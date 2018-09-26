package testCases;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basicSelenium.Checkbox;

public class TestCase_CheckBox extends Checkbox
{
	/*@BeforeTest	
	public void step1_launch()
	{
		Checkbox launch= new Checkbox();
		launch.launch();
	}*/
	
	@BeforeMethod
	public void step2_Setup()
	{
		Reporter.log("Browser session started", true);
		
		Checkbox set= new Checkbox();
		set.testSetup();	
		
		Reporter.log("Application started", true);
	}
	
	@Test
	public void step3_checkBoxSelect()
	{
		Checkbox select= new Checkbox();
		select.checkBoxSelect(); 
		
		Reporter.log("Application ended", true);
	}
	
	/*@AfterMethod
	public void lastStep_exit()
	{
		Checkbox exit= new Checkbox();
		exit.exit();	
		
		Reporter.log("Browser session end", true);
	}*/

}
