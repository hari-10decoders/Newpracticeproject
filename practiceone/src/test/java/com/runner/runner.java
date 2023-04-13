package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature",glue="com.step")
public class runner {

//	public static WebDriver driver;
//	 @BeforeClass
//	public static void setup() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\10Decoders\\eclipse-workspace\\practiceone\\driver\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//	 		
//	}
//	
//	@AfterClass
//	public static void teardown() {
//       driver.close();
//	}
}
