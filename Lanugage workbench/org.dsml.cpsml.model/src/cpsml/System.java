/**
 */
package cpsml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cpsml.System#getName <em>Name</em>}</li>
 *   <li>{@link cpsml.System#getOwnedvariables <em>Ownedvariables</em>}</li>
 *   <li>{@link cpsml.System#getRelatedvariable <em>Relatedvariable</em>}</li>
 *   <li>{@link cpsml.System#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link cpsml.System#getOwnedTransitions <em>Owned Transitions</em>}</li>
 *   <li>{@link cpsml.System#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link cpsml.System#getOwnedodes <em>Ownedodes</em>}</li>
 * </ul>
 *
 * @see cpsml.CpsmlPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
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
	 * @see cpsml.CpsmlPackage#getSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cpsml.System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ownedvariables</b></em>' containment reference list.
	 * The list contents are of type {@link cpsml.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ownedvariables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownedvariables</em>' containment reference list.
	 * @see cpsml.CpsmlPackage#getSystem_Ownedvariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getOwnedvariables();

	/**
	 * Returns the value of the '<em><b>Relatedvariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relatedvariable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relatedvariable</em>' reference.
	 * @see #setRelatedvariable(Variable)
	 * @see cpsml.CpsmlPackage#getSystem_Relatedvariable()
	 * @model required="true"
	 * @generated
	 */
	Variable getRelatedvariable();

	/**
	 * Sets the value of the '{@link cpsml.System#getRelatedvariable <em>Relatedvariable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relatedvariable</em>' reference.
	 * @see #getRelatedvariable()
	 * @generated
	 */
	void setRelatedvariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Owned States</b></em>' containment reference list.
	 * The list contents are of type {@link cpsml.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned States</em>' containment reference list.
	 * @see cpsml.CpsmlPackage#getSystem_OwnedStates()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getOwnedStates();

	/**
	 * Returns the value of the '<em><b>Owned Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link cpsml.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Transitions</em>' containment reference list.
	 * @see cpsml.CpsmlPackage#getSystem_OwnedTransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getOwnedTransitions();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(State)
	 * @see cpsml.CpsmlPackage#getSystem_InitialState()
	 * @model required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link cpsml.System#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * Returns the value of the '<em><b>Ownedodes</b></em>' containment reference list.
	 * The list contents are of type {@link cpsml.ODE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ownedodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownedodes</em>' containment reference list.
	 * @see cpsml.CpsmlPackage#getSystem_Ownedodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODE> getOwnedodes();

} // System
