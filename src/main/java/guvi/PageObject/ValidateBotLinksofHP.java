package guvi.PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidateBotLinksofHP
{
	public WebDriver driver; 
	public ValidateBotLinksofHP(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locate USRegion
	@FindBy(xpath=("(//img[@alt='United States'])[1]"))
	WebElement buttonUSRegion;
		
	//Creating Suitable method
	
	public void USRegion() 
	{
		buttonUSRegion.click();
	}
	
	public void ValidateBotLinks() 
	{
		//Fetching the Text of HomePage Bottom Links		
		List<WebElement> footerLinks=driver.findElements(By.xpath("//div[@class='flex justify-content-start']/a"));
				
		//for(WebElement l1:footerLinks) 
		//{
		//	System.out.println(l1.getText());
		//}
		
		//Adding the Expected Text Values for Bottom Links of HomePage
		ArrayList<String> expValues=new ArrayList<String>();
		expValues.add("Accessibility");
		expValues.add("Terms & Conditions");
		expValues.add("Privacy");
		expValues.add("Interest-Based Ads");
		expValues.add("State Privacy Rights");
		expValues.add("CA Do Not Sell/Share My Personal Information");
		expValues.add("Limit Use of My Sensitive Personal Information");
		expValues.add("Targeted Advertising Opt Out");
		expValues.add("CA Supply Chain Transparency Act");
		
		//Storing the Text of HomePage Bottom Links by creating a Array List
		ArrayList<String> actValues=new ArrayList<String>();
		for(WebElement l1:footerLinks) 
		{
			System.out.println(l1.getText());
			actValues.add(l1.getText().trim());
		}
		
		//Comparing Text of Expected Links with the Actual Links
		if(expValues.equals(actValues)) 
		{
			System.out.println("Status -- Passed | Expected links are matching with the Actual Links");
		}
		else 
		{
			System.out.println("Status -- Failed | Expected links are not matching with the Actual Links");
		}
	}
		
	
}
