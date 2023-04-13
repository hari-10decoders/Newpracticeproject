package com.runner;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dummy {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\10Decoders\\git\\exmaple\\driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement table = driver.findElement(By.xpath("(//table[@id='product'])[2]"));
		String dynamicCity = new String("'Chennai'");
		String customizedXpath = new String(
				"//table[@id='product']/tbody/tr/td[contains(text()," + dynamicCity + ")]/parent::tr");
		List<WebElement> city = driver.findElements(By.xpath(customizedXpath));
		for (WebElement webElement : city) {
			System.out.println(webElement.getText());
		}
		driver.close();
	}

}
