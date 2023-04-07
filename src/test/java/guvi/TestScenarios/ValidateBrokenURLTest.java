package guvi.TestScenarios;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.PageObject.ValidateBrokenURL;

public class ValidateBrokenURLTest extends BaseClass
{

	@Test(priority=0)
	public void BrokenURL() throws InterruptedException, IOException
	{
		ValidateBrokenURL validurl=new ValidateBrokenURL(driver);
		validurl.USRegion();
		validurl.verifyTitle();
	}

}
