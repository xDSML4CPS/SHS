/**
 */
package org.xcpsml.xcpsml.cpsml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.State#getName <em>Name</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.State#getSlaveode <em>Slaveode</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.State#getOutgoingComTransitions <em>Outgoing Com Transitions</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.State#getIncomingComTransitions <em>Incoming Com Transitions</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.State#getOutgoingProbTransitions <em>Outgoing Prob Transitions</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.State#getIncomingProbTransitions <em>Incoming Prob Transitions</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.State#getSubStates <em>Sub States</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.State#getInitialsubstate <em>Initialsubstate</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.State#getSubtransitions <em>Subtransitions</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.State#getSubodes <em>Subodes</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.State#getSubrelatedvariables <em>Subrelatedvariables</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.State#getSubrelatedvariable <em>Subrelatedvariable</em>}</li>
 * </ul>
 *
 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
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
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsml.cpsml.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Slaveode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slaveode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slaveode</em>' reference.
	 * @see #setSlaveode(ODE)
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getState_Slaveode()
	 * @model required="true"
	 * @generated
	 */
	ODE getSlaveode();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsml.cpsml.State#getSlaveode <em>Slaveode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slaveode</em>' reference.
	 * @see #getSlaveode()
	 * @generated
	 */
	void setSlaveode(ODE value);

	/**
	 * Returns the value of the '<em><b>Outgoing Com Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.xcpsml.xcpsml.cpsml.ComTransition}.
	 * It is bidirectional and its opposite is '{@link org.xcpsml.xcpsml.cpsml.ComTransition#getCsrc <em>Csrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Com Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Com Transitions</em>' reference list.
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getState_OutgoingComTransitions()
	 * @see org.xcpsml.xcpsml.cpsml.ComTransition#getCsrc
	 * @model opposite="csrc"
	 * @generated
	 */
	EList<ComTransition> getOutgoingComTransitions();

	/**
	 * Returns the value of the '<em><b>Incoming Com Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.xcpsml.xcpsml.cpsml.ComTransition}.
	 * It is bidirectional and its opposite is '{@link org.xcpsml.xcpsml.cpsml.ComTransition#getCtgt <em>Ctgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Com Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Com Transitions</em>' reference list.
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getState_IncomingComTransitions()
	 * @see org.xcpsml.xcpsml.cpsml.ComTransition#getCtgt
	 * @model opposite="ctgt"
	 * @generated
	 */
	EList<ComTransition> getIncomingComTransitions();

	/**
	 * Returns the value of the '<em><b>Outgoing Prob Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.xcpsml.xcpsml.cpsml.ProbTransition}.
	 * It is bidirectional and its opposite is '{@link org.xcpsml.xcpsml.cpsml.ProbTransition#getPsrc <em>Psrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Prob Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Prob Transitions</em>' reference list.
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getState_OutgoingProbTransitions()
	 * @see org.xcpsml.xcpsml.cpsml.ProbTransition#getPsrc
	 * @model opposite="psrc"
	 * @generated
	 */
	EList<ProbTransition> getOutgoingProbTransitions();

	/**
	 * Returns the value of the '<em><b>Incoming Prob Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.xcpsml.xcpsml.cpsml.ProbTransition}.
	 * It is bidirectional and its opposite is '{@link org.xcpsml.xcpsml.cpsml.ProbTransition#getPtgt <em>Ptgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Prob Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Prob Transitions</em>' reference list.
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getState_IncomingProbTransitions()
	 * @see org.xcpsml.xcpsml.cpsml.ProbTransition#getPtgt
	 * @model opposite="ptgt"
	 * @generated
	 */
	EList<ProbTransition> getIncomingProbTransitions();

	/**
	 * Returns the value of the '<em><b>Sub States</b></em>' containment reference list.
	 * The list contents are of type {@link org.xcpsml.xcpsml.cpsml.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub States</em>' containment reference list.
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getState_SubStates()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getSubStates();

	/**
	 * Returns the value of the '<em><b>Initialsubstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialsubstate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialsubstate</em>' reference.
	 * @see #setInitialsubstate(State)
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getState_Initialsubstate()
	 * @model required="true"
	 * @generated
	 */
	State getInitialsubstate();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsml.cpsml.State#getInitialsubstate <em>Initialsubstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialsubstate</em>' reference.
	 * @see #getInitialsubstate()
	 * @generated
	 */
	void setInitialsubstate(State value);

	/**
	 * Returns the value of the '<em><b>Subtransitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.xcpsml.xcpsml.cpsml.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtransitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtransitions</em>' containment reference list.
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getState_Subtransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getSubtransitions();

	/**
	 * Returns the value of the '<em><b>Subodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.xcpsml.xcpsml.cpsml.ODE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subodes</em>' containment reference list.
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getState_Subodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODE> getSubodes();

	/**
	 * Returns the value of the '<em><b>Subrelatedvariables</b></em>' containment reference list.
	 * The list contents are of type {@link org.xcpsml.xcpsml.cpsml.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subrelatedvariables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subrelatedvariables</em>' containment reference list.
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getState_Subrelatedvariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getSubrelatedvariables();

	/**
	 * Returns the value of the '<em><b>Subrelatedvariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subrelatedvariable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subrelatedvariable</em>' reference.
	 * @see #setSubrelatedvariable(Variable)
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getState_Subrelatedvariable()
	 * @model required="true"
	 * @generated
	 */
	Variable getSubrelatedvariable();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsml.cpsml.State#getSubrelatedvariable <em>Subrelatedvariable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subrelatedvariable</em>' reference.
	 * @see #getSubrelatedvariable()
	 * @generated
	 */
	void setSubrelatedvariable(Variable value);

} // State
