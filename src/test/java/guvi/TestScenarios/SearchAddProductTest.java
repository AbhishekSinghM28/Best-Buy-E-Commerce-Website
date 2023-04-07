package guvi.TestScenarios;

import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.PageObject.SearchAddProduct;

public class SearchAddProductTest extends BaseClass
{
	@Test
	public void SearchandAddProducttoCart() 
	{
		SearchAddProduct addproduct=new SearchAddProduct(driver);
		addproduct.selectUSRegion();
		addproduct.SearchandAddProduct();		
	}

}
