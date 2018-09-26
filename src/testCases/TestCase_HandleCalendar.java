package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basicSelenium.HandleCalendar;

public class TestCase_HandleCalendar extends HandleCalendar
{
	@BeforeTest
	public void step1_Enter()
	{
		launch();
	}
	
	@Test
	public void step2_HandleCalendar()
	{
		testHandleCalendar();
	}
	
	@AfterTest
	public void lastStep_Exit()
	{
		exit();
	}

}
