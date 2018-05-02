package org.xcpsml.xcpsml.adapters.cpsmlmt.cpsml;

import cpsml.ComTransition;
import cpsml.Condition;
import cpsml.CpsmlFactory;
import cpsml.CpsmlPackage;
import cpsml.DeVariable;
import cpsml.Fright;
import cpsml.Function;
import cpsml.IndeVariable;
import cpsml.Interval;
import cpsml.ODE;
import cpsml.ProbTransition;
import cpsml.State;
import cpsml.Variable;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.xcpsml.xcpsml.adapters.cpsmlmt.CPSMLMTAdaptersFactory;

@SuppressWarnings("all")
public class CpsmlFactoryAdapter extends EFactoryImpl implements CpsmlFactory {
  private CPSMLMTAdaptersFactory adaptersFactory = org.xcpsml.xcpsml.adapters.cpsmlmt.CPSMLMTAdaptersFactory.getInstance();
  
  private org.xcpsml.xcpsml.cpsml.CpsmlFactory cpsmlAdaptee = org.xcpsml.xcpsml.cpsml.CpsmlFactory.eINSTANCE;
  
  @Override
  public cpsml.System createSystem() {
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
    return cpsml.CpsmlPackage.eINSTANCE;
  }
}
