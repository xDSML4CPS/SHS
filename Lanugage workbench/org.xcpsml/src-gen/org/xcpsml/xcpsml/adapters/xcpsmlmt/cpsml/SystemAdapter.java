package org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.xcpsml.xcpsml.adapters.xcpsmlmt.XCPSMLMTAdaptersFactory;
import org.xcpsml.xcpsmlmt.cpsml.ODE;
import org.xcpsml.xcpsmlmt.cpsml.ProbTransition;
import org.xcpsml.xcpsmlmt.cpsml.State;
import org.xcpsml.xcpsmlmt.cpsml.Transition;
import org.xcpsml.xcpsmlmt.cpsml.Variable;

@SuppressWarnings("all")
public class SystemAdapter extends EObjectAdapter<org.xcpsml.xcpsml.cpsml.System> implements org.xcpsml.xcpsmlmt.cpsml.System {
  private XCPSMLMTAdaptersFactory adaptersFactory;
  
  public SystemAdapter() {
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
  
  private EList<Variable> ownedvariables_;
  
  @Override
  public EList<Variable> getOwnedvariables() {
    if (ownedvariables_ == null)
    	ownedvariables_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedvariables(), adaptersFactory, eResource);
    return ownedvariables_;
  }
  
  @Override
  public Variable getRelatedvariable() {
    return (Variable) adaptersFactory.createAdapter(adaptee.getRelatedvariable(), eResource);
  }
  
  @Override
  public void setRelatedvariable(final Variable o) {
    if (o != null)
    	adaptee.setRelatedvariable(((org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.VariableAdapter) o).getAdaptee());
    else adaptee.setRelatedvariable(null);
  }
  
  private EList<State> ownedStates_;
  
