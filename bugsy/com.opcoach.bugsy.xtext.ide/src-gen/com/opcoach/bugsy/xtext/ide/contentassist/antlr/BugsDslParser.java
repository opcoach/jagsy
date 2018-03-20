/*
 * generated by Xtext 2.12.0
 */
package com.opcoach.bugsy.xtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import com.opcoach.bugsy.xtext.ide.contentassist.antlr.internal.InternalBugsDslParser;
import com.opcoach.bugsy.xtext.services.BugsDslGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class BugsDslParser extends AbstractContentAssistParser {

	@Inject
	private BugsDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalBugsDslParser createParser() {
		InternalBugsDslParser result = new InternalBugsDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getInstructionAccess().getAlternatives(), "rule__Instruction__Alternatives");
					put(grammarAccess.getNumericAccess().getAlternatives(), "rule__Numeric__Alternatives");
					put(grammarAccess.getIndexAccess().getAlternatives(), "rule__Index__Alternatives");
					put(grammarAccess.getForIndexAccess().getAlternatives(), "rule__ForIndex__Alternatives");
					put(grammarAccess.getFloatAccess().getAlternatives_3_1(), "rule__Float__Alternatives_3_1");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getRelationAccess().getAlternatives(), "rule__Relation__Alternatives");
					put(grammarAccess.getStochasticRelationAccess().getAlternatives_4(), "rule__StochasticRelation__Alternatives_4");
					put(grammarAccess.getDeterministicRelationAccess().getAlternatives_2(), "rule__DeterministicRelation__Alternatives_2");
					put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
					put(grammarAccess.getFunctionAccess().getAlternatives_1(), "rule__Function__Alternatives_1");
					put(grammarAccess.getArrayFunctionAccess().getAlternatives_1(), "rule__ArrayFunction__Alternatives_1");
					put(grammarAccess.getDistributionAccess().getAlternatives_1(), "rule__Distribution__Alternatives_1");
					put(grammarAccess.getTerminalExpressionAccess().getAlternatives(), "rule__TerminalExpression__Alternatives");
					put(grammarAccess.getDistributionOperatorAccess().getAlternatives(), "rule__DistributionOperator__Alternatives");
					put(grammarAccess.getDensityOperatorAccess().getAlternatives(), "rule__DensityOperator__Alternatives");
					put(grammarAccess.getFunctionOperatorAccess().getAlternatives(), "rule__FunctionOperator__Alternatives");
					put(grammarAccess.getBugsModelAccess().getGroup(), "rule__BugsModel__Group__0");
					put(grammarAccess.getBugsModelAccess().getGroup_1(), "rule__BugsModel__Group_1__0");
					put(grammarAccess.getForAccess().getGroup(), "rule__For__Group__0");
					put(grammarAccess.getForIndexAccess().getGroup_0(), "rule__ForIndex__Group_0__0");
					put(grammarAccess.getForRangeAccess().getGroup(), "rule__ForRange__Group__0");
					put(grammarAccess.getArrayRangeAccess().getGroup(), "rule__ArrayRange__Group__0");
					put(grammarAccess.getArrayRangeAccess().getGroup_1(), "rule__ArrayRange__Group_1__0");
					put(grammarAccess.getFloatAccess().getGroup(), "rule__Float__Group__0");
					put(grammarAccess.getFloatAccess().getGroup_3(), "rule__Float__Group_3__0");
					put(grammarAccess.getValueAccess().getGroup_0(), "rule__Value__Group_0__0");
					put(grammarAccess.getArrayIDAccess().getGroup(), "rule__ArrayID__Group__0");
					put(grammarAccess.getArrayIDAccess().getGroup_1(), "rule__ArrayID__Group_1__0");
					put(grammarAccess.getArrayIDAccess().getGroup_1_2(), "rule__ArrayID__Group_1_2__0");
					put(grammarAccess.getStochasticRelationAccess().getGroup(), "rule__StochasticRelation__Group__0");
					put(grammarAccess.getStochasticRelationAccess().getGroup_4_1(), "rule__StochasticRelation__Group_4_1__0");
					put(grammarAccess.getStochasticRelationAccess().getGroup_4_1_1(), "rule__StochasticRelation__Group_4_1_1__0");
					put(grammarAccess.getStochasticRelationAccess().getGroup_4_1_1_1(), "rule__StochasticRelation__Group_4_1_1_1__0");
					put(grammarAccess.getDeterministicRelationAccess().getGroup(), "rule__DeterministicRelation__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup_1_1(), "rule__Function__Group_1_1__0");
					put(grammarAccess.getFunctionAccess().getGroup_1_1_1(), "rule__Function__Group_1_1_1__0");
					put(grammarAccess.getFunctionAccess().getGroup_1_1_1_0(), "rule__Function__Group_1_1_1_0__0");
					put(grammarAccess.getFunctionAccess().getGroup_1_1_1_1(), "rule__Function__Group_1_1_1_1__0");
					put(grammarAccess.getArrayFunctionAccess().getGroup(), "rule__ArrayFunction__Group__0");
					put(grammarAccess.getArrayFunctionAccess().getGroup_1_1(), "rule__ArrayFunction__Group_1_1__0");
					put(grammarAccess.getArrayFunctionAccess().getGroup_1_1_1(), "rule__ArrayFunction__Group_1_1_1__0");
					put(grammarAccess.getArrayFunctionAccess().getGroup_1_1_1_0(), "rule__ArrayFunction__Group_1_1_1_0__0");
					put(grammarAccess.getArrayFunctionAccess().getGroup_1_1_1_1(), "rule__ArrayFunction__Group_1_1_1_1__0");
					put(grammarAccess.getDistributionAccess().getGroup(), "rule__Distribution__Group__0");
					put(grammarAccess.getDistributionAccess().getGroup_1_1(), "rule__Distribution__Group_1_1__0");
					put(grammarAccess.getDistributionAccess().getGroup_1_1_1(), "rule__Distribution__Group_1_1_1__0");
					put(grammarAccess.getDistributionAccess().getGroup_1_1_1_0(), "rule__Distribution__Group_1_1_1_0__0");
					put(grammarAccess.getDistributionAccess().getGroup_1_1_1_1(), "rule__Distribution__Group_1_1_1_1__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_0(), "rule__TerminalExpression__Group_0__0");
					put(grammarAccess.getBugsModelAccess().getDataAssignment_1_2(), "rule__BugsModel__DataAssignment_1_2");
					put(grammarAccess.getBugsModelAccess().getInstructionsAssignment_4(), "rule__BugsModel__InstructionsAssignment_4");
					put(grammarAccess.getForAccess().getVariableAssignment_3(), "rule__For__VariableAssignment_3");
					put(grammarAccess.getForAccess().getRangeAssignment_5(), "rule__For__RangeAssignment_5");
					put(grammarAccess.getForAccess().getInstructionsAssignment_8(), "rule__For__InstructionsAssignment_8");
					put(grammarAccess.getForIndexAccess().getFunctionAssignment_0_0(), "rule__ForIndex__FunctionAssignment_0_0");
					put(grammarAccess.getForIndexAccess().getValueAssignment_0_2(), "rule__ForIndex__ValueAssignment_0_2");
					put(grammarAccess.getForIndexAccess().getValueAssignment_1(), "rule__ForIndex__ValueAssignment_1");
					put(grammarAccess.getForRangeAccess().getLowAssignment_0(), "rule__ForRange__LowAssignment_0");
					put(grammarAccess.getForRangeAccess().getHighAssignment_2(), "rule__ForRange__HighAssignment_2");
					put(grammarAccess.getArrayRangeAccess().getLowAssignment_0(), "rule__ArrayRange__LowAssignment_0");
					put(grammarAccess.getArrayRangeAccess().getHighAssignment_1_1(), "rule__ArrayRange__HighAssignment_1_1");
					put(grammarAccess.getValueAccess().getValueAssignment_0_1(), "rule__Value__ValueAssignment_0_1");
					put(grammarAccess.getValueAccess().getIdAssignment_1(), "rule__Value__IdAssignment_1");
					put(grammarAccess.getArrayIDAccess().getNameAssignment_0(), "rule__ArrayID__NameAssignment_0");
					put(grammarAccess.getArrayIDAccess().getIndexesAssignment_1_1(), "rule__ArrayID__IndexesAssignment_1_1");
					put(grammarAccess.getArrayIDAccess().getIndexesAssignment_1_2_1(), "rule__ArrayID__IndexesAssignment_1_2_1");
					put(grammarAccess.getStochasticRelationAccess().getNameAssignment_1(), "rule__StochasticRelation__NameAssignment_1");
					put(grammarAccess.getStochasticRelationAccess().getDistribAssignment_3(), "rule__StochasticRelation__DistribAssignment_3");
					put(grammarAccess.getStochasticRelationAccess().getParamsAssignment_4_1_1_0(), "rule__StochasticRelation__ParamsAssignment_4_1_1_0");
					put(grammarAccess.getStochasticRelationAccess().getParamsAssignment_4_1_1_1_1(), "rule__StochasticRelation__ParamsAssignment_4_1_1_1_1");
					put(grammarAccess.getDeterministicRelationAccess().getNameAssignment_1(), "rule__DeterministicRelation__NameAssignment_1");
					put(grammarAccess.getDeterministicRelationAccess().getExpressionsAssignment_3(), "rule__DeterministicRelation__ExpressionsAssignment_3");
					put(grammarAccess.getFunctionAccess().getOperationAssignment_0(), "rule__Function__OperationAssignment_0");
					put(grammarAccess.getFunctionAccess().getParamsAssignment_1_1_1_0_0(), "rule__Function__ParamsAssignment_1_1_1_0_0");
					put(grammarAccess.getFunctionAccess().getParamsAssignment_1_1_1_1_1(), "rule__Function__ParamsAssignment_1_1_1_1_1");
					put(grammarAccess.getArrayFunctionAccess().getOperationAssignment_0(), "rule__ArrayFunction__OperationAssignment_0");
					put(grammarAccess.getArrayFunctionAccess().getParamsAssignment_1_1_1_0_0(), "rule__ArrayFunction__ParamsAssignment_1_1_1_0_0");
					put(grammarAccess.getArrayFunctionAccess().getParamsAssignment_1_1_1_1_1(), "rule__ArrayFunction__ParamsAssignment_1_1_1_1_1");
					put(grammarAccess.getDistributionAccess().getDistribAssignment_0(), "rule__Distribution__DistribAssignment_0");
					put(grammarAccess.getDistributionAccess().getParamsAssignment_1_1_1_0_0(), "rule__Distribution__ParamsAssignment_1_1_1_0_0");
					put(grammarAccess.getDistributionAccess().getParamsAssignment_1_1_1_1_1(), "rule__Distribution__ParamsAssignment_1_1_1_1_1");
					put(grammarAccess.getExpressionAccess().getOpAssignment_1_1(), "rule__Expression__OpAssignment_1_1");
					put(grammarAccess.getExpressionAccess().getRightAssignment_1_2(), "rule__Expression__RightAssignment_1_2");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1(), "rule__TerminalExpression__ValueAssignment_1");
					put(grammarAccess.getTerminalExpressionAccess().getFunctionAssignment_2(), "rule__TerminalExpression__FunctionAssignment_2");
					put(grammarAccess.getTerminalExpressionAccess().getDistributionAssignment_3(), "rule__TerminalExpression__DistributionAssignment_3");
					put(grammarAccess.getTerminalExpressionAccess().getArrayFunctionAssignment_4(), "rule__TerminalExpression__ArrayFunctionAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public BugsDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BugsDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
