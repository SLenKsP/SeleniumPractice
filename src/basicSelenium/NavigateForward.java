package basicSelenium;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class NavigateForward extends NavigateBack
{
	@Test (priority=2)
	public void navigateForward()
	{
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());;
		
		assertTrue(driver.getTitle().contains("facebook"));
	}
	
}
