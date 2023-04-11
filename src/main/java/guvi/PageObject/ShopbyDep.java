package guvi.PageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ShopbyDep
{
	public WebDriver driver; 
	public ShopbyDep(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//Code to select and add an item from (Menu a shop by dep)
	@FindBy(xpath=("(//img[@alt='United States'])[1]"))
	WebElement USRegion;
	
	@FindBy(xpath=("//button[normalize-space()='Menu']//*[name()='svg']"))
	WebElement buttonMenu;

	@FindBy(xpath="//*[text()='Appliances']")
	WebElement buttonAppliances;

	@FindBy(xpath="//*[text()='Major Kitchen Appliances']")
	WebElement buttonMajorKitchenAppliances;

	@FindBy(xpath="//*[text()='Refrigerators']")
	WebElement buttonRefrigerators;

	//window.scrollBy(0,600)

	@FindBy(xpath="(//a[@class='flex-image-inner-wrapper flex-fluid-image'])[1]")
	WebElement buttonFrenchDoorRefrigerators;

	//window.scrollBy(0,500)

	@FindBy(xpath="(//a[@class='image-link'])[1]")
	WebElement buttonSamsung27cu;

	//Samsung - 27 cu. ft. Large Capacity 3-Door French Door Refrigerator with External Water //& Ice Dispenser - Stainless steel

	//window.scrollBy(0,1700)

	@FindBy(xpath="//*[text()='Add to Cart']")
	WebElement deptAddtoCart;
	
	//Code for Service Unavailable
	
	@FindBy(xpath="//div[@class='installation-services-unavailable-text']")
	WebElement installationserviceUnavailable;
	
	@FindBy(xpath="//button[@class='c-button-unstyled service-selector cta-text']")
	WebElement buttonCheckLocation;
	
	@FindBy(xpath="//input[@id='service-selector-zip-code']")
	WebElement feildEstimatesPin;
	
	@FindBy(xpath="//*[text()='Update']")
	WebElement buttonUpdate;
	
	@FindBy(xpath="//*[text()='Go to Cart']")
	WebElement buttonGotoCart;
	
	@FindBy(xpath="//button[@class='c-close-icon c-modal-close-icon']")
	WebElement buttonClosePopUp;
	
	//code for Product verification
	
	@FindBy(xpath="//h2[@class='cart-item__title-heading']")
	WebElement productname;
	
	@FindBy(xpath="(//span[@class='price-summary-line__content'])[1]")
	WebElement originalprice;

	@FindBy(xpath="(//span[@class='price-summary-line__content'])[2]")
	WebElement savings;

	@FindBy(xpath="(//span[@class='price-summary-line__content'])[3]")
	WebElement Delivery;

	@FindBy(xpath="(//span[@class='price-summary-line__content'])[4]")
	WebElement estimatedtax;
	
	@FindBy(xpath="//div[@class='price-block__primary-price']")
	WebElement total;
		
	//Creating Methods
	public void selectUSRegion() 
	{
		USRegion.click();
	}
	
	public void shopbyDepartment() 
	{
		buttonMenu.click();
		buttonAppliances.click();
		buttonMajorKitchenAppliances.click();
		buttonRefrigerators.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(buttonFrenchDoorRefrigerators));
		
		buttonFrenchDoorRefrigerators.click();
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,500)");
		
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeClickable(buttonSamsung27cu));
		
		buttonSamsung27cu.click();
		
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,500)");
		
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.elementToBeClickable(deptAddtoCart));
		
						
		if(installationserviceUnavailable.isDisplayed()) 
		{
			buttonCheckLocation.click();
			
			Actions actions=new Actions(driver);
			actions.click(feildEstimatesPin)
			.keyDown(Keys.CONTROL)
			.sendKeys("a")
			.keyUp(Keys.CONTROL)
			.sendKeys(Keys.BACK_SPACE)
			.sendKeys("99501")
			.build()
			.perform();
			
			buttonUpdate.click();
			deptAddtoCart.click();
			
			buttonGotoCart.click();
			buttonClosePopUp.click();
		}		
		}
	
	public void verifyOrderDetails() 
	{
		System.out.println("Verifying the Product Information");
		System.out.println("---------------------------------");		
		System.out.println("PRODUCT NAME : "+""+productname.getText());
		System.out.println("ORIGINAL PRICE FOR PRODUCTS : "+""+originalprice.getText());
		System.out.println("SAVING AMOUNT FOR PRODUCTS : "+""+savings.getText());
		System.out.println("PICKUP PRICE FOR PRODUCTS : "+""+Delivery.getText());
		System.out.println("ESTIMATED TAX FOR PRODUCTS : "+""+estimatedtax.getText());
		System.out.println("PAYMENT PRICE FOR PRODUCTS : "+""+total.getText());
		
		String expectedProductName="Samsung - 27 cu. ft. Large Capacity 3-Door French Door Refrigerator with External Water & Ice Dispenser - Stainless steel";
		Assert.assertEquals(productname.getText(),expectedProductName);	
	}
	
	
}
