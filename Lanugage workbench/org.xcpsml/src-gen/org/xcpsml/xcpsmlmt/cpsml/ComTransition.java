/**
 */
package org.xcpsml.xcpsmlmt.cpsml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Com Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xcpsml.xcpsmlmt.cpsml.ComTransition#getCsrc <em>Csrc</em>}</li>
 *   <li>{@link org.xcpsml.xcpsmlmt.cpsml.ComTransition#getCtgt <em>Ctgt</em>}</li>
 * </ul>
 *
 * @see org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage#getComTransition()
 * @model
 * @generated
 */
public interface ComTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Csrc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.xcpsml.xcpsmlmt.cpsml.State#getOutgoingComTransitions <em>Outgoing Com Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csrc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csrc</em>' reference.
	 * @see #setCsrc(State)
	 * @see org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage#getComTransition_Csrc()
	 * @see org.xcpsml.xcpsmlmt.cpsml.State#getOutgoingComTransitions
	 * @model opposite="outgoingComTransitions" required="true"
	 * @generated
	 */
	State getCsrc();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsmlmt.cpsml.ComTransition#getCsrc <em>Csrc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Csrc</em>' reference.
	 * @see #getCsrc()
	 * @generated
	 */
	void setCsrc(State value);

	/**
	 * Returns the value of the '<em><b>Ctgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.xcpsml.xcpsmlmt.cpsml.State#getIncomingComTransitions <em>Incoming Com Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctgt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctgt</em>' reference.
	 * @see #setCtgt(State)
	 * @see org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage#getComTransition_Ctgt()
	 * @see org.xcpsml.xcpsmlmt.cpsml.State#getIncomingComTransitions
	 * @model opposite="incomingComTransitions" required="true"
	 * @generated
	 */
	State getCtgt();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsmlmt.cpsml.ComTransition#getCtgt <em>Ctgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctgt</em>' reference.
	 * @see #getCtgt()
	 * @generated
	 */
	void setCtgt(State value);

} // ComTransition
