package org.dsml.cpsml.k3dsa.cpsml.aspects;

import cpsml.ProbTransition;
import java.util.Map;
import org.dsml.cpsml.k3dsa.cpsml.aspects.ProbTransitionAspectProbTransitionAspectProperties;

@SuppressWarnings("all")
public class ProbTransitionAspectProbTransitionAspectContext {
  public final static ProbTransitionAspectProbTransitionAspectContext INSTANCE = new ProbTransitionAspectProbTransitionAspectContext();
  
  public static ProbTransitionAspectProbTransitionAspectProperties getSelf(final ProbTransition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.dsml.cpsml.k3dsa.cpsml.aspects.ProbTransitionAspectProbTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ProbTransition, ProbTransitionAspectProbTransitionAspectProperties> map = new java.util.WeakHashMap<cpsml.ProbTransition, org.dsml.cpsml.k3dsa.cpsml.aspects.ProbTransitionAspectProbTransitionAspectProperties>();
  
  public Map<ProbTransition, ProbTransitionAspectProbTransitionAspectProperties> getMap() {
    return map;
  }
}
