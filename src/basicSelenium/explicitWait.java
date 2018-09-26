package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class explicitWait 
{
	
	@Test
	public void explicitwait()
	{
		callWebDriver.driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		WebDriverWait wait= new WebDriverWait(callWebDriver.driver, 20);
		
		WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		
		boolean status= element.isDisplayed();
		
		if(status)
			System.out.println("element is displayed");
		else
			System.out.println("element is not visible");
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
		callWebDriver.driver.navigate().to("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
	}

	@AfterTest
	public void exit()
	{
		callWebDriver exit= new callWebDriver();
		exit.exit();
	}
}
