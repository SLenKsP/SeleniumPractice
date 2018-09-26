package basicSelenium;

public class InheritanceTest extends callWebDriver
{
	/*@BeforeTest
	public void enter()
	{
		launch();
	}*/
	
	
	protected void inherit()
	{
		driver.navigate().to("http://google.com");
		
	}
	
	/*@AfterTest
	public void end()
	{
		exit();
		
	}*/
}
