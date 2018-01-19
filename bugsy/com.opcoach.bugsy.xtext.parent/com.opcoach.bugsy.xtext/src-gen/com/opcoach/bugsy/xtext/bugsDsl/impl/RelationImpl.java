/**
 * generated by Xtext 2.12.0
 */
package com.opcoach.bugsy.xtext.bugsDsl.impl;

import com.opcoach.bugsy.xtext.bugsDsl.BugsDslPackage;
import com.opcoach.bugsy.xtext.bugsDsl.Operation;
import com.opcoach.bugsy.xtext.bugsDsl.Relation;
import com.opcoach.bugsy.xtext.bugsDsl.RelationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.opcoach.bugsy.xtext.bugsDsl.impl.RelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.opcoach.bugsy.xtext.bugsDsl.impl.RelationImpl#getRelationType <em>Relation Type</em>}</li>
 *   <li>{@link com.opcoach.bugsy.xtext.bugsDsl.impl.RelationImpl#getLeftExpr <em>Left Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends InstructionImpl implements Relation
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getRelationType() <em>Relation Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationType()
   * @generated
   * @ordered
   */
  protected static final RelationType RELATION_TYPE_EDEFAULT = RelationType.STOCHASTIC;

  /**
   * The cached value of the '{@link #getRelationType() <em>Relation Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationType()
   * @generated
   * @ordered
   */
  protected RelationType relationType = RELATION_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getLeftExpr() <em>Left Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftExpr()
   * @generated
   * @ordered
   */
  protected Operation leftExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationImpl()
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
    return BugsDslPackage.Literals.RELATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BugsDslPackage.RELATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationType getRelationType()
  {
    return relationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationType(RelationType newRelationType)
  {
    RelationType oldRelationType = relationType;
    relationType = newRelationType == null ? RELATION_TYPE_EDEFAULT : newRelationType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BugsDslPackage.RELATION__RELATION_TYPE, oldRelationType, relationType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation getLeftExpr()
  {
    return leftExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftExpr(Operation newLeftExpr, NotificationChain msgs)
  {
    Operation oldLeftExpr = leftExpr;
    leftExpr = newLeftExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BugsDslPackage.RELATION__LEFT_EXPR, oldLeftExpr, newLeftExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftExpr(Operation newLeftExpr)
  {
    if (newLeftExpr != leftExpr)
    {
      NotificationChain msgs = null;
      if (leftExpr != null)
        msgs = ((InternalEObject)leftExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BugsDslPackage.RELATION__LEFT_EXPR, null, msgs);
      if (newLeftExpr != null)
        msgs = ((InternalEObject)newLeftExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BugsDslPackage.RELATION__LEFT_EXPR, null, msgs);
      msgs = basicSetLeftExpr(newLeftExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BugsDslPackage.RELATION__LEFT_EXPR, newLeftExpr, newLeftExpr));
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
      case BugsDslPackage.RELATION__LEFT_EXPR:
        return basicSetLeftExpr(null, msgs);
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
      case BugsDslPackage.RELATION__NAME:
        return getName();
      case BugsDslPackage.RELATION__RELATION_TYPE:
        return getRelationType();
      case BugsDslPackage.RELATION__LEFT_EXPR:
        return getLeftExpr();
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
      case BugsDslPackage.RELATION__NAME:
        setName((String)newValue);
        return;
      case BugsDslPackage.RELATION__RELATION_TYPE:
        setRelationType((RelationType)newValue);
        return;
      case BugsDslPackage.RELATION__LEFT_EXPR:
        setLeftExpr((Operation)newValue);
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
      case BugsDslPackage.RELATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BugsDslPackage.RELATION__RELATION_TYPE:
        setRelationType(RELATION_TYPE_EDEFAULT);
        return;
      case BugsDslPackage.RELATION__LEFT_EXPR:
        setLeftExpr((Operation)null);
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
      case BugsDslPackage.RELATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BugsDslPackage.RELATION__RELATION_TYPE:
        return relationType != RELATION_TYPE_EDEFAULT;
      case BugsDslPackage.RELATION__LEFT_EXPR:
        return leftExpr != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", relationType: ");
    result.append(relationType);
    result.append(')');
    return result.toString();
  }

} //RelationImpl
