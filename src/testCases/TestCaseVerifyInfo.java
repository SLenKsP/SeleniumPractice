package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basicSelenium.verifyPageInfo;

public class TestCaseVerifyInfo 
{

	@BeforeTest
	public void step1_launch()
	{
		verifyPageInfo launch= new verifyPageInfo();
		
		launch.launchWeb();
	}
	
	@Test (priority=1)
	public void step2_verifyPageInfo()
	{
		verifyPageInfo pageInfo= new verifyPageInfo();
		
		pageInfo.verifyInfo();
	}
	
	@Test (priority=2)
	public void step3_findElementOnthePage()
	{
		verifyPageInfo eles= new verifyPageInfo();
		
		eles.findElements();
	}
	
	@AfterTest
	public void lastStep_exit()
	{
		verifyPageInfo exit= new verifyPageInfo();
		
		exit.exitWeb();
	}
}
