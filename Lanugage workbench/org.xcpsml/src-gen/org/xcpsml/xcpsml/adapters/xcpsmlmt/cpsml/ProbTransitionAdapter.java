package org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.xcpsml.xcpsml.adapters.xcpsmlmt.XCPSMLMTAdaptersFactory;
import org.xcpsml.xcpsml.cpsml.ProbTransition;
import org.xcpsml.xcpsmlmt.cpsml.State;
import org.xcpsml.xcpsmlmt.cpsml.Variable;

@SuppressWarnings("all")
public class ProbTransitionAdapter extends EObjectAdapter<ProbTransition> implements org.xcpsml.xcpsmlmt.cpsml.ProbTransition {
  private XCPSMLMTAdaptersFactory adaptersFactory;
  
  public ProbTransitionAdapter() {
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
  public float getProbability() {
    return adaptee.getProbability();
  }
  
  @Override
  public void setProbability(final float o) {
    adaptee.setProbability(o);
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
  public State getPsrc() {
    return (State) adaptersFactory.createAdapter(adaptee.getPsrc(), eResource);
  }
  
  @Override
  public void setPsrc(final State o) {
    if (o != null)
    	adaptee.setPsrc(((org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.StateAdapter) o).getAdaptee());
    else adaptee.setPsrc(null);
  }
  
  @Override
  public State getPtgt() {
    return (State) adaptersFactory.createAdapter(adaptee.getPtgt(), eResource);
  }
  
  @Override
  public void setPtgt(final State o) {
    if (o != null)
    	adaptee.setPtgt(((org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.StateAdapter) o).getAdaptee());
    else adaptee.setPtgt(null);
  }
  
  @Override
  public boolean holds() {
    return org.xcpsml.xcpsml.aspects.TransitionAspect.holds(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static String EVENT_EDEFAULT = null;
  
  protected final static String GUARD_EDEFAULT = null;
  
  protected final static String ACTION_EDEFAULT = null;
  
  protected final static float PROBABILITY_EDEFAULT = 0.0F;
  
  @Override
  public EClass eClass() {
    return org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.eINSTANCE.getProbTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__NAME:
    		return getName();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__RELATEDVARIABLE2:
    		return getRelatedvariable2();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__EVENT:
    		return getEvent();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__GUARD:
    		return getGuard();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__ACTION:
    		return getAction();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__PROBABILITY:
    		return new java.lang.Float(getProbability());
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__PSRC:
    		return getPsrc();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__PTGT:
    		return getPtgt();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__RELATEDVARIABLE2:
    		return getRelatedvariable2() != null;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__EVENT:
    		return getEvent() != EVENT_EDEFAULT;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__GUARD:
    		return getGuard() != GUARD_EDEFAULT;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__ACTION:
    		return getAction() != ACTION_EDEFAULT;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__PROBABILITY:
    		return getProbability() != PROBABILITY_EDEFAULT;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__PSRC:
    		return getPsrc() != null;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__PTGT:
    		return getPtgt() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__RELATEDVARIABLE2:
    		setRelatedvariable2(
    		(org.xcpsml.xcpsmlmt.cpsml.Variable)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__EVENT:
    		setEvent(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__GUARD:
    		setGuard(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__ACTION:
    		setAction(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__PROBABILITY:
    		setProbability(((java.lang.Float) newValue).floatValue());
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__PSRC:
    		setPsrc(
    		(org.xcpsml.xcpsmlmt.cpsml.State)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.PROB_TRANSITION__PTGT:
    		setPtgt(
    		(org.xcpsml.xcpsmlmt.cpsml.State)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
