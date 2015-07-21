package kz.projects.gwt.MyGWTProject.client;

import com.google.gwt.junit.client.GWTTestCase;

public class CompileGwtTest extends GWTTestCase {
  
  @Override
  public String getModuleName() {
    return "kz.projects.gwt.MyGWTProject.Project";
  }

  public void testSandbox() {
    assertTrue(true);
  }
  
}
