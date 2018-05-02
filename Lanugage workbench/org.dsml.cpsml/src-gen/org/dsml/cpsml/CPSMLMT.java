package org.dsml.cpsml;

import cpsml.CpsmlFactory;
import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface CPSMLMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract CpsmlFactory getCpsmlFactory();
  
  public abstract void save(final String uri) throws IOException;
}
