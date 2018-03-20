/*
 * generated by Xtext 2.12.0
 */
package com.opcoach.bugsy.xtext.validation

import com.opcoach.bugsy.xtext.bugsDsl.ArrayID
import com.opcoach.bugsy.xtext.bugsDsl.ArrayRange
import com.opcoach.bugsy.xtext.bugsDsl.BugsDslPackage
import com.opcoach.bugsy.xtext.bugsDsl.BugsModel
import com.opcoach.bugsy.xtext.bugsDsl.Expression
import com.opcoach.bugsy.xtext.bugsDsl.For
import com.opcoach.bugsy.xtext.bugsDsl.Instruction
import com.opcoach.bugsy.xtext.bugsDsl.Relation
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class BugsDslValidator extends AbstractBugsDslValidator {

	public static val CHECK_UNIQUE_VARIABLE_NAME = 'uniqueVariableName'
	public static val CHECK_VARIABLE_DIMENSION_COMPLIANCE = 'variableDimensionCompliance' // Variables must be used with same dimensions
	public static val CHECK_INVALID_INDEX_IN_LOOP = 'invalidIndexInLoop' // An index used in a variable must be in the loop scope

	/** Check unique name for relations */
	@Check
	def checkUniqueRelationName(Relation r) {
		val nameToCheck = r.name
		// Check if another relation in the file has the same name...
		val parent = r.eContainer // Can be the model or a for object...
		if (parent instanceof BugsModel || parent instanceof For) {
			for (c : parent.eContents) {
				if ((c != r) && (c instanceof Relation)) {
					val rc = c as Relation
					if (rc.name.name.equals(nameToCheck.name))
						warning('Variable names must be unique.', BugsDslPackage.Literals.RELATION__NAME,
							CHECK_UNIQUE_VARIABLE_NAME)
				}
			}
		}
	}

	/** Check dimension compliance for variables in expressions : if a variable is used without indexes, it must be used like this*/
	@Check
	def checkDimensionCompliance(Expression e) {
		// For expression, must only check when there are ids 
		val id = e.value.id
		if (id !== null) {
			val bugsModel = e.getModel as BugsModel
			val cardinality = id.indexes.size

			// println("Must check this expression : " + id.name + " and for this cardinality : " + cardinality)
			if (verifyCardinalityUsage(bugsModel, id.name, cardinality) !== null) {
				error("The expression variable " + id.name + " is used with different dimensions in the file ",
					BugsDslPackage.Literals.EXPRESSION__VALUE, CHECK_VARIABLE_DIMENSION_COMPLIANCE)

			}
		}

	}

	/** Check dimension compliance for variables in relations : if a variable is used without indexes, it must be used like this*/
	@Check
	def checkDimensionCompliance(Relation r) {

		// val bugsModel = r.getModel
		val cardinality = r.name.indexes.size
		val name = r.name.name
		val bugsModel = r.getModel as BugsModel
		// println("Must check this relation : " + name + " and for this cardinality : " + cardinality)
		if (verifyCardinalityUsage(bugsModel, name, cardinality) !== null) {

			error("The relation variable " + name + " is used with different dimensions in the file ",
				BugsDslPackage.Literals.RELATION__NAME, CHECK_VARIABLE_DIMENSION_COMPLIANCE)
		}
	}

	@Check
	def checkArrayIndexIsInScope(ArrayRange ar) {
		// Check only indexes that are not Integer.
		val parentScope = ar.getVariableNamesInScope
		checkIndexIsInScope(getIndexName(ar.low), parentScope)
		checkIndexIsInScope(getIndexName(ar.high), parentScope)

	}

	def checkIndexIsInScope(String indexName, List<String> scope) {
		if (indexName !== null) {
			// Check if name is in parent scope
			if (!scope.contains(indexName))
				error("The index variable " + indexName + " is not defined at this location ",
					BugsDslPackage.Literals.ARRAY_RANGE__LOW, CHECK_INVALID_INDEX_IN_LOOP)
		}

	}

	/** Returns the index name if this is a string or null if it is a string */
	def getIndexName(String value) {
		if (value !== null && ! Character::isDigit(value.charAt(0)))
			return value
		return null

	}

	/** This method returns the list of variable names in the scope of current object */
	def getVariableNamesInScope(EObject o) {
		val result = new ArrayList<String>
		var parent = o.eContainer
		while (parent !== null) {
			if (parent instanceof For) {
				val forobject = parent as For
				result.add(forobject.variable)

			}
			parent = parent.eContainer

		}
		result
	}

	/** This method returns the object where  the relation name or expression name in the model is not used using the same cardinality
	 *  It returns null if no problem is found */
	def verifyCardinalityUsage(BugsModel m, String name, int cardinality) {
		return verifyCardinalityUsage(m.instructions, name, cardinality)

	}

	def verifyCardinalityUsage(For f, String name, int cardinality) {
		return verifyCardinalityUsage(f.instructions, name, cardinality)
	}

	def Object verifyCardinalityUsage(List<Instruction> instructions, String name, int cardinality) {

		for (ins : instructions) {
			val check = ins.verifyCardinalityUsage(name, cardinality)
			if (check !== null)
				return check
		}
		return null
	}

	def verifyCardinalityUsage(Instruction ins, String name, int cardinality) {
		if (ins instanceof For)
			return verifyCardinalityUsage(ins as For, name, cardinality)
		else if (ins instanceof Relation)
			return verifyCardinalityUsage(ins as Relation, name, cardinality)
		return null
	}

	def Object verifyCardinalityUsage(Expression e, String name, int cardinality) {
		// Depending on the kind of expression.. will check the left and right expresssions, or the current terminal value
		// or the parameters found in function or in Distribution
		if (e === null)
			return null

		if (e.function !== null) {
			// Must check all parameters (that are expresssions...)
			for (p : e.function.params)
				return verifyCardinalityUsage(p, name, cardinality)
		} else if (e.distribution !== null) {
			// Must check all parameters (that are expresssions...)
			for (p : e.distribution.params)
				return verifyCardinalityUsage(p, name, cardinality)
		} else if (e.value !== null && e.value.id !== null) {
			// This is a value which is an array id and not a simple numeric value... Must check it again...
			if (verifyCardinalityUsage(e.value.id, name, cardinality) !== null)
				return e.value
		} else {
			// This is an expresssion... must check the left and the right...
			var Object result = verifyCardinalityUsage(e.left, name, cardinality)
			if (result === null) {
				// check the right part
				result = verifyCardinalityUsage(e.right, name, cardinality)
			}
			return result
		}

		// No problem found 
		return null
	}

	def verifyCardinalityUsage(Relation r, String name, int cardinality) {
		if (verifyCardinalityUsage(r.name, name, cardinality) !== null)
			return r
		return null
	}

	def verifyCardinalityUsage(ArrayID ai, String name, int cardinality) {
		// print(
		// "Checking if id (" + ai.name + "," + ai.indexes.size + ") is compliant with (" + name + "," +
		// cardinality + ")")
		if (name == ai.name && ai.indexes.size != cardinality) {
			// println(" --> NOT Compliant (same name, different cardinality)")
			return ai
		}
		// println(" --> Compliant ")
		return null
	}

	// Get the parent model for any object in the model. 
	def getModel(EObject o) {
		var parent = o.eContainer
		while (parent !== null && (parent instanceof BugsModel) == false) {
			parent = parent.eContainer
		}
		parent

	}

}
