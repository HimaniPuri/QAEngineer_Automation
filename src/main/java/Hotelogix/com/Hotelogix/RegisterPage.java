package Hotelogix.com.Hotelogix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	RegisterPage(WebDriver driver){
		
		 PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath ="//input[@name='hotelName']")
	public WebElement Hname;
	
	@FindBy(xpath ="//form[@id='registerForm']//div[2]//input")
	public WebElement Fullname;
	
	@FindBy(xpath ="//form[@id='registerForm']//div[3]//input")
	public WebElement email;
	
	@FindBy(name="countryCode")
	public WebElement drpcountry;
	
	@FindBy(name="stateCode")
    public WebElement drpState;
	
	@FindBy(xpath ="//input[@name='phone']")
	public WebElement phone;
	
	@FindBy(linkText="SUBMIT")
	public WebElement subbtn;
	
	
	public void SetHotelName(String StrHotelName)
	{
		Hname.sendKeys(StrHotelName);
	}
	
	public void SetFullName(String StrFullName)
	{
		Fullname.sendKeys(StrFullName);
	}
	
	public void SetEmail(String StrEmail)
	{
		email.sendKeys(StrEmail);
	}
	
	public void SelectCountry()
	{
		drpcountry.click();
	}
	
	public void SelectState()
	{
	
	drpState.click();
   }
	
	//public void SetPhone(int i){
	//	phone.sendKeys(i);
	//}
	
	
	public void fn_SubmitButton() throws Exception{
		try
		{
		//GenericMethods gm = new GenericMethods();
			//GenericMethods
			
			GenericMethods.fn_provideObj().fn_click(subbtn);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	
	
	
			
	}
}
