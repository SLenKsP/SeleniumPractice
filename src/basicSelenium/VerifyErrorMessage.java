package basicSelenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class VerifyErrorMessage 
{
	@BeforeTest
	public static void launch()
	{
		callWebDriver launch= new callWebDriver();
		launch.launch();
	}
	
	@BeforeTest
	public static void setup()
	{
		callWebDriver.driver.get("http://facebook.com");
	}
	
	@Test
	public static void verifyError()
	{
		callWebDriver.driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		String actual_error= callWebDriver.driver.findElement(By.xpath("//div[@class='_4rbf _53ij']")).getText();
		
		String expect= "The email or phone number you’ve entered doesn’t match any account. Sign up for an account.";
		
		Assert.assertEquals(actual_error, expect);
		
		System.out.println("test Completed");
		
	}
	@AfterTest
	public static void exit()
	{
		callWebDriver exit= new callWebDriver();
		exit.exit();
	}
	
	
}