  @Override
  public EList<State> getOwnedStates() {
    if (ownedStates_ == null)
    	ownedStates_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedStates(), adaptersFactory, eResource);
    return ownedStates_;
  }
  
  private EList<Transition> ownedTransitions_;
  
  @Override
  public EList<Transition> getOwnedTransitions() {
    if (ownedTransitions_ == null)
    	ownedTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedTransitions(), adaptersFactory, eResource);
    return ownedTransitions_;
  }
  
  @Override
  public State getInitialState() {
    return (State) adaptersFactory.createAdapter(adaptee.getInitialState(), eResource);
  }
  
  @Override
  public void setInitialState(final State o) {
    if (o != null)
    	adaptee.setInitialState(((org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.StateAdapter) o).getAdaptee());
    else adaptee.setInitialState(null);
  }
  
  private EList<ODE> ownedodes_;
  
  @Override
  public EList<ODE> getOwnedodes() {
    if (ownedodes_ == null)
    	ownedodes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedodes(), adaptersFactory, eResource);
    return ownedodes_;
  }
  
  @Override
  public void RealizeInitializeModel(final org.eclipse.emf.common.util.EList<java.lang.String> arguments) {
    org.xcpsml.xcpsml.aspects.SystemAspect.RealizeInitializeModel(adaptee, arguments
    );
  }
  
  @Override
  public void callscilab() {
    org.xcpsml.xcpsml.aspects.SystemAspect.callscilab(adaptee);
  }
  
  @Override
  public State getCurrentState() {
    return (State) adaptersFactory.createAdapter(org.xcpsml.xcpsml.aspects.SystemAspect.currentState(adaptee), eResource);
  }
  
  @Override
  public void setCurrentState(final State currentState) {
    org.xcpsml.xcpsml.aspects.SystemAspect.currentState(adaptee, (org.xcpsml.xcpsml.cpsml.State)((EObjectAdapter)currentState).getAdaptee()
    );
  }
  
  @Override
  public void dojump() {
    org.xcpsml.xcpsml.aspects.SystemAspect.dojump(adaptee);
  }
  
  @Override
  public State getFatherState() {
    return (State) adaptersFactory.createAdapter(org.xcpsml.xcpsml.aspects.SystemAspect.fatherState(adaptee), eResource);
  }
  
  @Override
  public void setFatherState(final State fatherState) {
    org.xcpsml.xcpsml.aspects.SystemAspect.fatherState(adaptee, (org.xcpsml.xcpsml.cpsml.State)((EObjectAdapter)fatherState).getAdaptee()
    );
  }
  
  @Override
  public void main() {
    org.xcpsml.xcpsml.aspects.SystemAspect.main(adaptee);
  }
  
  @Override
  public ProbTransition getPtok() {
    return (ProbTransition) adaptersFactory.createAdapter(org.xcpsml.xcpsml.aspects.SystemAspect.ptok(adaptee), eResource);
  }
  
  @Override
  public void setPtok(final ProbTransition ptok) {
    org.xcpsml.xcpsml.aspects.SystemAspect.ptok(adaptee, (org.xcpsml.xcpsml.cpsml.ProbTransition)((EObjectAdapter)ptok).getAdaptee()
    );
  }
  
  @Override
  public Float getRan() {
    return org.xcpsml.xcpsml.aspects.SystemAspect.ran(adaptee);
  }
  
  @Override
  public void setRan(final Float ran) {
    org.xcpsml.xcpsml.aspects.SystemAspect.ran(adaptee, ran
    );
  }
  
  @Override
  public int getSub() {
    return org.xcpsml.xcpsml.aspects.SystemAspect.sub(adaptee);
  }
  
  @Override
  public void setSub(final int sub) {
    org.xcpsml.xcpsml.aspects.SystemAspect.sub(adaptee, sub
    );
  }
  
  @Override
  public int getY0label() {
    return org.xcpsml.xcpsml.aspects.SystemAspect.y0label(adaptee);
  }
  
  @Override
  public void setY0label(final int y0label) {
    org.xcpsml.xcpsml.aspects.SystemAspect.y0label(adaptee, y0label
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static Float RAN_EDEFAULT = null;
  
  protected final static int SUB_EDEFAULT = 0;
  
  protected final static int Y0LABEL_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.eINSTANCE.getSystem();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__NAME:
    		return getName();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__OWNEDVARIABLES:
    		return getOwnedvariables();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__RELATEDVARIABLE:
    		return getRelatedvariable();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__OWNED_STATES:
    		return getOwnedStates();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__OWNED_TRANSITIONS:
    		return getOwnedTransitions();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__INITIAL_STATE:
    		return getInitialState();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__OWNEDODES:
    		return getOwnedodes();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__CURRENT_STATE:
    		return getCurrentState();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__FATHER_STATE:
    		return getFatherState();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__PTOK:
    		return getPtok();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__RAN:
    		return getRan();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__SUB:
    		return new java.lang.Integer(getSub());
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__Y0LABEL:
    		return new java.lang.Integer(getY0label());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__OWNEDVARIABLES:
    		return getOwnedvariables() != null && !getOwnedvariables().isEmpty();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__RELATEDVARIABLE:
    		return getRelatedvariable() != null;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__OWNED_STATES:
    		return getOwnedStates() != null && !getOwnedStates().isEmpty();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__OWNED_TRANSITIONS:
    		return getOwnedTransitions() != null && !getOwnedTransitions().isEmpty();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__INITIAL_STATE:
    		return getInitialState() != null;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__OWNEDODES:
    		return getOwnedodes() != null && !getOwnedodes().isEmpty();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__CURRENT_STATE:
    		return getCurrentState() != null;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__FATHER_STATE:
    		return getFatherState() != null;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__PTOK:
    		return getPtok() != null;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__RAN:
    		return getRan() != RAN_EDEFAULT;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__SUB:
    		return getSub() != SUB_EDEFAULT;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__Y0LABEL:
    		return getY0label() != Y0LABEL_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__OWNEDVARIABLES:
    		getOwnedvariables().clear();
    		getOwnedvariables().addAll((Collection) newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__RELATEDVARIABLE:
    		setRelatedvariable(
    		(org.xcpsml.xcpsmlmt.cpsml.Variable)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__OWNED_STATES:
    		getOwnedStates().clear();
    		getOwnedStates().addAll((Collection) newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__OWNED_TRANSITIONS:
    		getOwnedTransitions().clear();
    		getOwnedTransitions().addAll((Collection) newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__INITIAL_STATE:
    		setInitialState(
    		(org.xcpsml.xcpsmlmt.cpsml.State)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__OWNEDODES:
    		getOwnedodes().clear();
    		getOwnedodes().addAll((Collection) newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__CURRENT_STATE:
    		setCurrentState(
    		(org.xcpsml.xcpsmlmt.cpsml.State)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__FATHER_STATE:
    		setFatherState(
    		(org.xcpsml.xcpsmlmt.cpsml.State)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__PTOK:
    		setPtok(
    		(org.xcpsml.xcpsmlmt.cpsml.ProbTransition)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__RAN:
    		setRan(
    		(java.lang.Float)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__SUB:
    		setSub(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.SYSTEM__Y0LABEL:
    		setY0label(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
