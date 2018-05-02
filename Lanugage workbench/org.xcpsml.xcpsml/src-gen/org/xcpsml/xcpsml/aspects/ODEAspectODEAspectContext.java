package org.xcpsml.xcpsml.aspects;

import org.xcpsml.xcpsml.cpsml.ODE;
import java.util.Map;
import org.xcpsml.xcpsml.aspects.ODEAspectODEAspectProperties;

@SuppressWarnings("all")
public class ODEAspectODEAspectContext {
  public final static ODEAspectODEAspectContext INSTANCE = new ODEAspectODEAspectContext();
  
  public static ODEAspectODEAspectProperties getSelf(final ODE _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.xcpsml.xcpsml.aspects.ODEAspectODEAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ODE, ODEAspectODEAspectProperties> map = new java.util.WeakHashMap<org.xcpsml.xcpsml.cpsml.ODE, org.xcpsml.xcpsml.aspects.ODEAspectODEAspectProperties>();
  
  public Map<ODE, ODEAspectODEAspectProperties> getMap() {
    return map;
  }
}
