package pom_class;

import java.awt.AWTException;
import java.awt.Window;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class pom_class2  {


	
		public static WebDriver driver;
		@FindBy(id = "openwindow")
		private  WebElement New_window;
		@FindBy(id = "opentab")
		private WebElement newtab;
		@FindBy(id = "alertbtn")
		private WebElement alert_button;
		@FindBy(id = "confirmbtn")
		private WebElement confirm_alert_button;
		@FindBy(id = "product") 
		private WebElement table;
		@FindBy(xpath = "(//table[@id='product'])[2]")
		private WebElement Posion_table;
		@FindBy(id = "hide-textbox")
		private WebElement hide_Button;
		@FindBy(id = "show-textbox")
		private WebElement show_Button;
		@FindBy(id ="mousehover")
		private WebElement mousehover;
		@FindBy(xpath = "//a[text()='Reload']")
		private WebElement reload;
		@FindBy(id = "courses-iframe")
		private WebElement iframe;
//		@FindBy(xpath = "(//a[text()='Home'])[1]")
//		private WebElement Iframe2;
		public pom_class2(WebDriver Run_Driver) {
			this.driver = Run_Driver;
			PageFactory.initElements(driver, this);
		}
		
		
		
		public WebElement getTable() {
			String inputvalue = new String("'Selenium'");
			List<WebElement> element = driver.findElements(
					By.xpath("//table[@id='product']/tbody/tr/td[contains(text(), " + inputvalue + ")]/parent::tr"));
			for (WebElement webElement : element) {
				System.out.println("***who are studied selenium==>"+webElement.getText());
			}
			return table;
			}
		
		//////////////////////////////////////////
		public WebElement getNewtab()   {
			
		return getNewtab();
		}
		//////////////////////////////////////////////////
		public WebElement getNew_window() throws InterruptedException, AWTException  {
		return New_window;
				}
		//////////////////////////////////////////////////	
		public static WebElement alrtbutton;
		public WebElement getAlert_button() {
			alrtbutton = driver.findElement(By.id("alertbtn"));
			alrtbutton.click();
			return alert_button;
		}
		public void simplealert() {
			String text = driver.switchTo().alert().getText();
			System.out.println(text);
		}
		public void accept_alert() {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
////////////////////////////////////////////////////			
		}
		public static WebElement comfirm_alert ;
		public WebElement getConfirm_alert_button() {
			comfirm_alert = driver.findElement(By.id("confirmbtn"));
			comfirm_alert.click();
			System.out.println("Click the alert button");
			return confirm_alert_button;
		}
		public void Confirm_alert() {
			driver.switchTo().alert().accept();
			System.out.println("switchTo the alert button");
			}
			public void cancle_alert() {
			driver.switchTo().alert().dismiss();
			System.out.println("switchTo the alert button and dismiss");
			}
	///////////////////////////////////////////////////////////		
		public WebElement getPosion_table() {
			WebElement table = driver.findElement(By.xpath("(//table[@id='product'])[2]"));
			String dynamicCity = new String("'Chennai'");
			String customizedXpath = new String(
					"//table[@id='product']/tbody/tr/td[contains(text()," + dynamicCity + ")]/parent::tr");
			List<WebElement> city = driver.findElements(By.xpath(customizedXpath));
			for (WebElement webElement : city) {
				System.out.println("***who are in chennai location==>"+webElement.getText());
			}
			return Posion_table;
		}
		public void scrollDown() {
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("window.scrollBy(0,700)");
		}
		public static WebElement hide;
		public WebElement getHide_Button() {
			hide = driver.findElement(By.id("hide-textbox"));
			System.out.println(hide.getText());
			hide.click();
			return hide_Button;
		}

		public WebElement getShow_Button() {
			return show_Button;
		}
		
		public WebElement getMousehover() {
			return mousehover;
		}
		public WebElement getReload() {
			return reload;
		}
		
		public WebElement getIframe() {
			WebElement frame = driver.findElement(By.id("courses-iframe"));
			driver.switchTo().frame(0);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement frame_home =driver.findElement(By.xpath("(//a[text()='Home'])[1]"));
			System.out.println(frame_home.getText());
			frame_home.click();
			return iframe;
		}
	}


