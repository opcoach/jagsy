/**
 * generated by Xtext 2.12.0
 */
package com.opcoach.bugsy.xtext.bugsDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.opcoach.bugsy.xtext.bugsDsl.BugsDslFactory
 * @model kind="package"
 * @generated
 */
public interface BugsDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "bugsDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.opcoach.com/bugsy/xtext/BugsDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "bugsDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BugsDslPackage eINSTANCE = com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl.init();

  /**
   * The meta object id for the '{@link com.opcoach.bugsy.xtext.bugsDsl.impl.BugsModelImpl <em>Bugs Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsModelImpl
   * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl#getBugsModel()
   * @generated
   */
  int BUGS_MODEL = 0;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUGS_MODEL__INSTRUCTIONS = 0;

  /**
   * The number of structural features of the '<em>Bugs Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUGS_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.opcoach.bugsy.xtext.bugsDsl.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.opcoach.bugsy.xtext.bugsDsl.impl.InstructionImpl
   * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 1;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.opcoach.bugsy.xtext.bugsDsl.impl.ForImpl <em>For</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.opcoach.bugsy.xtext.bugsDsl.impl.ForImpl
   * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl#getFor()
   * @generated
   */
  int FOR = 2;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__VARIABLE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Low</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__LOW = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>High</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__HIGH = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__CONTENTS = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>For</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.opcoach.bugsy.xtext.bugsDsl.impl.ParametersImpl <em>Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.opcoach.bugsy.xtext.bugsDsl.impl.ParametersImpl
   * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl#getParameters()
   * @generated
   */
  int PARAMETERS = 3;

  /**
   * The number of structural features of the '<em>Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.opcoach.bugsy.xtext.bugsDsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.opcoach.bugsy.xtext.bugsDsl.impl.ParameterImpl
   * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__VALUE = 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.opcoach.bugsy.xtext.bugsDsl.impl.RelationImpl <em>Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.opcoach.bugsy.xtext.bugsDsl.impl.RelationImpl
   * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl#getRelation()
   * @generated
   */
  int RELATION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__NAME = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Relation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__RELATION = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.opcoach.bugsy.xtext.bugsDsl.impl.StochasticRelationImpl <em>Stochastic Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.opcoach.bugsy.xtext.bugsDsl.impl.StochasticRelationImpl
   * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl#getStochasticRelation()
   * @generated
   */
  int STOCHASTIC_RELATION = 6;

  /**
   * The feature id for the '<em><b>Distrib</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STOCHASTIC_RELATION__DISTRIB = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STOCHASTIC_RELATION__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Stochastic Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STOCHASTIC_RELATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.opcoach.bugsy.xtext.bugsDsl.impl.DeterministicRelationImpl <em>Deterministic Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.opcoach.bugsy.xtext.bugsDsl.impl.DeterministicRelationImpl
   * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl#getDeterministicRelation()
   * @generated
   */
  int DETERMINISTIC_RELATION = 7;

  /**
   * The feature id for the '<em><b>Distrib</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETERMINISTIC_RELATION__DISTRIB = 0;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETERMINISTIC_RELATION__FUNCTION = 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETERMINISTIC_RELATION__PARAMS = 2;

  /**
   * The number of structural features of the '<em>Deterministic Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETERMINISTIC_RELATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.opcoach.bugsy.xtext.bugsDsl.Distribution <em>Distribution</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.opcoach.bugsy.xtext.bugsDsl.Distribution
   * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl#getDistribution()
   * @generated
   */
  int DISTRIBUTION = 8;

  /**
   * The meta object id for the '{@link com.opcoach.bugsy.xtext.bugsDsl.Density <em>Density</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.opcoach.bugsy.xtext.bugsDsl.Density
   * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl#getDensity()
   * @generated
   */
  int DENSITY = 9;

  /**
   * The meta object id for the '{@link com.opcoach.bugsy.xtext.bugsDsl.Function <em>Function</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.opcoach.bugsy.xtext.bugsDsl.Function
   * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 10;


  /**
   * Returns the meta object for class '{@link com.opcoach.bugsy.xtext.bugsDsl.BugsModel <em>Bugs Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bugs Model</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.BugsModel
   * @generated
   */
  EClass getBugsModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.opcoach.bugsy.xtext.bugsDsl.BugsModel#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.BugsModel#getInstructions()
   * @see #getBugsModel()
   * @generated
   */
  EReference getBugsModel_Instructions();

  /**
   * Returns the meta object for class '{@link com.opcoach.bugsy.xtext.bugsDsl.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for class '{@link com.opcoach.bugsy.xtext.bugsDsl.For <em>For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.For
   * @generated
   */
  EClass getFor();

  /**
   * Returns the meta object for the attribute '{@link com.opcoach.bugsy.xtext.bugsDsl.For#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.For#getVariable()
   * @see #getFor()
   * @generated
   */
  EAttribute getFor_Variable();

  /**
   * Returns the meta object for the attribute '{@link com.opcoach.bugsy.xtext.bugsDsl.For#getLow <em>Low</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Low</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.For#getLow()
   * @see #getFor()
   * @generated
   */
  EAttribute getFor_Low();

  /**
   * Returns the meta object for the attribute '{@link com.opcoach.bugsy.xtext.bugsDsl.For#getHigh <em>High</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>High</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.For#getHigh()
   * @see #getFor()
   * @generated
   */
  EAttribute getFor_High();

  /**
   * Returns the meta object for the containment reference list '{@link com.opcoach.bugsy.xtext.bugsDsl.For#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.For#getContents()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Contents();

  /**
   * Returns the meta object for class '{@link com.opcoach.bugsy.xtext.bugsDsl.Parameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameters</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.Parameters
   * @generated
   */
  EClass getParameters();

  /**
   * Returns the meta object for class '{@link com.opcoach.bugsy.xtext.bugsDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link com.opcoach.bugsy.xtext.bugsDsl.Parameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.Parameter#getValue()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Value();

  /**
   * Returns the meta object for class '{@link com.opcoach.bugsy.xtext.bugsDsl.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.Relation
   * @generated
   */
  EClass getRelation();

  /**
   * Returns the meta object for the attribute '{@link com.opcoach.bugsy.xtext.bugsDsl.Relation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.Relation#getName()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.opcoach.bugsy.xtext.bugsDsl.Relation#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Relation</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.Relation#getRelation()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Relation();

  /**
   * Returns the meta object for class '{@link com.opcoach.bugsy.xtext.bugsDsl.StochasticRelation <em>Stochastic Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stochastic Relation</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.StochasticRelation
   * @generated
   */
  EClass getStochasticRelation();

  /**
   * Returns the meta object for the attribute '{@link com.opcoach.bugsy.xtext.bugsDsl.StochasticRelation#getDistrib <em>Distrib</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Distrib</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.StochasticRelation#getDistrib()
   * @see #getStochasticRelation()
   * @generated
   */
  EAttribute getStochasticRelation_Distrib();

  /**
   * Returns the meta object for the containment reference list '{@link com.opcoach.bugsy.xtext.bugsDsl.StochasticRelation#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.StochasticRelation#getParams()
   * @see #getStochasticRelation()
   * @generated
   */
  EReference getStochasticRelation_Params();

  /**
   * Returns the meta object for class '{@link com.opcoach.bugsy.xtext.bugsDsl.DeterministicRelation <em>Deterministic Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deterministic Relation</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.DeterministicRelation
   * @generated
   */
  EClass getDeterministicRelation();

  /**
   * Returns the meta object for the attribute '{@link com.opcoach.bugsy.xtext.bugsDsl.DeterministicRelation#getDistrib <em>Distrib</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Distrib</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.DeterministicRelation#getDistrib()
   * @see #getDeterministicRelation()
   * @generated
   */
  EAttribute getDeterministicRelation_Distrib();

  /**
   * Returns the meta object for the attribute '{@link com.opcoach.bugsy.xtext.bugsDsl.DeterministicRelation#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.DeterministicRelation#getFunction()
   * @see #getDeterministicRelation()
   * @generated
   */
  EAttribute getDeterministicRelation_Function();

  /**
   * Returns the meta object for the containment reference list '{@link com.opcoach.bugsy.xtext.bugsDsl.DeterministicRelation#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.DeterministicRelation#getParams()
   * @see #getDeterministicRelation()
   * @generated
   */
  EReference getDeterministicRelation_Params();

  /**
   * Returns the meta object for enum '{@link com.opcoach.bugsy.xtext.bugsDsl.Distribution <em>Distribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Distribution</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.Distribution
   * @generated
   */
  EEnum getDistribution();

  /**
   * Returns the meta object for enum '{@link com.opcoach.bugsy.xtext.bugsDsl.Density <em>Density</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Density</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.Density
   * @generated
   */
  EEnum getDensity();

  /**
   * Returns the meta object for enum '{@link com.opcoach.bugsy.xtext.bugsDsl.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Function</em>'.
   * @see com.opcoach.bugsy.xtext.bugsDsl.Function
   * @generated
   */
  EEnum getFunction();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BugsDslFactory getBugsDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.opcoach.bugsy.xtext.bugsDsl.impl.BugsModelImpl <em>Bugs Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsModelImpl
     * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl#getBugsModel()
     * @generated
     */
    EClass BUGS_MODEL = eINSTANCE.getBugsModel();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUGS_MODEL__INSTRUCTIONS = eINSTANCE.getBugsModel_Instructions();

    /**
     * The meta object literal for the '{@link com.opcoach.bugsy.xtext.bugsDsl.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.opcoach.bugsy.xtext.bugsDsl.impl.InstructionImpl
     * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '{@link com.opcoach.bugsy.xtext.bugsDsl.impl.ForImpl <em>For</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.opcoach.bugsy.xtext.bugsDsl.impl.ForImpl
     * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl#getFor()
     * @generated
     */
    EClass FOR = eINSTANCE.getFor();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR__VARIABLE = eINSTANCE.getFor_Variable();

    /**
     * The meta object literal for the '<em><b>Low</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR__LOW = eINSTANCE.getFor_Low();

    /**
     * The meta object literal for the '<em><b>High</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR__HIGH = eINSTANCE.getFor_High();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__CONTENTS = eINSTANCE.getFor_Contents();

    /**
     * The meta object literal for the '{@link com.opcoach.bugsy.xtext.bugsDsl.impl.ParametersImpl <em>Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.opcoach.bugsy.xtext.bugsDsl.impl.ParametersImpl
     * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl#getParameters()
     * @generated
     */
    EClass PARAMETERS = eINSTANCE.getParameters();

    /**
     * The meta object literal for the '{@link com.opcoach.bugsy.xtext.bugsDsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.opcoach.bugsy.xtext.bugsDsl.impl.ParameterImpl
     * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

    /**
     * The meta object literal for the '{@link com.opcoach.bugsy.xtext.bugsDsl.impl.RelationImpl <em>Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.opcoach.bugsy.xtext.bugsDsl.impl.RelationImpl
     * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl#getRelation()
     * @generated
     */
    EClass RELATION = eINSTANCE.getRelation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__RELATION = eINSTANCE.getRelation_Relation();

    /**
     * The meta object literal for the '{@link com.opcoach.bugsy.xtext.bugsDsl.impl.StochasticRelationImpl <em>Stochastic Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.opcoach.bugsy.xtext.bugsDsl.impl.StochasticRelationImpl
     * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl#getStochasticRelation()
     * @generated
     */
    EClass STOCHASTIC_RELATION = eINSTANCE.getStochasticRelation();

    /**
     * The meta object literal for the '<em><b>Distrib</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STOCHASTIC_RELATION__DISTRIB = eINSTANCE.getStochasticRelation_Distrib();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STOCHASTIC_RELATION__PARAMS = eINSTANCE.getStochasticRelation_Params();

    /**
     * The meta object literal for the '{@link com.opcoach.bugsy.xtext.bugsDsl.impl.DeterministicRelationImpl <em>Deterministic Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.opcoach.bugsy.xtext.bugsDsl.impl.DeterministicRelationImpl
     * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl#getDeterministicRelation()
     * @generated
     */
    EClass DETERMINISTIC_RELATION = eINSTANCE.getDeterministicRelation();

    /**
     * The meta object literal for the '<em><b>Distrib</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DETERMINISTIC_RELATION__DISTRIB = eINSTANCE.getDeterministicRelation_Distrib();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DETERMINISTIC_RELATION__FUNCTION = eINSTANCE.getDeterministicRelation_Function();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DETERMINISTIC_RELATION__PARAMS = eINSTANCE.getDeterministicRelation_Params();

    /**
     * The meta object literal for the '{@link com.opcoach.bugsy.xtext.bugsDsl.Distribution <em>Distribution</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.opcoach.bugsy.xtext.bugsDsl.Distribution
     * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl#getDistribution()
     * @generated
     */
    EEnum DISTRIBUTION = eINSTANCE.getDistribution();

    /**
     * The meta object literal for the '{@link com.opcoach.bugsy.xtext.bugsDsl.Density <em>Density</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.opcoach.bugsy.xtext.bugsDsl.Density
     * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl#getDensity()
     * @generated
     */
    EEnum DENSITY = eINSTANCE.getDensity();

    /**
     * The meta object literal for the '{@link com.opcoach.bugsy.xtext.bugsDsl.Function <em>Function</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.opcoach.bugsy.xtext.bugsDsl.Function
     * @see com.opcoach.bugsy.xtext.bugsDsl.impl.BugsDslPackageImpl#getFunction()
     * @generated
     */
    EEnum FUNCTION = eINSTANCE.getFunction();

  }

} //BugsDslPackage
