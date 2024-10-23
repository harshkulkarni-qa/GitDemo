package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.CheckOutPage;
import pageobjects.LandingPage;
import utils.TestContextSetup;

public class CheckOutPageStepDefinition {

	TestContextSetup testContextSetup;
	//#And Verify Product Name and Quantity matches with landing page
	//#And Verify Apply and Place Order buttons are enabled and displayed
	
	public CheckOutPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}
	
	@And("User clicked Proceed To Checkout button")
	public void userClickedProceedButton() {
		LandingPage landPage = testContextSetup.pageObjectManager.getLandingPage();
		landPage.clickProceedToCheckout();
	}
	
	@Then("User should be navigated to Checkout page")
	public void userNavigateToCheckoutPage() {
		 CheckOutPage checkOutPage = testContextSetup.pageObjectManager.getCheckoutPage();
		// switchToCheckOutPage(); 
		// testContextSetup.genericUtils.SwitchWindowToChild("GreenKart - veg and fruits kart");
	}
	
	
	
	public void switchToCheckOutPage() {
		
	}
}
