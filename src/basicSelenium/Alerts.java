package basicSelenium;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

	public class Alerts extends callWebDriver
	{
	  
		protected boolean acceptNextAlert = true;


	
	  protected void testAlert() {
	    driver.get("http://www.rediff.com/");
	    
	    driver.findElement(By.linkText("Sign in")).click();
	    driver.findElement(By.name("proceed")).click();
	    
	    assertEquals(closeAlertAndGetItsText(), "Please enter a valid user name");
	    
	    driver.close();
	  }


	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      
	      System.out.println("alert text is: "+ alertText);
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}

