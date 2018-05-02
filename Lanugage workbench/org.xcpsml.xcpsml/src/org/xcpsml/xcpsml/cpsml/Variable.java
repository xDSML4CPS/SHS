/**
 */
package org.xcpsml.xcpsml.cpsml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.Variable#getValue <em>Value</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.Variable#getGlobalnv <em>Globalnv</em>}</li>
 * </ul>
 *
 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getVariable_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsml.cpsml.Variable#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Globalnv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Globalnv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Globalnv</em>' attribute.
	 * @see #setGlobalnv(float)
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getVariable_Globalnv()
	 * @model unique="false"
	 * @generated
	 */
	float getGlobalnv();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsml.cpsml.Variable#getGlobalnv <em>Globalnv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Globalnv</em>' attribute.
	 * @see #getGlobalnv()
	 * @generated
	 */
	void setGlobalnv(float value);

} // Variable
