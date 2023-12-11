package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	
     WebDriver driver;
	
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement LoginLink;
	
	
	
    @FindBy(xpath = "/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/button[3]/span[1]/mat-icon[1]")
	private WebElement AccountLogo;
    
    @FindBy(xpath = "//input[@aria-label='search']")
	private WebElement SerchBox;
    

	@FindBy(xpath = "//span[@class='mat-option-text']")
	private WebElement Product_List;
	
	@FindBy(xpath = "//span[@id='mat-badge-content-0']")
	private WebElement Cart_Count;
	
	@FindBys({@FindBy(xpath = "//div[@class='card-title']//a//strong")})
	private List<WebElement> DashBoard_Product;
	
	@FindBy(xpath = "(//span[@class='mat-button-wrapper'])[7]")
	private WebElement Dasg_AddTo_Cart;
	
	@FindBy(xpath = "(//span[@class='mat-button-wrapper'])[3]")
	private WebElement Cart_Button;
	
	
	

	
	public WebElement getCart_Button() {
		return Cart_Button;
	}



	public List<WebElement> getDashBoard_Product() {
		return DashBoard_Product;
	}



	public WebElement getDasg_AddTo_Cart() {
		return Dasg_AddTo_Cart;
	}




	

	
	public WebElement getCart_Count() {
		return Cart_Count;
	}



	public WebElement getAccountLogo() {
		return AccountLogo;
	}



	public WebDriver getDriver() {
		return driver;
	}



	public WebElement getLoginLink() {
		return LoginLink;
	}
	
	public WebElement  getSerchBox() {
		return SerchBox;
	}



	public WebElement getProduct_List() {
		return Product_List;
	}




	public Home_Page(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}



	

}
