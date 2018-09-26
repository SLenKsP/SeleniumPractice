package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseActivities 
{
	
	@Test (priority=1)
	public void mouseHover()
	{	
		Actions act= new Actions(callWebDriver.driver);
		WebElement element= callWebDriver.driver.findElement(By.xpath(" //a[@class='a-level-1'][contains(text(),'Golf Clubs')]"));
		act.moveToElement(element).build().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		callWebDriver.driver.findElement(By.partialLinkText("Putters")).click();
		
	}
	
	@Test (priority=2)
	public void rightClick()
	{
		
		WebElement element2=callWebDriver.driver.findElement(By.xpath("//a[@title='Golf Clubs']"));
		Actions act= new Actions(callWebDriver.driver);
		act.contextClick(element2).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
	@BeforeTest
	public void launch()
	{
		callWebDriver launch= new callWebDriver();
		launch.launch();
	}

	@BeforeTest
	public void setup()
	{
		callWebDriver.driver.navigate().to("https://www.americangolf.co.uk/");

	}
	
	@AfterTest
	public void exit()
	{
		callWebDriver exit= new callWebDriver();
		exit.exit();
	}
	
	
	
}
