package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Page {

	
	 WebDriver driver;
		
		
		@FindBy(css ="button[color='primaryaaaa']")
		private WebElement AddToCart;
		
		public Product_Page(WebDriver driver) {
			
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
		}


		public WebDriver getDriver() {
			return driver;
		}


		public WebElement getAddToCart() {
			return AddToCart;
		}
}
