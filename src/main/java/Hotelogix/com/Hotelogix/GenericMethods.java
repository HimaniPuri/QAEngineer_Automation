package Hotelogix.com.Hotelogix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

public class GenericMethods {
	
	public WebDriver driver;
	public static GenericMethods gm;

	
	
	public static GenericMethods fn_provideObj()
	{
		if(gm==null)
		{
			
			gm=new GenericMethods();
		}
		return gm;
		
		//return gm;
		
	}
	
	/*public static int sum(int a, int b){
		int c = a +b;
		System.err.println(c);
		return c;*/
		
	

	
	
	public void fn_launchbrowser(String browserName)throws Exception
	{
	
		try
		{
		if(browserName.equalsIgnoreCase("FF"))
		{
		System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver.exe");
		DesiredCapabilities dc=DesiredCapabilities.firefox();
		dc.setCapability("marionette", true);
		
		// capabilities.setCapability("marionette", true);
         //FirefoxProfile profile = new FirefoxProfile();
         //profile.setPreference("browser.link.open_newwindow.restriction", 1);
         //profile.setPreference("browser.link.open_newwindow", 2);
         //capabilities.setCapability(FirefoxDriver.PROFILE, profile);
         driver= new FirefoxDriver(dc);
         
		}	
		else if(browserName.equalsIgnoreCase("CH"))
		{
			
		}
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			PageFactory.initElements(driver, this);
		}
		catch(Exception e)
		{
			throw e;
		}
		
		
	}
	
	public void fn_navigaingToURL(String url) throws Exception{
		try
		{
            driver.get(url);		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		
	}
	
	public void fn_click(WebElement we) throws Exception{
		try
		{
		
		if(we.isEnabled() &&  we.isDisplayed())
		{
			we.click();
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		
	
	}
}


