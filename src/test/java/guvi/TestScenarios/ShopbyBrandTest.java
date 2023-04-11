package guvi.TestScenarios;

import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.PageObject.ShopbyBrand;

public class ShopbyBrandTest extends BaseClass
{

	@Test(priority=1)
	public void MenuaShopbyBrand()
	{
		ShopbyBrand brand=new ShopbyBrand(driver);
		brand.selectUSRegion();
		brand.shopbyBrand();
		brand.verifyOrderDetails();
	}

}
