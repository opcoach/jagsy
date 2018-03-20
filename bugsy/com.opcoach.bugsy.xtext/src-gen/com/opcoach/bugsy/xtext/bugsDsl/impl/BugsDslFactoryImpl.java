/**
 * generated by Xtext 2.12.0
 */
package com.opcoach.bugsy.xtext.bugsDsl.impl;

import com.opcoach.bugsy.xtext.bugsDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BugsDslFactoryImpl extends EFactoryImpl implements BugsDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BugsDslFactory init()
  {
    try
    {
      BugsDslFactory theBugsDslFactory = (BugsDslFactory)EPackage.Registry.INSTANCE.getEFactory(BugsDslPackage.eNS_URI);
      if (theBugsDslFactory != null)
      {
        return theBugsDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BugsDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BugsDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BugsDslPackage.BUGS_MODEL: return createBugsModel();
      case BugsDslPackage.INSTRUCTION: return createInstruction();
      case BugsDslPackage.FOR: return createFor();
      case BugsDslPackage.FOR_INDEX: return createForIndex();
      case BugsDslPackage.FOR_RANGE: return createForRange();
      case BugsDslPackage.ARRAY_RANGE: return createArrayRange();
      case BugsDslPackage.VALUE: return createValue();
      case BugsDslPackage.ARRAY_ID: return createArrayID();
      case BugsDslPackage.RELATION: return createRelation();
      case BugsDslPackage.STOCHASTIC_RELATION: return createStochasticRelation();
      case BugsDslPackage.DETERMINISTIC_RELATION: return createDeterministicRelation();
      case BugsDslPackage.FUNCTION: return createFunction();
      case BugsDslPackage.DISTRIBUTION: return createDistribution();
      case BugsDslPackage.EXPRESSION: return createExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BugsDslPackage.DISTRIBUTION_OPERATOR:
        return createDistributionOperatorFromString(eDataType, initialValue);
      case BugsDslPackage.DENSITY:
        return createDensityFromString(eDataType, initialValue);
      case BugsDslPackage.FUNCTION_OPERATOR:
        return createFunctionOperatorFromString(eDataType, initialValue);
      case BugsDslPackage.ARRAY_FUNCTION:
        return createArrayFunctionFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BugsDslPackage.DISTRIBUTION_OPERATOR:
        return convertDistributionOperatorToString(eDataType, instanceValue);
      case BugsDslPackage.DENSITY:
        return convertDensityToString(eDataType, instanceValue);
      case BugsDslPackage.FUNCTION_OPERATOR:
        return convertFunctionOperatorToString(eDataType, instanceValue);
      case BugsDslPackage.ARRAY_FUNCTION:
        return convertArrayFunctionToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BugsModel createBugsModel()
  {
    BugsModelImpl bugsModel = new BugsModelImpl();
    return bugsModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For createFor()
  {
    ForImpl for_ = new ForImpl();
    return for_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForIndex createForIndex()
  {
    ForIndexImpl forIndex = new ForIndexImpl();
    return forIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForRange createForRange()
  {
    ForRangeImpl forRange = new ForRangeImpl();
    return forRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayRange createArrayRange()
  {
    ArrayRangeImpl arrayRange = new ArrayRangeImpl();
    return arrayRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayID createArrayID()
  {
    ArrayIDImpl arrayID = new ArrayIDImpl();
    return arrayID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relation createRelation()
  {
    RelationImpl relation = new RelationImpl();
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StochasticRelation createStochasticRelation()
  {
    StochasticRelationImpl stochasticRelation = new StochasticRelationImpl();
    return stochasticRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeterministicRelation createDeterministicRelation()
  {
    DeterministicRelationImpl deterministicRelation = new DeterministicRelationImpl();
    return deterministicRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Distribution createDistribution()
  {
    DistributionImpl distribution = new DistributionImpl();
    return distribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DistributionOperator createDistributionOperatorFromString(EDataType eDataType, String initialValue)
  {
    DistributionOperator result = DistributionOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDistributionOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Density createDensityFromString(EDataType eDataType, String initialValue)
  {
    Density result = Density.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDensityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionOperator createFunctionOperatorFromString(EDataType eDataType, String initialValue)
  {
    FunctionOperator result = FunctionOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFunctionOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayFunction createArrayFunctionFromString(EDataType eDataType, String initialValue)
  {
    ArrayFunction result = ArrayFunction.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertArrayFunctionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BugsDslPackage getBugsDslPackage()
  {
    return (BugsDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BugsDslPackage getPackage()
  {
    return BugsDslPackage.eINSTANCE;
  }

} //BugsDslFactoryImpl
