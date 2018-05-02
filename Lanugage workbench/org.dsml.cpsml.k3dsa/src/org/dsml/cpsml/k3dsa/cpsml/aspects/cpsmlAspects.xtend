package org.dsml.cpsml.k3dsa.cpsml.aspects

import org.scilab.modules.javasci.Scilab
import org.scilab.modules.types.ScilabType
import org.eclipse.emf.common.util.EList
import java.util.Random
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Step

import cpsml.System
import cpsml.Variable
import cpsml.State
import cpsml.Transition
import cpsml.ComTransition
import cpsml.ProbTransition
import cpsml.ODE
import cpsml.Function
import cpsml.Condition
import cpsml.Interval
import cpsml.IndeVariable
import cpsml.DeVariable
import cpsml.Fright

import static extension org.dsml.cpsml.k3dsa.cpsml.aspects.SystemAspect.*
import static extension org.dsml.cpsml.k3dsa.cpsml.aspects.VariableAspect.*
import static extension org.dsml.cpsml.k3dsa.cpsml.aspects.StateAspect.*
import static extension org.dsml.cpsml.k3dsa.cpsml.aspects.TransitionAspect.*
import static extension org.dsml.cpsml.k3dsa.cpsml.aspects.ComTransitionAspect.*
import static extension org.dsml.cpsml.k3dsa.cpsml.aspects.ProbTransitionAspect.*
import static extension org.dsml.cpsml.k3dsa.cpsml.aspects.ODEAspect.*
import static extension org.dsml.cpsml.k3dsa.cpsml.aspects.FunctionAspect.*
import static extension org.dsml.cpsml.k3dsa.cpsml.aspects.ConditionAspect.*
import static extension org.dsml.cpsml.k3dsa.cpsml.aspects.IntervalAspect.*
import static extension org.dsml.cpsml.k3dsa.cpsml.aspects.IndeVariableAspect.*
import static extension org.dsml.cpsml.k3dsa.cpsml.aspects.DeVariableAspect.*
import static extension org.dsml.cpsml.k3dsa.cpsml.aspects.FrightAspect.*

