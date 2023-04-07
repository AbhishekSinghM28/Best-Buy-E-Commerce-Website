package Base;

import org.testng.annotations.BeforeMethod;
import Utilities.Utility;
import java.io.IOException;

import org.testng.annotations.AfterMethod;


public class BaseClass extends Utility {
 
  @BeforeMethod
  public void Startup() throws IOException
  {
	 driver=initializeDriver();
	 driver.get(prop.getProperty("url"));
  }
  
  @AfterMethod
  public void close() 
  {
	 driver.quit();
  }
}