package basicSelenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleMultipleWindows 
{
	@Test
	public static void multipleWindows() throws InterruptedException
	{
		callWebDriver init= new callWebDriver();
		init.launch();
		
		callWebDriver.driver.get("http://www.naukri.com");
		
		//finding parent window
		
		String Parent= callWebDriver.driver.getWindowHandle();
		
		System.out.println("Parent window title: "+ Parent);
		
		Set<String> all_Windows= callWebDriver.driver.getWindowHandles();
		
		ArrayList<String> tabs= new ArrayList<>(all_Windows);
		
		callWebDriver.driver.switchTo().window(tabs.get(2));
		
		callWebDriver.driver.close();
		
		Thread.sleep(2000);
		
		callWebDriver.driver.switchTo().window(tabs.get(1));
		
		callWebDriver.driver.close();
		
		Thread.sleep(2000);
		
		callWebDriver.driver.switchTo().window(Parent);
		
		callWebDriver.driver.findElement(By.xpath("//a[@title='Employer Login']")).click();;
		
		Thread.sleep(2000);
		
		init.exit();
	}
	
	

}
