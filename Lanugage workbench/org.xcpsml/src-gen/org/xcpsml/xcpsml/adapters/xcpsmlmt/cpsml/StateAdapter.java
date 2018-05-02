package org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.xcpsml.xcpsml.adapters.xcpsmlmt.XCPSMLMTAdaptersFactory;
import org.xcpsml.xcpsml.cpsml.State;
import org.xcpsml.xcpsmlmt.cpsml.ComTransition;
import org.xcpsml.xcpsmlmt.cpsml.ODE;
import org.xcpsml.xcpsmlmt.cpsml.ProbTransition;
import org.xcpsml.xcpsmlmt.cpsml.Transition;
import org.xcpsml.xcpsmlmt.cpsml.Variable;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements org.xcpsml.xcpsmlmt.cpsml.State {
  private XCPSMLMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
    super(org.xcpsml.xcpsml.adapters.xcpsmlmt.XCPSMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.xcpsml.xcpsml.adapters.xcpsmlmt.XCPSMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public ODE getSlaveode() {
    return (ODE) adaptersFactory.createAdapter(adaptee.getSlaveode(), eResource);
  }
  
  @Override
  public void setSlaveode(final ODE o) {
    if (o != null)
    	adaptee.setSlaveode(((org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.ODEAdapter) o).getAdaptee());
    else adaptee.setSlaveode(null);
  }
  
  private EList<ComTransition> outgoingComTransitions_;
  
  @Override
  public EList<ComTransition> getOutgoingComTransitions() {
    if (outgoingComTransitions_ == null)
    	outgoingComTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingComTransitions(), adaptersFactory, eResource);
    return outgoingComTransitions_;
  }
  
  private EList<ComTransition> incomingComTransitions_;
  
  @Override
  public EList<ComTransition> getIncomingComTransitions() {
    if (incomingComTransitions_ == null)
    	incomingComTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingComTransitions(), adaptersFactory, eResource);
    return incomingComTransitions_;
  }
  
  private EList<ProbTransition> outgoingProbTransitions_;
  
  @Override
  public EList<ProbTransition> getOutgoingProbTransitions() {
    if (outgoingProbTransitions_ == null)
    	outgoingProbTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingProbTransitions(), adaptersFactory, eResource);
    return outgoingProbTransitions_;
  }
  
  private EList<ProbTransition> incomingProbTransitions_;
  
  @Override
  public EList<ProbTransition> getIncomingProbTransitions() {
    if (incomingProbTransitions_ == null)
    	incomingProbTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingProbTransitions(), adaptersFactory, eResource);
    return incomingProbTransitions_;
  }
  
  private EList<org.xcpsml.xcpsmlmt.cpsml.State> subStates_;
  
  @Override
  public EList<org.xcpsml.xcpsmlmt.cpsml.State> getSubStates() {
    if (subStates_ == null)
    	subStates_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSubStates(), adaptersFactory, eResource);
    return subStates_;
  }
  
  @Override
  public org.xcpsml.xcpsmlmt.cpsml.State getInitialsubstate() {
    return (org.xcpsml.xcpsmlmt.cpsml.State) adaptersFactory.createAdapter(adaptee.getInitialsubstate(), eResource);
  }
  
  @Override
  public void setInitialsubstate(final org.xcpsml.xcpsmlmt.cpsml.State o) {
    if (o != null)
    	adaptee.setInitialsubstate(((org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.StateAdapter) o).getAdaptee());
    else adaptee.setInitialsubstate(null);
  }
  
  private EList<Transition> subtransitions_;
  
  @Override
  public EList<Transition> getSubtransitions() {
    if (subtransitions_ == null)
    	subtransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSubtransitions(), adaptersFactory, eResource);
    return subtransitions_;
  }
  
  private EList<ODE> subodes_;
  
  @Override
  public EList<ODE> getSubodes() {
    if (subodes_ == null)
    	subodes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSubodes(), adaptersFactory, eResource);
    return subodes_;
  }
  
  private EList<Variable> subrelatedvariables_;
  
  @Override
  public EList<Variable> getSubrelatedvariables() {
    if (subrelatedvariables_ == null)
    	subrelatedvariables_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSubrelatedvariables(), adaptersFactory, eResource);
    return subrelatedvariables_;
  }
  
  @Override
  public Variable getSubrelatedvariable() {
    return (Variable) adaptersFactory.createAdapter(adaptee.getSubrelatedvariable(), eResource);
  }
  
  @Override
  public void setSubrelatedvariable(final Variable o) {
    if (o != null)
    	adaptee.setSubrelatedvariable(((org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.VariableAdapter) o).getAdaptee());
    else adaptee.setSubrelatedvariable(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.eINSTANCE.getState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__NAME:
    		return getName();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__SLAVEODE:
    		return getSlaveode();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__OUTGOING_COM_TRANSITIONS:
    		return getOutgoingComTransitions();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__INCOMING_COM_TRANSITIONS:
    		return getIncomingComTransitions();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__OUTGOING_PROB_TRANSITIONS:
    		return getOutgoingProbTransitions();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__INCOMING_PROB_TRANSITIONS:
    		return getIncomingProbTransitions();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__SUB_STATES:
    		return getSubStates();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__INITIALSUBSTATE:
    		return getInitialsubstate();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__SUBTRANSITIONS:
    		return getSubtransitions();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__SUBODES:
    		return getSubodes();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__SUBRELATEDVARIABLES:
    		return getSubrelatedvariables();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__SUBRELATEDVARIABLE:
    		return getSubrelatedvariable();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__SLAVEODE:
    		return getSlaveode() != null;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__OUTGOING_COM_TRANSITIONS:
    		return getOutgoingComTransitions() != null && !getOutgoingComTransitions().isEmpty();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__INCOMING_COM_TRANSITIONS:
    		return getIncomingComTransitions() != null && !getIncomingComTransitions().isEmpty();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__OUTGOING_PROB_TRANSITIONS:
    		return getOutgoingProbTransitions() != null && !getOutgoingProbTransitions().isEmpty();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__INCOMING_PROB_TRANSITIONS:
    		return getIncomingProbTransitions() != null && !getIncomingProbTransitions().isEmpty();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__SUB_STATES:
    		return getSubStates() != null && !getSubStates().isEmpty();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__INITIALSUBSTATE:
    		return getInitialsubstate() != null;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__SUBTRANSITIONS:
    		return getSubtransitions() != null && !getSubtransitions().isEmpty();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__SUBODES:
    		return getSubodes() != null && !getSubodes().isEmpty();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__SUBRELATEDVARIABLES:
    		return getSubrelatedvariables() != null && !getSubrelatedvariables().isEmpty();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__SUBRELATEDVARIABLE:
    		return getSubrelatedvariable() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__SLAVEODE:
    		setSlaveode(
    		(org.xcpsml.xcpsmlmt.cpsml.ODE)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__OUTGOING_COM_TRANSITIONS:
    		getOutgoingComTransitions().clear();
    		getOutgoingComTransitions().addAll((Collection) newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__INCOMING_COM_TRANSITIONS:
    		getIncomingComTransitions().clear();
    		getIncomingComTransitions().addAll((Collection) newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__OUTGOING_PROB_TRANSITIONS:
    		getOutgoingProbTransitions().clear();
    		getOutgoingProbTransitions().addAll((Collection) newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__INCOMING_PROB_TRANSITIONS:
    		getIncomingProbTransitions().clear();
    		getIncomingProbTransitions().addAll((Collection) newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__SUB_STATES:
    		getSubStates().clear();
    		getSubStates().addAll((Collection) newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__INITIALSUBSTATE:
    		setInitialsubstate(
    		(org.xcpsml.xcpsmlmt.cpsml.State)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__SUBTRANSITIONS:
    		getSubtransitions().clear();
    		getSubtransitions().addAll((Collection) newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__SUBODES:
    		getSubodes().clear();
    		getSubodes().addAll((Collection) newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__SUBRELATEDVARIABLES:
    		getSubrelatedvariables().clear();
    		getSubrelatedvariables().addAll((Collection) newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.STATE__SUBRELATEDVARIABLE:
    		setSubrelatedvariable(
    		(org.xcpsml.xcpsmlmt.cpsml.Variable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
