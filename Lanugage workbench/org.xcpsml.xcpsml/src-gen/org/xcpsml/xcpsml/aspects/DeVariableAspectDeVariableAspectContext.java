package org.xcpsml.xcpsml.aspects;

import org.xcpsml.xcpsml.cpsml.DeVariable;
import java.util.Map;
import org.xcpsml.xcpsml.aspects.DeVariableAspectDeVariableAspectProperties;

@SuppressWarnings("all")
public class DeVariableAspectDeVariableAspectContext {
  public final static DeVariableAspectDeVariableAspectContext INSTANCE = new DeVariableAspectDeVariableAspectContext();
  
  public static DeVariableAspectDeVariableAspectProperties getSelf(final DeVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.xcpsml.xcpsml.aspects.DeVariableAspectDeVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<DeVariable, DeVariableAspectDeVariableAspectProperties> map = new java.util.WeakHashMap<org.xcpsml.xcpsml.cpsml.DeVariable, org.xcpsml.xcpsml.aspects.DeVariableAspectDeVariableAspectProperties>();
  
  public Map<DeVariable, DeVariableAspectDeVariableAspectProperties> getMap() {
    return map;
  }
}
