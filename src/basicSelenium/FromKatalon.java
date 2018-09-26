package basicSelenium;


	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

	public class FromKatalon {
	  private WebDriver driver;
	  //private String baseUrl;

	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception 
	  {
		System.setProperty("webdriver.chrome.driver","/Users/sagarpatel/eclipse-workspace/Selenium/chromedriver");
		
	    driver = new ChromeDriver();
	    //baseUrl = "https://www.katalon.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testCase1()
	  {
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("katalon");
	    driver.findElement(By.id("pass")).click();
	    driver.findElement(By.id("pass")).clear();
	    driver.findElement(By.id("pass")).sendKeys("katalon");
	    driver.findElement(By.id("u_0_2")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Facebook © 2018'])[1]/following::div[4]")).click();
	    driver.close();
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() 
	  {
	    driver.quit();
	 
	  }
	}

