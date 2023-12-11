package StepDefention;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Constenes.constent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddToCart_DashBoard_Product extends constent {
	
	

@And("User Select The Product of {string}")
public void userSelectTheProductOf(String Product) throws InterruptedException {
	
	
	/*for (WebElement AllProduct : home.getDashBoard_Product()) {
	     
		if(AllProduct.getText().equalsIgnoreCase(Product)) {
			
			AllProduct.click();
		}
	}*/
	
	driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[7]")).click();
    
}

@And("User Click On AddoToCart button")
public void userClickOnAddoToCartButton() {
   
	//home.getDasg_AddTo_Cart().click();
	
}

@Then("Verify The Selected Product Successfully Added To The Cart page")
public void verifyTheSelectedProductSuccessfullyAddedToTheCartPage() {
  
	home.getCart_Button().click();
	
	
for (WebElement CartProduct : cart.getCart_Product()) {
	
	Assert.assertEquals(CartProduct.getText(), "HP2");
		
	}
}
}


