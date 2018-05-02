package org.xcpsml.xcpsml.aspects;

import org.xcpsml.xcpsml.cpsml.Variable;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.xcpsml.xcpsml.aspects.VariableAspectVariableAspectProperties;

@Aspect(className = Variable.class)
@SuppressWarnings("all")
public class VariableAspect {
  public static float Globalnv(final Variable _self) {
	final org.xcpsml.xcpsml.aspects.VariableAspectVariableAspectProperties _self_ = org.xcpsml.xcpsml.aspects.VariableAspectVariableAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_Globalnv(_self_, _self);
	;
	return (float) result;
}
  
  public static void Globalnv(final Variable _self, final float Globalnv) {
	final org.xcpsml.xcpsml.aspects.VariableAspectVariableAspectProperties _self_ = org.xcpsml.xcpsml.aspects.VariableAspectVariableAspectContext
			.getSelf(_self);
	_privk3_Globalnv(_self_, _self, Globalnv);
	;
}
  
  protected static float _privk3_Globalnv(final VariableAspectVariableAspectProperties _self_, final Variable _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getGlobalnv") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (float) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.Globalnv;
  }
  
  protected static void _privk3_Globalnv(final VariableAspectVariableAspectProperties _self_, final Variable _self, final float Globalnv) {
    _self_.Globalnv = Globalnv; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setGlobalnv")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, Globalnv);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
