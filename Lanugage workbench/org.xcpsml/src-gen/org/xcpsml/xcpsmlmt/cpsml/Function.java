/**
 */
package org.xcpsml.xcpsmlmt.cpsml;

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
 *   <li>{@link org.xcpsml.xcpsmlmt.cpsml.Function#getName <em>Name</em>}</li>
 *   <li>{@link org.xcpsml.xcpsmlmt.cpsml.Function#getIndevariable <em>Indevariable</em>}</li>
 *   <li>{@link org.xcpsml.xcpsmlmt.cpsml.Function#getDevariable <em>Devariable</em>}</li>
 *   <li>{@link org.xcpsml.xcpsmlmt.cpsml.Function#getFright <em>Fright</em>}</li>
 * </ul>
 *
 * @see org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage#getFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsmlmt.cpsml.Function#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Indevariable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indevariable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indevariable</em>' containment reference.
	 * @see #setIndevariable(IndeVariable)
	 * @see org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage#getFunction_Indevariable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IndeVariable getIndevariable();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsmlmt.cpsml.Function#getIndevariable <em>Indevariable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indevariable</em>' containment reference.
	 * @see #getIndevariable()
	 * @generated
	 */
	void setIndevariable(IndeVariable value);

	/**
	 * Returns the value of the '<em><b>Devariable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devariable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devariable</em>' containment reference.
	 * @see #setDevariable(DeVariable)
	 * @see org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage#getFunction_Devariable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DeVariable getDevariable();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsmlmt.cpsml.Function#getDevariable <em>Devariable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Devariable</em>' containment reference.
	 * @see #getDevariable()
	 * @generated
	 */
	void setDevariable(DeVariable value);

	/**
	 * Returns the value of the '<em><b>Fright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fright</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fright</em>' containment reference.
	 * @see #setFright(Fright)
	 * @see org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage#getFunction_Fright()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Fright getFright();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsmlmt.cpsml.Function#getFright <em>Fright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fright</em>' containment reference.
	 * @see #getFright()
	 * @generated
	 */
	void setFright(Fright value);

} // Function
