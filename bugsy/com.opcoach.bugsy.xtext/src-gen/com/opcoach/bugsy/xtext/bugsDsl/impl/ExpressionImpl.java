/**
 * generated by Xtext 2.12.0
 */
package com.opcoach.bugsy.xtext.bugsDsl.impl;

import com.opcoach.bugsy.xtext.bugsDsl.ArrayFunction;
import com.opcoach.bugsy.xtext.bugsDsl.BugsDslPackage;
import com.opcoach.bugsy.xtext.bugsDsl.Distribution;
import com.opcoach.bugsy.xtext.bugsDsl.Expression;
import com.opcoach.bugsy.xtext.bugsDsl.Function;
import com.opcoach.bugsy.xtext.bugsDsl.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.opcoach.bugsy.xtext.bugsDsl.impl.ExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link com.opcoach.bugsy.xtext.bugsDsl.impl.ExpressionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link com.opcoach.bugsy.xtext.bugsDsl.impl.ExpressionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link com.opcoach.bugsy.xtext.bugsDsl.impl.ExpressionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.opcoach.bugsy.xtext.bugsDsl.impl.ExpressionImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link com.opcoach.bugsy.xtext.bugsDsl.impl.ExpressionImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link com.opcoach.bugsy.xtext.bugsDsl.impl.ExpressionImpl#getArrayFunction <em>Array Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Expression left;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected Expression right;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Value value;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected Function function;

  /**
   * The cached value of the '{@link #getDistribution() <em>Distribution</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistribution()
   * @generated
   * @ordered
   */
  protected Distribution distribution;

  /**
   * The cached value of the '{@link #getArrayFunction() <em>Array Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayFunction()
   * @generated
   * @ordered
   */
  protected ArrayFunction arrayFunction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BugsDslPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Expression newLeft, NotificationChain msgs)
  {
    Expression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BugsDslPackage.EXPRESSION__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(Expression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BugsDslPackage.EXPRESSION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BugsDslPackage.EXPRESSION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BugsDslPackage.EXPRESSION__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BugsDslPackage.EXPRESSION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(Expression newRight, NotificationChain msgs)
  {
    Expression oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BugsDslPackage.EXPRESSION__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(Expression newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BugsDslPackage.EXPRESSION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BugsDslPackage.EXPRESSION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BugsDslPackage.EXPRESSION__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Value newValue, NotificationChain msgs)
  {
    Value oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BugsDslPackage.EXPRESSION__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Value newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BugsDslPackage.EXPRESSION__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BugsDslPackage.EXPRESSION__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BugsDslPackage.EXPRESSION__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function getFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunction(Function newFunction, NotificationChain msgs)
  {
    Function oldFunction = function;
    function = newFunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BugsDslPackage.EXPRESSION__FUNCTION, oldFunction, newFunction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction(Function newFunction)
  {
    if (newFunction != function)
    {
      NotificationChain msgs = null;
      if (function != null)
        msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BugsDslPackage.EXPRESSION__FUNCTION, null, msgs);
      if (newFunction != null)
        msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BugsDslPackage.EXPRESSION__FUNCTION, null, msgs);
      msgs = basicSetFunction(newFunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BugsDslPackage.EXPRESSION__FUNCTION, newFunction, newFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Distribution getDistribution()
  {
    return distribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDistribution(Distribution newDistribution, NotificationChain msgs)
  {
    Distribution oldDistribution = distribution;
    distribution = newDistribution;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BugsDslPackage.EXPRESSION__DISTRIBUTION, oldDistribution, newDistribution);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDistribution(Distribution newDistribution)
  {
    if (newDistribution != distribution)
    {
      NotificationChain msgs = null;
      if (distribution != null)
        msgs = ((InternalEObject)distribution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BugsDslPackage.EXPRESSION__DISTRIBUTION, null, msgs);
      if (newDistribution != null)
        msgs = ((InternalEObject)newDistribution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BugsDslPackage.EXPRESSION__DISTRIBUTION, null, msgs);
      msgs = basicSetDistribution(newDistribution, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BugsDslPackage.EXPRESSION__DISTRIBUTION, newDistribution, newDistribution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayFunction getArrayFunction()
  {
    return arrayFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrayFunction(ArrayFunction newArrayFunction, NotificationChain msgs)
  {
    ArrayFunction oldArrayFunction = arrayFunction;
    arrayFunction = newArrayFunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BugsDslPackage.EXPRESSION__ARRAY_FUNCTION, oldArrayFunction, newArrayFunction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrayFunction(ArrayFunction newArrayFunction)
  {
    if (newArrayFunction != arrayFunction)
    {
      NotificationChain msgs = null;
      if (arrayFunction != null)
        msgs = ((InternalEObject)arrayFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BugsDslPackage.EXPRESSION__ARRAY_FUNCTION, null, msgs);
      if (newArrayFunction != null)
        msgs = ((InternalEObject)newArrayFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BugsDslPackage.EXPRESSION__ARRAY_FUNCTION, null, msgs);
      msgs = basicSetArrayFunction(newArrayFunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BugsDslPackage.EXPRESSION__ARRAY_FUNCTION, newArrayFunction, newArrayFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BugsDslPackage.EXPRESSION__LEFT:
        return basicSetLeft(null, msgs);
      case BugsDslPackage.EXPRESSION__RIGHT:
        return basicSetRight(null, msgs);
      case BugsDslPackage.EXPRESSION__VALUE:
        return basicSetValue(null, msgs);
      case BugsDslPackage.EXPRESSION__FUNCTION:
        return basicSetFunction(null, msgs);
      case BugsDslPackage.EXPRESSION__DISTRIBUTION:
        return basicSetDistribution(null, msgs);
      case BugsDslPackage.EXPRESSION__ARRAY_FUNCTION:
        return basicSetArrayFunction(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BugsDslPackage.EXPRESSION__LEFT:
        return getLeft();
      case BugsDslPackage.EXPRESSION__OP:
        return getOp();
      case BugsDslPackage.EXPRESSION__RIGHT:
        return getRight();
      case BugsDslPackage.EXPRESSION__VALUE:
        return getValue();
      case BugsDslPackage.EXPRESSION__FUNCTION:
        return getFunction();
      case BugsDslPackage.EXPRESSION__DISTRIBUTION:
        return getDistribution();
      case BugsDslPackage.EXPRESSION__ARRAY_FUNCTION:
        return getArrayFunction();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BugsDslPackage.EXPRESSION__LEFT:
        setLeft((Expression)newValue);
        return;
      case BugsDslPackage.EXPRESSION__OP:
        setOp((String)newValue);
        return;
      case BugsDslPackage.EXPRESSION__RIGHT:
        setRight((Expression)newValue);
        return;
      case BugsDslPackage.EXPRESSION__VALUE:
        setValue((Value)newValue);
        return;
      case BugsDslPackage.EXPRESSION__FUNCTION:
        setFunction((Function)newValue);
        return;
      case BugsDslPackage.EXPRESSION__DISTRIBUTION:
        setDistribution((Distribution)newValue);
        return;
      case BugsDslPackage.EXPRESSION__ARRAY_FUNCTION:
        setArrayFunction((ArrayFunction)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BugsDslPackage.EXPRESSION__LEFT:
        setLeft((Expression)null);
        return;
      case BugsDslPackage.EXPRESSION__OP:
        setOp(OP_EDEFAULT);
        return;
      case BugsDslPackage.EXPRESSION__RIGHT:
        setRight((Expression)null);
        return;
      case BugsDslPackage.EXPRESSION__VALUE:
        setValue((Value)null);
        return;
      case BugsDslPackage.EXPRESSION__FUNCTION:
        setFunction((Function)null);
        return;
      case BugsDslPackage.EXPRESSION__DISTRIBUTION:
        setDistribution((Distribution)null);
        return;
      case BugsDslPackage.EXPRESSION__ARRAY_FUNCTION:
        setArrayFunction((ArrayFunction)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BugsDslPackage.EXPRESSION__LEFT:
        return left != null;
      case BugsDslPackage.EXPRESSION__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case BugsDslPackage.EXPRESSION__RIGHT:
        return right != null;
      case BugsDslPackage.EXPRESSION__VALUE:
        return value != null;
      case BugsDslPackage.EXPRESSION__FUNCTION:
        return function != null;
      case BugsDslPackage.EXPRESSION__DISTRIBUTION:
        return distribution != null;
      case BugsDslPackage.EXPRESSION__ARRAY_FUNCTION:
        return arrayFunction != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl
