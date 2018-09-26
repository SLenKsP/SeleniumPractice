package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basicSelenium.Alerts;

public class TestCase_Alerts extends Alerts
{
	@BeforeTest
	public void step1_launch()
	{
		launch();
	}
	
	@Test
	public void step2_Alerts()
	{
		testAlert();
	}
	
	@AfterTest
	public void lastStep_exit()
	{
		exit();
	}

}
