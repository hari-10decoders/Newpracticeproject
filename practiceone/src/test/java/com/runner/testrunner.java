package com.runner;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Baseclass.base_Class;
import PageObjectClass.PageObjec_class;
import PageObjectClass.Pom_class1;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testrunner extends base_Class {

	public static WebDriver driver;
	public static PageObjec_class obj;

	public static Pom_class1 pom = new Pom_class1(driver);

	@Given("^I Launch the web application$")
	public void i_Launch_the_web_application() {
		driver = getbrowser("chrome");
		driver.manage().window().maximize();
	}

	@When("^I launch the automation practice website$")
	public void i_launch_the_automation_practice_website() throws Throwable {
		GetUrl("https://rahulshettyacademy.com/AutomationPractice/");
	}

	@When("^Click the Radio Option-One on Radio field$")
	public void click_the_Radio_Option_One_on_Radio_field() throws Throwable {
		obj = new PageObjec_class(driver);
		obj.getRadioOne().click();
	}

	public void I_Click_on_Radio_option2() {

		ClickOnElement(obj.getRadioTwo());
	}

	public void I_Click_on_Radio_option3() {
		ClickOnElement(obj.getRadioThree());
	}

	@Then("^I enter the country name in country name field$")
	public void i_enter_the_country_name_in_country_name_field() throws Throwable {
		Sendkeys(obj.getCountry(), "india");
	}

	@When("^I click the Dropdown in Options and select the field$")
	public void i_click_the_Dropdown_in_Options_and_select_the_field() throws Throwable {
		obj.getOption1();
	}

	@When("^I click the Dropdown in Options and select the OptionOne$")
	public void i_click_the_Dropdown_in_Options_and_select_the_OptionOne() throws Throwable {
		ClickOnElement(obj.getOption1());
	}

	@When("^I click the Dropdown in Options and select the Optiontwo$")
	public void i_click_the_Dropdown_in_Options_and_select_the_Optiontwo() throws Throwable {
		ClickOnElement(obj.getOption2());
	}

	@Then("^I click the Dropdown in Options and select the Optionthree$")
	public void i_click_the_Dropdown_in_Options_and_select_the_Optionthree() throws Throwable {
		ClickOnElement(obj.getOption3());
	}

	@When("^I click the OptionOne checkbox in Options checkbox field$")
	public void i_click_the_OptionOne_checkbox_in_Options_checkbox_field() throws Throwable {
		ClickOnElement(obj.getCheckbox1());
	}

	@When("^I click the Optiontwo checkbox in Options checkbox field$")
	public void i_click_the_Optiontwo_checkbox_in_Options_checkbox_field() throws Throwable {
		ClickOnElement(obj.getCheckbox2());
	}

	@Then("^I click the Optionthree checkbox in Options checkbox field$")
	public void i_click_the_Optionthree_checkbox_in_Options_checkbox_field() throws Throwable {
		ClickOnElement(obj.getCheckbox3());
	}

	@When("^I click on open window button$")
	public void i_click_on_open_window_button() throws Throwable {
		pom = new Pom_class1(driver);
		ClickOnElement(pom.getNew_window());

	}

	@When("^I need to switch to new window$")
	public void i_need_to_switch_to_new_window() throws Throwable {
		switchto_child();

	}

	@Then("^I close the child Window$")
	public void i_close_the_child_Window() throws Throwable {
		driver.navigate().refresh();

	}

	@When("^I click on open tab button$")
	public void i_click_on_open_tab_button() throws Throwable {
		ClickOnElement(pom.getNewtab());

	}

	@When("^I need to switch to new tab$")
	public void i_need_to_switch_to_new_tab() throws Throwable {
		switchto_child();

	}

	@Then("^I close the child Window$")
	public void i_close_the_child_tab() throws Throwable {
		driver.navigate().refresh();
	}

	@When("^I enter the text in alert field$")
	public void i_enter_the_text_in_alert_field() throws Throwable {
		Sendkeys(pom.getAlertfiedl(), "javatest");
	}

	@When("^I click on confirm button$")
	public void i_click_on_confirm_button() throws Throwable {
		ClickOnElement(pom.getAlert_button());
	}

	@Then("^I click on ok on alert popup$")
	public void i_click_on_ok_on_alert_popup() throws Throwable {
		simple_alert();
	}

	@When("^I enter the text in alert field1$")
	public void i_enter_the_text_in_alert_field1() throws Throwable {
		JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,1000)");	
		Sendkeys(pom.getAlertfiedl(), "javatest");
	}

	@And("^I click the confirm alert button  $")
	public void i_click_the_confirm_alert_button() throws Throwable {
		ClickOnElement(pom.getConfirm_alert_button());
	}

	@And("^I able to swith to alert and click popups $")
	public void i_able_to_swith_to_alert_and_click_popup() throws Throwable {
		simple_alert();
		
	}
	
	@Then("^Get course details for jmeter$")
    public void get_course_details_for_jmeter() throws Throwable {
		ClickOnElement(pom.getTable());
		System.out.println(pom.getTable().getText());
		
    }

    @And("^Get \"([^\"]*)\" city name selection data  $")
    public void get_something_city_name_selection_data() throws Throwable {
    	
	ClickOnElement(pom.getPosion_table());
	Dynamic_tables();
    }

    @When("^I click on hide button$")
    public void i_click_on_hide_button() throws Throwable {
    	ClickOnElement(pom.getHide_Button());
    }

    @When("^I click on Show button$")
    public void i_click_on_show_button() throws Throwable {
    	ClickOnElement(pom.getShow_Button());
    }

    @When("^I click reload on mouse hover button 	$")
    public void i_click_reload_on_mouse_hover_button() throws Throwable {
    	ClickOnElement(pom.getMousehover());
    }

    @When("^I switch to iframe$")
    public void i_switch_to_iframe_and_click_the_home_gettex() throws Throwable {
    	Iframe();
    }
   
    @And("^Switch to main content$")
    public void switch_to_main_content() throws Throwable {
    	iframe_defaultcontent();
    	closedriver();
    }

	public static void main(String[] args) throws Throwable {
		testrunner t = new testrunner();
		t.i_Launch_the_web_application();
		t.i_launch_the_automation_practice_website();
		
		t.click_the_Radio_Option_One_on_Radio_field();
		t.I_Click_on_Radio_option2();
		t.I_Click_on_Radio_option3();
		
		t.i_enter_the_country_name_in_country_name_field();
		
		t.i_click_the_Dropdown_in_Options_and_select_the_field();
		t.i_click_the_Dropdown_in_Options_and_select_the_OptionOne();
		t.i_click_the_Dropdown_in_Options_and_select_the_Optiontwo();
		t.i_click_the_Dropdown_in_Options_and_select_the_Optionthree();
		
		t.i_click_the_OptionOne_checkbox_in_Options_checkbox_field();
		t.i_click_the_Optiontwo_checkbox_in_Options_checkbox_field();
		t.i_click_the_Optionthree_checkbox_in_Options_checkbox_field();
		
		t.i_click_on_open_window_button();
		t.i_need_to_switch_to_new_window();
		t.i_close_the_child_Window();
		t.i_click_on_open_tab_button();
		t.i_need_to_switch_to_new_tab();
		t.i_close_the_child_tab();

		t.i_enter_the_text_in_alert_field();
		t.i_click_on_confirm_button();
		t.i_click_on_ok_on_alert_popup();
		t.i_enter_the_text_in_alert_field1();
		t.i_click_the_confirm_alert_button();
		t.i_click_on_ok_on_alert_popup();
		
		t.get_course_details_for_jmeter();
		t.get_something_city_name_selection_data();
		
		t.i_click_on_hide_button();
		t.i_click_on_show_button();
		t.i_click_reload_on_mouse_hover_button();
		t.i_switch_to_iframe_and_click_the_home_gettex();
		t.switch_to_main_content();
		}
}
