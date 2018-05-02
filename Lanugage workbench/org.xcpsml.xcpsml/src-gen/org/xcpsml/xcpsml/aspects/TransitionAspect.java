package org.xcpsml.xcpsml.aspects;

import org.xcpsml.xcpsml.cpsml.Transition;
import org.xcpsml.xcpsml.cpsml.Variable;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.xcpsml.xcpsml.aspects.TransitionAspectTransitionAspectProperties;
import org.xcpsml.xcpsml.aspects.VariableAspect;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public abstract class TransitionAspect {
  @Step
  public static boolean holds(final Transition _self) {
	final org.xcpsml.xcpsml.aspects.TransitionAspectTransitionAspectProperties _self_ = org.xcpsml.xcpsml.aspects.TransitionAspectTransitionAspectContext
			.getSelf(_self);
	Object result = null;
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			addToResult(_privk3_holds(_self_, _self));
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Transition", "holds");
	} else {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
				.getInstance().findEventManager(null);
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	result = command.getResult();
	;
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_holds(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    String _guard = _self.getGuard();
    boolean _contains = _guard.contains("<");
    if (_contains) {
      String _guard_1 = _self.getGuard();
      String _guard_2 = _self.getGuard();
      int _indexOf = _guard_2.indexOf("<");
      int _plus = (_indexOf + 1);
      String guardright = _guard_1.substring(_plus);
      Variable _relatedvariable2 = _self.getRelatedvariable2();
      float _Globalnv = VariableAspect.Globalnv(_relatedvariable2);
      float _parseFloat = Float.parseFloat(guardright);
      boolean _lessThan = (_Globalnv < _parseFloat);
      if (_lessThan) {
        return true;
      }
    }
    String _guard_3 = _self.getGuard();
    boolean _contains_1 = _guard_3.contains(">");
    if (_contains_1) {
      String _guard_4 = _self.getGuard();
      String _guard_5 = _self.getGuard();
      int _indexOf_1 = _guard_5.indexOf(">");
      int _plus_1 = (_indexOf_1 + 1);
      String guardright_1 = _guard_4.substring(_plus_1);
      Variable _relatedvariable2_1 = _self.getRelatedvariable2();
      float _Globalnv_1 = VariableAspect.Globalnv(_relatedvariable2_1);
      float _parseFloat_1 = Float.parseFloat(guardright_1);
      boolean _greaterThan = (_Globalnv_1 > _parseFloat_1);
      if (_greaterThan) {
        return true;
      }
    }
    String _guard_6 = _self.getGuard();
    boolean _contains_2 = _guard_6.contains("=");
    if (_contains_2) {
      String _guard_7 = _self.getGuard();
      String _guard_8 = _self.getGuard();
      int _indexOf_2 = _guard_8.indexOf("=");
      int _plus_2 = (_indexOf_2 + 1);
      String guardright_2 = _guard_7.substring(_plus_2);
      Variable _relatedvariable2_2 = _self.getRelatedvariable2();
      float _Globalnv_2 = VariableAspect.Globalnv(_relatedvariable2_2);
      float _parseFloat_2 = Float.parseFloat(guardright_2);
      boolean _equals = (_Globalnv_2 == _parseFloat_2);
      if (_equals) {
        return true;
      }
    }
    return false;
  }
}
