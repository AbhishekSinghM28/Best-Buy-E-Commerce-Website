package guvi.TestScenarios;

import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.PageObject.ShopbyDep;

public class ShopbyDepTest extends BaseClass
{
	@Test(priority=1)
	public void MenuaShopbyDep()
	{
		ShopbyDep dep=new ShopbyDep(driver);
		dep.selectUSRegion();
		dep.shopbyDepartment();
		dep.verifyOrderDetails();
	}

}
