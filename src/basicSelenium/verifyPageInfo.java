package basicSelenium;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class verifyPageInfo 
{
	public static WebDriver driver;
	
	@Test (priority= 1)
	public void verifyInfo()
	{
		
		driver.get("http://google.com");
		//get current url
		String currentUrl= driver.getCurrentUrl();
		System.out.println("Current Url is: "+ currentUrl);
		
		//get page title
		String pageTitle= driver.getTitle();
		System.out.println("Title of this page is: "+ pageTitle);
	}
	
	@Test (priority= 2)
	public void findElements()
	{
		//find element by name
		WebElement elementName= driver.findElement(By.name("q"));
		System.out.println(elementName.getText());
		
		//find element by tagname
		WebElement elementTag= driver.findElement(By.tagName("img"));
		System.out.println(elementTag.getText());
		
		//find element by xpath
		WebElement elementXpath= driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
		System.out.println(elementXpath.getText());
		
		
	}
	
	@BeforeTest
	public void launchWeb()
	{
		//set chromepath
		System.setProperty("webdriver.chrome.driver","/Users/sagarpatel/eclipse-workspace/Selenium/chromedriver");
		
		driver= new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void exitWeb()
	{
		driver.quit();
	}
	

}
