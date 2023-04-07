package guvi.TestScenarios;

import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.PageObject.SignupandLoginPage;

public class SignupandLoginTest extends BaseClass
{

	@Test(priority=0)
	public void Signup() 
	{
		SignupandLoginPage signup=new SignupandLoginPage(driver);
		signup.selectUSRegion();
		signup.navigatetoAccButton();
		signup.setupAccount();
		signup.datafirstName(prop.getProperty("FirstName"));
		signup.datalastName(prop.getProperty("LastName"));
		signup.dataEmail(prop.getProperty("Email"));
		signup.dataPassword(prop.getProperty("Password"));
		signup.dataconfirmPassword(prop.getProperty("ConfirmPassword"));
		signup.datamobileNo(prop.getProperty("MobileNumber"));
		signup.dataaccountRecovery();
		signup.datacreateAccount();
	}
	
	@Test(priority=1)
	public void Login() 
	{
		SignupandLoginPage login=new SignupandLoginPage(driver);
		login.selectUSRegion();
		login.navigatetoAccButton();
		login.Signin();
		login.EmailAddress(prop.getProperty("Email"));
		login.AccountPassword(prop.getProperty("Password"));
		login.Login();
	}
	
}
