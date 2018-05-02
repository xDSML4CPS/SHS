package org.dsml.cpsml.k3dsa.cpsml.aspects;

import java.util.Map;
import org.dsml.cpsml.k3dsa.cpsml.aspects.SystemAspectSystemAspectProperties;

@SuppressWarnings("all")
public class SystemAspectSystemAspectContext {
  public final static SystemAspectSystemAspectContext INSTANCE = new SystemAspectSystemAspectContext();
  
  public static SystemAspectSystemAspectProperties getSelf(final cpsml.System _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.dsml.cpsml.k3dsa.cpsml.aspects.SystemAspectSystemAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<cpsml.System, SystemAspectSystemAspectProperties> map = new java.util.WeakHashMap<cpsml.System, org.dsml.cpsml.k3dsa.cpsml.aspects.SystemAspectSystemAspectProperties>();
  
  public Map<cpsml.System, SystemAspectSystemAspectProperties> getMap() {
    return map;
  }
}
