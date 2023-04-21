package Base_class_new;


import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
public class Base_class_new {

		public static WebDriver driver;
		public static WebDriver getbrowser(String type) {
			if (type.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\10Decoders\\eclipse-workspace\\automation_practicetask\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
				
			}
			return driver;
		}
		public static WebDriver GetUrl(String type) {
			driver.get(type);
			return null;
		}
		public void ClickOnElement(WebElement value) {
			value.click();
		}
		
		public void Sendkeys(WebElement element, String text) {
			element.clear();
			element.click();
			element.sendKeys(text);
		}
		public void Dropdwon(WebElement element, int num) {
			Select s = new Select(element);
			s.selectByIndex(num);
			element.click();
		}
		public void mousehover(WebElement element) {
			Actions a = new Actions(driver);
			a.moveToElement(element).click().build().perform();
		}
		public void switchtoMultipleWindow(int index) {
			String par = driver.getWindowHandle();
			Set<String> allwindow = driver.getWindowHandles();
			List<String> list_1 = new ArrayList<String>();
			list_1.addAll(allwindow);
			driver.switchTo().window(list_1.get(index));
	}
		
		public static void switchto_child() {
		
			driver.findElement(By.id("openwindow")).click();
			String par = driver.getWindowHandle();
			System.out.println(par);
			Set<String> allWin = driver.getWindowHandles();
			System.out.println(allWin);
			Iterator<String> iter = allWin.iterator();
			while (iter.hasNext()) {
				String child = iter.next();
				if (!child.equals(par)) {
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				driver.close();
				driver.switchTo().window(par);
				System.out.println(driver.getTitle());
				}
			}}
		public void parent_to_win() {
			String par = driver.getWindowHandle();
			System.out.println(par);
			Set<String> allWin = driver.getWindowHandles();
			System.out.println(allWin);
			Iterator<String> iter = allWin.iterator();
			while (iter.hasNext()) {
				String child = iter.next();
				if (!child.equals(par)) {
				driver.close();
				driver.switchTo().window(par);
				System.out.println(driver.getTitle());
				}
			}
	}
		public void simple_alert() {
		driver.switchTo().alert().accept();	
				
		}
	public void closedriver() {
	driver.close();
	}	
	public void scrolldown() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
	   j.executeScript("window.scrollBy(0,1200)");	
	}
	public void Dynamic_tables() {
		
		WebElement table = driver.findElement(By.xpath("(//table[@id='product'])[2]"));
		String dynamicCity = new String("'Chennai'");
		String customizedXpath = new String(
				"//table[@id='product']/tbody/tr/td[contains(text()," + dynamicCity + ")]/parent::tr");
		List<WebElement> city = driver.findElements(By.xpath(customizedXpath));
		for (WebElement webElement : city) {
			System.out.println(webElement.getText());
		}
		
		
	}
	public void coursetable() {
		WebElement path1 = driver.findElement(By.xpath("(//table[@id='product'])[1]"));
		String customizedinput = new String();
		String customizedpath = new String
				("//table[@id='product']/tbody/tr/td[contains(text()," + customizedinput + ")]/parent::tr");
		List<WebElement> course = driver.findElements(By.xpath(customizedpath));
		for (WebElement coursename : course) {
			System.out.println(coursename.getText());
		}
		
		
		
	}
	public void Iframe() {
		 WebElement frame = driver.findElement(By.id("courses-iframe"));
	    driver.switchTo().frame(0);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement frame1 = driver.findElement(By.xpath("(//a[text()='Home'])[1]"));
	    System.out.println(frame1.getText());
	    frame1.click();
		
	}
	public void iframe_defaultcontent() {
		 driver.switchTo().defaultContent();
	}
	}

		




