package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	
    WebDriver driver;
	
	
	@FindBy(xpath = "//input[@data-placeholder='Username']")
	private WebElement UserName;
	
	@FindBy(xpath = "//input[@data-placeholder='Password']")
	private WebElement Password;
	
	@FindBy(xpath = "(//span[text()='Login'])[2]")
	private WebElement Login;
	
	@FindBy(xpath = "//span[text()='Register']")
	private WebElement Register_Link;
	
	
	
      public WebElement getRegister_Link() {
		return Register_Link;
	}

	public Login_Page(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
      
      public WebDriver getDriver() {
  		return driver;
  	}

  	public WebElement getUserName() {
  		return UserName;
  	}

  	public WebElement getPassword() {
  		return Password;
  	}

  	public WebElement getLogin() {
  		return Login;
  	}
	
	

}
