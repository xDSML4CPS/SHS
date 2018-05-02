package org.xcpsml.xcpsml.aspects;

import org.xcpsml.xcpsml.cpsml.Interval;
import java.util.Map;
import org.xcpsml.xcpsml.aspects.IntervalAspectIntervalAspectProperties;

@SuppressWarnings("all")
public class IntervalAspectIntervalAspectContext {
  public final static IntervalAspectIntervalAspectContext INSTANCE = new IntervalAspectIntervalAspectContext();
  
  public static IntervalAspectIntervalAspectProperties getSelf(final Interval _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.xcpsml.xcpsml.aspects.IntervalAspectIntervalAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Interval, IntervalAspectIntervalAspectProperties> map = new java.util.WeakHashMap<org.xcpsml.xcpsml.cpsml.Interval, org.xcpsml.xcpsml.aspects.IntervalAspectIntervalAspectProperties>();
  
  public Map<Interval, IntervalAspectIntervalAspectProperties> getMap() {
    return map;
  }
}
