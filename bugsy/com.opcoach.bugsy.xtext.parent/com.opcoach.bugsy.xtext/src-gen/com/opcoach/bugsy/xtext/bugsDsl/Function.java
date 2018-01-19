/**
 * generated by Xtext 2.12.0
 */
package com.opcoach.bugsy.xtext.bugsDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Function</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.opcoach.bugsy.xtext.bugsDsl.BugsDslPackage#getFunction()
 * @model
 * @generated
 */
public enum Function implements Enumerator
{
  /**
   * The '<em><b>Acos</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ACOS_VALUE
   * @generated
   * @ordered
   */
  ACOS(0, "acos", "acos"),

  /**
   * The '<em><b>Acosh</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ACOSH_VALUE
   * @generated
   * @ordered
   */
  ACOSH(1, "acosh", "acosh"),

  /**
   * The '<em><b>Asin</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASIN_VALUE
   * @generated
   * @ordered
   */
  ASIN(2, "asin", "asin"),

  /**
   * The '<em><b>Asinh</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASINH_VALUE
   * @generated
   * @ordered
   */
  ASINH(3, "asinh", "asinh"),

  /**
   * The '<em><b>Atan</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ATAN_VALUE
   * @generated
   * @ordered
   */
  ATAN(4, "atan", "atan"),

  /**
   * The '<em><b>Log</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LOG_VALUE
   * @generated
   * @ordered
   */
  LOG(5, "log", "log"),

  /**
   * The '<em><b>Ep</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EP_VALUE
   * @generated
   * @ordered
   */
  EP(6, "ep", "exp"),

  /**
   * The '<em><b>C</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #C_VALUE
   * @generated
   * @ordered
   */
  C(7, "c", "c");

  /**
   * The '<em><b>Acos</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Acos</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ACOS
   * @model name="acos"
   * @generated
   * @ordered
   */
  public static final int ACOS_VALUE = 0;

  /**
   * The '<em><b>Acosh</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Acosh</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ACOSH
   * @model name="acosh"
   * @generated
   * @ordered
   */
  public static final int ACOSH_VALUE = 1;

  /**
   * The '<em><b>Asin</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Asin</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASIN
   * @model name="asin"
   * @generated
   * @ordered
   */
  public static final int ASIN_VALUE = 2;

  /**
   * The '<em><b>Asinh</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Asinh</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASINH
   * @model name="asinh"
   * @generated
   * @ordered
   */
  public static final int ASINH_VALUE = 3;

  /**
   * The '<em><b>Atan</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Atan</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ATAN
   * @model name="atan"
   * @generated
   * @ordered
   */
  public static final int ATAN_VALUE = 4;

  /**
   * The '<em><b>Log</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Log</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LOG
   * @model name="log"
   * @generated
   * @ordered
   */
  public static final int LOG_VALUE = 5;

  /**
   * The '<em><b>Ep</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ep</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EP
   * @model name="ep" literal="exp"
   * @generated
   * @ordered
   */
  public static final int EP_VALUE = 6;

  /**
   * The '<em><b>C</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>C</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #C
   * @model name="c"
   * @generated
   * @ordered
   */
  public static final int C_VALUE = 7;

  /**
   * An array of all the '<em><b>Function</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Function[] VALUES_ARRAY =
    new Function[]
    {
      ACOS,
      ACOSH,
      ASIN,
      ASINH,
      ATAN,
      LOG,
      EP,
      C,
    };

  /**
   * A public read-only list of all the '<em><b>Function</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Function> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Function</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Function get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Function result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Function</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Function getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Function result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Function</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Function get(int value)
  {
    switch (value)
    {
      case ACOS_VALUE: return ACOS;
      case ACOSH_VALUE: return ACOSH;
      case ASIN_VALUE: return ASIN;
      case ASINH_VALUE: return ASINH;
      case ATAN_VALUE: return ATAN;
      case LOG_VALUE: return LOG;
      case EP_VALUE: return EP;
      case C_VALUE: return C;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Function(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Function
