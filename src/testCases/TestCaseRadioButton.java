package testCases;

import basicSelenium.RadioButton;

public class TestCaseRadioButton 
{
	public void step1_launch()
	{
		RadioButton launch= new RadioButton();
		launch.launch();
	}
	
	public void step2_Setup()
	{
		RadioButton set= new RadioButton();
		set.testSetup();	
	}
	
	public void step3_RadioButtonSelection()
	{
		RadioButton select= new RadioButton();
		select.radioButtonSelect();
	}
	
	public void lastStep_exit()
	{
		RadioButton exit= new RadioButton();
		exit.exit();	
	}

}
