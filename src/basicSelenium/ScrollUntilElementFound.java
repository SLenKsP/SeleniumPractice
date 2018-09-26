package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import mylibrary.RetryCase;


public class ScrollUntilElementFound extends callWebDriver
{
	@Test (retryAnalyzer= RetryCase.class)
	public void scrollUntilElement()
	{
		driver.navigate().to("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		JavascriptExecutor je= (JavascriptExecutor)driver;
		
		WebElement element= driver.findElement(By.xpath("//textarea[contains(text(),'textarea')]"));
		
		je.executeScript("arguments[0].scrollIntoView(true);", element);
		
		System.out.println(element.getText());
	}

}
