package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class HandleCalendar extends callWebDriver
{
	 
	  protected void testHandleCalendar()
	  {
	    driver.get("https://www.expedia.com/");
	    driver.findElement(By.id("package-origin-hp-package")).click();
	    driver.findElement(By.id("package-origin-hp-package")).clear();
	    driver.findElement(By.id("package-origin-hp-package")).sendKeys("mci");
	    driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.DOWN);
	    driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ENTER);
	    driver.findElement(By.id("package-departing-hp-package")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='empty'])[3]/following::button[17]")).click();
	    driver.findElement(By.id("partialHotelBooking-hp-package")).click();
	    driver.findElement(By.id("package-checkin-hp-package")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='empty'])[3]/following::button[19]")).click();
	    driver.findElement(By.id("package-advanced-preferred-class-hp-package")).click();
	    new Select(driver.findElement(By.id("package-advanced-preferred-class-hp-package"))).selectByVisibleText("First class");
	    driver.findElement(By.id("search-button-hp-package")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search Vacation Packages'])[1]/following::div[1]")).click();
	  }

}
