/**
 */
package org.xcpsml.xcpsml.cpsml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xcpsml.xcpsml.cpsml.CpsmlPackage;
import org.xcpsml.xcpsml.cpsml.ProbTransition;
import org.xcpsml.xcpsml.cpsml.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prob Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.impl.ProbTransitionImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.impl.ProbTransitionImpl#getPsrc <em>Psrc</em>}</li>
 *   <li>{@link org.xcpsml.xcpsml.cpsml.impl.ProbTransitionImpl#getPtgt <em>Ptgt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProbTransitionImpl extends TransitionImpl implements ProbTransition {
	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final float PROBABILITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected float probability = PROBABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPsrc() <em>Psrc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsrc()
	 * @generated
	 * @ordered
	 */
	protected State psrc;

	/**
	 * The cached value of the '{@link #getPtgt() <em>Ptgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtgt()
	 * @generated
	 * @ordered
	 */
	protected State ptgt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsmlPackage.Literals.PROB_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(float newProbability) {
		float oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.PROB_TRANSITION__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getPsrc() {
		if (psrc != null && psrc.eIsProxy()) {
			InternalEObject oldPsrc = (InternalEObject)psrc;
			psrc = (State)eResolveProxy(oldPsrc);
			if (psrc != oldPsrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CpsmlPackage.PROB_TRANSITION__PSRC, oldPsrc, psrc));
			}
		}
		return psrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetPsrc() {
		return psrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPsrc(State newPsrc, NotificationChain msgs) {
		State oldPsrc = psrc;
		psrc = newPsrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpsmlPackage.PROB_TRANSITION__PSRC, oldPsrc, newPsrc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPsrc(State newPsrc) {
		if (newPsrc != psrc) {
			NotificationChain msgs = null;
			if (psrc != null)
				msgs = ((InternalEObject)psrc).eInverseRemove(this, CpsmlPackage.STATE__OUTGOING_PROB_TRANSITIONS, State.class, msgs);
			if (newPsrc != null)
				msgs = ((InternalEObject)newPsrc).eInverseAdd(this, CpsmlPackage.STATE__OUTGOING_PROB_TRANSITIONS, State.class, msgs);
			msgs = basicSetPsrc(newPsrc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.PROB_TRANSITION__PSRC, newPsrc, newPsrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getPtgt() {
		if (ptgt != null && ptgt.eIsProxy()) {
			InternalEObject oldPtgt = (InternalEObject)ptgt;
			ptgt = (State)eResolveProxy(oldPtgt);
			if (ptgt != oldPtgt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CpsmlPackage.PROB_TRANSITION__PTGT, oldPtgt, ptgt));
			}
		}
		return ptgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetPtgt() {
		return ptgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPtgt(State newPtgt, NotificationChain msgs) {
		State oldPtgt = ptgt;
		ptgt = newPtgt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpsmlPackage.PROB_TRANSITION__PTGT, oldPtgt, newPtgt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPtgt(State newPtgt) {
		if (newPtgt != ptgt) {
			NotificationChain msgs = null;
			if (ptgt != null)
				msgs = ((InternalEObject)ptgt).eInverseRemove(this, CpsmlPackage.STATE__INCOMING_PROB_TRANSITIONS, State.class, msgs);
			if (newPtgt != null)
				msgs = ((InternalEObject)newPtgt).eInverseAdd(this, CpsmlPackage.STATE__INCOMING_PROB_TRANSITIONS, State.class, msgs);
			msgs = basicSetPtgt(newPtgt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.PROB_TRANSITION__PTGT, newPtgt, newPtgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpsmlPackage.PROB_TRANSITION__PSRC:
				if (psrc != null)
					msgs = ((InternalEObject)psrc).eInverseRemove(this, CpsmlPackage.STATE__OUTGOING_PROB_TRANSITIONS, State.class, msgs);
				return basicSetPsrc((State)otherEnd, msgs);
			case CpsmlPackage.PROB_TRANSITION__PTGT:
				if (ptgt != null)
					msgs = ((InternalEObject)ptgt).eInverseRemove(this, CpsmlPackage.STATE__INCOMING_PROB_TRANSITIONS, State.class, msgs);
				return basicSetPtgt((State)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpsmlPackage.PROB_TRANSITION__PSRC:
				return basicSetPsrc(null, msgs);
			case CpsmlPackage.PROB_TRANSITION__PTGT:
				return basicSetPtgt(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CpsmlPackage.PROB_TRANSITION__PROBABILITY:
				return getProbability();
			case CpsmlPackage.PROB_TRANSITION__PSRC:
				if (resolve) return getPsrc();
				return basicGetPsrc();
			case CpsmlPackage.PROB_TRANSITION__PTGT:
				if (resolve) return getPtgt();
				return basicGetPtgt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CpsmlPackage.PROB_TRANSITION__PROBABILITY:
				setProbability((Float)newValue);
				return;
			case CpsmlPackage.PROB_TRANSITION__PSRC:
				setPsrc((State)newValue);
				return;
			case CpsmlPackage.PROB_TRANSITION__PTGT:
				setPtgt((State)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case CpsmlPackage.PROB_TRANSITION__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case CpsmlPackage.PROB_TRANSITION__PSRC:
				setPsrc((State)null);
				return;
			case CpsmlPackage.PROB_TRANSITION__PTGT:
				setPtgt((State)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CpsmlPackage.PROB_TRANSITION__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case CpsmlPackage.PROB_TRANSITION__PSRC:
				return psrc != null;
			case CpsmlPackage.PROB_TRANSITION__PTGT:
				return ptgt != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //ProbTransitionImpl
