package org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.xcpsml.xcpsml.adapters.xcpsmlmt.XCPSMLMTAdaptersFactory;
import org.xcpsml.xcpsml.cpsml.Variable;

@SuppressWarnings("all")
public class VariableAdapter extends EObjectAdapter<Variable> implements org.xcpsml.xcpsmlmt.cpsml.Variable {
  private XCPSMLMTAdaptersFactory adaptersFactory;
  
  public VariableAdapter() {
    super(org.xcpsml.xcpsml.adapters.xcpsmlmt.XCPSMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.xcpsml.xcpsml.adapters.xcpsmlmt.XCPSMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public float getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final float o) {
    adaptee.setValue(o);
  }
  
  @Override
  public float getGlobalnv() {
    return org.xcpsml.xcpsml.aspects.VariableAspect.Globalnv(adaptee);
  }
  
  @Override
  public void setGlobalnv(final float Globalnv) {
    org.xcpsml.xcpsml.aspects.VariableAspect.Globalnv(adaptee, Globalnv
    );
  }
  
  protected final static float VALUE_EDEFAULT = 0.0F;
  
  protected final static float GLOBALNV_EDEFAULT = 0.0F;
  
  @Override
  public EClass eClass() {
    return org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.eINSTANCE.getVariable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.VARIABLE__VALUE:
    		return new java.lang.Float(getValue());
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.VARIABLE__GLOBALNV:
    		return new java.lang.Float(getGlobalnv());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.VARIABLE__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.VARIABLE__GLOBALNV:
    		return getGlobalnv() != GLOBALNV_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.VARIABLE__VALUE:
    		setValue(((java.lang.Float) newValue).floatValue());
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.VARIABLE__GLOBALNV:
    		setGlobalnv(((java.lang.Float) newValue).floatValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
