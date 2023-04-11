package guvi.PageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ShopbyBrand
{
	public WebDriver driver; 
	public ShopbyBrand(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Code to select and add an item from (Menu a shop by brand)
	@FindBy(xpath=("(//img[@alt='United States'])[1]"))
	WebElement USRegion;
	
	@FindBy(xpath=("//button[normalize-space()='Menu']//*[name()='svg']"))
	WebElement buttonMenu;
	
	@FindBy(xpath="//*[text()='Samsung']")
	WebElement buttonSamsung;
	
	@FindBy(xpath="//*[text()='Brands']")
	WebElement buttonBrands;
	
	@FindBy(xpath="//img[@alt='Headphones, sound bar and subwoofer']")
	WebElement buttonAudio;

	@FindBy(xpath="(//img[@alt='Samsung - Galaxy Buds2 Pro True Wireless Earbud Headphones - Graphite - Front_Zoom'])[1]")
	WebElement buttonGalaxyBuds2;

	//window.scrollBy(0,1000)

	@FindBy(xpath="//button[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button']")
	WebElement brandAddtoCart;

	@FindBy(xpath="//*[text()='Go to Cart']")
	WebElement buttonGotoCart;

	@FindBy(xpath="(//*[name()='path'])[65]")
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
	
	public void shopbyBrand() 
	{
		buttonMenu.click();
		buttonBrands.click();
		buttonSamsung.click();
		buttonAudio.click();
		buttonGalaxyBuds2.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", brandAddtoCart);
		//js.executeScript("window.scrollBy(0,1100)");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(brandAddtoCart));
		
		brandAddtoCart.click();
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,1700)");
		
		buttonGotoCart.click();			
		//buttonClosePopUp.click();				
				
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
		
		String expectedProductName="Samsung - Galaxy Buds2 Pro True Wireless Earbud Headphones - Graphite"
				+ "";
		Assert.assertEquals(productname.getText(),expectedProductName);	
	}
}
