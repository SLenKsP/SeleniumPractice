package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HighlightElement extends callWebDriver
{
	@Test
	public void highlight()
	{
		driver.get("http://www.facebook.com");
		
		JavascriptExecutor je= (JavascriptExecutor)driver;
		
		WebElement element= driver.findElement(By.id("email"));
		
		//je.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element); //This will change field background and border colors
		
		je.executeScript("arguments[0].setAttribute('style','border: 2px solid red');", element); //will change only border color
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
