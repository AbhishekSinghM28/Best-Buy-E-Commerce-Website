package guvi.TestScenarios;

import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.PageObject.ValidateBotLinksofHP;

public class ValidateBotLinksofHPTest extends BaseClass
{
	@Test(priority=1)
	public void ValidateBottomLinkofHomePage()
	{
		ValidateBotLinksofHP selectRegion=new ValidateBotLinksofHP(driver);
		selectRegion.USRegion();
		selectRegion.ValidateBotLinks();
	}

}
