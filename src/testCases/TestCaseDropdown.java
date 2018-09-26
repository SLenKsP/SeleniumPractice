package testCases;

import basicSelenium.DropDown;

public class TestCaseDropdown 
{
	public void step1_Launch()
	{
		DropDown launch= new DropDown();
		launch.launch();
	}
	
	public void step2_Setup()
	{
		DropDown set= new DropDown();
		set.testSetup();
	}
	
	public void step3_DropDownList()
	{
		DropDown select= new DropDown();
		select.dropDownSelection();
	}
	
	public void step4_SignUp()
	{
		DropDown signup= new DropDown();
		signup.pressSignUp();
	}
	
	public void lastStep_Exit()
	{
		DropDown exit= new DropDown();
		exit.exit();
	}

}
