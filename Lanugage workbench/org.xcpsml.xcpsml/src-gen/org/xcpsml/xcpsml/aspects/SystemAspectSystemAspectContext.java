package org.xcpsml.xcpsml.aspects;

import java.util.Map;
import org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties;

@SuppressWarnings("all")
public class SystemAspectSystemAspectContext {
  public final static SystemAspectSystemAspectContext INSTANCE = new SystemAspectSystemAspectContext();
  
  public static SystemAspectSystemAspectProperties getSelf(final org.xcpsml.xcpsml.cpsml.System _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<org.xcpsml.xcpsml.cpsml.System, SystemAspectSystemAspectProperties> map = new java.util.WeakHashMap<org.xcpsml.xcpsml.cpsml.System, org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties>();
  
  public Map<org.xcpsml.xcpsml.cpsml.System, SystemAspectSystemAspectProperties> getMap() {
    return map;
  }
}
