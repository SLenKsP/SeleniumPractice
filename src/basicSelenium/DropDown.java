package basicSelenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDown 
{
	static WebDriver driver;
	
	@Test (priority= 2)
	public void dropDownSelection()
	{
		//find month dropdown
		WebElement monthDropDown= driver.findElement(By.id("month"));

		//find days
		WebElement dayDropDown= driver.findElement(By.id("day"));

		// find years
		WebElement yearDropDown= driver.findElement(By.id("year"));

		//select month
		Select month= new Select(monthDropDown);
		int totalMonths= month.getOptions().size();
		System.out.println("total number of months: "+totalMonths);
		for(int i=0; i<totalMonths; i++)
		{	
			month.selectByIndex(i);
		}
		
		//Select Day
		Select day= new Select(dayDropDown);
		int totalDays= day.getOptions().size();
		System.out.println("total number of days: "+ totalDays);
		for(int i= 1; i<totalDays; i++)
		{
			day.selectByIndex(i);
		}
		
		Select year= new Select(yearDropDown);
		int totalYears= year.getOptions().size();
		System.out.println("Total number of years: "+ totalYears);
		year.selectByValue("1985");
		
		//select gender radio button
		driver.findElement(By.xpath("//input[@type='radio'][@value='2']")).click();

	}
	
	@Test (priority= 3)
	public void pressSignUp()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
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
		
		driver.navigate().to("http://www.facebook.com");
		
		//type name
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Selenium");
	}

}
