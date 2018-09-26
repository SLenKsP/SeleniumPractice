package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mylibrary.ScreenShot;

public class Checkbox extends callWebDriver
{

	
	//@Test (priority= 2)
	public void checkBoxSelect()
	{
		//find checkBox milk and select
		WebElement checkbox1= driver.findElement(By.xpath("//input[@value='Milk']"));
		System.out.println(checkbox1.getAttribute("value"));
		checkbox1.click();
		
		//find checkbox Cheese and select
		WebElement checkbox2= driver.findElement(By.xpath(" //input[@value='Cheese']"));
		System.out.println(checkbox2.getAttribute("value"));
		checkbox2.click();

	}
	
	//@BeforeTest
	public void enterWeb()
	{
		launch();
	}
	
	//@AfterTest
	public void tearDown()
	{
		exit();
	}
	
	//@BeforeMethod
	public void testSetup()
	{
		//go to the website
		
		driver.navigate().to("http://www.echoecho.com/htmlforms09.htm");
			
		ScreenShot.ScreenCapture(driver, "checkBox");
		
	}
	


}
