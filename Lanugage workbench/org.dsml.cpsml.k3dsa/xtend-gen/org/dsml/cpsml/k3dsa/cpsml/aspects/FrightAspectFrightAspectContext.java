package org.dsml.cpsml.k3dsa.cpsml.aspects;

import cpsml.Fright;
import java.util.Map;
import org.dsml.cpsml.k3dsa.cpsml.aspects.FrightAspectFrightAspectProperties;

@SuppressWarnings("all")
public class FrightAspectFrightAspectContext {
  public final static FrightAspectFrightAspectContext INSTANCE = new FrightAspectFrightAspectContext();
  
  public static FrightAspectFrightAspectProperties getSelf(final Fright _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.dsml.cpsml.k3dsa.cpsml.aspects.FrightAspectFrightAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Fright, FrightAspectFrightAspectProperties> map = new java.util.WeakHashMap<cpsml.Fright, org.dsml.cpsml.k3dsa.cpsml.aspects.FrightAspectFrightAspectProperties>();
  
  public Map<Fright, FrightAspectFrightAspectProperties> getMap() {
    return map;
  }
}
