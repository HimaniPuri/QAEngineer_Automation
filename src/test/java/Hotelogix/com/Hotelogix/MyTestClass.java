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
	/*int d = GenericMethods.sum(6, 7);
	System.out.println(d);
		
	GenericMethods.fn_provideObj().*/
	}
	
	@Test(priority=3)
	public void fn_Register() throws Exception{
		
		RegisterPage RegisterObj = new RegisterPage(GenericMethods.fn_provideObj().driver);
		RegisterObj.SetHotelName("Taj");
		RegisterObj.SetFullName("Himani Puri");
		RegisterObj.SetEmail("himani.puri@hotelogix.com");
		RegisterObj.SelectCountry();
		RegisterObj.SelectState();
		//RegisterObj.SetPhone(213213213);
		RegisterObj.fn_SubmitButton();
	}
		
	
	
	
	

}
