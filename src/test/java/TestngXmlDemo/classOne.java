package TestngXmlDemo;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class classOne {
	
	@BeforeTest
	public void setup()
	{
		System.out.println("Setup Method");
	}
	
	@AfterTest
	public void tearDown()
	{
		System.out.println("Quit Method ");
	}
	
	@Test
	public void methodOne()
	{
		int a =10, b=20;
		if(a<b)
			Assert.assertEquals(a,b,"a is Greater than b");
	}
	@Test
	public void methodTwo()
	{
		String myName= "Mayuri";
		String mySurName = "Dasri";
		Assert.assertEquals(myName,mySurName, "Both names are different");
	}
}
