package org.xcpsml.xcpsml.adapters.cpsmlmt.cpsml;

import cpsml.ODE;
import cpsml.State;
import cpsml.Transition;
import cpsml.Variable;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.xcpsml.xcpsml.adapters.cpsmlmt.CPSMLMTAdaptersFactory;

@SuppressWarnings("all")
public class SystemAdapter extends EObjectAdapter<org.xcpsml.xcpsml.cpsml.System> implements cpsml.System {
  private CPSMLMTAdaptersFactory adaptersFactory;
  
  public SystemAdapter() {
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
    	adaptee.setRelatedvariable(((org.xcpsml.xcpsml.adapters.cpsmlmt.cpsml.VariableAdapter) o).getAdaptee());
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
    	adaptee.setInitialState(((org.xcpsml.xcpsml.adapters.cpsmlmt.cpsml.StateAdapter) o).getAdaptee());
    else adaptee.setInitialState(null);
  }
  
  private EList<ODE> ownedodes_;
  
  @Override
  public EList<ODE> getOwnedodes() {
    if (ownedodes_ == null)
    	ownedodes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedodes(), adaptersFactory, eResource);
    return ownedodes_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return cpsml.CpsmlPackage.eINSTANCE.getSystem();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case cpsml.CpsmlPackage.SYSTEM__NAME:
    		return getName();
    	case cpsml.CpsmlPackage.SYSTEM__OWNEDVARIABLES:
    		return getOwnedvariables();
    	case cpsml.CpsmlPackage.SYSTEM__RELATEDVARIABLE:
    		return getRelatedvariable();
    	case cpsml.CpsmlPackage.SYSTEM__OWNED_STATES:
    		return getOwnedStates();
    	case cpsml.CpsmlPackage.SYSTEM__OWNED_TRANSITIONS:
    		return getOwnedTransitions();
    	case cpsml.CpsmlPackage.SYSTEM__INITIAL_STATE:
    		return getInitialState();
    	case cpsml.CpsmlPackage.SYSTEM__OWNEDODES:
    		return getOwnedodes();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case cpsml.CpsmlPackage.SYSTEM__NAME:
    		return getName() != NAME_EDEFAULT;
    	case cpsml.CpsmlPackage.SYSTEM__OWNEDVARIABLES:
    		return getOwnedvariables() != null && !getOwnedvariables().isEmpty();
    	case cpsml.CpsmlPackage.SYSTEM__RELATEDVARIABLE:
    		return getRelatedvariable() != null;
    	case cpsml.CpsmlPackage.SYSTEM__OWNED_STATES:
    		return getOwnedStates() != null && !getOwnedStates().isEmpty();
    	case cpsml.CpsmlPackage.SYSTEM__OWNED_TRANSITIONS:
    		return getOwnedTransitions() != null && !getOwnedTransitions().isEmpty();
    	case cpsml.CpsmlPackage.SYSTEM__INITIAL_STATE:
    		return getInitialState() != null;
    	case cpsml.CpsmlPackage.SYSTEM__OWNEDODES:
    		return getOwnedodes() != null && !getOwnedodes().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case cpsml.CpsmlPackage.SYSTEM__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case cpsml.CpsmlPackage.SYSTEM__OWNEDVARIABLES:
    		getOwnedvariables().clear();
    		getOwnedvariables().addAll((Collection) newValue);
    		return;
    	case cpsml.CpsmlPackage.SYSTEM__RELATEDVARIABLE:
    		setRelatedvariable(
    		(cpsml.Variable)
    		 newValue);
    		return;
    	case cpsml.CpsmlPackage.SYSTEM__OWNED_STATES:
    		getOwnedStates().clear();
    		getOwnedStates().addAll((Collection) newValue);
    		return;
    	case cpsml.CpsmlPackage.SYSTEM__OWNED_TRANSITIONS:
    		getOwnedTransitions().clear();
    		getOwnedTransitions().addAll((Collection) newValue);
    		return;
    	case cpsml.CpsmlPackage.SYSTEM__INITIAL_STATE:
    		setInitialState(
    		(cpsml.State)
    		 newValue);
    		return;
    	case cpsml.CpsmlPackage.SYSTEM__OWNEDODES:
    		getOwnedodes().clear();
    		getOwnedodes().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
