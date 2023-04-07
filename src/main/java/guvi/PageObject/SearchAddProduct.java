package guvi.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchAddProduct 
{
	public WebDriver driver; 
	public SearchAddProduct(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//Locating an elements
	@FindBy(xpath=("(//img[@alt='United States'])[1]"))
	WebElement USRegion;
	
	@FindBy(xpath="//input[@id='gh-search-input']")
	WebElement feildSearchBar;

	@FindBy(xpath="//span[@class='header-search-icon']//*[name()='svg']")
	WebElement buttonSearchBar;

	@FindBy(xpath="(//img[@class=\"product-image \"])[1]")
	WebElement chooseProduct;

	@FindBy(xpath="//button[@data-button-state='ADD_TO_CART']")
	WebElement buttonAddtoCart;


	//Creating methods for CountrySelection and SearchandAddProduct
	public void selectUSRegion() 
	{
		USRegion.click();
	}
	
	public void SearchandAddProduct() 
	{
		feildSearchBar.click();
		feildSearchBar.sendKeys("MacBook Air 13.6\" Laptop - Apple M2 chip");
		buttonSearchBar.click();
		chooseProduct.click();
		buttonAddtoCart.click();
		
		
	}
}
