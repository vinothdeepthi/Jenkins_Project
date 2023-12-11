package StepDefention;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import Constenes.constent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration_Step_definitions extends constent {
	
	
	private static final Logger log = (Logger) LogManager.getLogger(Registration_Step_definitions.class);
	
	@Given("User Should Be Navigate The Application")
	public void userShouldBeNavigateTheApplication() {
		log.info("Louching the Applicaion ");
		
	    driver.get(constent.Url);
	}

	@Given("User Click On The Login Link")
	public void userClickOnTheLoginLink() {
		
		log.info(" User Redirect To Login Page ");
		home.getLoginLink().click();
	
	}

	@Given("User Click On The Register Link")
	public void userClickOnTheRegisterLink() {
	    
		log.info("User Redirect To Register page");
		
		login.getRegister_Link().click();
	}
	
	@Given("User Enter The First Name As {string}")
	public void userEnterTheFirstNameAs(String FirstName) {
	    
		log.info("user Entering The FirstName");
		
		reg.getFirstName().sendKeys(FirstName);;
	}

	@Given("User Enter The Last Name As {string}")
	public void userEnterTheLastNameAs(String LastName) {
		
		log.info("user Entering The LastName");
	  
		reg.getLastName().sendKeys(LastName);
	}

	@Given("User Enter The User Name As {string}")
	public void userEnterTheUserNameAs(String UserName) {
		
		log.info("user Entering The UserName");
		
		reg.getUserName().sendKeys(UserName);
	    
	}

	@Given("User Enter The Password As {string}")
	public void userEnterThePasswordAs(String Password) {
		
		log.info("user Entering The Password");
	    
		reg.getPassword().sendKeys(Password);
	}

	@Given("User Enter The Confirm Password As {string}")
	public void userEnterTheConfirmPasswordAs(String confirmPassword) {
	   
		log.info("user Entering The ConfirmPassword");
		
		reg.getConfirm_Password().sendKeys(confirmPassword);
	}

	@Given("User Select The Gender As Male")
	public void userSelectTheGenderAsMale() {
	    
		log.info("user Selecting The Gender");
		
		reg.getGender().click();
		
	}
	
	@When("User Click On The Register button")
	public void userClickOnTheRegisterButton() {
	    
		log.info("user Submit the Register Form");
		
		reg.getRegister_Button().click();
	}


	@Then("User Successfully Register on Book Cart Application")
	public void userSuccessfullyRegisterOnBookCartApplication() {
	   
		log.info("User Successfully Register");
		
		
	}

}
