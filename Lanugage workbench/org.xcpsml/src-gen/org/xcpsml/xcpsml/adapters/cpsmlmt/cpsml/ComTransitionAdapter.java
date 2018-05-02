package org.xcpsml.xcpsml.adapters.cpsmlmt.cpsml;

import cpsml.State;
import cpsml.Variable;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.xcpsml.xcpsml.adapters.cpsmlmt.CPSMLMTAdaptersFactory;
import org.xcpsml.xcpsml.cpsml.ComTransition;

@SuppressWarnings("all")
public class ComTransitionAdapter extends EObjectAdapter<ComTransition> implements cpsml.ComTransition {
  private CPSMLMTAdaptersFactory adaptersFactory;
  
  public ComTransitionAdapter() {
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
  public State getCsrc() {
    return (State) adaptersFactory.createAdapter(adaptee.getCsrc(), eResource);
  }
  
  @Override
  public void setCsrc(final State o) {
    if (o != null)
    	adaptee.setCsrc(((org.xcpsml.xcpsml.adapters.cpsmlmt.cpsml.StateAdapter) o).getAdaptee());
    else adaptee.setCsrc(null);
  }
  
  @Override
  public State getCtgt() {
    return (State) adaptersFactory.createAdapter(adaptee.getCtgt(), eResource);
  }
  
  @Override
  public void setCtgt(final State o) {
    if (o != null)
    	adaptee.setCtgt(((org.xcpsml.xcpsml.adapters.cpsmlmt.cpsml.StateAdapter) o).getAdaptee());
    else adaptee.setCtgt(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static String EVENT_EDEFAULT = null;
  
  protected final static String GUARD_EDEFAULT = null;
  
  protected final static String ACTION_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return cpsml.CpsmlPackage.eINSTANCE.getComTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case cpsml.CpsmlPackage.COM_TRANSITION__NAME:
    		return getName();
    	case cpsml.CpsmlPackage.COM_TRANSITION__RELATEDVARIABLE2:
    		return getRelatedvariable2();
    	case cpsml.CpsmlPackage.COM_TRANSITION__EVENT:
    		return getEvent();
    	case cpsml.CpsmlPackage.COM_TRANSITION__GUARD:
    		return getGuard();
    	case cpsml.CpsmlPackage.COM_TRANSITION__ACTION:
    		return getAction();
    	case cpsml.CpsmlPackage.COM_TRANSITION__CSRC:
    		return getCsrc();
    	case cpsml.CpsmlPackage.COM_TRANSITION__CTGT:
    		return getCtgt();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case cpsml.CpsmlPackage.COM_TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case cpsml.CpsmlPackage.COM_TRANSITION__RELATEDVARIABLE2:
    		return getRelatedvariable2() != null;
    	case cpsml.CpsmlPackage.COM_TRANSITION__EVENT:
    		return getEvent() != EVENT_EDEFAULT;
    	case cpsml.CpsmlPackage.COM_TRANSITION__GUARD:
    		return getGuard() != GUARD_EDEFAULT;
    	case cpsml.CpsmlPackage.COM_TRANSITION__ACTION:
    		return getAction() != ACTION_EDEFAULT;
    	case cpsml.CpsmlPackage.COM_TRANSITION__CSRC:
    		return getCsrc() != null;
    	case cpsml.CpsmlPackage.COM_TRANSITION__CTGT:
    		return getCtgt() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case cpsml.CpsmlPackage.COM_TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case cpsml.CpsmlPackage.COM_TRANSITION__RELATEDVARIABLE2:
    		setRelatedvariable2(
    		(cpsml.Variable)
    		 newValue);
    		return;
    	case cpsml.CpsmlPackage.COM_TRANSITION__EVENT:
    		setEvent(
    		(java.lang.String)
    		 newValue);
    		return;
    	case cpsml.CpsmlPackage.COM_TRANSITION__GUARD:
    		setGuard(
    		(java.lang.String)
    		 newValue);
    		return;
    	case cpsml.CpsmlPackage.COM_TRANSITION__ACTION:
    		setAction(
    		(java.lang.String)
    		 newValue);
    		return;
    	case cpsml.CpsmlPackage.COM_TRANSITION__CSRC:
    		setCsrc(
    		(cpsml.State)
    		 newValue);
    		return;
    	case cpsml.CpsmlPackage.COM_TRANSITION__CTGT:
    		setCtgt(
    		(cpsml.State)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
