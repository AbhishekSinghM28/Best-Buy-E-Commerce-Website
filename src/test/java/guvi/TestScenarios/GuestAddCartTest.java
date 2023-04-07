package guvi.TestScenarios;

import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.PageObject.AccountaddPage;
import guvi.PageObject.GuestAddCartPage;



public class GuestAddCartTest extends BaseClass
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
}