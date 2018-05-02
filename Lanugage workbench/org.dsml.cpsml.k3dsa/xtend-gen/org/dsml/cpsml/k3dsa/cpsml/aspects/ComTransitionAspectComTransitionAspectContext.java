package org.dsml.cpsml.k3dsa.cpsml.aspects;

import cpsml.ComTransition;
import java.util.Map;
import org.dsml.cpsml.k3dsa.cpsml.aspects.ComTransitionAspectComTransitionAspectProperties;

@SuppressWarnings("all")
public class ComTransitionAspectComTransitionAspectContext {
  public final static ComTransitionAspectComTransitionAspectContext INSTANCE = new ComTransitionAspectComTransitionAspectContext();
  
  public static ComTransitionAspectComTransitionAspectProperties getSelf(final ComTransition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.dsml.cpsml.k3dsa.cpsml.aspects.ComTransitionAspectComTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ComTransition, ComTransitionAspectComTransitionAspectProperties> map = new java.util.WeakHashMap<cpsml.ComTransition, org.dsml.cpsml.k3dsa.cpsml.aspects.ComTransitionAspectComTransitionAspectProperties>();
  
  public Map<ComTransition, ComTransitionAspectComTransitionAspectProperties> getMap() {
    return map;
  }
}
