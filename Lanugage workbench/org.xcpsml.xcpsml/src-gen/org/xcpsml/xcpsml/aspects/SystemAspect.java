package org.xcpsml.xcpsml.aspects;

import com.google.common.base.Objects;
import org.xcpsml.xcpsml.cpsml.ComTransition;
import org.xcpsml.xcpsml.cpsml.Condition;
import org.xcpsml.xcpsml.cpsml.DeVariable;
import org.xcpsml.xcpsml.cpsml.Fright;
import org.xcpsml.xcpsml.cpsml.Function;
import org.xcpsml.xcpsml.cpsml.IndeVariable;
import org.xcpsml.xcpsml.cpsml.Interval;
import org.xcpsml.xcpsml.cpsml.ODE;
import org.xcpsml.xcpsml.cpsml.ProbTransition;
import org.xcpsml.xcpsml.cpsml.State;
import org.xcpsml.xcpsml.cpsml.Variable;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties;
import org.xcpsml.xcpsml.aspects.TransitionAspect;
import org.xcpsml.xcpsml.aspects.VariableAspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.scilab.modules.javasci.JavasciException;
import org.scilab.modules.javasci.Scilab;
import org.scilab.modules.types.ScilabType;

@Aspect(className = org.xcpsml.xcpsml.cpsml.System.class)
@SuppressWarnings("all")
public class SystemAspect {
  @Main
  public static void main(final org.xcpsml.xcpsml.cpsml.System _self) {
	final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext
			.getSelf(_self);
	_privk3_main(_self_, _self);
	;
}
  
