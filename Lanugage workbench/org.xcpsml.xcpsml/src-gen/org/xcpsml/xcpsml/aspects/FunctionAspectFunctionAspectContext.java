package org.xcpsml.xcpsml.aspects;

import org.xcpsml.xcpsml.cpsml.Function;
import java.util.Map;
import org.xcpsml.xcpsml.aspects.FunctionAspectFunctionAspectProperties;

@SuppressWarnings("all")
public class FunctionAspectFunctionAspectContext {
  public final static FunctionAspectFunctionAspectContext INSTANCE = new FunctionAspectFunctionAspectContext();
  
  public static FunctionAspectFunctionAspectProperties getSelf(final Function _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.xcpsml.xcpsml.aspects.FunctionAspectFunctionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Function, FunctionAspectFunctionAspectProperties> map = new java.util.WeakHashMap<org.xcpsml.xcpsml.cpsml.Function, org.xcpsml.xcpsml.aspects.FunctionAspectFunctionAspectProperties>();
  
  public Map<Function, FunctionAspectFunctionAspectProperties> getMap() {
    return map;
  }
}
