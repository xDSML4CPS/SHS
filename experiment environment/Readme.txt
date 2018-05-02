Experimental environment:

1.Windows7(64bit)

2.The GEMOC Studio we installed  is 2.3.0.

3.The Scilab we installed is 6.0.1. 
  Associated jars package of Scilab has been regenerated as standard GEMOC plugins, including org.scilab.modules.javasci_5.0.0, org.scilab.modules.jvm_5.0.0, org.scilab.modules.types_5.0.0
  

  If you want to run the example successfuly, please firstly install GEMOC 2.3.0 and Scilab 6.0.1 in your computer. Then, put the three plugins (org.scilab.modules.javasci_5.0.0, org.scilab.modules.jvm_5.0.0, org.scilab.modules.types_5.0.0) into the plugins folder of GEMOC. 
  
  Step1. In modeling workbench, import related projects in folder Language workbench. 
  Step2. Run a Eclipse Application, in order to call scilab successfully, please set the the VM arguments: -Dosgi.parentClassloader=app
  Step3. In a Eclipse Application, import the model project of folder Modeling Project. 
  Step4. Debug
         > Gemoc Sequential eXecutable Model> 
         choose the model to execute:/TemperatureControllerSystem/TemperatureController.cpsml, 
         choose the language:org.xcpsml.XCPSML, 
         choose the Animation:/TemperatureControllerSystem/representations.aird, 0, ¡Ìbreak at start.
         choose DSA>browse and choose main method and main model element path.
         >Run.
         >Plese open Default Messaging Control, right click Clobal context: System, step return, then you will see its execution information and simulation results.