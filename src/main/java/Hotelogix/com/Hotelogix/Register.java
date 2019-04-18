package Hotelogix.com.Hotelogix;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Register {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "https://www.hotelogix.com/";
  
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Try For Free")).click();
        driver.findElement(By.xpath("//input[@name='hotelName']")).sendKeys("The Royal"); 
        driver.findElement(By.xpath("//form[@id='registerForm']//div[2]//input")).sendKeys("testing");
        driver.findElement(By.xpath("//form[@id='registerForm']//div[3]//input")).sendKeys("himani.puri@hotelogix.com");
        Select drpCountry = new Select(driver.findElement(By.name("countryCode")));
		drpCountry.selectByVisibleText("American Samoa");
		Select drpState = new Select(driver.findElement(By.name("stateCode")));
		drpState.selectByVisibleText("Manua");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("23213232323");
        driver.findElement(By.linkText("SUBMIT")).click();
        
      
}
}
