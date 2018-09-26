package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragDrop 
{
	@Test
	public void dragDropElement()
	{
		Actions act= new Actions(callWebDriver.driver);
		
		WebElement drag= callWebDriver.driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement drop= callWebDriver.driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(drag, drop).build().perform();
		
	}

	@BeforeTest
	public void launch()
	{
		callWebDriver launch= new callWebDriver();
		launch.launch();
	}

	@BeforeTest
	public void testSetup()
	{
		callWebDriver.driver.navigate().to("http://jqueryui.com/resources/demos/droppable/default.html");
	}

	@AfterTest
	public void exit()
	{
		callWebDriver exit= new callWebDriver();
		exit.exit();
	}
	
}
