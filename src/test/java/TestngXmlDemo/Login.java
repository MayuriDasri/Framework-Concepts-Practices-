package TestngXmlDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {

	WebDriver driver ;
	@BeforeTest
	public void setup()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
	}
	
	@AfterTest
	public void tearDown()
	{
		if(driver!=null)
			driver.quit();
	}
	@Test
	public void loginWithValidCredentials() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		String pageTitle = driver.getTitle();	
		
		Assert.assertEquals(pageTitle, "Your Store");
		
		
		
	}
}
