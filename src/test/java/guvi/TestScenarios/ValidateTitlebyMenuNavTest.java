package guvi.TestScenarios;

import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.PageObject.ValidateTitlebyMenuNav;

public class ValidateTitlebyMenuNavTest extends BaseClass
{

	@Test(priority=1)
	public void TitleValidationbyMenu() 
	{
		ValidateTitlebyMenuNav topdeal=new ValidateTitlebyMenuNav(driver);
		topdeal.selectUSRegion();
		topdeal.TopDeals();
		System.out.println("Successfully Validated TopDeals Page Title");
		topdeal.DealsofTheDay();
		System.out.println("Successfully Validated DealsofTheDay Page Title");
		topdeal.TotalTechMembership();
		System.out.println("Successfully Validated TotalTechMembership Page Title");
		topdeal.CreditCards();
		System.out.println("Successfully Validated CreditCard Page Title");
		topdeal.GiftCards();
		System.out.println("Successfully Validated GiftCard Page Title");
		topdeal.GiftIdeas();
		System.out.println("Successfully Validated GiftIdea Page Title");
		topdeal.HealthandWellness();
		System.out.println("Successfully Validated HealthandWellness Page Title");
		topdeal.BestBuyOutlet();
		System.out.println("Successfully Validated BestBuyOutlet Page Title");
		topdeal.BestBuyBusiness();
		System.out.println("Successfully Validated BestBuyforBusiness Page Title");
	}
}
