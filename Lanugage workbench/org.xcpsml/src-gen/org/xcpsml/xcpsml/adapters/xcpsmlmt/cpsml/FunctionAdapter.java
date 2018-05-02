package org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.xcpsml.xcpsml.adapters.xcpsmlmt.XCPSMLMTAdaptersFactory;
import org.xcpsml.xcpsml.cpsml.Function;
import org.xcpsml.xcpsmlmt.cpsml.DeVariable;
import org.xcpsml.xcpsmlmt.cpsml.Fright;
import org.xcpsml.xcpsmlmt.cpsml.IndeVariable;

@SuppressWarnings("all")
public class FunctionAdapter extends EObjectAdapter<Function> implements org.xcpsml.xcpsmlmt.cpsml.Function {
  private XCPSMLMTAdaptersFactory adaptersFactory;
  
  public FunctionAdapter() {
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
  public IndeVariable getIndevariable() {
    return (IndeVariable) adaptersFactory.createAdapter(adaptee.getIndevariable(), eResource);
  }
  
  @Override
  public void setIndevariable(final IndeVariable o) {
    if (o != null)
    	adaptee.setIndevariable(((org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.IndeVariableAdapter) o).getAdaptee());
    else adaptee.setIndevariable(null);
  }
  
  @Override
  public DeVariable getDevariable() {
    return (DeVariable) adaptersFactory.createAdapter(adaptee.getDevariable(), eResource);
  }
  
  @Override
  public void setDevariable(final DeVariable o) {
    if (o != null)
    	adaptee.setDevariable(((org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.DeVariableAdapter) o).getAdaptee());
    else adaptee.setDevariable(null);
  }
  
  @Override
  public Fright getFright() {
    return (Fright) adaptersFactory.createAdapter(adaptee.getFright(), eResource);
  }
  
  @Override
  public void setFright(final Fright o) {
    if (o != null)
    	adaptee.setFright(((org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.FrightAdapter) o).getAdaptee());
    else adaptee.setFright(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.eINSTANCE.getFunction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.FUNCTION__NAME:
    		return getName();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.FUNCTION__INDEVARIABLE:
    		return getIndevariable();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.FUNCTION__DEVARIABLE:
    		return getDevariable();
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.FUNCTION__FRIGHT:
    		return getFright();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.FUNCTION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.FUNCTION__INDEVARIABLE:
    		return getIndevariable() != null;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.FUNCTION__DEVARIABLE:
    		return getDevariable() != null;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.FUNCTION__FRIGHT:
    		return getFright() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.FUNCTION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.FUNCTION__INDEVARIABLE:
    		setIndevariable(
    		(org.xcpsml.xcpsmlmt.cpsml.IndeVariable)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.FUNCTION__DEVARIABLE:
    		setDevariable(
    		(org.xcpsml.xcpsmlmt.cpsml.DeVariable)
    		 newValue);
    		return;
    	case org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.FUNCTION__FRIGHT:
    		setFright(
    		(org.xcpsml.xcpsmlmt.cpsml.Fright)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
