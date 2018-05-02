package org.xcpsml.xcpsml.aspects;

import org.xcpsml.xcpsml.cpsml.IndeVariable;
import java.util.Map;
import org.xcpsml.xcpsml.aspects.IndeVariableAspectIndeVariableAspectProperties;

@SuppressWarnings("all")
public class IndeVariableAspectIndeVariableAspectContext {
  public final static IndeVariableAspectIndeVariableAspectContext INSTANCE = new IndeVariableAspectIndeVariableAspectContext();
  
  public static IndeVariableAspectIndeVariableAspectProperties getSelf(final IndeVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.xcpsml.xcpsml.aspects.IndeVariableAspectIndeVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IndeVariable, IndeVariableAspectIndeVariableAspectProperties> map = new java.util.WeakHashMap<org.xcpsml.xcpsml.cpsml.IndeVariable, org.xcpsml.xcpsml.aspects.IndeVariableAspectIndeVariableAspectProperties>();
  
  public Map<IndeVariable, IndeVariableAspectIndeVariableAspectProperties> getMap() {
    return map;
  }
}
