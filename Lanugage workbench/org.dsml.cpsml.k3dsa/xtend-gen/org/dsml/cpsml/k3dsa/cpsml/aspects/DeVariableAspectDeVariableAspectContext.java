package org.dsml.cpsml.k3dsa.cpsml.aspects;

import cpsml.DeVariable;
import java.util.Map;
import org.dsml.cpsml.k3dsa.cpsml.aspects.DeVariableAspectDeVariableAspectProperties;

@SuppressWarnings("all")
public class DeVariableAspectDeVariableAspectContext {
  public final static DeVariableAspectDeVariableAspectContext INSTANCE = new DeVariableAspectDeVariableAspectContext();
  
  public static DeVariableAspectDeVariableAspectProperties getSelf(final DeVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.dsml.cpsml.k3dsa.cpsml.aspects.DeVariableAspectDeVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<DeVariable, DeVariableAspectDeVariableAspectProperties> map = new java.util.WeakHashMap<cpsml.DeVariable, org.dsml.cpsml.k3dsa.cpsml.aspects.DeVariableAspectDeVariableAspectProperties>();
  
  public Map<DeVariable, DeVariableAspectDeVariableAspectProperties> getMap() {
    return map;
  }
}
