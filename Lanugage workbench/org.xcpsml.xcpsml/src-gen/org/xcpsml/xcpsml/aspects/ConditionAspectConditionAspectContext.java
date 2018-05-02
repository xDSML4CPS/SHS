package org.xcpsml.xcpsml.aspects;

import org.xcpsml.xcpsml.cpsml.Condition;
import java.util.Map;
import org.xcpsml.xcpsml.aspects.ConditionAspectConditionAspectProperties;

@SuppressWarnings("all")
public class ConditionAspectConditionAspectContext {
  public final static ConditionAspectConditionAspectContext INSTANCE = new ConditionAspectConditionAspectContext();
  
  public static ConditionAspectConditionAspectProperties getSelf(final Condition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.xcpsml.xcpsml.aspects.ConditionAspectConditionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Condition, ConditionAspectConditionAspectProperties> map = new java.util.WeakHashMap<org.xcpsml.xcpsml.cpsml.Condition, org.xcpsml.xcpsml.aspects.ConditionAspectConditionAspectProperties>();
  
  public Map<Condition, ConditionAspectConditionAspectProperties> getMap() {
    return map;
  }
}