  @Step
  public static void dojump(final org.xcpsml.xcpsml.cpsml.System _self) {
	final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_dojump(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "System", "dojump");
	} else {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
				.getInstance().findEventManager(null);
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  @Step
  public static void callscilab(final org.xcpsml.xcpsml.cpsml.System _self) {
	final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_callscilab(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "System", "callscilab");
	} else {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
				.getInstance().findEventManager(null);
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  @Step
  @InitializeModel
  public static void RealizeInitializeModel(final org.xcpsml.xcpsml.cpsml.System _self, final EList<String> arguments) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_RealizeInitializeModel(_self_, _self,arguments);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"System","RealizeInitializeModel");
    } else {
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    	if (eventManager != null) {
    		eventManager.manageEvents();
    	}
    	command.execute();
    }
    ;;
  }
  
  public static State currentState(final org.xcpsml.xcpsml.cpsml.System _self) {
	final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_currentState(_self_, _self);
	;
	return (org.xcpsml.xcpsml.cpsml.State) result;
}
  
  public static void currentState(final org.xcpsml.xcpsml.cpsml.System _self, final State currentState) {
	final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext
			.getSelf(_self);
	_privk3_currentState(_self_, _self, currentState);
	;
}
  
  public static State fatherState(final org.xcpsml.xcpsml.cpsml.System _self) {
	final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_fatherState(_self_, _self);
	;
	return (org.xcpsml.xcpsml.cpsml.State) result;
}
  
  public static void fatherState(final org.xcpsml.xcpsml.cpsml.System _self, final State fatherState) {
	final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext
			.getSelf(_self);
	_privk3_fatherState(_self_, _self, fatherState);
	;
}
  
  public static ProbTransition ptok(final org.xcpsml.xcpsml.cpsml.System _self) {
	final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_ptok(_self_, _self);
	;
	return (org.xcpsml.xcpsml.cpsml.ProbTransition) result;
}
  
  public static void ptok(final org.xcpsml.xcpsml.cpsml.System _self, final ProbTransition ptok) {
	final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext
			.getSelf(_self);
	_privk3_ptok(_self_, _self, ptok);
	;
}
  
  public static Float ran(final org.xcpsml.xcpsml.cpsml.System _self) {
	final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_ran(_self_, _self);
	;
	return (java.lang.Float) result;
}
  
  public static void ran(final org.xcpsml.xcpsml.cpsml.System _self, final Float ran) {
	final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext
			.getSelf(_self);
	_privk3_ran(_self_, _self, ran);
	;
}
  
  public static int sub(final org.xcpsml.xcpsml.cpsml.System _self) {
	final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_sub(_self_, _self);
	;
	return (int) result;
}
  
  public static void sub(final org.xcpsml.xcpsml.cpsml.System _self, final int sub) {
	final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext
			.getSelf(_self);
	_privk3_sub(_self_, _self, sub);
	;
}
  
  private static Scilab sci(final org.xcpsml.xcpsml.cpsml.System _self) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_sci(_self_, _self);;
    return (org.scilab.modules.javasci.Scilab)result;
  }
  
  private static void sci(final org.xcpsml.xcpsml.cpsml.System _self, final Scilab sci) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_sci(_self_, _self,sci);;
  }
  
  private static float i(final org.xcpsml.xcpsml.cpsml.System _self) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_i(_self_, _self);;
    return (float)result;
  }
  
  private static void i(final org.xcpsml.xcpsml.cpsml.System _self, final float i) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_i(_self_, _self,i);;
  }
  
  private static int j(final org.xcpsml.xcpsml.cpsml.System _self) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_j(_self_, _self);;
    return (int)result;
  }
  
  private static void j(final org.xcpsml.xcpsml.cpsml.System _self, final int j) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_j(_self_, _self,j);;
  }
  
  private static String str1(final org.xcpsml.xcpsml.cpsml.System _self) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_str1(_self_, _self);;
    return (java.lang.String)result;
  }
  
  private static void str1(final org.xcpsml.xcpsml.cpsml.System _self, final String str1) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_str1(_self_, _self,str1);;
  }
  
  private static String str2(final org.xcpsml.xcpsml.cpsml.System _self) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_str2(_self_, _self);;
    return (java.lang.String)result;
  }
  
  private static void str2(final org.xcpsml.xcpsml.cpsml.System _self, final String str2) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_str2(_self_, _self,str2);;
  }
  
  private static String str3(final org.xcpsml.xcpsml.cpsml.System _self) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_str3(_self_, _self);;
    return (java.lang.String)result;
  }
  
  private static void str3(final org.xcpsml.xcpsml.cpsml.System _self, final String str3) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_str3(_self_, _self,str3);;
  }
  
  private static String str4(final org.xcpsml.xcpsml.cpsml.System _self) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_str4(_self_, _self);;
    return (java.lang.String)result;
  }
  
  private static void str4(final org.xcpsml.xcpsml.cpsml.System _self, final String str4) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_str4(_self_, _self,str4);;
  }
  
  private static String str5(final org.xcpsml.xcpsml.cpsml.System _self) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_str5(_self_, _self);;
    return (java.lang.String)result;
  }
  
  private static void str5(final org.xcpsml.xcpsml.cpsml.System _self, final String str5) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_str5(_self_, _self,str5);;
  }
  
  private static float intervalleft(final org.xcpsml.xcpsml.cpsml.System _self) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_intervalleft(_self_, _self);;
    return (float)result;
  }
  
  private static void intervalleft(final org.xcpsml.xcpsml.cpsml.System _self, final float intervalleft) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_intervalleft(_self_, _self,intervalleft);;
  }
  
  private static float intervalright(final org.xcpsml.xcpsml.cpsml.System _self) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_intervalright(_self_, _self);;
    return (float)result;
  }
  
  private static void intervalright(final org.xcpsml.xcpsml.cpsml.System _self, final float intervalright) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_intervalright(_self_, _self,intervalright);;
  }
  
  private static float intervalsub(final org.xcpsml.xcpsml.cpsml.System _self) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_intervalsub(_self_, _self);;
    return (float)result;
  }
  
  private static void intervalsub(final org.xcpsml.xcpsml.cpsml.System _self, final float intervalsub) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_intervalsub(_self_, _self,intervalsub);;
  }
  
  private static float intervalleftnew(final org.xcpsml.xcpsml.cpsml.System _self) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_intervalleftnew(_self_, _self);;
    return (float)result;
  }
  
  private static void intervalleftnew(final org.xcpsml.xcpsml.cpsml.System _self, final float intervalleftnew) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_intervalleftnew(_self_, _self,intervalleftnew);;
  }
  
  public static int y0label(final org.xcpsml.xcpsml.cpsml.System _self) {
	final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_y0label(_self_, _self);
	;
	return (int) result;
}
  
  public static void y0label(final org.xcpsml.xcpsml.cpsml.System _self, final int y0label) {
	final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext
			.getSelf(_self);
	_privk3_y0label(_self_, _self, y0label);
	;
}
  
  private static float y0value(final org.xcpsml.xcpsml.cpsml.System _self) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_y0value(_self_, _self);;
    return (float)result;
  }
  
  private static void y0value(final org.xcpsml.xcpsml.cpsml.System _self, final float y0value) {
    final org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectProperties _self_ = org.xcpsml.xcpsml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_y0value(_self_, _self,y0value);;
  }
  
  protected static void _privk3_main(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self) {
    try {
      InputOutput.<String>println("");
      Scilab _sci = SystemAspect.sci(_self);
      _sci.open();
      try {
        while (true) {
          SystemAspect.dojump(_self);
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception nt = (Exception)_t;
          String _message = nt.getMessage();
          String _plus = ("Stopped due to:" + _message);
          InputOutput.<String>println(_plus);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static void _privk3_dojump(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self) {
    InputOutput.<String>println("  ");
    InputOutput.<String>print(">>>>");
    State _currentState = SystemAspect.currentState(_self);
    String _name = _currentState.getName();
    String _plus = ("currentState: " + _name);
    InputOutput.<String>print(_plus);
    InputOutput.<String>print("------");
    int direct = 1;
    int existdirect = 0;
    int _sub = SystemAspect.sub(_self);
    boolean _equals = (_sub == 0);
    if (_equals) {
      InputOutput.<String>println(">>>>In Father Layer");
      int doloop = 0;
      int a = 0;
      int b = 0;
      int c = 0;
      if (((((!Objects.equal(SystemAspect.currentState(_self).getInitialsubstate(), null)) && Objects.equal(SystemAspect.currentState(_self).getSlaveode(), null)) && (((Object[])Conversions.unwrapArray(SystemAspect.currentState(_self).getOutgoingComTransitions(), Object.class)).length < 1)) && (((Object[])Conversions.unwrapArray(SystemAspect.currentState(_self).getOutgoingProbTransitions(), Object.class)).length < 1))) {
        State _currentState_1 = SystemAspect.currentState(_self);
        SystemAspect.fatherState(_self, _currentState_1);
        State _currentState_2 = SystemAspect.currentState(_self);
        State _initialsubstate = _currentState_2.getInitialsubstate();
        SystemAspect.currentState(_self, _initialsubstate);
        State _currentState_3 = SystemAspect.currentState(_self);
        Variable _subrelatedvariable = _currentState_3.getSubrelatedvariable();
        State _currentState_4 = SystemAspect.currentState(_self);
        Variable _subrelatedvariable_1 = _currentState_4.getSubrelatedvariable();
        float _value = _subrelatedvariable_1.getValue();
        VariableAspect.Globalnv(_subrelatedvariable, _value);
        State _currentState_5 = SystemAspect.currentState(_self);
        String _name_1 = _currentState_5.getName();
        String _plus_1 = ("Change to State:  " + _name_1);
        InputOutput.<String>println(_plus_1);
        SystemAspect.sub(_self, 1);
      } else {
        if ((((Objects.equal(SystemAspect.currentState(_self).getInitialsubstate(), null) && Objects.equal(SystemAspect.currentState(_self).getSlaveode(), null)) && (((Object[])Conversions.unwrapArray(SystemAspect.currentState(_self).getOutgoingComTransitions(), Object.class)).length < 1)) && (((Object[])Conversions.unwrapArray(SystemAspect.currentState(_self).getOutgoingProbTransitions(), Object.class)).length < 1))) {
          State _currentState_6 = SystemAspect.currentState(_self);
          String _name_2 = _currentState_6.getName();
          String _plus_2 = (_name_2 + "is a Final State");
          InputOutput.<String>println(_plus_2);
        } else {
          while ((doloop == 0)) {
            {
              if ((a == 0)) {
                State _currentState_7 = SystemAspect.currentState(_self);
                EList<ComTransition> _outgoingComTransitions = _currentState_7.getOutgoingComTransitions();
                int _length = ((Object[])Conversions.unwrapArray(_outgoingComTransitions, Object.class)).length;
                boolean _greaterEqualsThan = (_length >= 1);
                if (_greaterEqualsThan) {
                  State _currentState_8 = SystemAspect.currentState(_self);
                  EList<ComTransition> _outgoingComTransitions_1 = _currentState_8.getOutgoingComTransitions();
                  for (final ComTransition ct3 : _outgoingComTransitions_1) {
                    if ((Objects.equal(ct3.getGuard(), null) || ((!Objects.equal(ct3.getGuard(), null)) && (TransitionAspect.holds(ct3) == true)))) {
                      doloop = 1;
                      State _ctgt = ct3.getCtgt();
                      SystemAspect.currentState(_self, _ctgt);
                      b = 1;
                      c = 1;
                      State _currentState_9 = SystemAspect.currentState(_self);
                      String _name_3 = _currentState_9.getName();
                      String _plus_3 = ("Change to State: " + _name_3);
                      InputOutput.<String>println(_plus_3);
                      State _currentState_10 = SystemAspect.currentState(_self);
                      State _initialsubstate_1 = _currentState_10.getInitialsubstate();
                      boolean _notEquals = (!Objects.equal(_initialsubstate_1, null));
                      if (_notEquals) {
                        direct = 1;
                        existdirect = 0;
                        if ((direct == 1)) {
                          State _currentState_11 = SystemAspect.currentState(_self);
                          EList<ComTransition> _outgoingComTransitions_2 = _currentState_11.getOutgoingComTransitions();
                          int _length_1 = ((Object[])Conversions.unwrapArray(_outgoingComTransitions_2, Object.class)).length;
                          boolean _greaterEqualsThan_1 = (_length_1 >= 1);
                          if (_greaterEqualsThan_1) {
                            State _currentState_12 = SystemAspect.currentState(_self);
                            EList<ComTransition> _outgoingComTransitions_3 = _currentState_12.getOutgoingComTransitions();
                            for (final ComTransition ct4 : _outgoingComTransitions_3) {
                              if ((Objects.equal(ct4.getGuard(), null) || ((!Objects.equal(ct4.getGuard(), null)) && (TransitionAspect.holds(ct4) == true)))) {
                                State _ctgt_1 = ct4.getCtgt();
                                SystemAspect.currentState(_self, _ctgt_1);
                                State _currentState_13 = SystemAspect.currentState(_self);
                                String _name_4 = _currentState_13.getName();
                                String _plus_4 = ("Change to State:" + _name_4);
                                InputOutput.<String>println(_plus_4);
                                existdirect = 1;
                              }
                            }
                          }
                          State _currentState_14 = SystemAspect.currentState(_self);
                          EList<ProbTransition> _outgoingProbTransitions = _currentState_14.getOutgoingProbTransitions();
                          int _length_2 = ((Object[])Conversions.unwrapArray(_outgoingProbTransitions, Object.class)).length;
                          boolean _greaterEqualsThan_2 = (_length_2 >= 1);
                          if (_greaterEqualsThan_2) {
                            double _random = Math.random();
                            String _string = Double.valueOf(_random).toString();
                            float _parseFloat = Float.parseFloat(_string);
                            SystemAspect.ran(_self, Float.valueOf(_parseFloat));
                            int x4 = 0;
                            int y4 = 0;
                            float probright4 = 0;
                            ProbTransition[] ptt4 = new ProbTransition[30];
                            Float[] ptprob4 = new Float[30];
                            State _currentState_15 = SystemAspect.currentState(_self);
                            EList<ProbTransition> _outgoingProbTransitions_1 = _currentState_15.getOutgoingProbTransitions();
                            for (final ProbTransition pt4 : _outgoingProbTransitions_1) {
                              if ((Objects.equal(pt4.getGuard(), null) || ((!Objects.equal(pt4.getGuard(), null)) && (TransitionAspect.holds(pt4) == true)))) {
                                ptt4[x4] = pt4;
                                x4++;
                                float _probability = pt4.getProbability();
                                float _plus_5 = (_probability + probright4);
                                ptprob4[y4] = Float.valueOf(_plus_5);
                                float _probability_1 = pt4.getProbability();
                                float _plus_6 = (_probability_1 + probright4);
                                probright4 = _plus_6;
                                y4++;
                              }
                            }
                            int s4 = 0;
                            int proboutlabel4 = 0;
                            if ((y4 > 0)) {
                              for (s4 = 1; ((s4 <= y4) && (proboutlabel4 == 0)); s4++) {
                                Float _ran = SystemAspect.ran(_self);
                                Float _get = ptprob4[(s4 - 1)];
                                boolean _lessThan = (_ran.compareTo(_get) < 0);
                                if (_lessThan) {
                                  ProbTransition _get_1 = ptt4[(s4 - 1)];
                                  SystemAspect.ptok(_self, _get_1);
                                  proboutlabel4 = 1;
                                }
                              }
                            }
                            if ((x4 > 0)) {
                              ProbTransition _ptok = SystemAspect.ptok(_self);
                              State _ptgt = _ptok.getPtgt();
                              SystemAspect.currentState(_self, _ptgt);
                              State _currentState_16 = SystemAspect.currentState(_self);
                              String _name_5 = _currentState_16.getName();
                              String _plus_7 = ("change to state:" + _name_5);
                              InputOutput.<String>println(_plus_7);
                              existdirect = 1;
                            }
                          }
                          if ((existdirect == 0)) {
                            direct = 0;
                          } else {
                            direct = 1;
                          }
                        }
                        if ((direct == 0)) {
                          State _currentState_17 = SystemAspect.currentState(_self);
                          SystemAspect.fatherState(_self, _currentState_17);
                          State _currentState_18 = SystemAspect.currentState(_self);
                          State _initialsubstate_2 = _currentState_18.getInitialsubstate();
                          SystemAspect.currentState(_self, _initialsubstate_2);
                          State _currentState_19 = SystemAspect.currentState(_self);
                          String _name_6 = _currentState_19.getName();
                          String _plus_8 = ("change to state:" + _name_6);
                          InputOutput.<String>println(_plus_8);
                          SystemAspect.sub(_self, 1);
                        }
                      }
                    }
                  }
                }
              }
              if ((b == 0)) {
                State _currentState_20 = SystemAspect.currentState(_self);
                EList<ProbTransition> _outgoingProbTransitions_2 = _currentState_20.getOutgoingProbTransitions();
                int _length_3 = ((Object[])Conversions.unwrapArray(_outgoingProbTransitions_2, Object.class)).length;
                boolean _greaterEqualsThan_3 = (_length_3 >= 1);
                if (_greaterEqualsThan_3) {
                  double _random_1 = Math.random();
                  String _string_1 = Double.valueOf(_random_1).toString();
                  float _parseFloat_1 = Float.parseFloat(_string_1);
                  SystemAspect.ran(_self, Float.valueOf(_parseFloat_1));
                  int x3 = 0;
                  int y3 = 0;
                  float probright3 = 0;
                  ProbTransition[] ptt3 = new ProbTransition[30];
                  Float[] ptprob3 = new Float[30];
                  State _currentState_21 = SystemAspect.currentState(_self);
                  EList<ProbTransition> _outgoingProbTransitions_3 = _currentState_21.getOutgoingProbTransitions();
                  for (final ProbTransition pt3 : _outgoingProbTransitions_3) {
                    if ((Objects.equal(pt3.getGuard(), null) || ((!Objects.equal(pt3.getGuard(), null)) && (TransitionAspect.holds(pt3) == true)))) {
                      ptt3[x3] = pt3;
                      x3++;
                      float _probability_2 = pt3.getProbability();
                      float _plus_9 = (_probability_2 + probright3);
                      ptprob3[y3] = Float.valueOf(_plus_9);
                      float _probability_3 = pt3.getProbability();
                      float _plus_10 = (_probability_3 + probright3);
                      probright3 = _plus_10;
                      y3++;
                    }
                  }
                  int s3 = 0;
                  int proboutlabel3 = 0;
                  if ((y3 > 0)) {
                    for (s3 = 1; ((s3 <= y3) && (proboutlabel3 == 0)); s3++) {
                      Float _ran = SystemAspect.ran(_self);
                      Float _get = ptprob3[(s3 - 1)];
                      boolean _lessThan = (_ran.compareTo(_get) < 0);
                      if (_lessThan) {
                        ProbTransition _get_1 = ptt3[(s3 - 1)];
                        SystemAspect.ptok(_self, _get_1);
                        proboutlabel3 = 1;
                      }
                    }
                  }
                  if ((x3 > 0)) {
                    doloop = 1;
                    ProbTransition _ptok_1 = SystemAspect.ptok(_self);
                    State _ptgt_1 = _ptok_1.getPtgt();
                    SystemAspect.currentState(_self, _ptgt_1);
                    c = 1;
                    State _currentState_22 = SystemAspect.currentState(_self);
                    String _name_7 = _currentState_22.getName();
                    String _plus_11 = ("Change to State:" + _name_7);
                    InputOutput.<String>println(_plus_11);
                    State _currentState_23 = SystemAspect.currentState(_self);
                    State _initialsubstate_3 = _currentState_23.getInitialsubstate();
                    boolean _notEquals_1 = (!Objects.equal(_initialsubstate_3, null));
                    if (_notEquals_1) {
                      direct = 1;
                      existdirect = 0;
                      if ((direct == 1)) {
                        State _currentState_24 = SystemAspect.currentState(_self);
                        EList<ComTransition> _outgoingComTransitions_4 = _currentState_24.getOutgoingComTransitions();
                        int _length_4 = ((Object[])Conversions.unwrapArray(_outgoingComTransitions_4, Object.class)).length;
                        boolean _greaterEqualsThan_4 = (_length_4 >= 1);
                        if (_greaterEqualsThan_4) {
                          State _currentState_25 = SystemAspect.currentState(_self);
                          EList<ComTransition> _outgoingComTransitions_5 = _currentState_25.getOutgoingComTransitions();
                          for (final ComTransition ct5 : _outgoingComTransitions_5) {
                            if ((Objects.equal(ct5.getGuard(), null) || ((!Objects.equal(ct5.getGuard(), null)) && (TransitionAspect.holds(ct5) == true)))) {
                              State _ctgt_2 = ct5.getCtgt();
                              SystemAspect.currentState(_self, _ctgt_2);
                              State _currentState_26 = SystemAspect.currentState(_self);
                              String _name_8 = _currentState_26.getName();
                              String _plus_12 = ("change to state:" + _name_8);
                              InputOutput.<String>println(_plus_12);
                              existdirect = 1;
                            }
                          }
                        }
                        State _currentState_27 = SystemAspect.currentState(_self);
                        EList<ProbTransition> _outgoingProbTransitions_4 = _currentState_27.getOutgoingProbTransitions();
                        int _length_5 = ((Object[])Conversions.unwrapArray(_outgoingProbTransitions_4, Object.class)).length;
                        boolean _greaterEqualsThan_5 = (_length_5 >= 1);
                        if (_greaterEqualsThan_5) {
                          double _random_2 = Math.random();
                          String _string_2 = Double.valueOf(_random_2).toString();
                          float _parseFloat_2 = Float.parseFloat(_string_2);
                          SystemAspect.ran(_self, Float.valueOf(_parseFloat_2));
                          int x5 = 0;
                          int y5 = 0;
                          float probright5 = 0;
                          ProbTransition[] ptt5 = new ProbTransition[30];
                          Float[] ptprob5 = new Float[30];
                          State _currentState_28 = SystemAspect.currentState(_self);
                          EList<ProbTransition> _outgoingProbTransitions_5 = _currentState_28.getOutgoingProbTransitions();
                          for (final ProbTransition pt5 : _outgoingProbTransitions_5) {
                            if ((Objects.equal(pt5.getGuard(), null) || ((!Objects.equal(pt5.getGuard(), null)) && (TransitionAspect.holds(pt5) == true)))) {
                              ptt5[x5] = pt5;
                              x5++;
                              float _probability_4 = pt5.getProbability();
                              float _plus_13 = (_probability_4 + probright5);
                              ptprob5[y5] = Float.valueOf(_plus_13);
                              float _probability_5 = pt5.getProbability();
                              float _plus_14 = (_probability_5 + probright5);
                              probright5 = _plus_14;
                              y5++;
                            }
                          }
                          int s5 = 0;
                          int proboutlabel5 = 0;
                          if ((y5 > 0)) {
                            for (s5 = 1; ((s5 <= y5) && (proboutlabel5 == 0)); s5++) {
                              Float _ran = SystemAspect.ran(_self);
                              Float _get = ptprob5[(s5 - 1)];
                              boolean _lessThan = (_ran.compareTo(_get) < 0);
                              if (_lessThan) {
                                ProbTransition _get_1 = ptt5[(s5 - 1)];
                                SystemAspect.ptok(_self, _get_1);
                                proboutlabel5 = 1;
                              }
                            }
                          }
                          if ((x5 > 0)) {
                            ProbTransition _ptok_2 = SystemAspect.ptok(_self);
                            State _ptgt_2 = _ptok_2.getPtgt();
                            SystemAspect.currentState(_self, _ptgt_2);
                            State _currentState_29 = SystemAspect.currentState(_self);
                            String _name_9 = _currentState_29.getName();
                            String _plus_15 = ("Change to State:" + _name_9);
                            InputOutput.<String>println(_plus_15);
                            existdirect = 1;
                          }
                        }
                        if ((existdirect == 0)) {
                          direct = 0;
                        } else {
                          direct = 1;
                        }
                      }
                      if ((direct == 0)) {
                        State _currentState_30 = SystemAspect.currentState(_self);
                        SystemAspect.fatherState(_self, _currentState_30);
                        State _currentState_31 = SystemAspect.currentState(_self);
                        State _initialsubstate_4 = _currentState_31.getInitialsubstate();
                        SystemAspect.currentState(_self, _initialsubstate_4);
                        State _currentState_32 = SystemAspect.currentState(_self);
                        String _name_10 = _currentState_32.getName();
                        String _plus_16 = ("change to state:" + _name_10);
                        InputOutput.<String>println(_plus_16);
                        SystemAspect.sub(_self, 1);
                      }
                    }
                  }
                }
              }
              if (((c == 0) && (!Objects.equal(SystemAspect.currentState(_self).getSlaveode(), null)))) {
                int _y0label = SystemAspect.y0label(_self);
                boolean _equals_1 = (_y0label == 0);
                if (_equals_1) {
                  State _currentState_33 = SystemAspect.currentState(_self);
                  ODE _slaveode = _currentState_33.getSlaveode();
                  Condition _condition = _slaveode.getCondition();
                  String _name_11 = _condition.getName();
                  SystemAspect.str1(_self, _name_11);
                } else {
                  float _y0value = SystemAspect.y0value(_self);
                  String _string_3 = Float.valueOf(_y0value).toString();
                  SystemAspect.str1(_self, _string_3);
                }
                State _currentState_34 = SystemAspect.currentState(_self);
                ODE _slaveode_1 = _currentState_34.getSlaveode();
                Function _function = _slaveode_1.getFunction();
                Fright _fright = _function.getFright();
                String _name_12 = _fright.getName();
                SystemAspect.str2(_self, _name_12);
                State _currentState_35 = SystemAspect.currentState(_self);
                ODE _slaveode_2 = _currentState_35.getSlaveode();
                Function _function_1 = _slaveode_2.getFunction();
                String _name_13 = _function_1.getName();
                SystemAspect.str3(_self, _name_13);
                State _currentState_36 = SystemAspect.currentState(_self);
                ODE _slaveode_3 = _currentState_36.getSlaveode();
                Function _function_2 = _slaveode_3.getFunction();
                IndeVariable _indevariable = _function_2.getIndevariable();
                String _name_14 = _indevariable.getName();
                SystemAspect.str4(_self, _name_14);
                State _currentState_37 = SystemAspect.currentState(_self);
                ODE _slaveode_4 = _currentState_37.getSlaveode();
                Function _function_3 = _slaveode_4.getFunction();
                DeVariable _devariable = _function_3.getDevariable();
                String _name_15 = _devariable.getName();
                SystemAspect.str5(_self, _name_15);
                State _currentState_38 = SystemAspect.currentState(_self);
                ODE _slaveode_5 = _currentState_38.getSlaveode();
                Interval _interval = _slaveode_5.getInterval();
                float _left = _interval.getLeft();
                SystemAspect.intervalleft(_self, _left);
                State _currentState_39 = SystemAspect.currentState(_self);
                ODE _slaveode_6 = _currentState_39.getSlaveode();
                Interval _interval_1 = _slaveode_6.getInterval();
                float _right = _interval_1.getRight();
                SystemAspect.intervalright(_self, _right);
                State _currentState_40 = SystemAspect.currentState(_self);
                ODE _slaveode_7 = _currentState_40.getSlaveode();
                Interval _interval_2 = _slaveode_7.getInterval();
                float _subinterval = _interval_2.getSubinterval();
                SystemAspect.intervalsub(_self, _subinterval);
                if ((doloop == 0)) {
                  SystemAspect.callscilab(_self);
                }
              }
            }
          }
          float _i = SystemAspect.i(_self);
          SystemAspect.intervalleftnew(_self, _i);
          Variable _relatedvariable = _self.getRelatedvariable();
          float _Globalnv = VariableAspect.Globalnv(_relatedvariable);
          SystemAspect.y0value(_self, _Globalnv);
          float _intervalleftnew = SystemAspect.intervalleftnew(_self);
          String _string = Float.valueOf(_intervalleftnew).toString();
          String _plus_3 = (">t=" + _string);
          InputOutput.<String>print(_plus_3);
          InputOutput.<String>print("    ");
          Variable _relatedvariable_1 = _self.getRelatedvariable();
          float _Globalnv_1 = VariableAspect.Globalnv(_relatedvariable_1);
          String _string_1 = Float.valueOf(_Globalnv_1).toString();
          String _plus_4 = ("Globalnv:" + _string_1);
          InputOutput.<String>println(_plus_4);
        }
      }
    } else {
      int _sub_1 = SystemAspect.sub(_self);
      boolean _equals_1 = (_sub_1 == 1);
      if (_equals_1) {
        InputOutput.<String>println(">>>>In Children Layer");
        int subdoloop = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        if ((((((((Object[])Conversions.unwrapArray(SystemAspect.fatherState(_self).getOutgoingComTransitions(), Object.class)).length < 1) && (((Object[])Conversions.unwrapArray(SystemAspect.fatherState(_self).getOutgoingProbTransitions(), Object.class)).length < 1)) && (((Object[])Conversions.unwrapArray(SystemAspect.currentState(_self).getOutgoingComTransitions(), Object.class)).length < 1)) && (((Object[])Conversions.unwrapArray(SystemAspect.currentState(_self).getOutgoingProbTransitions(), Object.class)).length < 1)) && Objects.equal(SystemAspect.currentState(_self).getSlaveode(), null))) {
          State _currentState_7 = SystemAspect.currentState(_self);
          String _name_3 = _currentState_7.getName();
          String _plus_5 = (_name_3 + "is a Final State");
          InputOutput.<String>println(_plus_5);
        } else {
          while ((subdoloop == 0)) {
            {
              if ((d == 0)) {
                State _fatherState = SystemAspect.fatherState(_self);
                EList<ComTransition> _outgoingComTransitions = _fatherState.getOutgoingComTransitions();
                int _length = ((Object[])Conversions.unwrapArray(_outgoingComTransitions, Object.class)).length;
                boolean _greaterEqualsThan = (_length >= 1);
                if (_greaterEqualsThan) {
                  State _fatherState_1 = SystemAspect.fatherState(_self);
                  EList<ComTransition> _outgoingComTransitions_1 = _fatherState_1.getOutgoingComTransitions();
                  for (final ComTransition ct6 : _outgoingComTransitions_1) {
                    if ((Objects.equal(ct6.getGuard(), null) || ((!Objects.equal(ct6.getGuard(), null)) && (TransitionAspect.holds(ct6) == true)))) {
                      State _ctgt = ct6.getCtgt();
                      SystemAspect.currentState(_self, _ctgt);
                      subdoloop = 1;
                      e = 1;
                      f = 1;
                      g = 1;
                      h = 1;
                      State _currentState_8 = SystemAspect.currentState(_self);
                      String _name_4 = _currentState_8.getName();
                      String _plus_6 = ("Change to  its father state: " + _name_4);
                      InputOutput.<String>println(_plus_6);
                      SystemAspect.sub(_self, 0);
                      State _currentState_9 = SystemAspect.currentState(_self);
                      State _initialsubstate_1 = _currentState_9.getInitialsubstate();
                      boolean _notEquals = (!Objects.equal(_initialsubstate_1, null));
                      if (_notEquals) {
                        direct = 1;
                        existdirect = 0;
                        if ((direct == 1)) {
                          State _currentState_10 = SystemAspect.currentState(_self);
                          EList<ComTransition> _outgoingComTransitions_2 = _currentState_10.getOutgoingComTransitions();
                          boolean _notEquals_1 = (!Objects.equal(_outgoingComTransitions_2, null));
                          if (_notEquals_1) {
                            State _currentState_11 = SystemAspect.currentState(_self);
                            EList<ComTransition> _outgoingComTransitions_3 = _currentState_11.getOutgoingComTransitions();
                            int _length_1 = ((Object[])Conversions.unwrapArray(_outgoingComTransitions_3, Object.class)).length;
                            boolean _greaterEqualsThan_1 = (_length_1 >= 1);
                            if (_greaterEqualsThan_1) {
                              State _currentState_12 = SystemAspect.currentState(_self);
                              EList<ComTransition> _outgoingComTransitions_4 = _currentState_12.getOutgoingComTransitions();
                              for (final ComTransition ct7 : _outgoingComTransitions_4) {
                                if ((Objects.equal(ct7.getGuard(), null) || ((!Objects.equal(ct7.getGuard(), null)) && (TransitionAspect.holds(ct7) == true)))) {
                                  State _ctgt_1 = ct7.getCtgt();
                                  SystemAspect.currentState(_self, _ctgt_1);
                                  State _currentState_13 = SystemAspect.currentState(_self);
                                  String _name_5 = _currentState_13.getName();
                                  String _plus_7 = ("Change to state:" + _name_5);
                                  InputOutput.<String>println(_plus_7);
                                  existdirect = 1;
                                }
                              }
                            }
                          }
                          State _currentState_14 = SystemAspect.currentState(_self);
                          EList<ProbTransition> _outgoingProbTransitions = _currentState_14.getOutgoingProbTransitions();
                          int _length_2 = ((Object[])Conversions.unwrapArray(_outgoingProbTransitions, Object.class)).length;
                          boolean _greaterEqualsThan_2 = (_length_2 >= 1);
                          if (_greaterEqualsThan_2) {
                            double _random = Math.random();
                            String _string_2 = Double.valueOf(_random).toString();
                            float _parseFloat = Float.parseFloat(_string_2);
                            SystemAspect.ran(_self, Float.valueOf(_parseFloat));
                            int x7 = 0;
                            int y7 = 0;
                            float probright7 = 0;
                            ProbTransition[] ptt7 = new ProbTransition[30];
                            Float[] ptprob7 = new Float[30];
                            State _currentState_15 = SystemAspect.currentState(_self);
                            EList<ProbTransition> _outgoingProbTransitions_1 = _currentState_15.getOutgoingProbTransitions();
                            for (final ProbTransition pt7 : _outgoingProbTransitions_1) {
                              if ((Objects.equal(pt7.getGuard(), null) || ((!Objects.equal(pt7.getGuard(), null)) && (TransitionAspect.holds(pt7) == true)))) {
                                ptt7[x7] = pt7;
                                x7++;
                                float _probability = pt7.getProbability();
                                float _plus_8 = (_probability + probright7);
                                ptprob7[y7] = Float.valueOf(_plus_8);
                                float _probability_1 = pt7.getProbability();
                                float _plus_9 = (_probability_1 + probright7);
                                probright7 = _plus_9;
                                y7++;
                              }
                            }
                            int s7 = 0;
                            int proboutlabel7 = 0;
                            if ((y7 > 0)) {
                              for (s7 = 1; ((s7 <= y7) && (proboutlabel7 == 0)); s7++) {
                                Float _ran = SystemAspect.ran(_self);
                                Float _get = ptprob7[(s7 - 1)];
                                boolean _lessThan = (_ran.compareTo(_get) < 0);
                                if (_lessThan) {
                                  ProbTransition _get_1 = ptt7[(s7 - 1)];
                                  SystemAspect.ptok(_self, _get_1);
                                  proboutlabel7 = 1;
                                }
                              }
                            }
                            if ((x7 > 0)) {
                              ProbTransition _ptok = SystemAspect.ptok(_self);
                              State _ptgt = _ptok.getPtgt();
                              SystemAspect.currentState(_self, _ptgt);
                              State _currentState_16 = SystemAspect.currentState(_self);
                              String _name_6 = _currentState_16.getName();
                              String _plus_10 = ("Change to State: " + _name_6);
                              InputOutput.<String>println(_plus_10);
                              existdirect = 1;
                            }
                          }
                          if ((existdirect == 0)) {
                            direct = 0;
                          } else {
                            direct = 1;
                          }
                        }
                        if ((direct == 0)) {
                          State _currentState_17 = SystemAspect.currentState(_self);
                          SystemAspect.fatherState(_self, _currentState_17);
                          State _currentState_18 = SystemAspect.currentState(_self);
                          State _initialsubstate_2 = _currentState_18.getInitialsubstate();
                          SystemAspect.currentState(_self, _initialsubstate_2);
                          State _currentState_19 = SystemAspect.currentState(_self);
                          String _name_7 = _currentState_19.getName();
                          String _plus_11 = ("Change to State: " + _name_7);
                          InputOutput.<String>println(_plus_11);
                          SystemAspect.sub(_self, 1);
                        }
                      }
                    }
                  }
                }
              }
              if ((e == 0)) {
                State _fatherState_2 = SystemAspect.fatherState(_self);
                EList<ProbTransition> _outgoingProbTransitions_2 = _fatherState_2.getOutgoingProbTransitions();
                int _length_3 = ((Object[])Conversions.unwrapArray(_outgoingProbTransitions_2, Object.class)).length;
                boolean _greaterEqualsThan_3 = (_length_3 >= 1);
                if (_greaterEqualsThan_3) {
                  double _random_1 = Math.random();
                  String _string_3 = Double.valueOf(_random_1).toString();
                  float _parseFloat_1 = Float.parseFloat(_string_3);
                  SystemAspect.ran(_self, Float.valueOf(_parseFloat_1));
                  int x6 = 0;
                  int y6 = 0;
                  float probright6 = 0;
                  ProbTransition[] ptt6 = new ProbTransition[30];
                  Float[] ptprob6 = new Float[30];
                  State _fatherState_3 = SystemAspect.fatherState(_self);
                  EList<ProbTransition> _outgoingProbTransitions_3 = _fatherState_3.getOutgoingProbTransitions();
                  for (final ProbTransition pt6 : _outgoingProbTransitions_3) {
                    if ((Objects.equal(pt6.getGuard(), null) || ((!Objects.equal(pt6.getGuard(), null)) && (TransitionAspect.holds(pt6) == true)))) {
                      ptt6[x6] = pt6;
                      x6++;
                      float _probability_2 = pt6.getProbability();
                      float _plus_12 = (_probability_2 + probright6);
                      ptprob6[y6] = Float.valueOf(_plus_12);
                      float _probability_3 = pt6.getProbability();
                      float _plus_13 = (_probability_3 + probright6);
                      probright6 = _plus_13;
                      y6++;
                    }
                  }
                  int s6 = 0;
                  int proboutlabel6 = 0;
                  if ((y6 > 0)) {
                    for (s6 = 1; ((s6 <= y6) && (proboutlabel6 == 0)); s6++) {
                      Float _ran = SystemAspect.ran(_self);
                      Float _get = ptprob6[(s6 - 1)];
                      boolean _lessThan = (_ran.compareTo(_get) < 0);
                      if (_lessThan) {
                        ProbTransition _get_1 = ptt6[(s6 - 1)];
                        SystemAspect.ptok(_self, _get_1);
                        proboutlabel6 = 1;
                      }
                    }
                  }
                  if ((x6 > 0)) {
                    ProbTransition _ptok_1 = SystemAspect.ptok(_self);
                    State _ptgt_1 = _ptok_1.getPtgt();
                    SystemAspect.currentState(_self, _ptgt_1);
                    subdoloop = 1;
                    f = 1;
                    g = 1;
                    h = 1;
                    State _currentState_20 = SystemAspect.currentState(_self);
                    String _name_8 = _currentState_20.getName();
                    String _plus_14 = ("Change to state: " + _name_8);
                    InputOutput.<String>println(_plus_14);
                    SystemAspect.sub(_self, 0);
                    State _currentState_21 = SystemAspect.currentState(_self);
                    State _initialsubstate_3 = _currentState_21.getInitialsubstate();
                    boolean _notEquals_2 = (!Objects.equal(_initialsubstate_3, null));
                    if (_notEquals_2) {
                      direct = 1;
                      existdirect = 0;
                      if ((direct == 1)) {
                        State _currentState_22 = SystemAspect.currentState(_self);
                        EList<ComTransition> _outgoingComTransitions_5 = _currentState_22.getOutgoingComTransitions();
                        boolean _notEquals_3 = (!Objects.equal(_outgoingComTransitions_5, null));
                        if (_notEquals_3) {
                          State _currentState_23 = SystemAspect.currentState(_self);
                          EList<ComTransition> _outgoingComTransitions_6 = _currentState_23.getOutgoingComTransitions();
                          int _length_4 = ((Object[])Conversions.unwrapArray(_outgoingComTransitions_6, Object.class)).length;
                          boolean _greaterEqualsThan_4 = (_length_4 >= 1);
                          if (_greaterEqualsThan_4) {
                            State _currentState_24 = SystemAspect.currentState(_self);
                            EList<ComTransition> _outgoingComTransitions_7 = _currentState_24.getOutgoingComTransitions();
                            for (final ComTransition ct8 : _outgoingComTransitions_7) {
                              if ((Objects.equal(ct8.getGuard(), null) || ((!Objects.equal(ct8.getGuard(), null)) && (TransitionAspect.holds(ct8) == true)))) {
                                State _ctgt_2 = ct8.getCtgt();
                                SystemAspect.currentState(_self, _ctgt_2);
                                State _currentState_25 = SystemAspect.currentState(_self);
                                String _name_9 = _currentState_25.getName();
                                String _plus_15 = ("Change to state: " + _name_9);
                                InputOutput.<String>println(_plus_15);
                                existdirect = 1;
                              }
                            }
                          }
                        }
                        State _currentState_26 = SystemAspect.currentState(_self);
                        EList<ProbTransition> _outgoingProbTransitions_4 = _currentState_26.getOutgoingProbTransitions();
                        int _length_5 = ((Object[])Conversions.unwrapArray(_outgoingProbTransitions_4, Object.class)).length;
                        boolean _greaterEqualsThan_5 = (_length_5 >= 1);
                        if (_greaterEqualsThan_5) {
                          double _random_2 = Math.random();
                          String _string_4 = Double.valueOf(_random_2).toString();
                          float _parseFloat_2 = Float.parseFloat(_string_4);
                          SystemAspect.ran(_self, Float.valueOf(_parseFloat_2));
                          int x8 = 0;
                          int y8 = 0;
                          float probright8 = 0;
                          ProbTransition[] ptt8 = new ProbTransition[30];
                          Float[] ptprob8 = new Float[30];
                          State _currentState_27 = SystemAspect.currentState(_self);
                          EList<ProbTransition> _outgoingProbTransitions_5 = _currentState_27.getOutgoingProbTransitions();
                          for (final ProbTransition pt8 : _outgoingProbTransitions_5) {
                            if ((Objects.equal(pt8.getGuard(), null) || ((!Objects.equal(pt8.getGuard(), null)) && (TransitionAspect.holds(pt8) == true)))) {
                              ptt8[x8] = pt8;
                              x8++;
                              float _probability_4 = pt8.getProbability();
                              float _plus_16 = (_probability_4 + probright8);
                              ptprob8[y8] = Float.valueOf(_plus_16);
                              float _probability_5 = pt8.getProbability();
                              float _plus_17 = (_probability_5 + probright8);
                              probright8 = _plus_17;
                              y8++;
                            }
                          }
                          int s8 = 0;
                          int proboutlabel8 = 0;
                          if ((y8 > 0)) {
                            for (s8 = 1; ((s8 <= y8) && (proboutlabel8 == 0)); s8++) {
                              Float _ran = SystemAspect.ran(_self);
                              Float _get = ptprob8[(s8 - 1)];
                              boolean _lessThan = (_ran.compareTo(_get) < 0);
                              if (_lessThan) {
                                ProbTransition _get_1 = ptt8[(s8 - 1)];
                                SystemAspect.ptok(_self, _get_1);
                                proboutlabel8 = 1;
                              }
                            }
                          }
                          if ((x8 > 0)) {
                            ProbTransition _ptok_2 = SystemAspect.ptok(_self);
                            State _ptgt_2 = _ptok_2.getPtgt();
                            SystemAspect.currentState(_self, _ptgt_2);
                            State _currentState_28 = SystemAspect.currentState(_self);
                            String _name_10 = _currentState_28.getName();
                            String _plus_18 = ("change to state: " + _name_10);
                            InputOutput.<String>println(_plus_18);
                            existdirect = 1;
                          }
                        }
                        if ((existdirect == 0)) {
                          direct = 0;
                        } else {
                          direct = 1;
                        }
                      }
                      if ((direct == 0)) {
                        State _currentState_29 = SystemAspect.currentState(_self);
                        SystemAspect.fatherState(_self, _currentState_29);
                        State _currentState_30 = SystemAspect.currentState(_self);
                        State _initialsubstate_4 = _currentState_30.getInitialsubstate();
                        SystemAspect.currentState(_self, _initialsubstate_4);
                        State _currentState_31 = SystemAspect.currentState(_self);
                        String _name_11 = _currentState_31.getName();
                        String _plus_19 = ("change to state: " + _name_11);
                        InputOutput.<String>println(_plus_19);
                        SystemAspect.sub(_self, 1);
                      }
                    }
                  }
                }
              }
              if ((f == 0)) {
                State _currentState_32 = SystemAspect.currentState(_self);
                EList<ComTransition> _outgoingComTransitions_8 = _currentState_32.getOutgoingComTransitions();
                int _length_6 = ((Object[])Conversions.unwrapArray(_outgoingComTransitions_8, Object.class)).length;
                boolean _greaterEqualsThan_6 = (_length_6 >= 1);
                if (_greaterEqualsThan_6) {
                  State _currentState_33 = SystemAspect.currentState(_self);
                  EList<ComTransition> _outgoingComTransitions_9 = _currentState_33.getOutgoingComTransitions();
                  for (final ComTransition ct9 : _outgoingComTransitions_9) {
                    if ((Objects.equal(ct9.getGuard(), null) || ((!Objects.equal(ct9.getGuard(), null)) && (TransitionAspect.holds(ct9) == true)))) {
                      subdoloop = 1;
                      State _ctgt_3 = ct9.getCtgt();
                      SystemAspect.currentState(_self, _ctgt_3);
                      g = 1;
                      h = 1;
                      State _currentState_34 = SystemAspect.currentState(_self);
                      String _name_12 = _currentState_34.getName();
                      String _plus_20 = ("Change to State: " + _name_12);
                      InputOutput.<String>println(_plus_20);
                      State _currentState_35 = SystemAspect.currentState(_self);
                      State _initialsubstate_5 = _currentState_35.getInitialsubstate();
                      boolean _notEquals_4 = (!Objects.equal(_initialsubstate_5, null));
                      if (_notEquals_4) {
                        direct = 1;
                        existdirect = 0;
                        if ((direct == 1)) {
                          State _currentState_36 = SystemAspect.currentState(_self);
                          EList<ComTransition> _outgoingComTransitions_10 = _currentState_36.getOutgoingComTransitions();
                          boolean _notEquals_5 = (!Objects.equal(_outgoingComTransitions_10, null));
                          if (_notEquals_5) {
                            State _currentState_37 = SystemAspect.currentState(_self);
                            EList<ComTransition> _outgoingComTransitions_11 = _currentState_37.getOutgoingComTransitions();
                            int _length_7 = ((Object[])Conversions.unwrapArray(_outgoingComTransitions_11, Object.class)).length;
                            boolean _greaterEqualsThan_7 = (_length_7 >= 1);
                            if (_greaterEqualsThan_7) {
                              State _currentState_38 = SystemAspect.currentState(_self);
                              EList<ComTransition> _outgoingComTransitions_12 = _currentState_38.getOutgoingComTransitions();
                              for (final ComTransition ct10 : _outgoingComTransitions_12) {
                                if ((Objects.equal(ct10.getGuard(), null) || ((!Objects.equal(ct10.getGuard(), null)) && (TransitionAspect.holds(ct10) == true)))) {
                                  State _ctgt_4 = ct10.getCtgt();
                                  SystemAspect.currentState(_self, _ctgt_4);
                                  State _currentState_39 = SystemAspect.currentState(_self);
                                  String _name_13 = _currentState_39.getName();
                                  String _plus_21 = ("Change to State: " + _name_13);
                                  InputOutput.<String>println(_plus_21);
                                  existdirect = 1;
                                }
                              }
                            }
                          }
                          State _currentState_40 = SystemAspect.currentState(_self);
                          EList<ProbTransition> _outgoingProbTransitions_6 = _currentState_40.getOutgoingProbTransitions();
                          int _length_8 = ((Object[])Conversions.unwrapArray(_outgoingProbTransitions_6, Object.class)).length;
                          boolean _greaterEqualsThan_8 = (_length_8 >= 1);
                          if (_greaterEqualsThan_8) {
                            double _random_3 = Math.random();
                            String _string_5 = Double.valueOf(_random_3).toString();
                            float _parseFloat_3 = Float.parseFloat(_string_5);
                            SystemAspect.ran(_self, Float.valueOf(_parseFloat_3));
                            int x10 = 0;
                            int y10 = 0;
                            float probright10 = 0;
                            ProbTransition[] ptt10 = new ProbTransition[30];
                            Float[] ptprob10 = new Float[30];
                            State _currentState_41 = SystemAspect.currentState(_self);
                            EList<ProbTransition> _outgoingProbTransitions_7 = _currentState_41.getOutgoingProbTransitions();
                            for (final ProbTransition pt10 : _outgoingProbTransitions_7) {
                              if ((Objects.equal(pt10.getGuard(), null) || ((!Objects.equal(pt10.getGuard(), null)) && (TransitionAspect.holds(pt10) == true)))) {
                                ptt10[x10] = pt10;
                                x10++;
                                float _probability_6 = pt10.getProbability();
                                float _plus_22 = (_probability_6 + probright10);
                                ptprob10[y10] = Float.valueOf(_plus_22);
                                float _probability_7 = pt10.getProbability();
                                float _plus_23 = (_probability_7 + probright10);
                                probright10 = _plus_23;
                                y10++;
                              }
                            }
                            int s10 = 0;
                            int proboutlabel10 = 0;
                            if ((y10 > 0)) {
                              for (s10 = 1; ((s10 <= y10) && (proboutlabel10 == 0)); s10++) {
                                Float _ran = SystemAspect.ran(_self);
                                Float _get = ptprob10[(s10 - 1)];
                                boolean _lessThan = (_ran.compareTo(_get) < 0);
                                if (_lessThan) {
                                  ProbTransition _get_1 = ptt10[(s10 - 1)];
                                  SystemAspect.ptok(_self, _get_1);
                                  proboutlabel10 = 1;
                                }
                              }
                            }
                            if ((x10 > 0)) {
                              ProbTransition _ptok_3 = SystemAspect.ptok(_self);
                              State _ptgt_3 = _ptok_3.getPtgt();
                              SystemAspect.currentState(_self, _ptgt_3);
                              State _currentState_42 = SystemAspect.currentState(_self);
                              String _name_14 = _currentState_42.getName();
                              String _plus_24 = ("Change to State: " + _name_14);
                              InputOutput.<String>println(_plus_24);
                              existdirect = 1;
                            }
                          }
                          if ((existdirect == 0)) {
                            direct = 0;
                          } else {
                            direct = 1;
                          }
                        }
                        if ((direct == 0)) {
                          State _currentState_43 = SystemAspect.currentState(_self);
                          SystemAspect.fatherState(_self, _currentState_43);
                          State _currentState_44 = SystemAspect.currentState(_self);
                          State _initialsubstate_6 = _currentState_44.getInitialsubstate();
                          SystemAspect.currentState(_self, _initialsubstate_6);
                          SystemAspect.sub(_self, 1);
                        }
                      }
                    }
                  }
                }
              }
              if ((g == 0)) {
                State _currentState_45 = SystemAspect.currentState(_self);
                EList<ProbTransition> _outgoingProbTransitions_8 = _currentState_45.getOutgoingProbTransitions();
                int _length_9 = ((Object[])Conversions.unwrapArray(_outgoingProbTransitions_8, Object.class)).length;
                boolean _greaterEqualsThan_9 = (_length_9 >= 1);
                if (_greaterEqualsThan_9) {
                  double _random_4 = Math.random();
                  String _string_6 = Double.valueOf(_random_4).toString();
                  float _parseFloat_4 = Float.parseFloat(_string_6);
                  SystemAspect.ran(_self, Float.valueOf(_parseFloat_4));
                  int x9 = 0;
                  int y9 = 0;
                  float probright9 = 0;
                  ProbTransition[] ptt9 = new ProbTransition[30];
                  Float[] ptprob9 = new Float[30];
                  State _currentState_46 = SystemAspect.currentState(_self);
                  EList<ProbTransition> _outgoingProbTransitions_9 = _currentState_46.getOutgoingProbTransitions();
                  for (final ProbTransition pt9 : _outgoingProbTransitions_9) {
                    if ((Objects.equal(pt9.getGuard(), null) || ((!Objects.equal(pt9.getGuard(), null)) && (TransitionAspect.holds(pt9) == true)))) {
                      ptt9[x9] = pt9;
                      x9++;
                      float _probability_8 = pt9.getProbability();
                      float _plus_25 = (_probability_8 + probright9);
                      ptprob9[y9] = Float.valueOf(_plus_25);
                      float _probability_9 = pt9.getProbability();
                      float _plus_26 = (_probability_9 + probright9);
                      probright9 = _plus_26;
                      y9++;
                    }
                  }
                  int s9 = 0;
                  int proboutlabel9 = 0;
                  if ((y9 > 0)) {
                    for (s9 = 1; ((s9 <= y9) && (proboutlabel9 == 0)); s9++) {
                      Float _ran = SystemAspect.ran(_self);
                      Float _get = ptprob9[(s9 - 1)];
                      boolean _lessThan = (_ran.compareTo(_get) < 0);
                      if (_lessThan) {
                        ProbTransition _get_1 = ptt9[(s9 - 1)];
                        SystemAspect.ptok(_self, _get_1);
                        proboutlabel9 = 1;
                      }
                    }
                  }
                  if ((x9 > 0)) {
                    subdoloop = 1;
                    ProbTransition _ptok_4 = SystemAspect.ptok(_self);
                    State _ptgt_4 = _ptok_4.getPtgt();
                    SystemAspect.currentState(_self, _ptgt_4);
                    h = 1;
                    State _currentState_47 = SystemAspect.currentState(_self);
                    String _name_15 = _currentState_47.getName();
                    String _plus_27 = ("change to state: " + _name_15);
                    InputOutput.<String>println(_plus_27);
                    State _currentState_48 = SystemAspect.currentState(_self);
                    State _initialsubstate_7 = _currentState_48.getInitialsubstate();
                    boolean _notEquals_6 = (!Objects.equal(_initialsubstate_7, null));
                    if (_notEquals_6) {
                      direct = 1;
                      existdirect = 0;
                      if ((direct == 1)) {
                        State _currentState_49 = SystemAspect.currentState(_self);
                        EList<ComTransition> _outgoingComTransitions_13 = _currentState_49.getOutgoingComTransitions();
                        int _length_10 = ((Object[])Conversions.unwrapArray(_outgoingComTransitions_13, Object.class)).length;
                        boolean _greaterEqualsThan_10 = (_length_10 >= 1);
                        if (_greaterEqualsThan_10) {
                          State _currentState_50 = SystemAspect.currentState(_self);
                          EList<ComTransition> _outgoingComTransitions_14 = _currentState_50.getOutgoingComTransitions();
                          for (final ComTransition ct11 : _outgoingComTransitions_14) {
                            if ((Objects.equal(ct11.getGuard(), null) || ((!Objects.equal(ct11.getGuard(), null)) && (TransitionAspect.holds(ct11) == true)))) {
                              State _ctgt_5 = ct11.getCtgt();
                              SystemAspect.currentState(_self, _ctgt_5);
                              State _currentState_51 = SystemAspect.currentState(_self);
                              String _name_16 = _currentState_51.getName();
                              String _plus_28 = ("Change to State: " + _name_16);
                              InputOutput.<String>println(_plus_28);
                              existdirect = 1;
                            }
                          }
                        }
                        State _currentState_52 = SystemAspect.currentState(_self);
                        EList<ProbTransition> _outgoingProbTransitions_10 = _currentState_52.getOutgoingProbTransitions();
                        int _length_11 = ((Object[])Conversions.unwrapArray(_outgoingProbTransitions_10, Object.class)).length;
                        boolean _greaterEqualsThan_11 = (_length_11 >= 1);
                        if (_greaterEqualsThan_11) {
                          double _random_5 = Math.random();
                          String _string_7 = Double.valueOf(_random_5).toString();
                          float _parseFloat_5 = Float.parseFloat(_string_7);
                          SystemAspect.ran(_self, Float.valueOf(_parseFloat_5));
                          int x11 = 0;
                          int y11 = 0;
                          float probright11 = 0;
                          ProbTransition[] ptt11 = new ProbTransition[30];
                          Float[] ptprob11 = new Float[30];
                          State _currentState_53 = SystemAspect.currentState(_self);
                          EList<ProbTransition> _outgoingProbTransitions_11 = _currentState_53.getOutgoingProbTransitions();
                          for (final ProbTransition pt11 : _outgoingProbTransitions_11) {
                            if ((Objects.equal(pt11.getGuard(), null) || ((!Objects.equal(pt11.getGuard(), null)) && (TransitionAspect.holds(pt11) == true)))) {
                              ptt11[x11] = pt11;
                              x11++;
                              float _probability_10 = pt11.getProbability();
                              float _plus_29 = (_probability_10 + probright11);
                              ptprob11[y11] = Float.valueOf(_plus_29);
                              float _probability_11 = pt11.getProbability();
                              float _plus_30 = (_probability_11 + probright11);
                              probright11 = _plus_30;
                            }
                          }
                          int s11 = 0;
                          int proboutlabel11 = 0;
                          if ((y11 > 0)) {
                            for (s11 = 1; ((s11 <= y11) && (proboutlabel11 == 0)); s11++) {
                              Float _ran = SystemAspect.ran(_self);
                              Float _get = ptprob11[(s11 - 1)];
                              boolean _lessThan = (_ran.compareTo(_get) < 0);
                              if (_lessThan) {
                                ProbTransition _get_1 = ptt11[(s11 - 1)];
                                SystemAspect.ptok(_self, _get_1);
                                proboutlabel11 = 1;
                              }
                            }
                          }
                          if ((x11 > 0)) {
                            ProbTransition _ptok_5 = SystemAspect.ptok(_self);
                            State _ptgt_5 = _ptok_5.getPtgt();
                            SystemAspect.currentState(_self, _ptgt_5);
                            State _currentState_54 = SystemAspect.currentState(_self);
                            String _name_17 = _currentState_54.getName();
                            String _plus_31 = ("Change to State: " + _name_17);
                            InputOutput.<String>println(_plus_31);
                            existdirect = 1;
                          }
                        }
                        if ((existdirect == 0)) {
                          direct = 0;
                        } else {
                          direct = 1;
                        }
                      }
                      if ((direct == 0)) {
                        State _currentState_55 = SystemAspect.currentState(_self);
                        SystemAspect.fatherState(_self, _currentState_55);
                        State _currentState_56 = SystemAspect.currentState(_self);
                        State _initialsubstate_8 = _currentState_56.getInitialsubstate();
                        SystemAspect.currentState(_self, _initialsubstate_8);
                        SystemAspect.sub(_self, 1);
                      }
                    }
                  }
                }
              }
              if (((h == 0) && (!Objects.equal(SystemAspect.currentState(_self).getSlaveode(), null)))) {
                int _y0label = SystemAspect.y0label(_self);
                boolean _equals_2 = (_y0label == 0);
                if (_equals_2) {
                  State _currentState_57 = SystemAspect.currentState(_self);
                  ODE _slaveode = _currentState_57.getSlaveode();
                  Condition _condition = _slaveode.getCondition();
                  String _name_18 = _condition.getName();
                  SystemAspect.str1(_self, _name_18);
                } else {
                  float _y0value = SystemAspect.y0value(_self);
                  String _string_8 = Float.valueOf(_y0value).toString();
                  SystemAspect.str1(_self, _string_8);
                }
                State _currentState_58 = SystemAspect.currentState(_self);
                ODE _slaveode_1 = _currentState_58.getSlaveode();
                Function _function = _slaveode_1.getFunction();
                Fright _fright = _function.getFright();
                String _name_19 = _fright.getName();
                SystemAspect.str2(_self, _name_19);
                State _currentState_59 = SystemAspect.currentState(_self);
                ODE _slaveode_2 = _currentState_59.getSlaveode();
                Function _function_1 = _slaveode_2.getFunction();
                String _name_20 = _function_1.getName();
                SystemAspect.str3(_self, _name_20);
                State _currentState_60 = SystemAspect.currentState(_self);
                ODE _slaveode_3 = _currentState_60.getSlaveode();
                Function _function_2 = _slaveode_3.getFunction();
                IndeVariable _indevariable = _function_2.getIndevariable();
                String _name_21 = _indevariable.getName();
                SystemAspect.str4(_self, _name_21);
                State _currentState_61 = SystemAspect.currentState(_self);
                ODE _slaveode_4 = _currentState_61.getSlaveode();
                Function _function_3 = _slaveode_4.getFunction();
                DeVariable _devariable = _function_3.getDevariable();
                String _name_22 = _devariable.getName();
                SystemAspect.str5(_self, _name_22);
                State _currentState_62 = SystemAspect.currentState(_self);
                ODE _slaveode_5 = _currentState_62.getSlaveode();
                Interval _interval = _slaveode_5.getInterval();
                float _left = _interval.getLeft();
                SystemAspect.intervalleft(_self, _left);
                State _currentState_63 = SystemAspect.currentState(_self);
                ODE _slaveode_6 = _currentState_63.getSlaveode();
                Interval _interval_1 = _slaveode_6.getInterval();
                float _right = _interval_1.getRight();
                SystemAspect.intervalright(_self, _right);
                State _currentState_64 = SystemAspect.currentState(_self);
                ODE _slaveode_7 = _currentState_64.getSlaveode();
                Interval _interval_2 = _slaveode_7.getInterval();
                float _subinterval = _interval_2.getSubinterval();
                SystemAspect.intervalsub(_self, _subinterval);
                if ((subdoloop == 0)) {
                  SystemAspect.callscilab(_self);
                }
              }
            }
          }
          float _i_1 = SystemAspect.i(_self);
          SystemAspect.intervalleftnew(_self, _i_1);
          Variable _relatedvariable_2 = _self.getRelatedvariable();
          float _Globalnv_2 = VariableAspect.Globalnv(_relatedvariable_2);
          SystemAspect.y0value(_self, _Globalnv_2);
          float _intervalleftnew_1 = SystemAspect.intervalleftnew(_self);
          String _string_2 = Float.valueOf(_intervalleftnew_1).toString();
          String _plus_6 = (">t=" + _string_2);
          InputOutput.<String>println(_plus_6);
        }
      }
    }
  }
  
  protected static void _privk3_callscilab(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self) {
    SystemAspect.y0label(_self, 1);
    float _i = SystemAspect.i(_self);
    String _plus = (">t=" + Float.valueOf(_i));
    InputOutput.<String>print(_plus);
    InputOutput.<String>print("   ");
    try {
      String _str5 = SystemAspect.str5(_self);
      String _plus_1 = (("function" + " ") + _str5);
      String _plus_2 = (_plus_1 + "dot=");
      String _str3 = SystemAspect.str3(_self);
      String _plus_3 = (_plus_2 + _str3);
      String _plus_4 = (_plus_3 + "(");
      String _str4 = SystemAspect.str4(_self);
      String _plus_5 = (_plus_4 + _str4);
      String _plus_6 = (_plus_5 + ",");
      String _str5_1 = SystemAspect.str5(_self);
      String _plus_7 = (_plus_6 + _str5_1);
      String _plus_8 = (_plus_7 + "),");
      String _str5_2 = SystemAspect.str5(_self);
      String _plus_9 = (_plus_8 + _str5_2);
      String _plus_10 = (_plus_9 + "dot=");
      String _str2 = SystemAspect.str2(_self);
      String _plus_11 = (_plus_10 + _str2);
      String _plus_12 = (_plus_11 + ",endfunction,");
      String _plus_13 = (_plus_12 + "y0=");
      String _str1 = SystemAspect.str1(_self);
      String _plus_14 = (_plus_13 + _str1);
      String _plus_15 = (_plus_14 + ",t0=");
      float _intervalleftnew = SystemAspect.intervalleftnew(_self);
      String _plus_16 = (_plus_15 + Float.valueOf(_intervalleftnew));
      String _plus_17 = (_plus_16 + 
        ",t=");
      float _intervalleftnew_1 = SystemAspect.intervalleftnew(_self);
      String _plus_18 = (_plus_17 + Float.valueOf(_intervalleftnew_1));
      String _plus_19 = (_plus_18 + ":0.1:");
      float _intervalright = SystemAspect.intervalright(_self);
      String _plus_20 = (_plus_19 + Float.valueOf(_intervalright));
      String _plus_21 = (_plus_20 + ",");
      String _str5_3 = SystemAspect.str5(_self);
      String _plus_22 = (_plus_21 + _str5_3);
      String _plus_23 = (_plus_22 + "=ode(");
      String _str5_4 = SystemAspect.str5(_self);
      String _plus_24 = (_plus_23 + _str5_4);
      String _plus_25 = (_plus_24 + "0,");
      String _plus_26 = (_plus_25 + "t0,");
      String _str4_1 = SystemAspect.str4(_self);
      String _plus_27 = (_plus_26 + _str4_1);
      String _plus_28 = (_plus_27 + ",");
      String _str3_1 = SystemAspect.str3(_self);
      String _plus_29 = (_plus_28 + _str3_1);
      String _plus_30 = (_plus_29 + ")");
      String _plus_31 = (_plus_30 + ",");
      int _j = SystemAspect.j(_self);
      String _plus_32 = ("result" + Integer.valueOf(_j));
      String _string = _plus_32.toString();
      String _plus_33 = (_plus_31 + _string);
      String _plus_34 = (_plus_33 + "=ode(");
      String _str5_5 = SystemAspect.str5(_self);
      String _plus_35 = (_plus_34 + _str5_5);
      String _plus_36 = (_plus_35 + "0,");
      String _plus_37 = (_plus_36 + "t0,");
      float _i_1 = SystemAspect.i(_self);
      String _plus_38 = (_plus_37 + Float.valueOf(_i_1));
      String _plus_39 = (_plus_38 + ",");
      String _str3_2 = SystemAspect.str3(_self);
      String _plus_40 = (_plus_39 + _str3_2);
      String strr = (_plus_40 + ")");
      Scilab _sci = SystemAspect.sci(_self);
      _sci.exec(strr);
      Scilab _sci_1 = SystemAspect.sci(_self);
      int _j_1 = SystemAspect.j(_self);
      String _string_1 = Integer.valueOf(_j_1).toString();
      String _plus_41 = ("result" + _string_1);
      ScilabType result = _sci_1.get(_plus_41);
      String s = result.toString();
      int _length = s.length();
      int _minus = (_length - 1);
      String ss = s.substring(1, _minus);
      Variable _relatedvariable = _self.getRelatedvariable();
      float _parseFloat = Float.parseFloat(ss);
      VariableAspect.Globalnv(_relatedvariable, _parseFloat);
      Variable _relatedvariable_1 = _self.getRelatedvariable();
      float _Globalnv = VariableAspect.Globalnv(_relatedvariable_1);
      String _string_2 = Float.valueOf(_Globalnv).toString();
      String _plus_42 = ("Globalnv:" + _string_2);
      InputOutput.<String>println(_plus_42);
      float _i_2 = SystemAspect.i(_self);
      String _plus_43 = ("x=[" + Float.valueOf(_i_2));
      String _plus_44 = (_plus_43 + "], y=[");
      Variable _relatedvariable_2 = _self.getRelatedvariable();
      float _Globalnv_1 = VariableAspect.Globalnv(_relatedvariable_2);
      String _plus_45 = (_plus_44 + Float.valueOf(_Globalnv_1));
      String sttplot = (_plus_45 + "],plot(x,y,\'.\')");
      Scilab _sci_2 = SystemAspect.sci(_self);
      _sci_2.exec(sttplot);
    } catch (final Throwable _t) {
      if (_t instanceof JavasciException) {
        final JavasciException e = (JavasciException)_t;
        String _localizedMessage = e.getLocalizedMessage();
        String _plus_46 = ("Error:" + _localizedMessage);
        InputOutput.<String>print(_plus_46);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    float _i_3 = SystemAspect.i(_self);
    float _intervalsub = SystemAspect.intervalsub(_self);
    float _plus_47 = (_i_3 + _intervalsub);
    SystemAspect.i(_self, _plus_47);
    int _j_2 = SystemAspect.j(_self);
    int _plus_48 = (_j_2 + 1);
    SystemAspect.j(_self, _plus_48);
  }
  
  protected static void _privk3_RealizeInitializeModel(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self, final EList<String> arguments) {
    InputOutput.<String>println("");
    InputOutput.<String>println("");
    State _initialState = _self.getInitialState();
    SystemAspect.currentState(_self, _initialState);
    State _currentState = SystemAspect.currentState(_self);
    String _name = _currentState.getName();
    String _plus = ("Initial State: " + _name);
    InputOutput.<String>println(_plus);
    Variable nv = _self.getRelatedvariable();
    float _value = nv.getValue();
    VariableAspect.Globalnv(nv, _value);
    float _intervalleftnew = SystemAspect.intervalleftnew(_self);
    String _string = Float.valueOf(_intervalleftnew).toString();
    String _plus_1 = ("Initial t=" + _string);
    InputOutput.<String>println(_plus_1);
    float _Globalnv = VariableAspect.Globalnv(nv);
    String _string_1 = Float.valueOf(_Globalnv).toString();
    String _plus_2 = ("Initial Globalnv: " + _string_1);
    InputOutput.<String>println(_plus_2);
  }
  
  protected static State _privk3_currentState(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentState") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.xcpsml.xcpsml.cpsml.State) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentState;
  }
  
  protected static void _privk3_currentState(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self, final State currentState) {
    _self_.currentState = currentState; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentState")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentState);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static State _privk3_fatherState(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getFatherState") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.xcpsml.xcpsml.cpsml.State) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.fatherState;
  }
  
  protected static void _privk3_fatherState(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self, final State fatherState) {
    _self_.fatherState = fatherState; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setFatherState")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, fatherState);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static ProbTransition _privk3_ptok(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getPtok") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.xcpsml.xcpsml.cpsml.ProbTransition) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.ptok;
  }
  
  protected static void _privk3_ptok(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self, final ProbTransition ptok) {
    _self_.ptok = ptok; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setPtok")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, ptok);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static Float _privk3_ran(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getRan") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Float) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.ran;
  }
  
  protected static void _privk3_ran(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self, final Float ran) {
    _self_.ran = ran; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setRan")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, ran);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static int _privk3_sub(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getSub") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.sub;
  }
  
  protected static void _privk3_sub(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self, final int sub) {
    _self_.sub = sub; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setSub")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, sub);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static Scilab _privk3_sci(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getSci") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.scilab.modules.javasci.Scilab) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.sci;
  }
  
  protected static void _privk3_sci(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self, final Scilab sci) {
    _self_.sci = sci; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setSci")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, sci);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static float _privk3_i(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getI") &&
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
    return _self_.i;
  }
  
  protected static void _privk3_i(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self, final float i) {
    _self_.i = i; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setI")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, i);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static int _privk3_j(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getJ") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.j;
  }
  
  protected static void _privk3_j(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self, final int j) {
    _self_.j = j; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setJ")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, j);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static String _privk3_str1(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getStr1") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.str1;
  }
  
  protected static void _privk3_str1(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self, final String str1) {
    _self_.str1 = str1; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setStr1")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, str1);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static String _privk3_str2(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getStr2") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.str2;
  }
  
  protected static void _privk3_str2(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self, final String str2) {
    _self_.str2 = str2; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setStr2")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, str2);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static String _privk3_str3(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getStr3") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.str3;
  }
  
  protected static void _privk3_str3(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self, final String str3) {
    _self_.str3 = str3; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setStr3")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, str3);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static String _privk3_str4(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getStr4") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.str4;
  }
  
  protected static void _privk3_str4(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self, final String str4) {
    _self_.str4 = str4; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setStr4")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, str4);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static String _privk3_str5(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getStr5") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.str5;
  }
  
  protected static void _privk3_str5(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self, final String str5) {
    _self_.str5 = str5; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setStr5")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, str5);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static float _privk3_intervalleft(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getIntervalleft") &&
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
    return _self_.intervalleft;
  }
  
  protected static void _privk3_intervalleft(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self, final float intervalleft) {
    _self_.intervalleft = intervalleft; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIntervalleft")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, intervalleft);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static float _privk3_intervalright(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getIntervalright") &&
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
    return _self_.intervalright;
  }
  
  protected static void _privk3_intervalright(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self, final float intervalright) {
    _self_.intervalright = intervalright; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIntervalright")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, intervalright);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static float _privk3_intervalsub(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getIntervalsub") &&
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
    return _self_.intervalsub;
  }
  
  protected static void _privk3_intervalsub(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self, final float intervalsub) {
    _self_.intervalsub = intervalsub; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIntervalsub")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, intervalsub);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static float _privk3_intervalleftnew(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getIntervalleftnew") &&
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
    return _self_.intervalleftnew;
  }
  
  protected static void _privk3_intervalleftnew(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self, final float intervalleftnew) {
    _self_.intervalleftnew = intervalleftnew; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIntervalleftnew")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, intervalleftnew);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static int _privk3_y0label(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getY0label") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.y0label;
  }
  
  protected static void _privk3_y0label(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self, final int y0label) {
    _self_.y0label = y0label; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setY0label")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, y0label);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static float _privk3_y0value(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getY0value") &&
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
    return _self_.y0value;
  }
  
  protected static void _privk3_y0value(final SystemAspectSystemAspectProperties _self_, final org.xcpsml.xcpsml.cpsml.System _self, final float y0value) {
    _self_.y0value = y0value; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setY0value")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, y0value);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
