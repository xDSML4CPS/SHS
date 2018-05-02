package org.dsml.cpsml.k3dsa.cpsml.aspects;

import cpsml.ODE;
import java.util.Map;
import org.dsml.cpsml.k3dsa.cpsml.aspects.ODEAspectODEAspectProperties;

@SuppressWarnings("all")
public class ODEAspectODEAspectContext {
  public final static ODEAspectODEAspectContext INSTANCE = new ODEAspectODEAspectContext();
  
  public static ODEAspectODEAspectProperties getSelf(final ODE _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.dsml.cpsml.k3dsa.cpsml.aspects.ODEAspectODEAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ODE, ODEAspectODEAspectProperties> map = new java.util.WeakHashMap<cpsml.ODE, org.dsml.cpsml.k3dsa.cpsml.aspects.ODEAspectODEAspectProperties>();
  
  public Map<ODE, ODEAspectODEAspectProperties> getMap() {
    return map;
  }
}
