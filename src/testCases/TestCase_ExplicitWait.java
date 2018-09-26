package testCases;



import basicSelenium.explicitWait;

public class TestCase_ExplicitWait 
{
	
	public void step1_launch()
	{
		explicitWait launch= new explicitWait();
		launch.launch();
	}
	
	
	public void step2_setup()
	{
		explicitWait set= new explicitWait();
		set.setup();
		
	}
	
	
	public void step3_explicitWaitTest()
	{
		explicitWait wait= new explicitWait();
		wait.explicitwait();
	}
	

	public void lastStep_exit()
	{
		explicitWait exit= new explicitWait();
		exit.exit();
	}

}
