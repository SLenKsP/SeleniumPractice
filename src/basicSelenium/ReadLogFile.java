package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadLogFile
{
	@Test
	public static void readLog() {
	      
	    // Here we need to create logger instance so we need to pass Class name for 
	     //which  we want to create log file in my case Google is classname
	         Logger logger=Logger.getLogger("Google");
	        
	 
	       // configure log4j properties file
	       PropertyConfigurator.configure("/Users/sagarpatel/eclipse-workspace/log4j.properties");
	 
	 
	        // Open browser
	       	System.setProperty("webdriver.chrome.driver","/Users/sagarpatel/eclipse-workspace/Selenium/chromedriver");
	        WebDriver driver = new ChromeDriver();
	        logger.info("Browser Opened");
	      
	        // Set implicit wait
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        logger.info("Implicit wait given");
	      
	 
	        // Load application
	        driver.get("https://www.google.co.in/");
	        logger.info("Url opened");
	      
	 
	        // type Selenium
	        driver.findElement(By.name("q")).sendKeys("Selenium");
	        logger.info("keyword type");        
	        
	        driver.quit();
	        logger.info("Browser closed");
	    }
}
