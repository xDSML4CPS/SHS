package org.xcpsml;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.xcpsml.xcpsmlmt.cpsml.CpsmlFactory;

@SuppressWarnings("all")
public interface XCPSMLMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract CpsmlFactory getCpsmlFactory();
  
  public abstract void save(final String uri) throws IOException;
}
