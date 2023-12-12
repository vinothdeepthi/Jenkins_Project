package Constenes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.Cart_Page;
import PageObjects.Home_Page;
import PageObjects.Login_Page;
import PageObjects.Product_Page;
import PageObjects.Register_Page;

public class constent  {
	
	
	protected Home_Page  home = new Home_Page(driver);
	
	 protected Register_Page  reg = new Register_Page(driver);
    
	 protected Login_Page login = new Login_Page(driver);
	
	 protected Product_Page product = new Product_Page(driver);
	 
	 protected Cart_Page cart = new Cart_Page(driver);
	
	public static WebDriver driver;
	
	public static WebDriverWait wait ;
	
	public static String system = "webdriver.chrome.driver";
	
	public static String Browser_Path ;
	
	public static String Browser_Name;
	
	public static String Url ;
	
	public static String Accountlogo;
	
	static String namea;
	
    
	
	

	

	
}	


