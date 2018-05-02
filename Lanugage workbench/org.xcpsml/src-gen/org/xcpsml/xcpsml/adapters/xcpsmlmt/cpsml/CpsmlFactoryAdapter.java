package org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.xcpsml.xcpsml.adapters.xcpsmlmt.XCPSMLMTAdaptersFactory;
import org.xcpsml.xcpsmlmt.cpsml.ComTransition;
import org.xcpsml.xcpsmlmt.cpsml.Condition;
import org.xcpsml.xcpsmlmt.cpsml.CpsmlFactory;
import org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage;
import org.xcpsml.xcpsmlmt.cpsml.DeVariable;
import org.xcpsml.xcpsmlmt.cpsml.Fright;
import org.xcpsml.xcpsmlmt.cpsml.Function;
import org.xcpsml.xcpsmlmt.cpsml.IndeVariable;
import org.xcpsml.xcpsmlmt.cpsml.Interval;
import org.xcpsml.xcpsmlmt.cpsml.ODE;
import org.xcpsml.xcpsmlmt.cpsml.ProbTransition;
import org.xcpsml.xcpsmlmt.cpsml.State;
import org.xcpsml.xcpsmlmt.cpsml.Variable;

@SuppressWarnings("all")
public class CpsmlFactoryAdapter extends EFactoryImpl implements CpsmlFactory {
  private XCPSMLMTAdaptersFactory adaptersFactory = org.xcpsml.xcpsml.adapters.xcpsmlmt.XCPSMLMTAdaptersFactory.getInstance();
  
  private org.xcpsml.xcpsml.cpsml.CpsmlFactory cpsmlAdaptee = org.xcpsml.xcpsml.cpsml.CpsmlFactory.eINSTANCE;
  
  @Override
  public org.xcpsml.xcpsmlmt.cpsml.System createSystem() {
    return adaptersFactory.createSystemAdapter(cpsmlAdaptee.createSystem(), null);
  }
  
  @Override
  public Variable createVariable() {
    return adaptersFactory.createVariableAdapter(cpsmlAdaptee.createVariable(), null);
  }
  
  @Override
  public State createState() {
    return adaptersFactory.createStateAdapter(cpsmlAdaptee.createState(), null);
  }
  
  @Override
  public ComTransition createComTransition() {
    return adaptersFactory.createComTransitionAdapter(cpsmlAdaptee.createComTransition(), null);
  }
  
  @Override
  public ProbTransition createProbTransition() {
    return adaptersFactory.createProbTransitionAdapter(cpsmlAdaptee.createProbTransition(), null);
  }
  
  @Override
  public ODE createODE() {
    return adaptersFactory.createODEAdapter(cpsmlAdaptee.createODE(), null);
  }
  
  @Override
  public Function createFunction() {
    return adaptersFactory.createFunctionAdapter(cpsmlAdaptee.createFunction(), null);
  }
  
  @Override
  public Condition createCondition() {
    return adaptersFactory.createConditionAdapter(cpsmlAdaptee.createCondition(), null);
  }
  
  @Override
  public Interval createInterval() {
    return adaptersFactory.createIntervalAdapter(cpsmlAdaptee.createInterval(), null);
  }
  
  @Override
  public IndeVariable createIndeVariable() {
    return adaptersFactory.createIndeVariableAdapter(cpsmlAdaptee.createIndeVariable(), null);
  }
  
  @Override
  public DeVariable createDeVariable() {
    return adaptersFactory.createDeVariableAdapter(cpsmlAdaptee.createDeVariable(), null);
  }
  
  @Override
  public Fright createFright() {
    return adaptersFactory.createFrightAdapter(cpsmlAdaptee.createFright(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getCpsmlPackage();
  }
  
  public CpsmlPackage getCpsmlPackage() {
    return org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage.eINSTANCE;
  }
}
