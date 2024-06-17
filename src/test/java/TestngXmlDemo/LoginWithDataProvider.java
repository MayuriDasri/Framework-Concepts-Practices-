package TestngXmlDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithDataProvider {

	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccount.click();
		
		WebElement loginOption = driver.findElement(By.xpath("//a[normalize-space()='Login']"));
		loginOption.click();
	}
	
	@AfterTest
	public void tearDown()
	{
		if(driver!=null)
		driver.quit();
	}
		
	@Test(dataProvider = "LoginData")
	public void loginWithValidCredinatals(String emailId, String password)
	{
		WebElement emailField = driver.findElement(By.xpath("//input[@id='input-email']"));
		//emailField.sendKeys("dasrimayuri@gmail.com");
		emailField.sendKeys(emailId);
		
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='input-password']"));
		//passwordField.sendKeys("Mayuri@123");
		passwordField.sendKeys(password);
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();
		
		String expectedTitle = "My Account";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle,"Login Failed");
		
	}
	@DataProvider(name = "LoginData")
	public Object[][] supplyLoginData()
	{
		Object[][]  credentials = {
									{"dasrimayuri@gmail.com", "Mayuri@123"},
									{"amotooricap1@gmail.com ", "12345"}
								   };
		return credentials ;
	}
	

}
