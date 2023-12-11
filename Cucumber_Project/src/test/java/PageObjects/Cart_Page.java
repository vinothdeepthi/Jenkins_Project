package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {
	
	
    WebDriver driver;
	

	@FindBys({@FindBy(xpath = "//mat-card-content[@class='mat-card-content mat-elevation-z2']//a")})
	private List<WebElement> Cart_Product;
    
    @FindBy(xpath = "//span[text()='CheckOutsss']")
	private WebElement CheckOut;
    
    @FindBy(xpath = "//input[@data-placeholder='Nameddfd']")
	private WebElement Shipping_Name;
    
    @FindBy(xpath = "//input[@data-placeholder='Address Line 1']")
	private WebElement Shpping_Addres1;
    
    @FindBy(xpath = "//input[@data-placeholder='Address Line 2']")
	private WebElement Shiping_Addrss2;
    
    @FindBy(xpath = "//input[@data-placeholder='Pincode']")
	private WebElement Pincode;
    
    @FindBy(xpath = "//input[@data-placeholder='State']")
	private WebElement State;
    
    @FindBy(xpath = "//span[text()='Place Order']")
   	private WebElement Place_Order;
    
    @FindBy(xpath = "(//td[@role='gridcell'])[1]")
   	private WebElement Order_id;
    
  
	
    public WebDriver getDriver() {
		return driver;
	}


	public List<WebElement> getCart_Product() {
		return Cart_Product;
	}
	
	 public WebElement getCheckOut() {
			return CheckOut;
		}


		public WebElement getShipping_Name() {
			return Shipping_Name;
		}


		public WebElement getShpping_Addres1() {
			return Shpping_Addres1;
		}


		public WebElement getShiping_Addrss2() {
			return Shiping_Addrss2;
		}


		public WebElement getPincode() {
			return Pincode;
		}


		public WebElement getState() {
			return State;
		}


		public WebElement getPlace_Order() {
			return Place_Order;
		}


		public WebElement getOrder_id() {
			return Order_id;
		}



  public Cart_Page(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

}
