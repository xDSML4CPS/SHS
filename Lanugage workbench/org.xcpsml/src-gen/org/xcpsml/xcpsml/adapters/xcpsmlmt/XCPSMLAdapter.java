package org.xcpsml.xcpsml.adapters.xcpsmlmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.xcpsml.XCPSMLMT;
import org.xcpsml.xcpsmlmt.cpsml.CpsmlFactory;

@SuppressWarnings("all")
public class XCPSMLAdapter extends ResourceAdapter implements XCPSMLMT {
  public XCPSMLAdapter() {
    super(org.xcpsml.xcpsml.adapters.xcpsmlmt.XCPSMLMTAdaptersFactory.getInstance());
  }
  
  @Override
  public CpsmlFactory getCpsmlFactory() {
    return new org.xcpsml.xcpsml.adapters.xcpsmlmt.cpsml.CpsmlFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getCpsmlFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
