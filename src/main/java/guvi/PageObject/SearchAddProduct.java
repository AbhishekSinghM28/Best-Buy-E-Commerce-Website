package guvi.PageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	@FindBy(xpath="//button[normalize-space()='Add to Cart']")
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
				
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2300)");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(buttonAddtoCart));
		
		buttonAddtoCart.click();
	}
}