@Aspect(className=System)
class SystemAspect {
   public State currentState                                                                             //设置当前状态
   public State fatherState                                                                              //用于设置子图的父节点
   public ProbTransition ptok                                                                            //用于从所有符合的pt中选择的那条边
   public Float ran                                                                                      //用于生成的随机数
   public int sub=0                                                                                      //0表示不在子图，1表示已经进入子图       sub                      
   var Scilab sci=new Scilab(true)                                                                       //用于打开Scilab
   var float i=0                                                                                         //用于输出x轴
   var int   j=0                                                                                         //result j
   var String str1=""                                                                                    //str1 y0=25
   var String str2=""                                                                                    //str2  0.1*y-1
   var String str3=""                                                                                    //str3 f1
   var String str4=""                                                                                    //str4 t
   var String str5=""                                                                                    //str5 y
   var float intervalleft=0
   var float intervalright=0
   var float intervalsub=0   
   var float intervalleftnew=0                                                                           //用于设置接下来ode的开始左区间	
   public int y0label=0
   var float y0value=0
   @Main
   def public void main(){
   	println("")
  // 	println("Step Main()")
   	_self.sci.open                                                                                       //因为Scilab不能多次打开，故放在此处
  //  println("Scilab Open")
    
    try{
    	while(true)
    	{
    		_self.dojump
    	}
    	
    }catch(Exception nt){
    	println("Stopped due to:"+nt.message)
    }
   } 
   
   
   @Step
 def public void dojump(){
   	println("  ")
   	print(">>>>")print("currentState: "+_self.currentState.name) print("------")
   	var int direct=1                                                                                 //精化状态下能直接出去，一开始假定能直接出去
   	var int existdirect=0                                                                            //如果确实存在一条直接从精化状态出去，则置1
 	
    	                                                                                                   //if当前状态是System的非初始状态且非子图状态
 if(_self.sub==0){
 	println(">>>>In Father Layer")
     var int doloop=0                                                                           //0表示callscilab，做一小步，如果有边出去则将doloop置为1,不做callscilab
     var int a=0
     var int b=0
     var int c=0
   
   if(_self.currentState.initialsubstate!=null&&_self.currentState.slaveode==null&&_self.currentState.outgoingComTransitions.length<1&&_self.currentState.outgoingProbTransitions.length<1){
     	_self.fatherState=_self.currentState    	
     	_self.currentState=_self.currentState.initialsubstate   
     	_self.currentState.subrelatedvariable.Globalnv=_self.currentState.subrelatedvariable.value
     	println("Change to State:  "+_self.currentState.name)
     	_self.sub=1    	
     	} 
    
    else if(_self.currentState.initialsubstate==null&&_self.currentState.slaveode==null&&_self.currentState.outgoingComTransitions.length<1&&_self.currentState.outgoingProbTransitions.length<1){ 
       println(_self.currentState.name+"is a Final State")     
     }  
    else{
     	
 
  while(doloop==0){ 		 
       	    
    if(a==0){ 
 
        if(_self.currentState.outgoingComTransitions.length>=1){
    	  for(ComTransition ct3:_self.currentState.outgoingComTransitions){
    		
    		
    		if(ct3.guard==null||(ct3.guard!=null&&ct3.holds==true)){
    			doloop=1
    			_self.currentState=ct3.ctgt
    		    b=1
    		    c=1
    		    println("Change to State: "+_self.currentState.name)
    			   
    		    
    	   //判断到达状态是否是精化状态    
    	  if(_self.currentState.initialsubstate!=null)
   		   {
    			 direct=1
 		         existdirect=0   			      
    			 
    			 if(direct==1)
    			 { 			
   				
   					if(_self.currentState.outgoingComTransitions.length>=1){
   					 for(ComTransition ct4:_self.currentState.outgoingComTransitions){
   						if(ct4.guard==null||(ct4.guard!=null&&ct4.holds==true)){
   							_self.currentState=ct4.ctgt    							
   							println("Change to State:"+_self.currentState.name)							  							
   							existdirect=1
   						}
   					   }
   				     }
   				
   				    if(_self.currentState.outgoingProbTransitions.length>=1){	
   					_self.ran=Float.parseFloat((Math.random()).toString)
   					var int x4=0     
   					var int y4=0      
   					var float probright4=0  	
   					var ProbTransition[] ptt4 = newArrayOfSize(30)
   					var Float[] ptprob4 = newArrayOfSize(30) 					
   					for(ProbTransition pt4:_self.currentState.outgoingProbTransitions){
   						if(pt4.guard==null||(pt4.guard!=null&&pt4.holds==true)){
   							 ptt4.set(x4,pt4)
   					         x4++  						
   						     ptprob4.set(y4,pt4.probability+probright4)
   						     probright4 = pt4.probability+probright4
   						     y4++                                                          
   						}
   					}
   					 var int s4=0
   					 var int proboutlabel4=0
   					if(y4>0){ 
   					 for(s4=1;s4<=y4&&proboutlabel4==0;s4++){
   					   if(_self.ran<ptprob4.get(s4-1)){
   					      _self.ptok=ptt4.get(s4-1)	
   					      proboutlabel4=1
   					   	}	
   					   }
   					 }
   					 
   					 
   					 if(x4>0){
   					        _self.currentState=_self.ptok.ptgt   					
   					        println("change to state:"+_self.currentState.name)
   					        existdirect=1  
   					        }
   					
   					}
   					
   					
   					    if(existdirect==0){
   						      direct=0
   					   }else{
   						     direct=1
   					   } 
   				}
   					
   			    if(direct==0){
   					_self.fatherState=_self.currentState                                          
   					_self.currentState=_self.currentState.initialsubstate  					   					
   					println("change to state:"+_self.currentState.name)
   					_self.sub=1                                                                     
   				 }
   				
   			   }//如果是精化状态的话，状态怎么变			
    		}    	
    	}
    }//CT不能为空呀                                                                    
  } //if a==0	                                                                
    
    
  
   
  if(b==0){
  	
  //  print("b==0")  print("   ") print(_self.currentState.outgoingProbTransitions.length>=1) 
   
    if(_self.currentState.outgoingProbTransitions.length>=1){	
     	
    	_self.ran=Float.parseFloat((Math.random()).toString)//生成[0,1)之间的一个随机数
  //   	print("   ") print("random:"+_self.ran) print("   ")
    	
    	var int x3=0      
   		var int y3=0      
   	    var float probright3=0  	
   		var ProbTransition[] ptt3 = newArrayOfSize(30)
   		var Float[] ptprob3 = newArrayOfSize(30)	
    	
    	
    	
    	for(ProbTransition pt3:_self.currentState.outgoingProbTransitions){    	        
    		if(pt3.guard==null||(pt3.guard!=null&&pt3.holds==true)){  				   
   				   ptt3.set(x3,pt3)   
   				   x3++  						
   				   ptprob3.set(y3,pt3.probability+probright3)
   				   probright3 = pt3.probability+probright3 				                     
   				   y3++ 
				     				   
   		    }
   		}	    
     //  print("ptt3[0]"+ptt3.get(0))  print("  ") print("ptt3[1]"+ptt3.get(1)) print("  ") 
     //  print("ptprob[0]"+ptprob3.get(0)) print("  ") print("ptprob[1]"+ptprob3.get(1)) print("  ") 
   	 //  print("end, x3:"+x3) print("  ") println("end y3:"+y3)
 		        
 		          var int s3=0
   				  var int proboutlabel3=0 					 
   			 	 
   			  
   		if(y3>0){                                                                              //println("[] is not none") 
   				  			   				  
   				  for(s3=1;s3<=y3&&proboutlabel3==0;s3++){  					   				     
   				                                                                              //  println("check the ptprob3:"+ptprob3.get(s3-1))
   				      
   					   if(_self.ran<ptprob3.get(s3-1)){ 
   					      _self.ptok=ptt3.get(s3-1)	
   					                                                                         // println("choose the pt3, then choose a ptok:"+_self.ptok.name)
   					      proboutlabel3=1
   					   	}	
   					 } 
   				}	 
   		
   		  
   				   
   		
   		if(x3>0){                                                                           //	println("[] is not none, the current state will change to ptok")     		    
   		        doloop=1   		           
   				_self.currentState=_self.ptok.ptgt
   			    c=1
   			    println("Change to State:"+_self.currentState.name)                                                    
   				
  			
  		//开始判断到达的当前状态，如果是精化状态的话，当前状态可能发生改变	
   		  if(_self.currentState.initialsubstate!=null)
   		  {  	//	println("refined state check----")	
   				     direct=1
 		             existdirect=0		        
 		         
   				   //假设可以直接出去，先检查CT，再检查PT,最后判断出是否真的能直接出去
   		     if(direct==1)
   		     {  						  				
   					 
   					 if(_self.currentState.outgoingComTransitions.length>=1)
   					 {  				
   					   for(ComTransition ct5:_self.currentState.outgoingComTransitions)
   					   { 
   					   	
   					                                                                  //   println("ct.relatedvariable2.Globalnv:"+ct5.relatedvariable2.Globalnv)
   						 if(ct5.guard==null||(ct5.guard!=null&&ct5.holds==true))
   						 {
   							_self.currentState=ct5.ctgt
   							println("change to state:"+_self.currentState.name)
   							existdirect=1
   						 }
   					   }
   				     }
   				   
   				   if(_self.currentState.outgoingProbTransitions.length>=1)
   				   { 				
   					_self.ran=Float.parseFloat((Math.random()).toString)                                      //生成[0,1)之间的一个随机数
   					var int x5=0                                                                              //用于数组 pt【x】
   					var int y5=0                                                                              //用于存放每条边的概率prob
   					var float probright5=0                                                                    //用于表示每段区间右值   	
   					var ProbTransition[] ptt5 = newArrayOfSize(30)
   					var Float[] ptprob5 = newArrayOfSize(30)	
   					
   					for(ProbTransition pt5:_self.currentState.outgoingProbTransitions){
   						if(pt5.guard==null||(pt5.guard!=null&&pt5.holds==true)){
   						ptt5.set(x5,pt5)
   					    x5++  						
   						ptprob5.set(y5,pt5.probability+probright5)
                        probright5 = pt5.probability+probright5  						   						
   						y5++ 
   						}
   					}
   					 var int s5=0
   					 var int proboutlabel5=0
   					 
   					 
   				 if(y5>0){
   					 for(s5=1;s5<=y5&&proboutlabel5==0;s5++){
   					   if(_self.ran<ptprob5.get(s5-1)){
   					      _self.ptok=ptt5.get(s5-1)	
   					      proboutlabel5=1
   					   	}	
   					   }				 
   					 }   					  
   				 if(x5>0){
   					_self.currentState=_self.ptok.ptgt
   					println("Change to State:"+_self.currentState.name)
   					existdirect=1                                                                         //确实存在这样直接出去的边则置existdirect为1
   					}
   					
   				}
   				
   			    //在检查了CT和PT之后，能下正确的结论了，能否直接出去
   			    	
   					if(existdirect==0){
   						direct=0
   					}else{
   						direct=1
   					} 
 							 				
   			}//假设结束，能跳则已经跳出去了
   				
   				
   			    if(direct==0){  			
   				    _self.fatherState=_self.currentState                                          
   					_self.currentState=_self.currentState.initialsubstate   				
   					println("change to state:"+_self.currentState.name)
   					_self.sub=1                                                                     			    
   				     }//不能跳的情况，则变成子图初始状态
   	       }//如果是精化状态，判断结束   				
 
 
   	
   	   }                                                                                   
     } //pt不能为空啊                                                                                   		       	        
   }// if b==0 
    	   
    	      
    	  if(c==0&&_self.currentState.slaveode!=null){
    	
    	       
    	        if(_self.y0label==0){ _self.str1=_self.currentState.slaveode.condition.name }else{_self.str1=(_self.y0value).toString}
    	       // _self.str1=_self.currentState.slaveode.condition.name                                       //str1 y0=25
    	        _self.str2=_self.currentState.slaveode.function.fright.name                                  //str2 0.1*y-1
    	        _self.str3=_self.currentState.slaveode.function.name                                         //str3 f1
    	        _self.str4=_self.currentState.slaveode.function.indevariable.name                            //str4 t
    	        _self.str5=_self.currentState.slaveode.function.devariable.name                              //str5 y
    	        _self.intervalleft=_self.currentState.slaveode.interval.left                                 //0
    	        _self.intervalright=_self.currentState.slaveode.interval.right                               //30
    	        _self.intervalsub=_self.currentState.slaveode.interval.subinterval                           //0.1  
    	       
    	        if(doloop==0){    	        
    	        	_self.callscilab
    	        }   	        
    	     }//if c==0        	        
    	  }//while结束
    	         _self.intervalleftnew=_self.i 
    	         _self.y0value=_self.relatedvariable.Globalnv                                                               //将当前的i设置成区间左值
    	 		 print(">t="+_self.intervalleftnew.toString) print("    ") println("Globalnv:"+_self.relatedvariable.Globalnv.toString)		
       }//else        
    
    }//System状态结束
       
    
    
                                                                                                           //如果当前状态是子图的状态  
 else if(_self.sub==1)  	                                                
 {  println(">>>>In Children Layer")
       var int subdoloop=0 
       var int d=0
       var int e=0
       var int f=0
       var int g=0
       var int h=0
     

  if(_self.fatherState.outgoingComTransitions.length<1&&_self.fatherState.outgoingProbTransitions.length<1&&_self.currentState.outgoingComTransitions.length<1&&_self.currentState.outgoingProbTransitions.length<1&&_self.currentState.slaveode==null)
       {  
       	println(_self.currentState.name+"is a Final State")
       	}
 else{   
 
  while(subdoloop==0){ 
  
     if(d==0){
  
      
       if(_self.fatherState.outgoingComTransitions.length>=1){
          for(ComTransition ct6:_self.fatherState.outgoingComTransitions){                                //首先判断父节点
        	if(ct6.guard==null||(ct6.guard!=null&&ct6.holds==true)){
        		_self.currentState=ct6.ctgt   
        		subdoloop=1      		   		
        		e=1
        		f=1
        		g=1
        		h=1
        		println("Change to  its father state: "+_self.currentState.name)
        		_self.sub=0
        	     
        	     
      if(_self.currentState.initialsubstate!=null){
        	    direct=1
 		        existdirect=0
             
            if(direct==1)
            {                             
   			   if(_self.currentState.outgoingComTransitions!=null){
   				  if(_self.currentState.outgoingComTransitions.length>=1){
   				      for(ComTransition ct7:_self.currentState.outgoingComTransitions){
   						if(ct7.guard==null||(ct7.guard!=null&&ct7.holds==true)){
   							_self.currentState=ct7.ctgt
   							println("Change to state:"+_self.currentState.name)
   							existdirect=1
   						}
   					}
   				   }
   			    }
   			  if(_self.currentState.outgoingProbTransitions.length>=1){
   					_self.ran=Float.parseFloat((Math.random()).toString)//生成[0,1)之间的一个随机数
   					var int x7=0      //用于数组 pt【x】
   					var int y7=0      //用于存放每条边的概率prob
   					var float probright7=0 //用于表示每段区间右值   	
   					var ProbTransition[] ptt7 = newArrayOfSize(30)
   					var Float[] ptprob7 = newArrayOfSize(30)			
   					for(ProbTransition pt7:_self.currentState.outgoingProbTransitions){
   						if(pt7.guard==null||(pt7.guard!=null&&pt7.holds==true)){
   						ptt7.set(x7,pt7)
   					    x7++  						
   						ptprob7.set(y7,pt7.probability+probright7)
   						probright7 = pt7.probability+probright7
   						y7++ 
   						}
   					}
   					 var int s7=0
   					 var int proboutlabel7=0//一开始还没找到
   					if(y7>0){ 
   					 for(s7=1;s7<=y7&&proboutlabel7==0;s7++){
   					   if(_self.ran<ptprob7.get(s7-1)){
   					      _self.ptok=ptt7.get(s7-1)	
   					      proboutlabel7=1
   					   	}	
   					   }   					 
   					 }
   					if(x7>0){
   					 _self.currentState=_self.ptok.ptgt
   				     println("Change to State: "+_self.currentState.name)
   				     existdirect=1 
   				     }                                                                 //确实存在这样直接出去的边则置existdirect为1
   				   }
   					
   					if(existdirect==0){
   						direct=0
   					}else{
   						direct=1
   					}
   				                                                                                 //假定推翻了，当前状态是有孩子，但是不能直接出去,没有则direct不对，需置1，确实存在，则direct是对的，仍然为1  				                                                                                       					
   				 }
   				
   				  if(direct==0){                            //当前状态有孩子且不能直接出去
   					 _self.fatherState=_self.currentState                                          //记录fatherstate
   					_self.currentState=_self.currentState.initialsubstate
   					 println("Change to State: "+_self.currentState.name)
   					_self.sub=1                                                                     //将当前状态置为子图的初始状态，sub表明当前状态在自状态
   				  }
        	  }//是精化状态的判断结束 
        	
        	}     		
         }        
       }
      }//if d==0
       
  if(e==0){
  	
  // print("e==0")  print("   ") println(_self.fatherState.outgoingProbTransitions.length>=1)
   if(_self.fatherState.outgoingProbTransitions.length>=1){ 
        _self.ran=Float.parseFloat((Math.random()).toString)
   		 var int x6=0      
   		 var int y6=0      
   		 var float probright6=0  	
   		 var ProbTransition[] ptt6 = newArrayOfSize(30)
   		 var Float[] ptprob6 = newArrayOfSize(30)	 
         
        for(ProbTransition pt6:_self.fatherState.outgoingProbTransitions){
        	if(pt6.guard==null||(pt6.guard!=null&&pt6.holds==true)){
        	ptt6.set(x6,pt6)
   			x6++  						
   			ptprob6.set(y6,pt6.probability+probright6)
   			probright6 = pt6.probability+probright6
   			y6++  
        	}	
        }	
      	 var int s6=0
   		 var int proboutlabel6=0//一开始还没找到 					 
   		
   		if(y6>0){
   		 for(s6=1;s6<=y6&&proboutlabel6==0;s6++)
   		   {
   					   if(_self.ran<ptprob6.get(s6-1)){
   					      _self.ptok=ptt6.get(s6-1)	
   					      proboutlabel6=1
   					   	} 					   	
   			}	
   		 }
        if(x6>0){
        	   _self.currentState=_self.ptok.ptgt
        	   subdoloop=1    
        	   
               f=1
               g=1
               h=1
              println("Change to state: "+_self.currentState.name)
               _self.sub=0		       	
               
               
          if(_self.currentState.initialsubstate!=null){
               direct=1
 		       existdirect=0
               if(direct==1){                             //先判断有没有直接出去的边
   				 if(_self.currentState.outgoingComTransitions!=null){
   					if(_self.currentState.outgoingComTransitions.length>=1){
   					for(ComTransition ct8:_self.currentState.outgoingComTransitions){
   						if(ct8.guard==null||(ct8.guard!=null&&ct8.holds==true)){
   							_self.currentState=ct8.ctgt
   							println("Change to state: "+_self.currentState.name)
   							existdirect=1
   						}
   					  }
   					}
   				  }
   				if(_self.currentState.outgoingProbTransitions.length>=1){
   					_self.ran=Float.parseFloat((Math.random()).toString)//生成[0,1)之间的一个随机数
   					 var int x8=0      //用于数组 pt【x】
   		             var int y8=0      //用于存放每条边的概率prob
   		             var float probright8=0 //用于表示每段区间右值   	
   		             var ProbTransition[] ptt8 = newArrayOfSize(30)
   		             var Float[] ptprob8 = newArrayOfSize(30)
   					
   					for(ProbTransition pt8:_self.currentState.outgoingProbTransitions){
   						if(pt8.guard==null||(pt8.guard!=null&&pt8.holds==true)){
   							ptt8.set(x8,pt8)
   			                x8++  						
   			                ptprob8.set(y8,pt8.probability+probright8)
   			               probright8 = pt8.probability+probright8
   			                y8++  	
   						}
   					}
   					 var int s8=0
   					 var int proboutlabel8=0//一开始还没找到
   					 if(y8>0){
   					 for(s8=1;s8<=y8&&proboutlabel8==0;s8++){
   					   if(_self.ran<ptprob8.get(s8-1)){
   					      _self.ptok=ptt8.get(s8-1)	
   					      proboutlabel8=1   					      
   					      }
   					   	}	
   					 }
   					if(x8>0){
   					_self.currentState=_self.ptok.ptgt
   					println("change to state: "+_self.currentState.name)
   					existdirect=1                                                           //确实存在这样直接出去的边则置existdirect为1
   					}   					
   				  }	
   					if(existdirect==0){
   						direct=0
   					}else{
   						direct=1
   					}  				                                                                                 //假定推翻了，当前状态是有孩子，但是不能直接出去,没有则direct不对，需置1，确实存在，则direct是对的，仍然为1  				                                                                                       					
   				}
   				if(direct==0){                            //当前状态有孩子且不能直接出去
   					 _self.fatherState=_self.currentState                                          //记录fatherstate
   					_self.currentState=_self.currentState.initialsubstate
   					println("change to state: "+_self.currentState.name)
   					_self.sub=1                                                                     //将当前状态置为子图的初始状态，sub表明当前状态在自状态
   				}
   		     }//到达状态是精化状态的判断结束
   
   			 }
        	}      	
         }//if e==0
         //父亲节点不能直接出去
        
        

     
     
  if(f==0){  
  	
 
     if(_self.currentState.outgoingComTransitions.length>=1){
         for(ComTransition ct9:_self.currentState.outgoingComTransitions ){
       	  if(ct9.guard==null||(ct9.guard!=null&&ct9.holds==true)){    		
       		 subdoloop=1                                                                           //sub里的node有ct满足
       		_self.currentState=ct9.ctgt       	     
       	     g=1
       	     h=1
       	     println("Change to State: "+_self.currentState.name)
       		 
       	if(_self.currentState.initialsubstate!=null){     
       		       direct=1
 		           existdirect=0
       		if(direct==1){
   				if(_self.currentState.outgoingComTransitions!=null){
   					if(_self.currentState.outgoingComTransitions.length>=1){
   					  for(ComTransition ct10:_self.currentState.outgoingComTransitions){
   						 if(ct10.guard==null||(ct10.guard!=null&&ct10.holds==true)){
   							_self.currentState=ct10.ctgt   							
   				            println("Change to State: "+_self.currentState.name)
   							existdirect=1
   						}
   					  }
   					 }		
   					}
   			    if(_self.currentState.outgoingProbTransitions.length>=1){
   					_self.ran=Float.parseFloat((Math.random()).toString)//生成[0,1)之间的一个随机数
                    var int x10=0      //用于数组 pt【x】
                    var int y10=0      //用于存放每条边的概率prob
                    var float probright10=0 //用于表示每段区间右值   	
                    var ProbTransition[] ptt10 = newArrayOfSize(30)
                    var Float[] ptprob10 = newArrayOfSize(30)	
   					for(ProbTransition pt10:_self.currentState.outgoingProbTransitions){
   						if(pt10.guard==null||(pt10.guard!=null&&pt10.holds==true)){
   						ptt10.set(x10,pt10)
   					    x10++  						
   						ptprob10.set(y10,pt10.probability+probright10)
   						probright10 = pt10.probability+probright10
   						y10++   						
   						}						
   					}
   					
   					 var int s10=0
   					 var int proboutlabel10=0//一开始还没找到
   					if(y10>0){ 
   					 for(s10=1;s10<=y10&&proboutlabel10==0;s10++){
   					   if(_self.ran<ptprob10.get(s10-1)){
   					      _self.ptok=ptt10.get(s10-1)	
   					      proboutlabel10=1  					      
   					      }
   					   	}	
   					 }
   					if(x10>0)
   					{
   						_self.currentState=_self.ptok.ptgt
   						println("Change to State: "+_self.currentState.name)
   						 existdirect=1    
   				    }                                                       //确实存在这样直接出去的边则置existdirect为1
   				  }
   					if(existdirect==0){
   						direct=0
   					}else{
   						direct=1
   					}  				  
   				}
   			  if(direct==0){
   					 _self.fatherState=_self.currentState                                          //记录fatherstate
   					_self.currentState=_self.currentState.initialsubstate
   					_self.sub=1                                                                     //将当前状态置为子图的初始状态，sub表明当前状态在自状态
   				   }
   				
   		       }//如果是精化状态的判断结束
       		}
       	}
     }
    }//f==0 
   
 if(g==0){

   
   if(_self.currentState.outgoingProbTransitions.length>=1){
     _self.ran=Float.parseFloat((Math.random()).toString)//生成[0,1)之间的一个随机数
      var int x9=0      //用于数组 pt[x]
      var int y9=0      //用于存放每条边的概率prob
      var float probright9=0 //用于表示每段区间右值   	
      var ProbTransition[] ptt9 = newArrayOfSize(30)
      var Float[] ptprob9 = newArrayOfSize(30)	
     
      for(ProbTransition pt9:_self.currentState.outgoingProbTransitions ){
       	if(pt9.guard==null||(pt9.guard!=null&&pt9.holds==true)){
       		            ptt9.set(x9,pt9)
   					    x9++  						
   						ptprob9.set(y9,pt9.probability+probright9)
   						probright9 = pt9.probability+probright9
   						y9++ 
       			}
       	}
       	             var int s9=0
   					 var int proboutlabel9=0//一开始还没找到
   			   if(y9>0){ 
   					 for(s9=1;s9<=y9&&proboutlabel9==0;s9++){
   					   if(_self.ran<ptprob9.get(s9-1)){
   					      _self.ptok=ptt9.get(s9-1)	
   					      proboutlabel9=1   					      
   					      }
   					   	}	
   					 }
              if(x9>0){                                                                                                    //果然确实却在概率边则检查
       		       subdoloop=1
       		       _self.currentState=_self.ptok.ptgt
       		       h=1
       		       println("change to state: "+_self.currentState.name) 
       		   
       		   
       		  if(_self.currentState.initialsubstate!=null){     
       		    direct=1
 		        existdirect=0
       			if(direct==1){
   			
   					if(_self.currentState.outgoingComTransitions.length>=1){					
   					  for(ComTransition ct11:_self.currentState.outgoingComTransitions){
   						if(ct11.guard==null||(ct11.guard!=null&&ct11.holds==true)){
   							_self.currentState=ct11.ctgt  							
   							println("Change to State: "+_self.currentState.name)
   							existdirect=1
   						}
   					   }
   					 }
   					
   				   if(_self.currentState.outgoingProbTransitions.length>=1){
   					_self.ran=Float.parseFloat((Math.random()).toString)//生成[0,1)之间的一个随机数
                     var int x11=0      //用于数组 pt【x】
                     var int y11=0      //用于存放每条边的概率prob
                     var float probright11=0 //用于表示每段区间右值   	
                     var ProbTransition[] ptt11 = newArrayOfSize(30)
                     var Float[] ptprob11 = newArrayOfSize(30)	
   					for(ProbTransition pt11:_self.currentState.outgoingProbTransitions){
   						if(pt11.guard==null||(pt11.guard!=null&&pt11.holds==true)){
   						ptt11.set(x11,pt11)
   					    x11++  						
   						ptprob11.set(y11,pt11.probability+probright11)   						
   						probright11 = pt11.probability+probright11  
   						}
   					}
   					
   					 var int s11=0
   					 var int proboutlabel11=0//一开始还没找到
   					if(y11>0){ 
   					 for(s11=1;s11<=y11&&proboutlabel11==0;s11++){
   					   if(_self.ran<ptprob11.get(s11-1)){
   					      _self.ptok=ptt11.get(s11-1)	
   					      proboutlabel11=1
   					   	}	
   					 }
   					}
   					if(x11>0){  					
   							_self.currentState=_self.ptok.ptgt
   						
   							 println("Change to State: "+_self.currentState.name)
   							 existdirect=1                                                           //确实存在这样直接出去的边则置existdirect为1
   					}}
   					if(existdirect==0){
   						direct=0
   					}else{
   						direct=1
   					}
   				   
   				}
   				if(direct==0){
   					 _self.fatherState=_self.currentState                                          //记录fatherstate
   					_self.currentState=_self.currentState.initialsubstate
   					_self.sub=1                                                                     //将当前状态置为子图的初始状态，sub表明当前状态在自状态
   				     }
   				   
   				   }
       	       }
         	        
    	   }
      }//g==0
      
      
      if(h==0&&_self.currentState.slaveode!=null){
        
               if(_self.y0label==0){_self.str1=_self.currentState.slaveode.condition.name }else{_self.str1=(_self.y0value).toString}
    	     //   _self.str1=_self.currentState.slaveode.condition.name                                        //str1 y0=25
    	        _self.str2=_self.currentState.slaveode.function.fright.name                                  //str2 0.1*y-1
    	        _self.str3=_self.currentState.slaveode.function.name                                         //str3 f1
    	        _self.str4=_self.currentState.slaveode.function.indevariable.name                            //str4 t
    	        _self.str5=_self.currentState.slaveode.function.devariable.name                              //str5 y
    	        _self.intervalleft=_self.currentState.slaveode.interval.left                                 //0
    	        _self.intervalright=_self.currentState.slaveode.interval.right                               //30
    	        _self.intervalsub=_self.currentState.slaveode.interval.subinterval                           //0.1  
    	        if(subdoloop==0){
    	        	_self.callscilab  	         
    	         }
    	     }//h==0	
       
        }//while结束
                _self.intervalleftnew=_self.i 
                _self.y0value=_self.relatedvariable.Globalnv                                                           //将当前的i设置成区间左值
    	 		 println(">t="+_self.intervalleftnew.toString)		
       }//esle结束
      
      }//sub结束
   	 
    }//dojump结束
   
  
     @Step
     def public void callscilab(){  	//println(_self.y0value) println(_self.y0label)  println(_self.str1)
    	_self.y0label=1  	
    	print(">t="+_self.i)     print("   ")        	                                                                //输出x轴坐标                                                                                                          //这边也可以获取subinterval
        try{ 	 
        	  var String strr="function"+" "+_self.str5+"dot="+_self.str3+"("+_self.str4+","+_self.str5+"),"+_self.str5+"dot="+_self.str2+",endfunction,"+"y0="+_self.str1+",t0="+_self.intervalleftnew+
        	 ",t="+_self.intervalleftnew+":0.1:"+_self.intervalright+","+_self.str5+"=ode("+_self.str5+"0,"+"t0,"+_self.str4+","+_self.str3+")"+","
        	 +("result"+_self.j).toString+"=ode("+_self.str5+"0,"+"t0,"+_self.i+","+_self.str3+")"	
         	// println(strr) 	      	
   	     	 _self.sci.exec(strr)       
   	     	                                                                                                //y=ode(y0,t0,t,f1),所以每次得到的都是一小步的y值
   	     	                                                                                               
   	     	 var ScilabType result=_self.sci.get("result"+_self.j.toString)
   	   	 
   	     	
   	     	
   	     	 var s=result.toString()
   	  	     	 
   	     	 var String ss=s.substring(1,s.length-1)
        	 
   	     	   	 
   	     	 _self.relatedvariable.Globalnv=Float.parseFloat(ss)                                             //改变了全局变量Globalnv
   	     	 println("Globalnv:"+_self.relatedvariable.Globalnv.toString)     
   	     	  	     	 
   	      
   	     	var String sttplot="x=["+_self.i+"], y=["+_self.relatedvariable.Globalnv+"],plot(x,y,'.')"  

		    _self.sci.exec(sttplot)
		
   	       	     	
   	    	  	     	    	     	
   	       
   	         }catch(org.scilab.modules.javasci.JavasciException e){
   	     	    print("Error:"+e.localizedMessage)
   	        }  	        
   	        _self.i=_self.i+_self.intervalsub
    	    _self.j=_self.j+1
    	    
          }  

