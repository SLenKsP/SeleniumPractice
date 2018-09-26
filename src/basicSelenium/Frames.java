package basicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frames extends callWebDriver
{
	
	@BeforeTest
	public void enter()
	{
		launch();
	}
	
	
	@Test
	protected void findFrames()
	{
		
		
		driver.navigate().to("http://jqueryui.com/draggable/");
		
		//find all available frames
		
		List<WebElement> frames= driver.findElements(By.tagName("iframe"));
		
		System.out.println("total number of frames: "+frames.size());
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("draggable"));
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[contains(text(),'Download')]")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@AfterTest
	public void end()
	{
		exit();
	}
}
