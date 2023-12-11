package StepDefention;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Constenes.constent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Place_Order extends constent {
	
	private static final Logger log = (Logger) LogManager.getLogger(Place_Order.class);
	
	@Given("User Able Navigate To The Application")
	public void userAbleNavigateToTheApplication() {
	    
		log.info("Lounching The Browser ");
		driver.get(constent.Url);
	}

	@When("User Able Be Login As {string} And {string}")
	public void userAbleBeLoginAsAnd(String UserName, String Password) {
	    
		log.info("User Entering The User Name And Password ");
		
		home.getLoginLink().click();
		
		login.getUserName().sendKeys(UserName);
		
		login.getPassword().sendKeys(Password);
		
		login.getLogin().click();
		
		log.info("User Successfully Logged ");
	}

	@When("User Search A Books {string}")
	public void userSearchABooks(String ProductName) throws InterruptedException {
		
		
	    
		log.info("User Search The Product ");
		
		wait.until(ExpectedConditions.visibilityOf(home.getSerchBox())).sendKeys(ProductName);
		
		home.getProduct_List().click();
		
		log.info("User Successuclly Click The Product Of "+ProductName);
	}

	@When("User Add  The Book To The Cart page")
	public void userAddTheBookToTheCartPage() {
	    
		product.getAddToCart().click();
		
		log.info("Product Sucessfully Add To The Cart Page ");
	}

	@When("User Should Be CheckOut The Product")
	public void userShouldBeCheckOutTheProduct() throws InterruptedException {
	    
		
		
		log.info("User Naviage To Cart Page ");
		
		wait.until(ExpectedConditions.visibilityOf(home.getCart_Button())).click();
		
		cart.getCheckOut().click();
		
		log.info("User Successfully Naviage To The CheckOut Page ");
	}
	

	@When("User Should Be Entering The Shipping Addres{string} And {string} And {string} And {string} And {string}")
	public void userShouldBeEnteringTheShippingAddresAndAndAndAnd(String Shipping_Name, String Shipping_Address1, String Shipping_Address2, String pincode, String state) {
		
		log.info("User Entering The Shipping Addres ");
		
		cart.getShipping_Name().sendKeys(Shipping_Name);
		
		cart.getShpping_Addres1().sendKeys(Shipping_Address1);
		
		cart.getShiping_Addrss2().sendKeys(Shipping_Address2);
		
	    cart.getPincode().sendKeys(pincode);
		
		cart.getState().sendKeys(state);
		
		log.info("User Successfully Entring The Shipping Addres ");
	}

	@When("user Should be Place The Order")
	public void userShouldBePlaceTheOrder() {
		
		cart.getPlace_Order().click();
	   
		log.info("User Successfully Place The Order Of The Book ");
	}

	@Then("User Should Be Verify The Order Id Is Successfully Placed Or Not")
	public void userShouldBeVerifyTheOrderIdIsSuccessfullyPlacedOrNot() {
		
		log.info("User Successfully Get The Order Id  Of "+cart.getOrder_id().getText());
	   
	}


}
