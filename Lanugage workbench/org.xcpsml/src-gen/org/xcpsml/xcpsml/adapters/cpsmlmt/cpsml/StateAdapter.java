package org.xcpsml.xcpsml.adapters.cpsmlmt.cpsml;

import cpsml.ComTransition;
import cpsml.ODE;
import cpsml.ProbTransition;
import cpsml.Transition;
import cpsml.Variable;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.xcpsml.xcpsml.adapters.cpsmlmt.CPSMLMTAdaptersFactory;
import org.xcpsml.xcpsml.cpsml.State;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements cpsml.State {
  private CPSMLMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
    super(org.xcpsml.xcpsml.adapters.cpsmlmt.CPSMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.xcpsml.xcpsml.adapters.cpsmlmt.CPSMLMTAdaptersFactory.getInstance();
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
    	adaptee.setSlaveode(((org.xcpsml.xcpsml.adapters.cpsmlmt.cpsml.ODEAdapter) o).getAdaptee());
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
  
  private EList<cpsml.State> subStates_;
  
  @Override
  public EList<cpsml.State> getSubStates() {
    if (subStates_ == null)
    	subStates_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSubStates(), adaptersFactory, eResource);
    return subStates_;
  }
  
  @Override
  public cpsml.State getInitialsubstate() {
    return (cpsml.State) adaptersFactory.createAdapter(adaptee.getInitialsubstate(), eResource);
  }
  
  @Override
  public void setInitialsubstate(final cpsml.State o) {
    if (o != null)
    	adaptee.setInitialsubstate(((org.xcpsml.xcpsml.adapters.cpsmlmt.cpsml.StateAdapter) o).getAdaptee());
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
    	adaptee.setSubrelatedvariable(((org.xcpsml.xcpsml.adapters.cpsmlmt.cpsml.VariableAdapter) o).getAdaptee());
    else adaptee.setSubrelatedvariable(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return cpsml.CpsmlPackage.eINSTANCE.getState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case cpsml.CpsmlPackage.STATE__NAME:
    		return getName();
    	case cpsml.CpsmlPackage.STATE__SLAVEODE:
    		return getSlaveode();
    	case cpsml.CpsmlPackage.STATE__OUTGOING_COM_TRANSITIONS:
    		return getOutgoingComTransitions();
    	case cpsml.CpsmlPackage.STATE__INCOMING_COM_TRANSITIONS:
    		return getIncomingComTransitions();
    	case cpsml.CpsmlPackage.STATE__OUTGOING_PROB_TRANSITIONS:
    		return getOutgoingProbTransitions();
    	case cpsml.CpsmlPackage.STATE__INCOMING_PROB_TRANSITIONS:
    		return getIncomingProbTransitions();
    	case cpsml.CpsmlPackage.STATE__SUB_STATES:
    		return getSubStates();
    	case cpsml.CpsmlPackage.STATE__INITIALSUBSTATE:
    		return getInitialsubstate();
    	case cpsml.CpsmlPackage.STATE__SUBTRANSITIONS:
    		return getSubtransitions();
    	case cpsml.CpsmlPackage.STATE__SUBODES:
    		return getSubodes();
    	case cpsml.CpsmlPackage.STATE__SUBRELATEDVARIABLES:
    		return getSubrelatedvariables();
    	case cpsml.CpsmlPackage.STATE__SUBRELATEDVARIABLE:
    		return getSubrelatedvariable();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case cpsml.CpsmlPackage.STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case cpsml.CpsmlPackage.STATE__SLAVEODE:
    		return getSlaveode() != null;
    	case cpsml.CpsmlPackage.STATE__OUTGOING_COM_TRANSITIONS:
    		return getOutgoingComTransitions() != null && !getOutgoingComTransitions().isEmpty();
    	case cpsml.CpsmlPackage.STATE__INCOMING_COM_TRANSITIONS:
    		return getIncomingComTransitions() != null && !getIncomingComTransitions().isEmpty();
    	case cpsml.CpsmlPackage.STATE__OUTGOING_PROB_TRANSITIONS:
    		return getOutgoingProbTransitions() != null && !getOutgoingProbTransitions().isEmpty();
    	case cpsml.CpsmlPackage.STATE__INCOMING_PROB_TRANSITIONS:
    		return getIncomingProbTransitions() != null && !getIncomingProbTransitions().isEmpty();
    	case cpsml.CpsmlPackage.STATE__SUB_STATES:
    		return getSubStates() != null && !getSubStates().isEmpty();
    	case cpsml.CpsmlPackage.STATE__INITIALSUBSTATE:
    		return getInitialsubstate() != null;
    	case cpsml.CpsmlPackage.STATE__SUBTRANSITIONS:
    		return getSubtransitions() != null && !getSubtransitions().isEmpty();
    	case cpsml.CpsmlPackage.STATE__SUBODES:
    		return getSubodes() != null && !getSubodes().isEmpty();
    	case cpsml.CpsmlPackage.STATE__SUBRELATEDVARIABLES:
    		return getSubrelatedvariables() != null && !getSubrelatedvariables().isEmpty();
    	case cpsml.CpsmlPackage.STATE__SUBRELATEDVARIABLE:
    		return getSubrelatedvariable() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case cpsml.CpsmlPackage.STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case cpsml.CpsmlPackage.STATE__SLAVEODE:
    		setSlaveode(
    		(cpsml.ODE)
    		 newValue);
    		return;
    	case cpsml.CpsmlPackage.STATE__OUTGOING_COM_TRANSITIONS:
    		getOutgoingComTransitions().clear();
    		getOutgoingComTransitions().addAll((Collection) newValue);
    		return;
    	case cpsml.CpsmlPackage.STATE__INCOMING_COM_TRANSITIONS:
    		getIncomingComTransitions().clear();
    		getIncomingComTransitions().addAll((Collection) newValue);
    		return;
    	case cpsml.CpsmlPackage.STATE__OUTGOING_PROB_TRANSITIONS:
    		getOutgoingProbTransitions().clear();
    		getOutgoingProbTransitions().addAll((Collection) newValue);
    		return;
    	case cpsml.CpsmlPackage.STATE__INCOMING_PROB_TRANSITIONS:
    		getIncomingProbTransitions().clear();
    		getIncomingProbTransitions().addAll((Collection) newValue);
    		return;
    	case cpsml.CpsmlPackage.STATE__SUB_STATES:
    		getSubStates().clear();
    		getSubStates().addAll((Collection) newValue);
    		return;
    	case cpsml.CpsmlPackage.STATE__INITIALSUBSTATE:
    		setInitialsubstate(
    		(cpsml.State)
    		 newValue);
    		return;
    	case cpsml.CpsmlPackage.STATE__SUBTRANSITIONS:
    		getSubtransitions().clear();
    		getSubtransitions().addAll((Collection) newValue);
    		return;
    	case cpsml.CpsmlPackage.STATE__SUBODES:
    		getSubodes().clear();
    		getSubodes().addAll((Collection) newValue);
    		return;
    	case cpsml.CpsmlPackage.STATE__SUBRELATEDVARIABLES:
    		getSubrelatedvariables().clear();
    		getSubrelatedvariables().addAll((Collection) newValue);
    		return;
    	case cpsml.CpsmlPackage.STATE__SUBRELATEDVARIABLE:
    		setSubrelatedvariable(
    		(cpsml.Variable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
