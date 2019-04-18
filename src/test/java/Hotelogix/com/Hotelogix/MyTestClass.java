package Hotelogix.com.Hotelogix;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import  Hotelogix.com.Hotelogix.GenericMethods;

public class MyTestClass {
	
	//WebDriver driver;
	
	@Test(priority=1)
	public void fn_launchingnavigatingbrowser() throws Exception{
		//GenericMethods genericObj = new GenericMethods();
		GenericMethods.fn_provideObj().fn_launchbrowser("FF");
		Thread.sleep(5000);
		GenericMethods.fn_provideObj().fn_navigaingToURL("https://www.hotelogix.com");
		
	}
	
	@Test(priority=2)
	public void fn_TryforFree() throws Exception{
		//GenericMethods
		HotelogicHomePage  tryforfreeObjj = new HotelogicHomePage(GenericMethods.fn_provideObj().driver);
		tryforfreeObjj.fn_clikcontryforfree();
	
		
	}
	
	
	

}
