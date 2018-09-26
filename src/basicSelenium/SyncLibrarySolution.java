package basicSelenium;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mylibrary.RetryCase;
import mylibrary.Utility;

public class SyncLibrarySolution extends callWebDriver
{
	@Test 
	public void checkbuses()
	{
		driver.navigate().to("https://www.redbus.in");
		
		Utility.isElementPresnt(driver, ".//*[@id='txtSource']", 20).sendKeys("Ahmedabad");
		
		Utility.isElementPresnt(driver, ".//*[@id='txtDestination']", 20).sendKeys("Mumbai");
		
		
	}
	
	@BeforeTest
	public void launch()
	{
		callWebDriver launch= new callWebDriver();
		launch.launch();
	}
	
	@AfterTest
	public void exit()
	{
		callWebDriver exit= new callWebDriver();
		exit.exit();
	}
	

}
