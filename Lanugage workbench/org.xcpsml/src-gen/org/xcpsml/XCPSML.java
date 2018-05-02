package org.xcpsml;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.dsml.cpsml.CPSMLMT;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.xcpsml.XCPSMLMT;

@SuppressWarnings("all")
public class XCPSML implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static XCPSML load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    XCPSML mm = new XCPSML();
    mm.setResource(res);
    return mm ;
  }
  
  public CPSMLMT toCPSMLMT() {
    org.xcpsml.xcpsml.adapters.cpsmlmt.XCPSMLAdapter adaptee = new org.xcpsml.xcpsml.adapters.cpsmlmt.XCPSMLAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public XCPSMLMT toXCPSMLMT() {
    org.xcpsml.xcpsml.adapters.xcpsmlmt.XCPSMLAdapter adaptee = new org.xcpsml.xcpsml.adapters.xcpsmlmt.XCPSMLAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
