package org.xcpsml.xcpsml.aspects;

import org.xcpsml.xcpsml.cpsml.ComTransition;
import java.util.Map;
import org.xcpsml.xcpsml.aspects.ComTransitionAspectComTransitionAspectProperties;

@SuppressWarnings("all")
public class ComTransitionAspectComTransitionAspectContext {
  public final static ComTransitionAspectComTransitionAspectContext INSTANCE = new ComTransitionAspectComTransitionAspectContext();
  
  public static ComTransitionAspectComTransitionAspectProperties getSelf(final ComTransition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.xcpsml.xcpsml.aspects.ComTransitionAspectComTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ComTransition, ComTransitionAspectComTransitionAspectProperties> map = new java.util.WeakHashMap<org.xcpsml.xcpsml.cpsml.ComTransition, org.xcpsml.xcpsml.aspects.ComTransitionAspectComTransitionAspectProperties>();
  
  public Map<ComTransition, ComTransitionAspectComTransitionAspectProperties> getMap() {
    return map;
  }
}
