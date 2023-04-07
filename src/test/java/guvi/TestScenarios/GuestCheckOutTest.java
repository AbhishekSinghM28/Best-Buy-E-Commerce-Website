package guvi.TestScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.PageObject.AccountaddPage;
import guvi.PageObject.GuestAddCartPage;
import guvi.PageObject.GuestCheckOutPage;
import guvi.PageObject.ShowCartPage;


public class GuestCheckOutTest extends BaseClass
{

	@Test(priority=1)
	public void PageEntryOperation() 
	{
		AccountaddPage addacc=new AccountaddPage(driver);
		addacc.SelectCountry();
//		addacc.AccountLink();		
	}
	@Test(priority=2)
	public void AddCartProductBySearch() 
	{
		GuestAddCartPage addcart=new GuestAddCartPage(driver);
		addcart.EnterProduct(prop.getProperty("Product1"));
		addcart.SearchProduct();
		addcart.AddtoCart();
		addcart.ContinueShop();
		
	}
	@Test(priority=3)
	public void AddCartProductByBrand()
	{
		GuestAddCartPage addcart=new GuestAddCartPage(driver);
		addcart.GetMenu();
		addcart.SelectBrand();
		addcart.SelectSonyproduct();
		addcart.AddtoCart();
		addcart.ContinueShop();
		
	}
	@Test(priority=4)
	public void AddCartProductByDept() 
	{
		GuestAddCartPage addcart=new GuestAddCartPage(driver);
		addcart.GetMenu();
		addcart.SelectTvDept();
		addcart.AddtoCart();
		addcart.ContinueShop();
		
	}

	@Test(priority=5)
	public void ShowCartOperation() 
	{
		ShowCartPage cart=new ShowCartPage(driver);
		cart.CartLink();
		cart.GetPrice();
		
	}
	@Test(priority=6)
	public void CheckOutOperation()
	{
		GuestCheckOutPage checkout=new GuestCheckOutPage(driver);
		checkout.CheckoutBtn();
		checkout.ChangePickupMethod();
		checkout.ChangePickupLocation();		
	}
	@Test(priority=7)
	public void AddPickupPerson() 
	{
		GuestCheckOutPage checkout=new GuestCheckOutPage(driver);
		checkout.EnterPickFname(prop.getProperty("PickPersonFname"));
		checkout.EnterPickLname(prop.getProperty("PickPersonLname"));
		checkout.EnterPickMobno(prop.getProperty("PickPersonMobile"));
		checkout.EnterPickEmail(prop.getProperty("PickPersonEmail"));
		checkout.PickPersonApply();
	}
	@Test(priority=8)
	public void PaymentInfo()
	{
		GuestCheckOutPage checkout=new GuestCheckOutPage(driver);
		checkout.UserEmaiAddr(prop.getProperty("Emailid"));
		checkout.UserMobileno(prop.getProperty("MobileNo"));
		checkout.ContinuePayment();
	}
}