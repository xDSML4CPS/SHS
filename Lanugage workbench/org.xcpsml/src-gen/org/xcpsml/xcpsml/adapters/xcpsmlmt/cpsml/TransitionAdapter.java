package org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.xcpsml.xcpsml.adapters.xcpsmlmt.XCPSMLMTAdaptersFactory;
import org.xcpsml.xcpsml.cpsml.Transition;
import org.xcpsml.xcpsmlmt.cpsml.Variable;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements org.xcpsml.xcpsmlmt.cpsml.Transition {
  private XCPSMLMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
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
  public String getEvent() {
    return adaptee.getEvent();
  }
  
  @Override
  public void setEvent(final String o) {
    adaptee.setEvent(o);
  }
  
  @Override
  public String getGuard() {
    return adaptee.getGuard();
  }
  
  @Override
  public void setGuard(final String o) {
    adaptee.setGuard(o);
  }
  
  @Override
  public String getAction() {
    return adaptee.getAction();
  }
  
  @Override
  public void setAction(final String o) {
    adaptee.setAction(o);
  }
  
  @Override
  public Variable getRelatedvariable2() {
    return (Variable) adaptersFactory.createAdapter(adaptee.getRelatedvariable2(), eResource);
  }
  
  @Override
  public void setRelatedvariable2(final Variable o) {
    if (o != null)
    	adaptee.setRelatedvariable2(((org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.VariableAdapter) o).getAdaptee());
    else adaptee.setRelatedvariable2(null);
  }
  
  @Override
  public boolean holds() {
    return org.xcpsml.xcpsml.aspects.TransitionAspect.holds(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static String EVENT_EDEFAULT = null;
  
  protected final static String GUARD_EDEFAULT = null;
  
  protected final static String ACTION_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.TRANSITION__NAME:
    		return getName();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.TRANSITION__RELATEDVARIABLE2:
    		return getRelatedvariable2();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.TRANSITION__EVENT:
    		return getEvent();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.TRANSITION__GUARD:
    		return getGuard();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.TRANSITION__ACTION:
    		return getAction();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.TRANSITION__RELATEDVARIABLE2:
    		return getRelatedvariable2() != null;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.TRANSITION__EVENT:
    		return getEvent() != EVENT_EDEFAULT;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.TRANSITION__GUARD:
    		return getGuard() != GUARD_EDEFAULT;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.TRANSITION__ACTION:
    		return getAction() != ACTION_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.TRANSITION__RELATEDVARIABLE2:
    		setRelatedvariable2(
    		(org.xcpsml.xcpsmlmt.cpsml.Variable)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.TRANSITION__EVENT:
    		setEvent(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.TRANSITION__GUARD:
    		setGuard(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.TRANSITION__ACTION:
    		setAction(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
