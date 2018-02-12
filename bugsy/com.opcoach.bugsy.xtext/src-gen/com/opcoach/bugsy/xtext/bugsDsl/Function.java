/**
 * generated by Xtext 2.12.0
 */
package com.opcoach.bugsy.xtext.bugsDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.opcoach.bugsy.xtext.bugsDsl.Function#getOperation <em>Operation</em>}</li>
 *   <li>{@link com.opcoach.bugsy.xtext.bugsDsl.Function#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see com.opcoach.bugsy.xtext.bugsDsl.BugsDslPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
  /**
   * Returns the value of the '<em><b>Operation</b></em>' attribute.
   * The literals are from the enumeration {@link com.opcoach.bugsy.xtext.bugsDsl.FunctionOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' attribute.
   * @see com.opcoach.bugsy.xtext.bugsDsl.FunctionOperator
   * @see #setOperation(FunctionOperator)
   * @see com.opcoach.bugsy.xtext.bugsDsl.BugsDslPackage#getFunction_Operation()
   * @model
   * @generated
   */
  FunctionOperator getOperation();

  /**
   * Sets the value of the '{@link com.opcoach.bugsy.xtext.bugsDsl.Function#getOperation <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' attribute.
   * @see com.opcoach.bugsy.xtext.bugsDsl.FunctionOperator
   * @see #getOperation()
   * @generated
   */
  void setOperation(FunctionOperator value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link com.opcoach.bugsy.xtext.bugsDsl.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see com.opcoach.bugsy.xtext.bugsDsl.BugsDslPackage#getFunction_Params()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getParams();

} // Function