   @Step
   @InitializeModel
   def public void RealizeInitializeModel(EList<String> arguments){
   	    println("")println("")
   	  //  println("Step RealizeInitializeModel()!")
   	   _self.currentState=_self.initialState                                                                 //设置当前状态为初始状态
     	println("Initial State: "+_self.currentState.name)
     	var Variable nv=_self.relatedvariable   		
   		nv.Globalnv=nv.value	                                                                         //找到与系统相关的那个物理变量，将value值赋给共享变量Globalnv
        println("Initial t="+_self.intervalleftnew.toString)
        println("Initial Globalnv: "+(nv.Globalnv).toString)
        
    
      
   	}
   	
}
   

@Aspect(className=Transition)
abstract class TransitionAspect {
  
   @Step
   def boolean holds(){
 //  	print("Step holds()") print("----")
   	
 
 //  	print("Globalnv:"+_self.relatedvariable2.Globalnv)
 //    	print("----")
   	
  	if(_self.guard.contains("<")){   	      
 //  	    print("compare <")print("----") 
   	    var guardright=_self.guard.substring(_self.guard.indexOf("<")+1)
 //  		print(_self.relatedvariable2.Globalnv<Float.parseFloat(guardright)) print("   ")
   		if(_self.relatedvariable2.Globalnv<Float.parseFloat(guardright)){ 		   
   		   
			return true
   		}
   	}
   	if(_self.guard.contains(">")){  
 //  		print("compare >")print("----")
   		var guardright=_self.guard.substring(_self.guard.indexOf(">")+1)	  		   		
 //  		print(_self.relatedvariable2.Globalnv>Float.parseFloat(guardright)) print("   ")
   		if( _self.relatedvariable2.Globalnv > Float.parseFloat(guardright)){                     
            		
   			return true
   		}
   	}
   	if(_self.guard.contains("=")){
 //  	   print("compare ==")print("----")
   		var guardright=_self.guard.substring(_self.guard.indexOf("=")+1)
 //  		print(_self.relatedvariable2.Globalnv==Float.parseFloat(guardright)) print("   ")  
   		if(_self.relatedvariable2.Globalnv==Float.parseFloat(guardright)){  		
   						
   			return true
   		}
   	}
   	
   	return false
   	
   }
}

@Aspect(className=Variable)
class VariableAspect {
   public float Globalnv
}


@Aspect(className=State)
class StateAspect {
    
}
@Aspect(className=ComTransition)
class ComTransitionAspect extends TransitionAspect {

}

@Aspect(className=ProbTransition)
class ProbTransitionAspect extends TransitionAspect {
	
}

@Aspect(className=ODE)
class ODEAspect {

}

@Aspect(className=Function)
class FunctionAspect {

}

@Aspect(className=Condition)
class ConditionAspect {

}

@Aspect(className=Interval)
class IntervalAspect {

}

@Aspect(className=IndeVariable)
class IndeVariableAspect {

}

@Aspect(className=DeVariable)
class DeVariableAspect {

}

@Aspect(className=Fright)
class FrightAspect {

}



