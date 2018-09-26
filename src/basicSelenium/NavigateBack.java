package basicSelenium;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NavigateBack extends callWebDriver
{
	@Test (priority=1)
	public void navigateBackVerify()
	{
		driver.navigate().to("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("facebook");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		driver.findElement(By.className("lsb")).click();
		
		driver.navigate().back();
		
		assertTrue(driver.getTitle().contains("Google"));
		
		screenShot();
	}

}
