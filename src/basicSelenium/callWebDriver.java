package basicSelenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class callWebDriver 
{
		public static WebDriver driver;
	
	@BeforeClass
	public void launch()
	{
		//below 4 lines of code will disable the notification services for vising chrome
		Map<String, Object> prefs= new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options= new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		/*//trusting SSL certificate
		DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);*/
		
		System.setProperty("webdriver.chrome.driver","/Users/sagarpatel/eclipse-workspace/Selenium/chromedriver");
		
		driver= new ChromeDriver(options);
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void exit()
	{
		driver.quit();
	}
	
	public void screenShot()
	{
		{
	        Date d = new Date();
	        System.out.println(d.toString());

	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");   
	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        // Now you can do whatever you need to do with it, for example copy somewhere
	        try {
				FileUtils.copyFile(scrFile, new File("/Users/sagarpatel/eclipse-workspace/SS/"+sdf.format(d)+".png"));
			} catch (IOException e) {
				e.printStackTrace();
			}

	    }
	}

}
