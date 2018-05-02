package org.dsml.cpsml.k3dsa.cpsml.aspects;

import cpsml.ProbTransition;
import cpsml.State;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.scilab.modules.javasci.Scilab;

@SuppressWarnings("all")
public class SystemAspectSystemAspectProperties {
  public State currentState;
  
  public State fatherState;
  
  public ProbTransition ptok;
  
  public Float ran;
  
  public int sub = 0;
  
  public Scilab sci = new Function0<Scilab>() {
    public Scilab apply() {
      try {
        Scilab _scilab = new Scilab(true);
        return _scilab;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  public float i = 0;
  
  public int j = 0;
  
  public String str1 = "";
  
  public String str2 = "";
  
  public String str3 = "";
  
  public String str4 = "";
  
  public String str5 = "";
  
  public float intervalleft = 0;
  
  public float intervalright = 0;
  
  public float intervalsub = 0;
  
  public float intervalleftnew = 0;
  
  public int y0label = 0;
  
  public float y0value = 0;
}
