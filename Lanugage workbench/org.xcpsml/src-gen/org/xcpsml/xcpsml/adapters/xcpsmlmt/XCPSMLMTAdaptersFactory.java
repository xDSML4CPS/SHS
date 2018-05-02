package org.xcpsml.xcpsml.adapters.xcpsmlmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.ComTransitionAdapter;
import org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.ConditionAdapter;
import org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.DeVariableAdapter;
import org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.FrightAdapter;
import org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.FunctionAdapter;
import org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.IndeVariableAdapter;
import org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.IntervalAdapter;
import org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.ODEAdapter;
import org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.ProbTransitionAdapter;
import org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.StateAdapter;
import org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.SystemAdapter;
import org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.TransitionAdapter;
import org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.VariableAdapter;
import org.xcpsml.xcpsml.cpsml.ComTransition;
import org.xcpsml.xcpsml.cpsml.Condition;
import org.xcpsml.xcpsml.cpsml.DeVariable;
import org.xcpsml.xcpsml.cpsml.Fright;
import org.xcpsml.xcpsml.cpsml.Function;
import org.xcpsml.xcpsml.cpsml.IndeVariable;
import org.xcpsml.xcpsml.cpsml.Interval;
import org.xcpsml.xcpsml.cpsml.ODE;
import org.xcpsml.xcpsml.cpsml.ProbTransition;
import org.xcpsml.xcpsml.cpsml.State;
import org.xcpsml.xcpsml.cpsml.Transition;
import org.xcpsml.xcpsml.cpsml.Variable;

@SuppressWarnings("all")
public class XCPSMLMTAdaptersFactory implements AdaptersFactory {
  private static XCPSMLMTAdaptersFactory instance;
  
  public static XCPSMLMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.xcpsml.xcpsml.adapters.xcpsmlmt.XCPSMLMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public XCPSMLMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.xcpsml.xcpsml.cpsml.System){
    	return createSystemAdapter((org.xcpsml.xcpsml.cpsml.System) o, res);
    }
    if (o instanceof org.xcpsml.xcpsml.cpsml.Variable){
    	return createVariableAdapter((org.xcpsml.xcpsml.cpsml.Variable) o, res);
    }
    if (o instanceof org.xcpsml.xcpsml.cpsml.State){
    	return createStateAdapter((org.xcpsml.xcpsml.cpsml.State) o, res);
    }
    if (o instanceof org.xcpsml.xcpsml.cpsml.ComTransition){
    	return createComTransitionAdapter((org.xcpsml.xcpsml.cpsml.ComTransition) o, res);
    }
    if (o instanceof org.xcpsml.xcpsml.cpsml.ProbTransition){
    	return createProbTransitionAdapter((org.xcpsml.xcpsml.cpsml.ProbTransition) o, res);
    }
    if (o instanceof org.xcpsml.xcpsml.cpsml.ODE){
    	return createODEAdapter((org.xcpsml.xcpsml.cpsml.ODE) o, res);
    }
    if (o instanceof org.xcpsml.xcpsml.cpsml.Function){
    	return createFunctionAdapter((org.xcpsml.xcpsml.cpsml.Function) o, res);
    }
    if (o instanceof org.xcpsml.xcpsml.cpsml.Condition){
    	return createConditionAdapter((org.xcpsml.xcpsml.cpsml.Condition) o, res);
    }
    if (o instanceof org.xcpsml.xcpsml.cpsml.Interval){
    	return createIntervalAdapter((org.xcpsml.xcpsml.cpsml.Interval) o, res);
    }
    if (o instanceof org.xcpsml.xcpsml.cpsml.IndeVariable){
    	return createIndeVariableAdapter((org.xcpsml.xcpsml.cpsml.IndeVariable) o, res);
    }
    if (o instanceof org.xcpsml.xcpsml.cpsml.DeVariable){
    	return createDeVariableAdapter((org.xcpsml.xcpsml.cpsml.DeVariable) o, res);
    }
    if (o instanceof org.xcpsml.xcpsml.cpsml.Fright){
    	return createFrightAdapter((org.xcpsml.xcpsml.cpsml.Fright) o, res);
    }
    
    return null;
  }
  
  public SystemAdapter createSystemAdapter(final org.xcpsml.xcpsml.cpsml.System adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.SystemAdapter) adapter;
    else {
    	adapter = new org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.SystemAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.SystemAdapter) adapter;
    }
  }
  
  public VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.VariableAdapter) adapter;
    else {
    	adapter = new org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.VariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.VariableAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.StateAdapter) adapter;
    else {
    	adapter = new org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.StateAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.TransitionAdapter) adapter;
    else {
    	adapter = new org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.TransitionAdapter) adapter;
    }
  }
  
  public ComTransitionAdapter createComTransitionAdapter(final ComTransition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.ComTransitionAdapter) adapter;
    else {
    	adapter = new org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.ComTransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.ComTransitionAdapter) adapter;
    }
  }
  
  public ProbTransitionAdapter createProbTransitionAdapter(final ProbTransition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.ProbTransitionAdapter) adapter;
    else {
    	adapter = new org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.ProbTransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.ProbTransitionAdapter) adapter;
    }
  }
  
  public ODEAdapter createODEAdapter(final ODE adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.ODEAdapter) adapter;
    else {
    	adapter = new org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.ODEAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.ODEAdapter) adapter;
    }
  }
  
  public FunctionAdapter createFunctionAdapter(final Function adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.FunctionAdapter) adapter;
    else {
    	adapter = new org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.FunctionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.FunctionAdapter) adapter;
    }
  }
  
  public ConditionAdapter createConditionAdapter(final Condition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.ConditionAdapter) adapter;
    else {
    	adapter = new org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.ConditionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.ConditionAdapter) adapter;
    }
  }
  
  public IntervalAdapter createIntervalAdapter(final Interval adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.IntervalAdapter) adapter;
    else {
    	adapter = new org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.IntervalAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.IntervalAdapter) adapter;
    }
  }
  
  public IndeVariableAdapter createIndeVariableAdapter(final IndeVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.IndeVariableAdapter) adapter;
    else {
    	adapter = new org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.IndeVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.IndeVariableAdapter) adapter;
    }
  }
  
  public DeVariableAdapter createDeVariableAdapter(final DeVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.DeVariableAdapter) adapter;
    else {
    	adapter = new org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.DeVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.DeVariableAdapter) adapter;
    }
  }
  
  public FrightAdapter createFrightAdapter(final Fright adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.FrightAdapter) adapter;
    else {
    	adapter = new org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.FrightAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.FrightAdapter) adapter;
    }
  }
}
