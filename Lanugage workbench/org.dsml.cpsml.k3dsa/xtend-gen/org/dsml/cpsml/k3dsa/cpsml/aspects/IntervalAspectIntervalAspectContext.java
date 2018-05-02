package org.dsml.cpsml.k3dsa.cpsml.aspects;

import cpsml.Interval;
import java.util.Map;
import org.dsml.cpsml.k3dsa.cpsml.aspects.IntervalAspectIntervalAspectProperties;

@SuppressWarnings("all")
public class IntervalAspectIntervalAspectContext {
  public final static IntervalAspectIntervalAspectContext INSTANCE = new IntervalAspectIntervalAspectContext();
  
  public static IntervalAspectIntervalAspectProperties getSelf(final Interval _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.dsml.cpsml.k3dsa.cpsml.aspects.IntervalAspectIntervalAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Interval, IntervalAspectIntervalAspectProperties> map = new java.util.WeakHashMap<cpsml.Interval, org.dsml.cpsml.k3dsa.cpsml.aspects.IntervalAspectIntervalAspectProperties>();
  
  public Map<Interval, IntervalAspectIntervalAspectProperties> getMap() {
    return map;
  }
}
