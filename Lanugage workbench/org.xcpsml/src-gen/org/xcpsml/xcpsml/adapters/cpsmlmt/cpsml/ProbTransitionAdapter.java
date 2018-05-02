package org.xcpsml.xcpsml.adapters.cpsmlmt.cpsml;

import cpsml.State;
import cpsml.Variable;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.xcpsml.xcpsml.adapters.cpsmlmt.CPSMLMTAdaptersFactory;
import org.xcpsml.xcpsml.cpsml.ProbTransition;

@SuppressWarnings("all")
public class ProbTransitionAdapter extends EObjectAdapter<ProbTransition> implements cpsml.ProbTransition {
  private CPSMLMTAdaptersFactory adaptersFactory;
  
  public ProbTransitionAdapter() {
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
    	adaptee.setRelatedvariable2(((org.xcpsml.xcpsml.adapters.cpsmlmt.cpsml.VariableAdapter) o).getAdaptee());
    else adaptee.setRelatedvariable2(null);
  }
  
  @Override
  public State getPsrc() {
    return (State) adaptersFactory.createAdapter(adaptee.getPsrc(), eResource);
  }
  
  @Override
  public void setPsrc(final State o) {
    if (o != null)
    	adaptee.setPsrc(((org.xcpsml.xcpsml.adapters.cpsmlmt.cpsml.StateAdapter) o).getAdaptee());
    else adaptee.setPsrc(null);
  }
  
  @Override
  public State getPtgt() {
    return (State) adaptersFactory.createAdapter(adaptee.getPtgt(), eResource);
  }
  
  @Override
  public void setPtgt(final State o) {
    if (o != null)
    	adaptee.setPtgt(((org.xcpsml.xcpsml.adapters.cpsmlmt.cpsml.StateAdapter) o).getAdaptee());
    else adaptee.setPtgt(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static String EVENT_EDEFAULT = null;
  
  protected final static String GUARD_EDEFAULT = null;
  
  protected final static String ACTION_EDEFAULT = null;
  
  protected final static float PROBABILITY_EDEFAULT = 0.0F;
  
  @Override
  public EClass eClass() {
    return cpsml.CpsmlPackage.eINSTANCE.getProbTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case cpsml.CpsmlPackage.PROB_TRANSITION__NAME:
    		return getName();
    	case cpsml.CpsmlPackage.PROB_TRANSITION__RELATEDVARIABLE2:
    		return getRelatedvariable2();
    	case cpsml.CpsmlPackage.PROB_TRANSITION__EVENT:
    		return getEvent();
    	case cpsml.CpsmlPackage.PROB_TRANSITION__GUARD:
    		return getGuard();
    	case cpsml.CpsmlPackage.PROB_TRANSITION__ACTION:
    		return getAction();
    	case cpsml.CpsmlPackage.PROB_TRANSITION__PROBABILITY:
    		return new java.lang.Float(getProbability());
    	case cpsml.CpsmlPackage.PROB_TRANSITION__PSRC:
    		return getPsrc();
    	case cpsml.CpsmlPackage.PROB_TRANSITION__PTGT:
    		return getPtgt();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case cpsml.CpsmlPackage.PROB_TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case cpsml.CpsmlPackage.PROB_TRANSITION__RELATEDVARIABLE2:
    		return getRelatedvariable2() != null;
    	case cpsml.CpsmlPackage.PROB_TRANSITION__EVENT:
    		return getEvent() != EVENT_EDEFAULT;
    	case cpsml.CpsmlPackage.PROB_TRANSITION__GUARD:
    		return getGuard() != GUARD_EDEFAULT;
    	case cpsml.CpsmlPackage.PROB_TRANSITION__ACTION:
    		return getAction() != ACTION_EDEFAULT;
    	case cpsml.CpsmlPackage.PROB_TRANSITION__PROBABILITY:
    		return getProbability() != PROBABILITY_EDEFAULT;
    	case cpsml.CpsmlPackage.PROB_TRANSITION__PSRC:
    		return getPsrc() != null;
    	case cpsml.CpsmlPackage.PROB_TRANSITION__PTGT:
    		return getPtgt() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case cpsml.CpsmlPackage.PROB_TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case cpsml.CpsmlPackage.PROB_TRANSITION__RELATEDVARIABLE2:
    		setRelatedvariable2(
    		(cpsml.Variable)
    		 newValue);
    		return;
    	case cpsml.CpsmlPackage.PROB_TRANSITION__EVENT:
    		setEvent(
    		(java.lang.String)
    		 newValue);
    		return;
    	case cpsml.CpsmlPackage.PROB_TRANSITION__GUARD:
    		setGuard(
    		(java.lang.String)
    		 newValue);
    		return;
    	case cpsml.CpsmlPackage.PROB_TRANSITION__ACTION:
    		setAction(
    		(java.lang.String)
    		 newValue);
    		return;
    	case cpsml.CpsmlPackage.PROB_TRANSITION__PROBABILITY:
    		setProbability(((java.lang.Float) newValue).floatValue());
    		return;
    	case cpsml.CpsmlPackage.PROB_TRANSITION__PSRC:
    		setPsrc(
    		(cpsml.State)
    		 newValue);
    		return;
    	case cpsml.CpsmlPackage.PROB_TRANSITION__PTGT:
    		setPtgt(
    		(cpsml.State)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
