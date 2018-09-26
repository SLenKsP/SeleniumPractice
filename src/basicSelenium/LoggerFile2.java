package basicSelenium;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerFile2 extends callWebDriver
{
	

	public static void main(String[] args)
	{
		callWebDriver run= new callWebDriver();
		
		Logger logger = Logger.getLogger("mylogfile");
		
		PropertyConfigurator.configure("/Users/sagarpatel/eclipse-workspace/SeleniumPractice/src/basicSelenium/log4j.properties");
		
		run.launch();
		
		logger.info("Launching browser");
		
		driver.navigate().to("http://www.garmin.com");
		
		logger.info("Opening Garmin main WebPage");
		
		run.exit();
		
		logger.info("Closing browser");
		
	}
	

}
