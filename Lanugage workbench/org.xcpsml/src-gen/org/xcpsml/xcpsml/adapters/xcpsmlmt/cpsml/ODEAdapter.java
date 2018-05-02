package org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.xcpsml.xcpsml.adapters.xcpsmlmt.XCPSMLMTAdaptersFactory;
import org.xcpsml.xcpsml.cpsml.ODE;
import org.xcpsml.xcpsmlmt.cpsml.Condition;
import org.xcpsml.xcpsmlmt.cpsml.Function;
import org.xcpsml.xcpsmlmt.cpsml.Interval;

@SuppressWarnings("all")
public class ODEAdapter extends EObjectAdapter<ODE> implements org.xcpsml.xcpsmlmt.cpsml.ODE {
  private XCPSMLMTAdaptersFactory adaptersFactory;
  
  public ODEAdapter() {
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
  public Function getFunction() {
    return (Function) adaptersFactory.createAdapter(adaptee.getFunction(), eResource);
  }
  
  @Override
  public void setFunction(final Function o) {
    if (o != null)
    	adaptee.setFunction(((org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.FunctionAdapter) o).getAdaptee());
    else adaptee.setFunction(null);
  }
  
  @Override
  public Condition getCondition() {
    return (Condition) adaptersFactory.createAdapter(adaptee.getCondition(), eResource);
  }
  
  @Override
  public void setCondition(final Condition o) {
    if (o != null)
    	adaptee.setCondition(((org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.ConditionAdapter) o).getAdaptee());
    else adaptee.setCondition(null);
  }
  
  @Override
  public Interval getInterval() {
    return (Interval) adaptersFactory.createAdapter(adaptee.getInterval(), eResource);
  }
  
  @Override
  public void setInterval(final Interval o) {
    if (o != null)
    	adaptee.setInterval(((org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.IntervalAdapter) o).getAdaptee());
    else adaptee.setInterval(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.eINSTANCE.getODE();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.ODE__NAME:
    		return getName();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.ODE__FUNCTION:
    		return getFunction();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.ODE__CONDITION:
    		return getCondition();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.ODE__INTERVAL:
    		return getInterval();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.ODE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.ODE__FUNCTION:
    		return getFunction() != null;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.ODE__CONDITION:
    		return getCondition() != null;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.ODE__INTERVAL:
    		return getInterval() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.ODE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.ODE__FUNCTION:
    		setFunction(
    		(org.xcpsml.xcpsmlmt.cpsml.Function)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.ODE__CONDITION:
    		setCondition(
    		(org.xcpsml.xcpsmlmt.cpsml.Condition)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.ODE__INTERVAL:
    		setInterval(
    		(org.xcpsml.xcpsmlmt.cpsml.Interval)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
