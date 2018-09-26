package testCases;

import basicSelenium.VerifyErrorMessage;

public class TestCase_VerifyErrorText 
{
	public void step1_launch()
	{
		VerifyErrorMessage.launch();
	}
	
	public void step2_setup()
	{
		VerifyErrorMessage.setup();
	}
	
	public void step3_errorText()
	{
		VerifyErrorMessage.verifyError();
	}
	
	public void lastStep_exit()
	{
		VerifyErrorMessage.exit();
	}
}
