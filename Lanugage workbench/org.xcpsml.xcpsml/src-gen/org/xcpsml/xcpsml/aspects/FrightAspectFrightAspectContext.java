package org.xcpsml.xcpsml.aspects;

import org.xcpsml.xcpsml.cpsml.Fright;
import java.util.Map;
import org.xcpsml.xcpsml.aspects.FrightAspectFrightAspectProperties;

@SuppressWarnings("all")
public class FrightAspectFrightAspectContext {
  public final static FrightAspectFrightAspectContext INSTANCE = new FrightAspectFrightAspectContext();
  
  public static FrightAspectFrightAspectProperties getSelf(final Fright _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.xcpsml.xcpsml.aspects.FrightAspectFrightAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Fright, FrightAspectFrightAspectProperties> map = new java.util.WeakHashMap<org.xcpsml.xcpsml.cpsml.Fright, org.xcpsml.xcpsml.aspects.FrightAspectFrightAspectProperties>();
  
  public Map<Fright, FrightAspectFrightAspectProperties> getMap() {
    return map;
  }
}
