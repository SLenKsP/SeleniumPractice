package mylibrary;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class ScreenShot 
{
	public static void ScreenCapture(WebDriver driver, String SSname)
    {
        try {
			Date d = new Date();
			System.out.println(d.toString());

        	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");   
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			// Now you can do whatever you need to do with it, for example copy somewhere
			//use the test case name for screenshot file name so you can figure out which test case it belongs to
			
			//FileUtils.copyFile(scrFile, new File("./Screenshot/"+SSname+"_"+sdf.format(d)+".png")); 
			FileHandler.copy(scrFile, new File("./Screenshot/"+SSname+"_"+sdf.format(d)+".png"));
		} 
        catch (Exception e) 
        {
        	System.out.println("Exception while taking screenshot "+e.getMessage());
		} 
    }


}
