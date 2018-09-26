package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import basicSelenium.ScrollUntilElementFound;

public class TestCase_ScrollUntilElementVisible extends ScrollUntilElementFound
{
	
	@BeforeClass
	public void step1_enterWeb()
	{
		launch();
	}
	@Test
	public void step2_scrollUntilElementIsVisible()
	{
		scrollUntilElement();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public void lastStep_ExitWeb()
	{
		exit();
	}

}
