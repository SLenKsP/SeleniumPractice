package basicSelenium;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class SetProxy 
{
	@Test
	public void setHTTPProxy()
	{
		Proxy p= new Proxy();
		

		p.setHttpProxy("localHost:8081");

		p.setHttpProxy("localHost:8888");

		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(CapabilityType.PROXY, p);
		
		System.setProperty("webdriver.chrome.driver","/Users/sagarpatel/eclipse-workspace/Selenium/chromedriver");
		
		WebDriver driver= new ChromeDriver(cap);

		
		

 	}
}
