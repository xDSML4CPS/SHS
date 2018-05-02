package org.xcpsml;

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
    	org.xcpsml.xcpsml.cpsml.CpsmlPackage.eNS_URI,
    	org.xcpsml.xcpsml.cpsml.CpsmlPackage.eINSTANCE
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
    MelangeRegistry.LanguageDescriptor xCPSML = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.xcpsml.XCPSML", "", "http://org.xcpsml.xcpsml/cpsml/", "org.xcpsml.XCPSMLMT"
    );
    xCPSML.addAdapter("org.dsml.cpsml.CPSMLMT", org.xcpsml.xcpsml.adapters.cpsmlmt.XCPSMLAdapter.class);
    xCPSML.addAdapter("org.xcpsml.XCPSMLMT", org.xcpsml.xcpsml.adapters.xcpsmlmt.XCPSMLAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.xcpsml.XCPSML",
    	xCPSML
    );
    MelangeRegistry.ModelTypeDescriptor xCPSMLMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.xcpsml.XCPSMLMT", "", "http://org.xcpsml.xcpsmlmt/"
    );
    xCPSMLMT.addSuperType("org.dsml.cpsml.CPSMLMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.xcpsml.XCPSMLMT",
    	xCPSMLMT
    );
  }
}
