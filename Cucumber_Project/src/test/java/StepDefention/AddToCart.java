package StepDefention;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.Assert;

import Constenes.constent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddToCart extends constent  {
	
	private static final Logger log = (Logger) LogManager.getLogger(AddToCart.class);
	
	
	@Given("User Should Be Navigate To The Application")
	public void userShouldBeNavigateToTheApplication() {
	   
		log.info("Louch The Application");
	    driver.get(constent.Url);
	    
	   
	}

	@Given("User Should Be Login As {string} And {string}")
	public void userShouldBeLoginAsAnd(String UserName, String Password) {
	    
		try {
			
			log.info("Login On The Application ");
			home.getLoginLink().click();
			login.getUserName().sendKeys(UserName);
			login.getPassword().sendKeys(Password);
			login.getLogin().click();
			
		} catch (Exception e) {
			
			log.error(e.getMessage());
		}
		
		
		
	}

	@Given("User Search A Book {string}")
	public void userSearchABook(String Books) {
	    
		try {
			
			log.info("User Search The Particular Book ");
			
			home.getSerchBox().sendKeys(Books);
			
			home.getProduct_List().click();
			
		} catch (Exception e) {
			
			log.error(e.getMessage());
			
		}
		
		
		
		
	}

	@And("User Add  The Book To The Cart")
	public void userAddTheBookToTheCart() throws InterruptedException {
		
		try {
			
			log.info("User Add The Product To Cart Page ");
			product.getAddToCart().click();
			
			Thread.sleep(2000);
			
		} catch (Exception e) {
			
			log.error(e.getMessage());
		}
	   
		
	}
	
	

	@Then("The Cart Badge Should Be Updated")
	public void theCartBadgeShouldBeUpdated() {
		
		log.info("Product Sucesfully Add Or Not To Verify");
		
		String d = home.getCart_Count().getText();
	   
		Assert.assertEquals(d, "1");
		
		log.info("User Successfully Add The Product ");
		
	}


}
