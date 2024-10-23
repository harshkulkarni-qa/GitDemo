package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.LandingPage;
import pageobjects.PageObjectManager;
import utils.TestContextSetup;

public class LandingPageStepDefinition {

TestContextSetup textContextSetup;
//PageObjectManager pageObjectManager;

public LandingPageStepDefinition(TestContextSetup textContextSetup) {
	this.textContextSetup = textContextSetup;
}

@Given("User is on GreenCart Landing page")
public void userOnLandingPage() throws IOException {
}


@When("user searched with shortname {} and extracted actual name of the product")
public void userSearchProductLandingPage(String prodName) throws InterruptedException {
	//LandingPage landPage = new LandingPage(textContextSetup.driver);
	LandingPage landPage = textContextSetup.pageObjectManager.getLandingPage();
	landPage.searchProdName(prodName);
	textContextSetup.prodName = landPage.getProductName().split("-")[0].trim();
}

@And("Clicked on plus icon to add more items in landing page")
public void clickOnPlusIconInLandingPage() {
	LandingPage landPage = textContextSetup.pageObjectManager.getLandingPage();
	landPage.clickToAddMoreItems();
	landPage.clickAddToCartButton();
	
	Assert.assertTrue(landPage.verifyAddedToCart());
	System.out.println("Added button is verified!!");
}


@And("Clicks on cart icon in landing page")
public void clickCartIcon()
{
	LandingPage landPage = textContextSetup.pageObjectManager.getLandingPage();
	landPage.clickCartIcon();
}



}
