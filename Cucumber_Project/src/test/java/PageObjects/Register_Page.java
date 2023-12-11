package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {
	
	
	 WebDriver driver;
	
		@FindBy(xpath = "//input[@data-placeholder='First name']")
		private WebElement FirstName;
		
		@FindBy(xpath = "//input[@data-placeholder='Last Name']")
		private WebElement LastName;
		
		@FindBy(xpath = "//input[@data-placeholder='User Name']")
		private WebElement UserName;
		
		@FindBy(xpath = "//input[@data-placeholder='Password']")
		private WebElement Password;
		
		@FindBy(xpath = "//input[@data-placeholder='Confirm Password']")
		private WebElement Confirm_Password;
		
		@FindBy(xpath = "(//span[@class='mat-radio-inner-circle'])[1]")
		private WebElement Gender;
		
		@FindBy(xpath = "(//span[@class='mat-button-wrapper'])[8]")
		private WebElement Register_Button;
		
		public Register_Page(WebDriver driver) {
			
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
		}
		

		public WebDriver getDriver() {
			return driver;
		}

		public WebElement getFirstName() {
			return FirstName;
		}

		public WebElement getLastName() {
			return LastName;
		}

		public WebElement getUserName() {
			return UserName;
		}

		public WebElement getPassword() {
			return Password;
		}

		public WebElement getConfirm_Password() {
			return Confirm_Password;
		}

		public WebElement getGender() {
			return Gender;
		}

		public WebElement getRegister_Button() {
			return Register_Button;
		}


}
