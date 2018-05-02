package org.xcpsml.xcpsml.adapters.cpsmlmt.cpsml;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.xcpsml.xcpsml.adapters.cpsmlmt.CPSMLMTAdaptersFactory;
import org.xcpsml.xcpsml.cpsml.Interval;

@SuppressWarnings("all")
public class IntervalAdapter extends EObjectAdapter<Interval> implements cpsml.Interval {
  private CPSMLMTAdaptersFactory adaptersFactory;
  
  public IntervalAdapter() {
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
  public float getLeft() {
    return adaptee.getLeft();
  }
  
  @Override
  public void setLeft(final float o) {
    adaptee.setLeft(o);
  }
  
  @Override
  public float getRight() {
    return adaptee.getRight();
  }
  
  @Override
  public void setRight(final float o) {
    adaptee.setRight(o);
  }
  
  @Override
  public float getSubinterval() {
    return adaptee.getSubinterval();
  }
  
  @Override
  public void setSubinterval(final float o) {
    adaptee.setSubinterval(o);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static float LEFT_EDEFAULT = 0.0F;
  
  protected final static float RIGHT_EDEFAULT = 0.0F;
  
  protected final static float SUBINTERVAL_EDEFAULT = 0.0F;
  
  @Override
  public EClass eClass() {
    return cpsml.CpsmlPackage.eINSTANCE.getInterval();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case cpsml.CpsmlPackage.INTERVAL__NAME:
    		return getName();
    	case cpsml.CpsmlPackage.INTERVAL__LEFT:
    		return new java.lang.Float(getLeft());
    	case cpsml.CpsmlPackage.INTERVAL__RIGHT:
    		return new java.lang.Float(getRight());
    	case cpsml.CpsmlPackage.INTERVAL__SUBINTERVAL:
    		return new java.lang.Float(getSubinterval());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case cpsml.CpsmlPackage.INTERVAL__NAME:
    		return getName() != NAME_EDEFAULT;
    	case cpsml.CpsmlPackage.INTERVAL__LEFT:
    		return getLeft() != LEFT_EDEFAULT;
    	case cpsml.CpsmlPackage.INTERVAL__RIGHT:
    		return getRight() != RIGHT_EDEFAULT;
    	case cpsml.CpsmlPackage.INTERVAL__SUBINTERVAL:
    		return getSubinterval() != SUBINTERVAL_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case cpsml.CpsmlPackage.INTERVAL__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case cpsml.CpsmlPackage.INTERVAL__LEFT:
    		setLeft(((java.lang.Float) newValue).floatValue());
    		return;
    	case cpsml.CpsmlPackage.INTERVAL__RIGHT:
    		setRight(((java.lang.Float) newValue).floatValue());
    		return;
    	case cpsml.CpsmlPackage.INTERVAL__SUBINTERVAL:
    		setSubinterval(((java.lang.Float) newValue).floatValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
