package Hotelogix.com.Hotelogix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelogicHomePage {
	//WebDriver driver;
	 HotelogicHomePage(WebDriver driver){
	
		 PageFactory.initElements(driver, this);
		
	}
   
	
	
	@FindBy(linkText="Try For Free")
	public WebElement tryforfree;
	
	
	public void fn_clikcontryforfree() throws Exception{
		try
		{
		//GenericMethods gm = new GenericMethods();
			//GenericMethods
			
			GenericMethods.fn_provideObj().fn_click(tryforfree);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}

	}
}
