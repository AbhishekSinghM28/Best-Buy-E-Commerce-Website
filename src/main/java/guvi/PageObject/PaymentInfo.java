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

public class PaymentInfo
{
	public WebDriver driver; 
	public PaymentInfo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Code to proceed for checkout page and fill Payment information
	//---------------------------------------------------------------

	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-primary']")
	WebElement buttonCheckout;

	@FindBy(xpath="//button[@class='c-button c-button-secondary c-button-lg cia-guest-content__continue guest']")
	WebElement buttonContinueasGuest;

	@FindBy(xpath="//input[@id='firstName']")
	WebElement buttonFirstName;

	@FindBy(xpath="//input[@id='lastName']")
	WebElement buttonLastName;

	@FindBy(xpath="//input[@class='tb-input  autocomplete__input']")
	WebElement buttonAddress;

	@FindBy(xpath="//input[@id='city']")
	WebElement buttonCity;

	@FindBy(xpath="//select[@id='state']")
	WebElement buttonState;

	@FindBy(xpath="//input[@id='zipcode']")
	WebElement buttonZipCode;

	@FindBy(xpath="//button[@class='c-button c-button-secondary c-button-md new-address-form__button']")
	WebElement buttonApply;

	@FindBy(xpath="//input[@id='user.emailAddress']")
	WebElement buttonEmailAddress;

	@FindBy(xpath="//input[@id='user.phone']")
	WebElement buttonPhoneNumber;
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-secondary']")
	WebElement buttonContinuetoScheduleDelivery;
	
	@FindBy(xpath="//button[@id='c-calendar-date-1682706600000']")
	WebElement buttonDeliveryDate;

	@FindBy(xpath="//button[@class='c-button c-button-secondary c-button-lg c-button-block ']")
	WebElement buttonContinuetoPaymentinformation;
	
	@FindBy(xpath="//div/span[contains(text(),'Sorry, there was a problem. Please try that again.')]")
	WebElement buttonContinuePaymentError;
		
	public void Checkoutinfo()
	{
		buttonCheckout.click();
		buttonContinueasGuest.click();
		
		buttonFirstName.sendKeys("Test");
		buttonLastName.sendKeys("Acco");
		buttonAddress.sendKeys("115 E 3rd Ave, Anchorage, AK");
		buttonCity.sendKeys("Anchorage");
		buttonState.sendKeys("AK");
		buttonZipCode.sendKeys("99501");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(buttonApply));
		
		buttonApply.click();
		
		buttonEmailAddress.sendKeys("Testseekeracco@gmail.com");
		buttonPhoneNumber.sendKeys("9876543210");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", buttonContinuetoScheduleDelivery);
		
		//WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(buttonContinuetoScheduleDelivery));
		
	}	

	public void ContinuePaymentPage()
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", buttonContinuePaymentError);
		if(buttonContinuePaymentError.isDisplayed()) 
		{
			Assert.assertEquals(buttonContinuePaymentError.getText(), "Sorry, there was a problem. Please try that again.");
			System.out.println("There was a problem in signin. Can't continue to payment page.");
		}			
		
		else 
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(buttonContinuetoPaymentinformation));
			
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", buttonContinuetoPaymentinformation);
			
			buttonContinuetoPaymentinformation.click();
		}
	}

}
