/**
 */
package org.xcpsml.xcpsml.cpsml;

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
 *   <li>{@link org.xcpsml.xcpsml.cpsml.System#getName <em>Name</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.System#getOwnedvariables <em>Ownedvariables</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.System#getRelatedvariable <em>Relatedvariable</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.System#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.System#getOwnedTransitions <em>Owned Transitions</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.System#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.System#getOwnedodes <em>Ownedodes</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.System#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.System#getFatherState <em>Father State</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.System#getPtok <em>Ptok</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.System#getRan <em>Ran</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.System#getSub <em>Sub</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.System#getY0label <em>Y0label</em>}</li>
 * </ul>
 *
 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getSystem()
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
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsml.cpsml.System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ownedvariables</b></em>' containment reference list.
	 * The list contents are of type {@link org.xcpsml.xcpsml.cpsml.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ownedvariables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownedvariables</em>' containment reference list.
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getSystem_Ownedvariables()
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
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getSystem_Relatedvariable()
	 * @model required="true"
	 * @generated
	 */
	Variable getRelatedvariable();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsml.cpsml.System#getRelatedvariable <em>Relatedvariable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relatedvariable</em>' reference.
	 * @see #getRelatedvariable()
	 * @generated
	 */
	void setRelatedvariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Owned States</b></em>' containment reference list.
	 * The list contents are of type {@link org.xcpsml.xcpsml.cpsml.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned States</em>' containment reference list.
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getSystem_OwnedStates()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getOwnedStates();

	/**
	 * Returns the value of the '<em><b>Owned Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.xcpsml.xcpsml.cpsml.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Transitions</em>' containment reference list.
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getSystem_OwnedTransitions()
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
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getSystem_InitialState()
	 * @model required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsml.cpsml.System#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * Returns the value of the '<em><b>Ownedodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.xcpsml.xcpsml.cpsml.ODE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ownedodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownedodes</em>' containment reference list.
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getSystem_Ownedodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODE> getOwnedodes();

	/**
	 * Returns the value of the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State</em>' reference.
	 * @see #setCurrentState(State)
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getSystem_CurrentState()
	 * @model
	 * @generated
	 */
	State getCurrentState();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsml.cpsml.System#getCurrentState <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' reference.
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(State value);

	/**
	 * Returns the value of the '<em><b>Father State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Father State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Father State</em>' reference.
	 * @see #setFatherState(State)
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getSystem_FatherState()
	 * @model
	 * @generated
	 */
	State getFatherState();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsml.cpsml.System#getFatherState <em>Father State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Father State</em>' reference.
	 * @see #getFatherState()
	 * @generated
	 */
	void setFatherState(State value);

	/**
	 * Returns the value of the '<em><b>Ptok</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ptok</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ptok</em>' reference.
	 * @see #setPtok(ProbTransition)
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getSystem_Ptok()
	 * @model
	 * @generated
	 */
	ProbTransition getPtok();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsml.cpsml.System#getPtok <em>Ptok</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ptok</em>' reference.
	 * @see #getPtok()
	 * @generated
	 */
	void setPtok(ProbTransition value);

	/**
	 * Returns the value of the '<em><b>Ran</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ran</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ran</em>' attribute.
	 * @see #setRan(Float)
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getSystem_Ran()
	 * @model unique="false"
	 * @generated
	 */
	Float getRan();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsml.cpsml.System#getRan <em>Ran</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ran</em>' attribute.
	 * @see #getRan()
	 * @generated
	 */
	void setRan(Float value);

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' attribute.
	 * @see #setSub(int)
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getSystem_Sub()
	 * @model unique="false"
	 * @generated
	 */
	int getSub();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsml.cpsml.System#getSub <em>Sub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub</em>' attribute.
	 * @see #getSub()
	 * @generated
	 */
	void setSub(int value);

	/**
	 * Returns the value of the '<em><b>Y0label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y0label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y0label</em>' attribute.
	 * @see #setY0label(int)
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getSystem_Y0label()
	 * @model unique="false"
	 * @generated
	 */
	int getY0label();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsml.cpsml.System#getY0label <em>Y0label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y0label</em>' attribute.
	 * @see #getY0label()
	 * @generated
	 */
	void setY0label(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void main();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void dojump();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void callscilab();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model argumentsMany="true"
	 * @generated
	 */
	void RealizeInitializeModel(EList<String> arguments);

} // System
