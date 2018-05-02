package org.dsml.cpsml.k3dsa.cpsml.aspects;

import cpsml.IndeVariable;
import java.util.Map;
import org.dsml.cpsml.k3dsa.cpsml.aspects.IndeVariableAspectIndeVariableAspectProperties;

@SuppressWarnings("all")
public class IndeVariableAspectIndeVariableAspectContext {
  public final static IndeVariableAspectIndeVariableAspectContext INSTANCE = new IndeVariableAspectIndeVariableAspectContext();
  
  public static IndeVariableAspectIndeVariableAspectProperties getSelf(final IndeVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.dsml.cpsml.k3dsa.cpsml.aspects.IndeVariableAspectIndeVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IndeVariable, IndeVariableAspectIndeVariableAspectProperties> map = new java.util.WeakHashMap<cpsml.IndeVariable, org.dsml.cpsml.k3dsa.cpsml.aspects.IndeVariableAspectIndeVariableAspectProperties>();
  
  public Map<IndeVariable, IndeVariableAspectIndeVariableAspectProperties> getMap() {
    return map;
  }
}
