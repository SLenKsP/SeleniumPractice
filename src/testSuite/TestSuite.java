package testSuite;

import org.testng.annotations.Test;


import testCases.TestCaseDragAndDrop;
import testCases.TestCaseDropdown;
import testCases.TestCaseRadioButton;
import testCases.TestCaseVerifyInfo;
import testCases.TestCase_Alerts;
import testCases.TestCase_CheckBox;
import testCases.TestCase_ExplicitWait;
import testCases.TestCase_HandleCalendar;
import testCases.TestCase_Inheritance;
import testCases.TestCase_MouseActivities;
import testCases.TestCase_MultipleWindows;
import testCases.TestCase_ScrollUntilElementVisible;
import testCases.TestCase_VerifyErrorText;



public class TestSuite 
{
	@Test (priority=1)
	public void testCase1_VerifyInfo()
	{
		TestCaseVerifyInfo run= new TestCaseVerifyInfo();
		
		run.step1_launch();
		run.step2_verifyPageInfo();
		run.step3_findElementOnthePage();
		run.lastStep_exit();
		
	}
	
	@Test(priority=2)
	public void testCase2_RadioButton()
	{
		TestCaseRadioButton run= new TestCaseRadioButton();
		
		run.step1_launch();
		run.step2_Setup();
		run.step3_RadioButtonSelection();
		run.lastStep_exit();
	}
	
	@Test(priority=3)
	public void testCase3_CheckBox()
	{
		TestCase_CheckBox run= new TestCase_CheckBox();
		
		//run.step1_launch();
		run.step2_Setup();
		run.step3_checkBoxSelect();
		//run.lastStep_exit();
	}
	
	@Test(priority=4, enabled= false)
	public void testCase4_DropDown()
	{
		TestCaseDropdown run= new TestCaseDropdown();
		
		run.step1_Launch();
		run.step2_Setup();
		run.step3_DropDownList();
		run.step4_SignUp();
		run.lastStep_Exit();
	}
	
	@Test(priority=5)
	public void testCase5_DragDrop()
	{
		TestCaseDragAndDrop run= new TestCaseDragAndDrop();
		
		run.step1_Launch();
		run.step2_Setup();
		run.step3_DragDrop();
		run.lastStep_Exit();
		
	}
	
	@Test (priority=6, enabled= false)
	public void testCase6_MouseActivities()
	{
		TestCase_MouseActivities run= new TestCase_MouseActivities();
		
		run.step1_launch();
		run.step2_setup();
		run.step3_mouseHover();
		run.step4_rightClick();
		run.lastStep_exit();
	}

	@Test (priority=7, enabled= false)
	public void testCase7_ExplicitWait()
	{
		TestCase_ExplicitWait run= new TestCase_ExplicitWait();
		
		run.step1_launch();
		run.step2_setup();
		run.step3_explicitWaitTest();
		run.lastStep_exit();
	}

	@Test (priority=8, enabled= false)
	public void testCase8_verifyErrorText()
	{
		TestCase_VerifyErrorText run= new TestCase_VerifyErrorText();
		
		run.step1_launch();
		run.step2_setup();
		run.step3_errorText();
		run.lastStep_exit();
	}
	
	@Test (priority= 9, enabled=false)
	public void testCase9_multipleWindows() throws InterruptedException
	{
		TestCase_MultipleWindows run= new TestCase_MultipleWindows();
		
		run.onlyTestStep_multiWindows();
	}
	
	@Test(priority=10)
	public void testCase10_Inherit()
	{
		TestCase_Inheritance run= new TestCase_Inheritance();
		
		run.step1_enterweb();
		run.step2_setup();
		run.lastStep_exitWeb();
	}
	
	@Test (priority=11)
	public void testCase11_Alerts()
	{
		TestCase_Alerts run= new TestCase_Alerts();
		
		run.step1_launch();
		run.step2_Alerts();
		run.lastStep_exit();
	}
	
	@Test (priority=12)
	public void testCase12_HandleCalendar()
	{
		TestCase_HandleCalendar run= new TestCase_HandleCalendar();
		
		run.step1_Enter();
		run.step2_HandleCalendar();
		run.lastStep_Exit();
	}
	
	@Test (priority= 13)
	
	public void testCase13_ScrollUntilElementIsVisible()
	{
		TestCase_ScrollUntilElementVisible run= new TestCase_ScrollUntilElementVisible();
		
		run.step1_enterWeb();
		run.step2_scrollUntilElementIsVisible();
		run.lastStep_ExitWeb();
	}
}
