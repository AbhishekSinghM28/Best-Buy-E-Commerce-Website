package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility
{
//Launching of browser should done in this Utility class.
//Screenshot
	
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		prop=new Properties();
		String proppath=System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties";
		FileInputStream fis = new FileInputStream(proppath);
		prop.load(fis);
		
		String browsername = "chrome";
		System.setProperty("webdriver.http.factory","jdk-http-client");
		
		if(browsername.equals("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browsername.equals("edge")) 
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}else if(browsername.equals("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;		
	}	
	//add code to capture the screenshot
			public String takeScreenshot(String testName,WebDriver driver) throws IOException 
			{
				File srcScreenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				String screenshotFilePath=System.getProperty("user.dir")+"\\Screenshots\\"+testName+".png";
				FileUtils.copyFile(srcScreenshot, new File(screenshotFilePath));
			
				return screenshotFilePath;					
			}

	//switching to window
			public static void SwitchWindow() 
			{
				String parentWindow=driver.getWindowHandle();
				Set<String> windowHandles=driver.getWindowHandles();
				windowHandles.size();
				
				for(String childWindow:windowHandles) 
				{
					if(!childWindow.contentEquals(parentWindow)) 
					{
						driver.switchTo().window(childWindow);
					}
				}
				
				
			}
}