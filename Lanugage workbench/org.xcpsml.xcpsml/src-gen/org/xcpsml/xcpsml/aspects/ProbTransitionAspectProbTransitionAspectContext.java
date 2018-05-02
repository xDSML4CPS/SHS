package org.xcpsml.xcpsml.aspects;

import org.xcpsml.xcpsml.cpsml.ProbTransition;
import java.util.Map;
import org.xcpsml.xcpsml.aspects.ProbTransitionAspectProbTransitionAspectProperties;

@SuppressWarnings("all")
public class ProbTransitionAspectProbTransitionAspectContext {
  public final static ProbTransitionAspectProbTransitionAspectContext INSTANCE = new ProbTransitionAspectProbTransitionAspectContext();
  
  public static ProbTransitionAspectProbTransitionAspectProperties getSelf(final ProbTransition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.xcpsml.xcpsml.aspects.ProbTransitionAspectProbTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ProbTransition, ProbTransitionAspectProbTransitionAspectProperties> map = new java.util.WeakHashMap<org.xcpsml.xcpsml.cpsml.ProbTransition, org.xcpsml.xcpsml.aspects.ProbTransitionAspectProbTransitionAspectProperties>();
  
  public Map<ProbTransition, ProbTransitionAspectProbTransitionAspectProperties> getMap() {
    return map;
  }
}
