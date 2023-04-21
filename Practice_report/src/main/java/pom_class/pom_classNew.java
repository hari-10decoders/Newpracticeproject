package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class pom_classNew {
	
		public static WebDriver driver;

		@FindBy(xpath = "//input[@value='radio1']")
		private WebElement radioOne;

		@FindBy(xpath = "//input[@value='radio2']")
		private WebElement radioTwo;

		@FindBy(xpath = "//input[@value='radio3']")
		private WebElement radioThree;

		@FindBy(xpath = "//input[@id='autocomplete']")
		private WebElement country;

		@FindBy(xpath = "//select[@id='dropdown-class-example']")
		private WebElement dropdown;

		@FindBy(xpath = "//option[@value='option1']")
		private WebElement option1;

		@FindBy(xpath = "//option[@value='option2']")
		private WebElement option2;

		@FindBy(xpath = "//option[@value='option3']")
		private WebElement option3;

		@FindBy(id = "checkBoxOption1")
		private WebElement checkbox1;

		@FindBy(id = "checkBoxOption2")
		private WebElement checkbox2;

		@FindBy(id = "checkBoxOption3")
		private WebElement checkbox3;

		
		
		
		public pom_classNew(WebDriver driver2) {
			this.driver = driver2;
			
			PageFactory.initElements(driver2, this);
		}

		public WebElement getRadioOne() {
			return radioOne;
		}

		public WebElement getRadioTwo() {
			return radioTwo;
		}

		public WebElement getRadioThree() {
			return radioThree;
		}

		public WebElement getCountry() {
			return country;
		}

		public WebElement getDropdown() {
			return dropdown;
		}

		public WebElement getOption1() {
			return option1;
		}

		public WebElement getOption2() {
			return option2;
		}

		public WebElement getOption3() {
			return option3;
		}

		public WebElement getCheckbox1() {
			return checkbox1;
		}

		public WebElement getCheckbox2() {
			return checkbox2;
		}

		public WebElement getCheckbox3() {
			return checkbox3;
		}
	}



