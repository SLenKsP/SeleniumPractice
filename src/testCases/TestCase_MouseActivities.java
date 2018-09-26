package testCases;

import basicSelenium.MouseActivities;

public class TestCase_MouseActivities 
{
	public void step1_launch()
	{
		MouseActivities launch= new MouseActivities();
		launch.launch();
	}
	
	public void step2_setup()
	{
		MouseActivities set= new MouseActivities();
		set.setup();
	}
	
	public void step3_mouseHover()
	{
		MouseActivities mousehover= new MouseActivities();
		mousehover.mouseHover();
	}
	
	public void step4_rightClick()
	{
		MouseActivities rightclick=  new MouseActivities();
		rightclick.rightClick();
	}
	
	public void lastStep_exit()
	{
		MouseActivities exit= new MouseActivities();
		exit.exit();
	}

}
