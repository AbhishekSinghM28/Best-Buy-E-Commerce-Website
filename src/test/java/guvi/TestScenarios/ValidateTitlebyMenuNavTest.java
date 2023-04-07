package guvi.TestScenarios;

import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.PageObject.ValidateTitlebyMenuNav;

public class ValidateTitlebyMenuNavTest extends BaseClass
{

	@Test(priority=1)
	public void topdealsMenuValidation() 
	{
		ValidateTitlebyMenuNav topdeal=new ValidateTitlebyMenuNav(driver);
		topdeal.selectUSRegion();
		topdeal.TopDeals();
		System.out.println("Successfully Validated TopDeals Page Title");
	}
	
	@Test(priority=2)
	public void dealsoftheDayMenuValidation() 
	{
		ValidateTitlebyMenuNav dealsofday=new ValidateTitlebyMenuNav(driver);
		dealsofday.selectUSRegion();
		dealsofday.DealsofTheDay();
		System.out.println("Successfully Validated DealsofTheDay Page Title");
	}
	
	@Test(priority=3)
	public void TotalTechMembershipMenuValidation() 
	{
		ValidateTitlebyMenuNav totalTechMembership=new ValidateTitlebyMenuNav(driver);
		totalTechMembership.selectUSRegion();
		totalTechMembership.TotalTechMembership();
		System.out.println("Successfully Validated TotalTechMembership Page Title");
	}
	
	@Test(priority=4)
	public void CreditCardMenuValidation() 
	{
		ValidateTitlebyMenuNav creditcard=new ValidateTitlebyMenuNav(driver);
		creditcard.selectUSRegion();
		creditcard.CreditCards();
		System.out.println("Successfully Validated CreditCard Page Title");
	}
	
	@Test(priority=5)
	public void GiftCardMenuValidation() 
	{
		ValidateTitlebyMenuNav giftcard=new ValidateTitlebyMenuNav(driver);
		giftcard.selectUSRegion();
		giftcard.GiftCards();
		System.out.println("Successfully Validated GiftCard Page Title");
	}
	
	@Test(priority=6)
	public void GiftIdeaMenuValidation() 
	{
		ValidateTitlebyMenuNav giftidea=new ValidateTitlebyMenuNav(driver);
		giftidea.selectUSRegion();
		giftidea.GiftIdeas();
		System.out.println("Successfully Validated GiftIdea Page Title");
	}
	
	@Test(priority=7)
	public void HealthandWellnessMenuValidation() 
	{
		ValidateTitlebyMenuNav healthandwellness=new ValidateTitlebyMenuNav(driver);
		healthandwellness.selectUSRegion();
		healthandwellness.HealthandWellness();
		System.out.println("Successfully Validated HealthandWellness Page Title");
	}
	
	@Test(priority=8)
	public void BestBuyOutletMenuValidation() 
	{
		ValidateTitlebyMenuNav bestbuyoutlet=new ValidateTitlebyMenuNav(driver);
		bestbuyoutlet.selectUSRegion();
		bestbuyoutlet.BestBuyOutlet();
		System.out.println("Successfully Validated BestBuyOutlet Page Title");
	}
	
	@Test(priority=9)
	public void BestBuyBusinessMenuValidation() 
	{
		ValidateTitlebyMenuNav bestbuybusiness=new ValidateTitlebyMenuNav(driver);
		bestbuybusiness.selectUSRegion();
		bestbuybusiness.BestBuyBusiness();
		System.out.println("Successfully Validated BestBuyforBusiness Page Title");
	}
}
