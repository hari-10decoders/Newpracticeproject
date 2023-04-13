import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testRunner {
	public static WebDriver driver;
	
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\10Decoders\\eclipse-workspace\\practiceone\\driver\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Radio Button Example
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		
		//Suggestion Class Example
		driver.findElement(By.id("autocomplete")).sendKeys("india");
		
		//Drop_down Example
		WebElement dd = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dd);
		s.selectByIndex(2);
		
		//Check_box Example
		driver.findElement(By.id("checkBoxOption1")).click();
		
		//Switch Window Example
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
		}
		
		//Switch To Alert Example
		driver.findElement(By.id("alertbtn")).click();
	    driver.switchTo().alert().accept();
	    driver.navigate().refresh();
	    driver.findElement(By.id("confirmbtn")).click();
	    driver.switchTo().alert().dismiss();
        driver.findElement(By.id("name")).sendKeys("java");
        driver.findElement(By.id("confirmbtn")).click();
        driver.switchTo().alert().accept();
        
        //Web Table Example
        WebElement table = driver.findElement(By.xpath("//table[@id='product']//tr[4]//td[1]"));
        System.out.println(table.getText());
        WebElement table1 = driver.findElement(By.xpath("(//table[@id='product']//tr[4])[2]"));
        System.out.println(table1.getText());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");	
        driver.navigate().refresh();
        
        //Element Hide and show
        driver.findElement(By.id("show-textbox")).click();
        driver.findElement(By.id("displayed-text")).sendKeys("java");
        driver.findElement(By.id("hide-textbox")).click();
        
        //Mouse Hover Example
        WebElement mouse = driver.findElement(By.xpath("//button[@id='mousehover']"));
        mouse.click();
        System.out.println(mouse.getText());
        driver.findElement(By.xpath("//a[text()='Top']")).click();
        
        //JavascriptExecutor
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,1200)");	
        
        //iFrame Example
        WebElement frame = driver.findElement(By.id("courses-iframe"));
        driver.switchTo().frame(0);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement frame1 = driver.findElement(By.xpath("(//a[text()='Home'])[1]"));
        System.out.println(frame1.getText());
        frame1.click();
        driver.close();
	}
	
}
