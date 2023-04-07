package guvi.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupandLoginPage 
{
	public WebDriver driver; 
	public SignupandLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//Locating an elements for Signup	
	@FindBy(xpath=("(//img[@alt='United States'])[1]"))
	WebElement USRegion;

	@FindBy(xpath=("//span[@class='v-p-right-xxs line-clamp']"))
	WebElement accountButton;

	@FindBy(xpath=("(//a[@tabindex='0'])[11]"))
	WebElement account; 

	@FindBy(xpath=("//input[@id='firstName']"))
	WebElement firstName; 

	@FindBy(xpath=("//input[@id='lastName']"))
	WebElement lastName; 

	@FindBy(xpath=("//input[@id='email']"))
	WebElement email;

	@FindBy(xpath=("//input[@id='fld-p1']"))
	WebElement password;

	@FindBy(xpath=("//input[@id='reenterPassword']"))
	WebElement confirmPassword;

	@FindBy(xpath=("//input[@id='phone']"))
	WebElement mobileNo;

	@FindBy(xpath=("//label[@for='is-recovery-phone']"))
	WebElement accountRecovery;

	@FindBy(xpath=("//button[@type='submit']"))
	WebElement createAccount;
	
	//Locating an elements for Login
	@FindBy(xpath=("//a[@data-lid='ubr_mby_signin_b']"))
	WebElement buttonSignin;

	@FindBy(xpath=("//input[@type='email']"))
	WebElement emailAddress;

	@FindBy(xpath=("//input[@type='password']"))
	WebElement accountPassword;

	@FindBy(xpath=("//button[@type='submit']"))
	WebElement buttonLogin;

	//Creating methods for Sign_up Test
	public void selectUSRegion() 
	{
		USRegion.click();
	}
	public void navigatetoAccButton() 
	{
		accountButton.click();
	}
	public void setupAccount() 
	{
		account.click();
	}
	public void datafirstName(String FirstName) 
	{
		firstName.sendKeys(FirstName);
	}
	public void datalastName(String LastName) 
	{
		lastName.sendKeys(LastName);
	}
	public void dataEmail(String Email) 
	{
		email.sendKeys(Email);
	}
	public void dataPassword(String Password) 
	{
		password.sendKeys(Password);
	}
	public void dataconfirmPassword(String ConfirmPassword) 
	{
		confirmPassword.sendKeys(ConfirmPassword);
	}
	public void datamobileNo(String MobileNumber) 
	{
		mobileNo.sendKeys(MobileNumber);
	}
	public void dataaccountRecovery() 
	{
		accountRecovery.click();
	}
	public void datacreateAccount() 
	{
		createAccount.click();
	}
		
	// Creating methods for Login Test
	public void Signin() 
	{
		//driver.navigate().to("https://www.bestbuy.com/identity/signin?token=tid%3A94a1d602-d441-11ed-ac7a-0a1dedd8f9d3");
		buttonSignin.click();
	}			
	public void EmailAddress(String Email) 
	{
		emailAddress.sendKeys(Email);
	}
	public void AccountPassword(String Password) 
	{
		accountPassword.sendKeys(Password);
	}
	public void Login() 
	{
		buttonLogin.click();
	}
}
