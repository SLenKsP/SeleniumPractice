package basicSelenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ErrorCases extends callWebDriver
{
	@Test
	public void compareElement()
	{
		driver.navigate().to("http://facebook.com");
		
		String actual= driver.findElement(By.xpath("//a[contains(text(),'Forgot account?')]")).getText();
		
		System.out.println("Actual element text is: "+ actual);
		
		String expected= "Forgot account?";
		
		Assert.assertEquals(actual, expected);
	}
	
	
}
