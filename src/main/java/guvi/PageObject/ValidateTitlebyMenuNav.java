package guvi.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ValidateTitlebyMenuNav
{
	public WebDriver driver;

	public ValidateTitlebyMenuNav(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);		
	}
	
	//Locators for Selecting a Country
	@FindBy(xpath=("(//img[@alt='United States'])[1]"))
	WebElement USRegion;
	
	//Locators for different pages of Menu

	//Title: Top Deals and Featured Offers on Electronics - Best Buy
	@FindBy(xpath=("//a[@data-lid='hdr_td_topdeals']"))
	WebElement buttonTopDeals ;

	//Title: Deal of the Day: Electronics Deals - Best Buy
	@FindBy(xpath=("//a[@data-lid='hdr_dotd']"))
	WebElement buttonDealsofDay;

	//Title: Best Buy Totaltech™ – Best Buy
	@FindBy(xpath=("//a[@data-lid='hdr_best_buy_totaltech']"))
	WebElement buttonTotaltechMembership;

	//Title: Best Buy Credit Card: Rewards &amp; Financing
	@FindBy(xpath=("//a[@data-lid='hdr_crd']"))
	WebElement buttonCreditCards;

	//Title: Gifts Cards and E-Gift Cards - Best Buy
	@FindBy(xpath=("//a[@data-lid='hdr_gift_cards']"))
	WebElement buttonGiftCards;

	//Title: Gift Ideas 2023: Best Gifts to Give This Year - Best Buy
	@FindBy(xpath=("//a[@data-lid='hdr_gift_ideas']"))
	WebElement buttonGiftideas;

	//Title: Health & Wellness Solutions & Technology - Best Buy
	@FindBy(xpath=("//a[@data-lid='hdr_health']"))
	WebElement buttonHealthandWellness ;

	//Title: Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy
	@FindBy(xpath=("//a[@data-lid='hdr_best_buy_outlet']"))
	WebElement buttonBestBuyOutlet;

	//Locator for More option
	@FindBy(xpath=("//*[text()='More']"))
	WebElement buttonMore;

	//Title: Best Buy for Business - Best Buy
	@FindBy(xpath=("(//a[@data-lid='hdr_best_buy_business'])[2]"))
	WebElement buttonBestBuyBusiness;

	//Methods
	public void selectUSRegion() 
	{
		USRegion.click();
	}
	
	public void TopDeals() 
	{
			buttonTopDeals.click();
			String actualTitle=driver.getTitle();
			String expectedTitle="Top Deals and Featured Offers on Electronics - Best Buy";
			Assert.assertEquals(actualTitle,expectedTitle);	
	}
	
	public void DealsofTheDay() 
	{
			buttonDealsofDay.click();
			String actualTitle=driver.getTitle();
			String expectedTitle="Deal of the Day: Electronics Deals - Best Buy";
			Assert.assertEquals(actualTitle,expectedTitle);	
	}
	
	public void TotalTechMembership() 
	{
			buttonTotaltechMembership.click();
			String actualTitle=driver.getTitle();
			String expectedTitle="Best Buy Totaltech™ – Best Buy";
			Assert.assertEquals(actualTitle,expectedTitle);	
	}
	
	public void CreditCards() 
	{
			buttonCreditCards.click();
			String actualTitle=driver.getTitle();
			String expectedTitle="Best Buy Credit Card: Rewards & Financing";
			Assert.assertEquals(actualTitle,expectedTitle);	
	}
	
	public void GiftCards() 
	{
			buttonGiftCards.click();
			String actualTitle=driver.getTitle();
			String expectedTitle="Gifts Cards and E-Gift Cards - Best Buy";
			Assert.assertEquals(actualTitle,expectedTitle);	
	}
	
	public void GiftIdeas() 
	{
			buttonGiftideas.click();
			String actualTitle=driver.getTitle();
			String expectedTitle="Gift Ideas 2023: Best Gifts to Give This Year - Best Buy";
			Assert.assertEquals(actualTitle,expectedTitle);	
	}
	
	public void HealthandWellness() 
	{
			buttonHealthandWellness.click();
			String actualTitle=driver.getTitle();
			String expectedTitle="Health & Wellness Solutions & Technology - Best Buy";
			Assert.assertEquals(actualTitle,expectedTitle);	
	}

	public void BestBuyOutlet() 
	{
			buttonBestBuyOutlet.click();
			String actualTitle=driver.getTitle();
			String expectedTitle="Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy";
			Assert.assertEquals(actualTitle,expectedTitle);	
	}
	
	public void BestBuyBusiness() 
	{
			buttonMore.click();
			buttonBestBuyBusiness.click();
			String actualTitle=driver.getTitle();
			String expectedTitle="Best Buy for Business - Best Buy";
			Assert.assertEquals(actualTitle,expectedTitle);	
	}
	
	
}
