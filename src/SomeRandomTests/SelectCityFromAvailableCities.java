package SomeRandomTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basicSelenium.SelectDateFromDatePicker;
import basicSelenium.callWebDriver;

public class SelectCityFromAvailableCities 
{
		
		SelectDateFromDatePicker datePicker= new SelectDateFromDatePicker();
		
		callWebDriver run= new callWebDriver();
		
		@Test
		public void checkbusestoMumbai() throws InterruptedException {
			
		datePicker.checkbuses();
		
		run.driver.findElement(By.xpath("/html/body/section/div[2]/div/div/div[2]/div[2]/div[2]/ul/li[1]/div/div[2]/div[1]")).click();
		
		Thread.sleep(5000);
		
		Actions act= new Actions(run.driver);
			
		//Adding this for loop to select multiple seats from  available
		//If you want to add just one random seat then just remove for loop and replace line 44 to: act.click(lowerBerth).build().perform();
		for (int i=1; i<7; i++)
		{
			int x= i*45;
			int y= 44;
			
			WebElement lowerBerth= run.driver.findElement(By.xpath("//canvas[@data-type='lower']"));
			
			
			//act.click(lowerBerth).perform();
			act.moveToElement(lowerBerth, x, y).click().perform();
			
			Thread.sleep(1000);
		}
		
		run.driver.findElement(By.xpath("//h3[@class='bp selected']"));
		run.driver.findElement(By.xpath("//div//div[@class='modal-body bp-list']//ul[@class='select-list']//li[1]")).click();
		
		run.driver.findElement(By.xpath("//h3[contains(@class,'dp')]"));
		run.driver.findElement(By.xpath("//div//div[@class='modal-body dp-list']//ul[@class='select-list']//li[1]")).click();
		
		Thread.sleep(1000);
		run.driver.findElement(By.xpath("//button[@class='button continue inactive']")).click();
		
		run.driver.findElement(By.xpath("//input[@id='seatno-04']")).sendKeys("Sagar");
		run.driver.findElement(By.xpath("//input[@id=\"22_0\"]")).click();
		run.driver.findElement(By.xpath("//input[@id='seatno-01']")).sendKeys("50");
		
		
	//	run.driver.switchTo().frame(0);
		
		
	/*		run.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Lower Deck'])[1]/following::canvas[1]")).click();
		    run.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Lower Deck'])[1]/following::canvas[1]")).click();
		    run.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Lower Deck'])[1]/following::canvas[1]")).click();
		    run.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='DROPPING POINT'])[2]/following::li[1]")).click();
		    run.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='NallaSopara Police Chowky NH-8 W.E. Highway'])[1]/following::li[1]")).click();
		    run.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Show Fare Details'])[1]/following::button[1]")).click();*/
		
	
	    
		
	    Thread.sleep(5000);
		
		}	
		
		@BeforeTest
		public void launch() {
			callWebDriver launch = new callWebDriver();
			launch.launch();
		}

		@AfterTest
		public void exit() {
			callWebDriver exit = new callWebDriver();
			exit.exit();
		}

	




}
