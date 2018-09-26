package basicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mylibrary.RetryCase;
import mylibrary.Utility;

public class SelectDateFromDatePicker extends callWebDriver {
	
	@Test
	public void checkbuses() throws InterruptedException {
		driver.navigate().to("https://www.redbus.in");

		/*Utility.isElementPresnt(driver, "//input[@id='src']", 20).sendKeys("Ahmedabad");

		Utility.isElementPresnt(driver, "//input[@id='dest']", 20).sendKeys("Mumbai");*/
		
		WebElement fromCity= driver.findElement(By.xpath("//input[@id='src']"));
		fromCity.sendKeys("Ahmedabad");
		Thread.sleep(1000);
		fromCity.sendKeys(Keys.TAB);
		
		WebElement destination= driver.findElement(By.xpath("//input[@id='dest']"));
		destination.sendKeys("Mumbai");
		Thread.sleep(1000);
		destination.sendKeys(Keys.TAB);

		// This logic will select date for staring journey

		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();

		/*
		 * List<WebElement> dates= driver.findElements(By.xpath(
		 * "//div[@id=\"rb-calendar_onward_cal\"]/table[1]//td")); int totalvalues=
		 * dates.size();
		 */

		/*
		 * dates.get(2).click();
		 * 
		 * List<WebElement> dates2= driver.findElements(By.xpath(
		 * "//div[@id=\"rb-calendar_onward_cal\"]/table[1]//td"));
		 * 
		 * dates2.get(25).click();
		 */
		int k = 0;

		while (k < 2) {
			List<WebElement> dates = driver
					.findElements(By.xpath("//div[@id=\"rb-calendar_onward_cal\"]/table[1]//td"));
			int totalvalues = dates.size();

			for (int i = 0; i < totalvalues; i++) {
				String value = dates.get(i).getText();

				if (value.equals(">")) {
					dates.get(i).click();

					Thread.sleep(1000);

					break;
				}

			}
			k++;
		}

		List<WebElement> dates2 = driver.findElements(By.xpath("//div[@id=\"rb-calendar_onward_cal\"]/table[1]//td"));

		int totalvalues2 = dates2.size();

		for (int i = 0; i < totalvalues2; i++) {
			String value2 = dates2.get(i).getText();

			if (value2.equals("25")) {
				dates2.get(i).click();

				Thread.sleep(1000);

				break;
			}

		}

		// for selecting return date

		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-return-calendar icon']")).click();

		while (k < 3) {
			List<WebElement> returnDates = driver
					.findElements(By.xpath("//div[@id=\"rb-calendar_return_cal\"]/table[1]//td"));
			int totalReturnValues = returnDates.size();

			for (int i = 0; i < totalReturnValues; i++) {
				String value = returnDates.get(i).getText();

				if (value.equals(">")) {
					returnDates.get(i).click();

					Thread.sleep(1000);

					break;
				}

			}
			k++;
		}

		List<WebElement> returnDates2 = driver
				.findElements(By.xpath("//div[@id=\"rb-calendar_return_cal\"]/table[1]//td"));

		int totalReturnValues2 = returnDates2.size();

		for (int i = 0; i < totalReturnValues2; i++) {
			String value2 = returnDates2.get(i).getText();

			if (value2.equals("25")) {
				returnDates2.get(i).click();

				Thread.sleep(1000);

				break;
			}

		}
		

		Thread.sleep(2000);

		WebElement searchButton= driver.findElement(By.id("search_btn"));
		searchButton.click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());

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
