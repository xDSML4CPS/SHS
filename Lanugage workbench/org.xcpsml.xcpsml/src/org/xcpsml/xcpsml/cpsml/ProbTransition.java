/**
 */
package org.xcpsml.xcpsml.cpsml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prob Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.ProbTransition#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.ProbTransition#getPsrc <em>Psrc</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.ProbTransition#getPtgt <em>Ptgt</em>}</li>
 * </ul>
 *
 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getProbTransition()
 * @model
 * @generated
 */
public interface ProbTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(float)
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getProbTransition_Probability()
	 * @model
	 * @generated
	 */
	float getProbability();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsml.cpsml.ProbTransition#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(float value);

	/**
	 * Returns the value of the '<em><b>Psrc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.xcpsml.xcpsml.cpsml.State#getOutgoingProbTransitions <em>Outgoing Prob Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Psrc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Psrc</em>' reference.
	 * @see #setPsrc(State)
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getProbTransition_Psrc()
	 * @see org.xcpsml.xcpsml.cpsml.State#getOutgoingProbTransitions
	 * @model opposite="outgoingProbTransitions" required="true"
	 * @generated
	 */
	State getPsrc();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsml.cpsml.ProbTransition#getPsrc <em>Psrc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Psrc</em>' reference.
	 * @see #getPsrc()
	 * @generated
	 */
	void setPsrc(State value);

	/**
	 * Returns the value of the '<em><b>Ptgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.xcpsml.xcpsml.cpsml.State#getIncomingProbTransitions <em>Incoming Prob Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ptgt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ptgt</em>' reference.
	 * @see #setPtgt(State)
	 * @see org.xcpsml.xcpsml.cpsml.CpsmlPackage#getProbTransition_Ptgt()
	 * @see org.xcpsml.xcpsml.cpsml.State#getIncomingProbTransitions
	 * @model opposite="incomingProbTransitions" required="true"
	 * @generated
	 */
	State getPtgt();

	/**
	 * Sets the value of the '{@link org.xcpsml.xcpsml.cpsml.ProbTransition#getPtgt <em>Ptgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ptgt</em>' reference.
	 * @see #getPtgt()
	 * @generated
	 */
	void setPtgt(State value);

} // ProbTransition
