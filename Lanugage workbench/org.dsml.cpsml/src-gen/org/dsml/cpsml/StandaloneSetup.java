package org.dsml.cpsml;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	cpsml.CpsmlPackage.eNS_URI,
    	cpsml.CpsmlPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor cPSML = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.dsml.cpsml.CPSML", "", "http://www.example.org/cpsml", "org.dsml.cpsml.CPSMLMT"
    );
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.dsml.cpsml.CPSML",
    	cPSML
    );
    MelangeRegistry.ModelTypeDescriptor cPSMLMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.dsml.cpsml.CPSMLMT", "", "http://org.dsml.cpsml.cpsmlmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.dsml.cpsml.CPSMLMT",
    	cPSMLMT
    );
  }
}
