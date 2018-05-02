/**
 */
package cpsml.impl;

import cpsml.ComTransition;
import cpsml.CpsmlPackage;
import cpsml.ODE;
import cpsml.ProbTransition;
import cpsml.State;

import cpsml.Transition;
import cpsml.Variable;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cpsml.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link cpsml.impl.StateImpl#getSlaveode <em>Slaveode</em>}</li>
 *   <li>{@link cpsml.impl.StateImpl#getOutgoingComTransitions <em>Outgoing Com Transitions</em>}</li>
 *   <li>{@link cpsml.impl.StateImpl#getIncomingComTransitions <em>Incoming Com Transitions</em>}</li>
 *   <li>{@link cpsml.impl.StateImpl#getOutgoingProbTransitions <em>Outgoing Prob Transitions</em>}</li>
 *   <li>{@link cpsml.impl.StateImpl#getIncomingProbTransitions <em>Incoming Prob Transitions</em>}</li>
 *   <li>{@link cpsml.impl.StateImpl#getSubStates <em>Sub States</em>}</li>
 *   <li>{@link cpsml.impl.StateImpl#getInitialsubstate <em>Initialsubstate</em>}</li>
 *   <li>{@link cpsml.impl.StateImpl#getSubtransitions <em>Subtransitions</em>}</li>
 *   <li>{@link cpsml.impl.StateImpl#getSubodes <em>Subodes</em>}</li>
 *   <li>{@link cpsml.impl.StateImpl#getSubrelatedvariables <em>Subrelatedvariables</em>}</li>
 *   <li>{@link cpsml.impl.StateImpl#getSubrelatedvariable <em>Subrelatedvariable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSlaveode() <em>Slaveode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlaveode()
	 * @generated
	 * @ordered
	 */
	protected ODE slaveode;

	/**
	 * The cached value of the '{@link #getOutgoingComTransitions() <em>Outgoing Com Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingComTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ComTransition> outgoingComTransitions;

	/**
	 * The cached value of the '{@link #getIncomingComTransitions() <em>Incoming Com Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingComTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ComTransition> incomingComTransitions;

	/**
	 * The cached value of the '{@link #getOutgoingProbTransitions() <em>Outgoing Prob Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingProbTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ProbTransition> outgoingProbTransitions;

	/**
	 * The cached value of the '{@link #getIncomingProbTransitions() <em>Incoming Prob Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingProbTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ProbTransition> incomingProbTransitions;

	/**
	 * The cached value of the '{@link #getSubStates() <em>Sub States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> subStates;

	/**
	 * The cached value of the '{@link #getInitialsubstate() <em>Initialsubstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialsubstate()
	 * @generated
	 * @ordered
	 */
	protected State initialsubstate;

	/**
	 * The cached value of the '{@link #getSubtransitions() <em>Subtransitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> subtransitions;

	/**
	 * The cached value of the '{@link #getSubodes() <em>Subodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ODE> subodes;

	/**
	 * The cached value of the '{@link #getSubrelatedvariables() <em>Subrelatedvariables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubrelatedvariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> subrelatedvariables;

	/**
	 * The cached value of the '{@link #getSubrelatedvariable() <em>Subrelatedvariable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubrelatedvariable()
	 * @generated
	 * @ordered
	 */
	protected Variable subrelatedvariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsmlPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODE getSlaveode() {
		if (slaveode != null && slaveode.eIsProxy()) {
			InternalEObject oldSlaveode = (InternalEObject)slaveode;
			slaveode = (ODE)eResolveProxy(oldSlaveode);
			if (slaveode != oldSlaveode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CpsmlPackage.STATE__SLAVEODE, oldSlaveode, slaveode));
			}
		}
		return slaveode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODE basicGetSlaveode() {
		return slaveode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlaveode(ODE newSlaveode) {
		ODE oldSlaveode = slaveode;
		slaveode = newSlaveode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.STATE__SLAVEODE, oldSlaveode, slaveode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComTransition> getOutgoingComTransitions() {
		if (outgoingComTransitions == null) {
			outgoingComTransitions = new EObjectWithInverseResolvingEList<ComTransition>(ComTransition.class, this, CpsmlPackage.STATE__OUTGOING_COM_TRANSITIONS, CpsmlPackage.COM_TRANSITION__CSRC);
		}
		return outgoingComTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComTransition> getIncomingComTransitions() {
		if (incomingComTransitions == null) {
			incomingComTransitions = new EObjectWithInverseResolvingEList<ComTransition>(ComTransition.class, this, CpsmlPackage.STATE__INCOMING_COM_TRANSITIONS, CpsmlPackage.COM_TRANSITION__CTGT);
		}
		return incomingComTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProbTransition> getOutgoingProbTransitions() {
		if (outgoingProbTransitions == null) {
			outgoingProbTransitions = new EObjectWithInverseResolvingEList<ProbTransition>(ProbTransition.class, this, CpsmlPackage.STATE__OUTGOING_PROB_TRANSITIONS, CpsmlPackage.PROB_TRANSITION__PSRC);
		}
		return outgoingProbTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProbTransition> getIncomingProbTransitions() {
		if (incomingProbTransitions == null) {
			incomingProbTransitions = new EObjectWithInverseResolvingEList<ProbTransition>(ProbTransition.class, this, CpsmlPackage.STATE__INCOMING_PROB_TRANSITIONS, CpsmlPackage.PROB_TRANSITION__PTGT);
		}
		return incomingProbTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getSubStates() {
		if (subStates == null) {
			subStates = new EObjectContainmentEList<State>(State.class, this, CpsmlPackage.STATE__SUB_STATES);
		}
		return subStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialsubstate() {
		if (initialsubstate != null && initialsubstate.eIsProxy()) {
			InternalEObject oldInitialsubstate = (InternalEObject)initialsubstate;
			initialsubstate = (State)eResolveProxy(oldInitialsubstate);
			if (initialsubstate != oldInitialsubstate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CpsmlPackage.STATE__INITIALSUBSTATE, oldInitialsubstate, initialsubstate));
			}
		}
		return initialsubstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitialsubstate() {
		return initialsubstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialsubstate(State newInitialsubstate) {
		State oldInitialsubstate = initialsubstate;
		initialsubstate = newInitialsubstate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.STATE__INITIALSUBSTATE, oldInitialsubstate, initialsubstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getSubtransitions() {
		if (subtransitions == null) {
			subtransitions = new EObjectContainmentEList<Transition>(Transition.class, this, CpsmlPackage.STATE__SUBTRANSITIONS);
		}
		return subtransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODE> getSubodes() {
		if (subodes == null) {
			subodes = new EObjectContainmentEList<ODE>(ODE.class, this, CpsmlPackage.STATE__SUBODES);
		}
		return subodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getSubrelatedvariables() {
		if (subrelatedvariables == null) {
			subrelatedvariables = new EObjectContainmentEList<Variable>(Variable.class, this, CpsmlPackage.STATE__SUBRELATEDVARIABLES);
		}
		return subrelatedvariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getSubrelatedvariable() {
		if (subrelatedvariable != null && subrelatedvariable.eIsProxy()) {
			InternalEObject oldSubrelatedvariable = (InternalEObject)subrelatedvariable;
			subrelatedvariable = (Variable)eResolveProxy(oldSubrelatedvariable);
			if (subrelatedvariable != oldSubrelatedvariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CpsmlPackage.STATE__SUBRELATEDVARIABLE, oldSubrelatedvariable, subrelatedvariable));
			}
		}
		return subrelatedvariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetSubrelatedvariable() {
		return subrelatedvariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubrelatedvariable(Variable newSubrelatedvariable) {
		Variable oldSubrelatedvariable = subrelatedvariable;
		subrelatedvariable = newSubrelatedvariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.STATE__SUBRELATEDVARIABLE, oldSubrelatedvariable, subrelatedvariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpsmlPackage.STATE__OUTGOING_COM_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingComTransitions()).basicAdd(otherEnd, msgs);
			case CpsmlPackage.STATE__INCOMING_COM_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingComTransitions()).basicAdd(otherEnd, msgs);
			case CpsmlPackage.STATE__OUTGOING_PROB_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingProbTransitions()).basicAdd(otherEnd, msgs);
			case CpsmlPackage.STATE__INCOMING_PROB_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingProbTransitions()).basicAdd(otherEnd, msgs);
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
			case CpsmlPackage.STATE__OUTGOING_COM_TRANSITIONS:
				return ((InternalEList<?>)getOutgoingComTransitions()).basicRemove(otherEnd, msgs);
			case CpsmlPackage.STATE__INCOMING_COM_TRANSITIONS:
				return ((InternalEList<?>)getIncomingComTransitions()).basicRemove(otherEnd, msgs);
			case CpsmlPackage.STATE__OUTGOING_PROB_TRANSITIONS:
				return ((InternalEList<?>)getOutgoingProbTransitions()).basicRemove(otherEnd, msgs);
			case CpsmlPackage.STATE__INCOMING_PROB_TRANSITIONS:
				return ((InternalEList<?>)getIncomingProbTransitions()).basicRemove(otherEnd, msgs);
			case CpsmlPackage.STATE__SUB_STATES:
				return ((InternalEList<?>)getSubStates()).basicRemove(otherEnd, msgs);
			case CpsmlPackage.STATE__SUBTRANSITIONS:
				return ((InternalEList<?>)getSubtransitions()).basicRemove(otherEnd, msgs);
			case CpsmlPackage.STATE__SUBODES:
				return ((InternalEList<?>)getSubodes()).basicRemove(otherEnd, msgs);
			case CpsmlPackage.STATE__SUBRELATEDVARIABLES:
				return ((InternalEList<?>)getSubrelatedvariables()).basicRemove(otherEnd, msgs);
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
			case CpsmlPackage.STATE__NAME:
				return getName();
			case CpsmlPackage.STATE__SLAVEODE:
				if (resolve) return getSlaveode();
				return basicGetSlaveode();
			case CpsmlPackage.STATE__OUTGOING_COM_TRANSITIONS:
				return getOutgoingComTransitions();
			case CpsmlPackage.STATE__INCOMING_COM_TRANSITIONS:
				return getIncomingComTransitions();
			case CpsmlPackage.STATE__OUTGOING_PROB_TRANSITIONS:
				return getOutgoingProbTransitions();
			case CpsmlPackage.STATE__INCOMING_PROB_TRANSITIONS:
				return getIncomingProbTransitions();
			case CpsmlPackage.STATE__SUB_STATES:
				return getSubStates();
			case CpsmlPackage.STATE__INITIALSUBSTATE:
				if (resolve) return getInitialsubstate();
				return basicGetInitialsubstate();
			case CpsmlPackage.STATE__SUBTRANSITIONS:
				return getSubtransitions();
			case CpsmlPackage.STATE__SUBODES:
				return getSubodes();
			case CpsmlPackage.STATE__SUBRELATEDVARIABLES:
				return getSubrelatedvariables();
			case CpsmlPackage.STATE__SUBRELATEDVARIABLE:
				if (resolve) return getSubrelatedvariable();
				return basicGetSubrelatedvariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CpsmlPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case CpsmlPackage.STATE__SLAVEODE:
				setSlaveode((ODE)newValue);
				return;
			case CpsmlPackage.STATE__OUTGOING_COM_TRANSITIONS:
				getOutgoingComTransitions().clear();
				getOutgoingComTransitions().addAll((Collection<? extends ComTransition>)newValue);
				return;
			case CpsmlPackage.STATE__INCOMING_COM_TRANSITIONS:
				getIncomingComTransitions().clear();
				getIncomingComTransitions().addAll((Collection<? extends ComTransition>)newValue);
				return;
			case CpsmlPackage.STATE__OUTGOING_PROB_TRANSITIONS:
				getOutgoingProbTransitions().clear();
				getOutgoingProbTransitions().addAll((Collection<? extends ProbTransition>)newValue);
				return;
			case CpsmlPackage.STATE__INCOMING_PROB_TRANSITIONS:
				getIncomingProbTransitions().clear();
				getIncomingProbTransitions().addAll((Collection<? extends ProbTransition>)newValue);
				return;
			case CpsmlPackage.STATE__SUB_STATES:
				getSubStates().clear();
				getSubStates().addAll((Collection<? extends State>)newValue);
				return;
			case CpsmlPackage.STATE__INITIALSUBSTATE:
				setInitialsubstate((State)newValue);
				return;
			case CpsmlPackage.STATE__SUBTRANSITIONS:
				getSubtransitions().clear();
				getSubtransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case CpsmlPackage.STATE__SUBODES:
				getSubodes().clear();
				getSubodes().addAll((Collection<? extends ODE>)newValue);
				return;
			case CpsmlPackage.STATE__SUBRELATEDVARIABLES:
				getSubrelatedvariables().clear();
				getSubrelatedvariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case CpsmlPackage.STATE__SUBRELATEDVARIABLE:
				setSubrelatedvariable((Variable)newValue);
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
			case CpsmlPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CpsmlPackage.STATE__SLAVEODE:
				setSlaveode((ODE)null);
				return;
			case CpsmlPackage.STATE__OUTGOING_COM_TRANSITIONS:
				getOutgoingComTransitions().clear();
				return;
			case CpsmlPackage.STATE__INCOMING_COM_TRANSITIONS:
				getIncomingComTransitions().clear();
				return;
			case CpsmlPackage.STATE__OUTGOING_PROB_TRANSITIONS:
				getOutgoingProbTransitions().clear();
				return;
			case CpsmlPackage.STATE__INCOMING_PROB_TRANSITIONS:
				getIncomingProbTransitions().clear();
				return;
			case CpsmlPackage.STATE__SUB_STATES:
				getSubStates().clear();
				return;
			case CpsmlPackage.STATE__INITIALSUBSTATE:
				setInitialsubstate((State)null);
				return;
			case CpsmlPackage.STATE__SUBTRANSITIONS:
				getSubtransitions().clear();
				return;
			case CpsmlPackage.STATE__SUBODES:
				getSubodes().clear();
				return;
			case CpsmlPackage.STATE__SUBRELATEDVARIABLES:
				getSubrelatedvariables().clear();
				return;
			case CpsmlPackage.STATE__SUBRELATEDVARIABLE:
				setSubrelatedvariable((Variable)null);
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
			case CpsmlPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CpsmlPackage.STATE__SLAVEODE:
				return slaveode != null;
			case CpsmlPackage.STATE__OUTGOING_COM_TRANSITIONS:
				return outgoingComTransitions != null && !outgoingComTransitions.isEmpty();
			case CpsmlPackage.STATE__INCOMING_COM_TRANSITIONS:
				return incomingComTransitions != null && !incomingComTransitions.isEmpty();
			case CpsmlPackage.STATE__OUTGOING_PROB_TRANSITIONS:
				return outgoingProbTransitions != null && !outgoingProbTransitions.isEmpty();
			case CpsmlPackage.STATE__INCOMING_PROB_TRANSITIONS:
				return incomingProbTransitions != null && !incomingProbTransitions.isEmpty();
			case CpsmlPackage.STATE__SUB_STATES:
				return subStates != null && !subStates.isEmpty();
			case CpsmlPackage.STATE__INITIALSUBSTATE:
				return initialsubstate != null;
			case CpsmlPackage.STATE__SUBTRANSITIONS:
				return subtransitions != null && !subtransitions.isEmpty();
			case CpsmlPackage.STATE__SUBODES:
				return subodes != null && !subodes.isEmpty();
			case CpsmlPackage.STATE__SUBRELATEDVARIABLES:
				return subrelatedvariables != null && !subrelatedvariables.isEmpty();
			case CpsmlPackage.STATE__SUBRELATEDVARIABLE:
				return subrelatedvariable != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StateImpl
