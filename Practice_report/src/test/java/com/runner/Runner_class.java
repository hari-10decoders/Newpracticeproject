package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\com\\feature",
glue ="stepDef" ,plugin = {"html:Report/HtmlReport.html"}
,monochrome = true )

public class Runner_class {

	public static WebDriver driver;
	
	@BeforeClass
	public static void driverSetup() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\10Decoders\\Decoder_new\\Practice_report\\driver\\chromedriver.exe");
	
	driver = new ChromeDriver();
	}
	@AfterClass
	public static void teardown() {
		driver.close();
	}
	
	
	
}
