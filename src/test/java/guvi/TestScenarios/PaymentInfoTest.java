package guvi.TestScenarios;

import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.PageObject.AccountaddPage;
import guvi.PageObject.PaymentInfoPage;


public class PaymentInfoTest extends BaseClass {
	@Test(priority=1)
	public void PageEntryOperation() {
		AccountaddPage addacc=new AccountaddPage(driver);
		addacc.SelectCountry();
//		addacc.AccountLink();		
	}
	@Test(priority=2)
	public void PlaceOrderOperation() {
		PaymentInfoPage payment=new PaymentInfoPage(driver);
//		payment.getpagetitle();
		payment.EnterCardnumber(prop.getProperty("CardNumber"));
		payment.EnterExpmonth(prop.getProperty("Month"));
		payment.EnterExpyear(prop.getProperty("Year"));
		payment.EnterCCV(prop.getProperty("Securitycode"));
		payment.EnterFirstname(prop.getProperty("Firstname"));
		payment.EnterLastname(prop.getProperty("Lastname"));
		payment.EnterAddr(prop.getProperty("Address"));
		payment.EnterCity(prop.getProperty("City"));
		payment.EnterState(prop.getProperty("State"));
		payment.EnterZipcode(prop.getProperty("Zipcode"));
		payment.PlaceOrder();
	}

}