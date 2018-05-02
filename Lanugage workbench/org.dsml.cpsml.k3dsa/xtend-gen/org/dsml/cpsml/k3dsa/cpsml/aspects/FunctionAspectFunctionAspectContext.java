package org.dsml.cpsml.k3dsa.cpsml.aspects;

import cpsml.Function;
import java.util.Map;
import org.dsml.cpsml.k3dsa.cpsml.aspects.FunctionAspectFunctionAspectProperties;

@SuppressWarnings("all")
public class FunctionAspectFunctionAspectContext {
  public final static FunctionAspectFunctionAspectContext INSTANCE = new FunctionAspectFunctionAspectContext();
  
  public static FunctionAspectFunctionAspectProperties getSelf(final Function _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.dsml.cpsml.k3dsa.cpsml.aspects.FunctionAspectFunctionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Function, FunctionAspectFunctionAspectProperties> map = new java.util.WeakHashMap<cpsml.Function, org.dsml.cpsml.k3dsa.cpsml.aspects.FunctionAspectFunctionAspectProperties>();
  
  public Map<Function, FunctionAspectFunctionAspectProperties> getMap() {
    return map;
  }
}
