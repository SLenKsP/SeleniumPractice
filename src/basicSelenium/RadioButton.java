package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButton 
{
	static WebDriver driver;
	
	@Test (priority= 2)
	public void radioButtonSelect()
	{
		//find button cheese and select
		WebElement button= driver.findElement(By.xpath("//input[@value='Cheese']"));
		System.out.println(button.getAttribute("value"));
		button.click();
		
		//find button beer and select
		WebElement button2= driver.findElement(By.xpath(" //input[@value='Beer']"));
		System.out.println(button2.getAttribute("value"));
		button2.click();

	}
	
	@BeforeTest
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","/Users/sagarpatel/eclipse-workspace/Selenium/chromedriver");
		
		driver= new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void exit()
	{
		driver.quit();
	}
	
	@Test (priority=1)
	public void testSetup()
	{
		//go to the website
		
		driver.navigate().to("http://www.echoecho.com/htmlforms10.htm");
	}

}
