package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basicSelenium.InheritanceTest;

public class TestCase_Inheritance extends InheritanceTest
{

	@BeforeTest
	public void step1_enterweb()
	{
		launch();
	}
	
	@Test
	public void step2_setup()
	{
		inherit();
	}
	
	@AfterTest
	public void lastStep_exitWeb()
	{
		exit();
	}
}
