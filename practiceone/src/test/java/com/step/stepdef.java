package com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.runner.runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class stepdef {
    
//public static WebDriver driver = runner.driver;
	@Given("^User lauch the webapplication$")
	public void user_lauch_the_webapplication() throws Throwable {
//		 driver = new ChromeDriver();
		System.out.println("java");
//	driver.get("https://www.google.com/");	
	}

	@When("^User enter the radio button on radio button field$")
	public void user_enter_the_radio_button_on_radio_button_field() throws Throwable {
//		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("youtube");
		System.out.println("helloworld");
	}


}
