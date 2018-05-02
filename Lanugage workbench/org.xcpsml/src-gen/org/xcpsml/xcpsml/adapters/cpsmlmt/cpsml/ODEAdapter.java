package org.xcpsml.xcpsml.adapters.cpsmlmt.cpsml;

import cpsml.Condition;
import cpsml.Function;
import cpsml.Interval;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.xcpsml.xcpsml.adapters.cpsmlmt.CPSMLMTAdaptersFactory;
import org.xcpsml.xcpsml.cpsml.ODE;

@SuppressWarnings("all")
public class ODEAdapter extends EObjectAdapter<ODE> implements cpsml.ODE {
  private CPSMLMTAdaptersFactory adaptersFactory;
  
  public ODEAdapter() {
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
  public Function getFunction() {
    return (Function) adaptersFactory.createAdapter(adaptee.getFunction(), eResource);
  }
  
  @Override
  public void setFunction(final Function o) {
    if (o != null)
    	adaptee.setFunction(((org.xcpsml.xcpsml.adapters.cpsmlmt.cpsml.FunctionAdapter) o).getAdaptee());
    else adaptee.setFunction(null);
  }
  
  @Override
  public Condition getCondition() {
    return (Condition) adaptersFactory.createAdapter(adaptee.getCondition(), eResource);
  }
  
  @Override
  public void setCondition(final Condition o) {
    if (o != null)
    	adaptee.setCondition(((org.xcpsml.xcpsml.adapters.cpsmlmt.cpsml.ConditionAdapter) o).getAdaptee());
    else adaptee.setCondition(null);
  }
  
  @Override
  public Interval getInterval() {
    return (Interval) adaptersFactory.createAdapter(adaptee.getInterval(), eResource);
  }
  
  @Override
  public void setInterval(final Interval o) {
    if (o != null)
    	adaptee.setInterval(((org.xcpsml.xcpsml.adapters.cpsmlmt.cpsml.IntervalAdapter) o).getAdaptee());
    else adaptee.setInterval(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return cpsml.CpsmlPackage.eINSTANCE.getODE();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case cpsml.CpsmlPackage.ODE__NAME:
    		return getName();
    	case cpsml.CpsmlPackage.ODE__FUNCTION:
    		return getFunction();
    	case cpsml.CpsmlPackage.ODE__CONDITION:
    		return getCondition();
    	case cpsml.CpsmlPackage.ODE__INTERVAL:
    		return getInterval();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case cpsml.CpsmlPackage.ODE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case cpsml.CpsmlPackage.ODE__FUNCTION:
    		return getFunction() != null;
    	case cpsml.CpsmlPackage.ODE__CONDITION:
    		return getCondition() != null;
    	case cpsml.CpsmlPackage.ODE__INTERVAL:
    		return getInterval() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case cpsml.CpsmlPackage.ODE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case cpsml.CpsmlPackage.ODE__FUNCTION:
    		setFunction(
    		(cpsml.Function)
    		 newValue);
    		return;
    	case cpsml.CpsmlPackage.ODE__CONDITION:
    		setCondition(
    		(cpsml.Condition)
    		 newValue);
    		return;
    	case cpsml.CpsmlPackage.ODE__INTERVAL:
    		setInterval(
    		(cpsml.Interval)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
