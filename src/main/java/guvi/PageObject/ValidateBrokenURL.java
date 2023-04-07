package guvi.PageObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ValidateBrokenURL
{
	public WebDriver driver;

	public ValidateBrokenURL(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locate USRegion
	@FindBy(xpath=("(//img[@alt='United States'])[1]"))
	WebElement buttonUSRegion;
		
	//Creating Suitable method
	public void USRegion() 
	{
		buttonUSRegion.click();
	}
	
	public void verifyTitle() throws InterruptedException, IOException
	{
		// Capture links from a WebPage
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		//Number of Links
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) 
		{
		//by using href attribute we can get URL of required link
		
		WebElement element = links.get(i);
		String url = element.getAttribute("href");
		
		URL link=new URL(url);
		
		//Creating a connection using URL object 'link'
		HttpURLConnection httpConn= (HttpURLConnection) link.openConnection();
		Thread.sleep(2000);
		
		//establish connection
		httpConn.connect();
		
		int rescode=httpConn.getResponseCode();//return response if res code is above 400
		
		if(rescode>=400)
		{
			System.out.println(url +" - "+ " is broken link");
		}
		
		else 
		{
			System.out.println(url +" - "+ " is valid link");
		}
		
		}
	}	
}
