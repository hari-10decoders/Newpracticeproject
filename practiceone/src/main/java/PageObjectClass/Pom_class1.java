package PageObjectClass;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class1 {
	
	public static WebDriver driver;
	
	@FindBy(id = "openwindow")
	private WebElement New_window;

	@FindBy(id = "opentab")
	private WebElement newtab;
	
	@FindBy(id = "name")
	private WebElement alertfiedl;

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
	
	@FindBy(id = "displayed-text")
	private WebElement mousehover;
	
	@FindBy(xpath = "//a[text()='Reload']")
	private WebElement reload;
	
	@FindBy(id = "courses-iframe")
	private WebElement iframe;
	
	@FindBy(xpath = "(//a[text()='Home'])[1]")
	private WebElement Iframe2;

	

	public Pom_class1(WebDriver Run_Driver) {
		this.driver=Run_Driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getTable() {
		return table;
	}

	public void setTable(WebElement table) {
		this.table = table;
	}

	public WebElement getNewtab() {
		return newtab;
	}

	public WebElement getNew_window() {
		return New_window;
		
	}
		
	
	public WebElement getAlertfiedl() {
		return alertfiedl;
	}

	public WebElement getAlert_button() {
		return alert_button;
	}

	public WebElement getConfirm_alert_button() {
		return confirm_alert_button;
	}
	public WebElement getPosion_table() {
		
		return Posion_table;
	}
	///////
	public WebElement getHide_Button() {
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
	        WebElement frame1 = driver.findElement(By.xpath("(//a[text()='Home'])[1]"));
	        System.out.println(frame1.getText());
	        frame1.click();
	        driver.close();
			return iframe;
		
	}
	public WebElement getIframe2() {
		return Iframe2;
	}
	
}