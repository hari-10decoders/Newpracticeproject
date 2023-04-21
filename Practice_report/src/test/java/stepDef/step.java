package stepDef;

import java.awt.AWTException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;

import com.runner.Runner_class;

import Base_class_new.Base_class_new;

import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_class.pom_class2;
import pom_class.pom_classNew;

public class step extends Base_class_new {
	public static WebDriver driver = Runner_class.driver;
	public static pom_classNew p = new pom_classNew(driver);
	public static pom_class2 obj = new pom_class2(driver);
	public static Logger log;

	public static String par;
	public static Set<String> allwindow;
	public static List<String> list_1;

	@Given("I launch the automation practice website")
	public void i_launch_the_automation_practice_website() {
		log = LogManager.getLogger(step.class);
		log.info("launch the automation practice WebSite");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}

	@When("Click the Radio Option-One on Radio field")
	public void click_the_radio_option_one_on_radio_field() {
		p.getRadioOne().click();
		log.info("Click the Radio Option-One");
	}

	@When("Click the Radio Option-Two on Radio field")
	public void click_the_radio_option_two_on_radio_field() {
		p.getRadioOne().click();
		log.info("Click the Radio Option-Two");
	}

	@Then("Click the Radio Option-Three on Radio field")
	public void click_the_radio_option_three_on_radio_field() {
		p.getRadioThree().click();
		log.info("Click the Radio Option-Three");
	}

	@When("I click the select country field")
	public void i_click_the_select_country_field() {
		p.getCountry().click();
		log.info("click the select country field");
	}

	@Then("I enter the country name in country name field")
	public void i_enter_the_country_name_in_country_name_field() {
		p.getCountry().sendKeys("ind");
		log.info("enter the country name");
	}

	@When("I click the Dropdown in Options and select the OptionOne")
	public void i_click_the_dropdown_in_options_and_select_the_option_one() {
		p.getOption1().click();
		log.info("Select the option-one in DropDown field");
	}

	@When("I click the Dropdown in Options and select the Optiontwo")
	public void i_click_the_dropdown_in_options_and_select_the_optiontwo() {
		p.getOption2().click();
		log.info("Select the option-two in DropDown field");
	}

	@Then("I click the Dropdown in Options and select the Optionthree")
	public void i_click_the_dropdown_in_options_and_select_the_optionthree() {
		p.getOption3().click();
		log.info("Select the option-three in DropDown field");
	}

	@When("I click the OptionOne checkbox in Options checkbox field")
	public void i_click_the_option_one_checkbox_in_options_checkbox_field() {
		p.getCheckbox1().click();
		log.info("Click the Check Box Option One");
	}

	@When("I click the Optiontwo checkbox in Options checkbox field")
	public void i_click_the_optiontwo_checkbox_in_options_checkbox_field() {
		p.getCheckbox2().click();
		log.info("Click the Check Box Option Two");
	}

	@Then("I click the Optionthree checkbox in Options checkbox field")
	public void i_click_the_optionthree_checkbox_in_options_checkbox_field() {
		p.getCheckbox3().click();
		log.info("Click the Check Box Option Three");
	}

	@When("I click on open window button")
	public void i_click_on_open_window_button() throws InterruptedException, AWTException {
		driver.findElement(By.id("openwindow")).click();
		par = driver.getWindowHandle();
		allwindow = driver.getWindowHandles();
		list_1 = new ArrayList<String>();
		list_1.addAll(allwindow);
		log.info("click on open window button");
	}

	@When("I need to switch to the child Window and close window")
	public void i_need_to_switch_to_the_child_window_and_close_window() {
		driver.switchTo().window(list_1.get(1)).close();
		System.out.println("Close the child window");
		log.info("Successfully to switch to the New Window ");
	}

	@Then("I switch to parent window")
	public void i_switch_to_parent_window() {
		driver.switchTo().window(list_1.get(0));
		System.out.println("switch to parent");
		log.info("Successfully to switch to the Parent Window ");
	}

	@When("I click on open tab button")
	public void i_click_on_open_tab_button() {
		driver.findElement(By.id("opentab")).click();
		par = driver.getWindowHandle();
		allwindow = driver.getWindowHandles();
		list_1 = new ArrayList<String>();
		list_1.addAll(allwindow);
		log.info("click on open tab button");
	}

	@When("I need to switch to tab")
	public void i_need_to_switch_to_tab() {
		System.out.println("Switch to childtab");
		driver.switchTo().window(list_1.get(1));
		log.info("Able to switch to tab");
	}

	@Then("I close the child tab and switch to parent tab")
	public void i_close_the_child_tab_and_switch_to_parent_tab() {
		System.out.println("close the childtab");
		driver.close();
		driver.switchTo().window(list_1.get(0));
		System.out.println("Swtich to parenttab");
		log.info("Close the New Tab and able to switch to parent tab");
	}

	@When("I click the alert button")
	public void i_click_the_alert_button() {
		driver.findElement(By.id("alertbtn")).click();
		log.info("click the alert button");
	}

	@Given("I able to switch to alert and click on popup alert")
	public void i_able_to_switch_to_alert_and_click_on_popup_alert() {
		System.out.println("switch to alert");
		driver.switchTo().alert().accept();
		log.info("Able to Switch alert and click on Popup alert");
	}

	@When("I click on confirm button")
	public void i_click_on_confirm_button() throws InterruptedException {
		Thread.sleep(2000);
		obj.getConfirm_alert_button();
		log.info("click on confirm button");
	}

	@Then("I switch to alert  click on dismiss alert popup")
	public void i_switch_to_alert_click_on_dismiss_alert_popup() {
		obj.cancle_alert();
		obj.scrollDown();
		log.info("click on cancel Alert button");
		log.info("I Scroll Down the Page");
	}

	@Then("Get course details for selenium course details")
	public void get_course_details_for_selenium_course_details() {
		ClickOnElement(obj.getTable());
		log.info("Get Details for who are Studied Selenium course Details");
	}

	@Then("Get Chennai city name selection data")
	public void get_chennai_city_name_selection_data() {
		ClickOnElement(obj.getPosion_table());
		log.info("Get Chennai city name selection data");
	}

	@When("I click on hide button")
	public void i_click_on_hide_button() {
		ClickOnElement(obj.getHide_Button());
		log.info("Click on Hide Button");
	}

	@When("I click on Show button")
	public void i_click_on_show_button() {
		ClickOnElement(obj.getShow_Button());
		log.info("Click on Show Button");
	}

	@When("I click on mouse hover button")
	public void i_click_on_mouse_hover_button() throws InterruptedException {
		obj.scrollDown();
		Thread.sleep(2000);
		obj.getMousehover().click();
		log.info("Click on mouse hover Button");
	}

	@When("I click on reload button")
	public void i_click_on_reload_button() {
		ClickOnElement(obj.getReload());
		log.info("Click on reload Button");
	}

	@When("I switch to iframe and click the home button")
	public void i_switch_to_iframe_and_click_the_home_button() throws InterruptedException {
		Thread.sleep(3000);
		obj.scrollDown();
		WebElement frame = driver.findElement(By.id("courses-iframe"));
		driver.switchTo().frame(frame);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement frame_home = driver.findElement(By.xpath("(//a[text()='Home'])[1]"));
		System.out.println(frame_home.getText());
		frame_home.click();
		log.info("switch to iframe and click the home button");
	}

}
