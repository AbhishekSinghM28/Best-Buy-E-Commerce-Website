package guvi.PageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GuestAddCartPage {
	public WebDriver driver;
	public GuestAddCartPage( WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id='survey_content']")
	WebElement surveycontent;
	@FindBy(xpath="//button[@id='survey_invite_no']")
	WebElement surveydismiss;
	@FindBy(xpath="//input[@id='gh-search-input']")
	WebElement enterproduct;
	@FindBy(xpath="//span[@class='header-search-icon']//*[name()='svg']")
	WebElement searchproduct;
	@FindBy(partialLinkText="Samsung - 65 Class 7 Series LED 4K UHD Smart Tize")
	WebElement samsungtv;
	@FindBy(xpath="//a[contains(text(),'BenQ - TK700 4K HDR Gaming Projector, Game Modes, ')]")
	WebElement projector;
//	@FindBy(xpath="(//button[@type='button'][normalize-space()='Add to Cart'])[1]")
	@FindBy(xpath="(////button[normalize-space()='Add to Cart']")
	
	WebElement addtocart;
	@FindBy(xpath="//a[contains(text(),'Sony - Alpha ZV-E10 Kit Mirrorless Vlog Camera wit')]")
	WebElement sonycamera;
	@FindBy(xpath="//button[@data-track='Attach Modal: Continue shopping']")
	WebElement continueshopping;
	@FindBy(xpath="//span[@class='cart-label']")
	WebElement gotocart;
	@FindBy(xpath="//button[normalize-space()='Continue as Guest']")
	WebElement guestlink;
	
	@FindBy(xpath="//button[@aria-label='Menu']")
	WebElement menulink;
	@FindBy(xpath="//button[normalize-space()='Brands']")
	WebElement brandlink;
	@FindBy(xpath="//a[@data-lid='ubr_shp_son']")
	WebElement sonylink;
	@FindBy(xpath="//a[normalize-space()='Sony cameras']")
	WebElement sonycameralink;
	@FindBy(xpath="body > div:nth-child(5) > main:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(12) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > strong:nth-child(1)")
	WebElement availablity;
	@FindBy(xpath="//button[@data-lid='ubr_tv']")
	WebElement tvhomelink;
	@FindBy(xpath="//button[@data-lid='ubr_tv_av']")
	WebElement tvlink;
	@FindBy(xpath="//a[@data-lid='ubr_tv_av_prj']")
	WebElement tvprojectorlink;
	
	public void EnterProduct(String Product) {
		
		enterproduct.clear();
		enterproduct.sendKeys(Product);
		searchproduct.click();
		Assert.assertEquals(driver.getTitle(), "Best Buy | Official Online Store | Shop Now & Save");
		System.out.println("This is Your Home Page");
//		try {
//			if(surveycontent.isDisplayed()) {
//				surveydismiss.click();
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	public void SearchProduct() {
//		Actions action = new Actions(driver);

		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.elementToBeClickable(samsungtv));
		samsungtv.click();
//		action.doubleClick(samsungtv).build().perform();
	}
	public void GetMenu() {
		menulink.click();
	}
	public void SelectBrand() {
		brandlink.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(sonylink));
		sonylink.click();
		Assert.assertEquals(driver.getTitle(), "Sony Store: Sony Electronics & Entertainment - Best Buy");
		System.out.println("This is Your Sony Brand Page");
		
	}
	public void SelectSonyproduct() {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", sonycameralink);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(sonycameralink));
		sonycameralink.click();
//		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(sonycamera));
		sonycamera.click();
		
	}
	public void SelectTvDept() {
		try {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(tvhomelink));
			tvhomelink.click();
			tvlink.click();
			tvprojectorlink.click();
//			wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//			wait.until(ExpectedConditions.elementToBeClickable(projector));
			projector.click();
			Assert.assertEquals(driver.getTitle(), "BenQ TK700 4K HDR Gaming Projector, Game Modes, Low Input Lag, 3200 Lumens White TK700 - Best Buy");
			System.out.println("This is Your TV Department Page");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void AddtoCart() {		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(addtocart));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", addtocart);
		addtocart.click();
		}	
	public void ContinueShop() {
		continueshopping.click();
	}
}