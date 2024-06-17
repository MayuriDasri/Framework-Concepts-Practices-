package TestNGListnersDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginListner {
	
	public WebDriver driver=null;
	
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		//myAccountDropMenu
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		//loginOption
		driver.findElement(By.linkText("Login")).click();
		
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		if(driver!=null)
			driver.quit();
	}
	
	@Test
	public void loginWithValidCredentials()
	{
		
	}
	
	@Test
	public void loginWithoutCredentials()
	{
		
	}
	
	@Test
	public void loginWithInvalidCredentials()
	{
		
	}
	
	@Test
	public void loginWithInvalidEmailAndValidPassword()
	{
		
	}
	
	@Test
	public void loginWithvalidEmailAndInvalidPassword()
	{
		
	}
	
	
	
	

}
