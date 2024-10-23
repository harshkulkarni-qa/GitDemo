package stepdefinitions;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.LandingPage;
import pageobjects.OffersPage;
import utils.TestContextSetup;

public class OffersPageStepDefinition {
	
	//private WebDriver driver;
	private String actualProductName;
	TestContextSetup testContextSetup;
	
	public OffersPageStepDefinition(TestContextSetup testContextSetup) {
	 this.testContextSetup = testContextSetup;
	}
	
	@Then("user searched for {} shortname in offers page")
	public void searchInOffersPage(String prodName) throws InterruptedException, IOException {
		OffersPage offers = testContextSetup.pageObjectManager.getOffersPage();
		switchToOffersPage();
		offers.searchProductName(prodName);		
		actualProductName = offers.getProductName();
	}
	
	@And("validate product name searched matches in offers page and landing page")
	public void validateLandingPageAndOffersPageProduct() {
		Assert.assertEquals(actualProductName, testContextSetup.prodName);
		System.out.println("Match success!!");
	}
	
	public void switchToOffersPage() throws InterruptedException {
		LandingPage lp = testContextSetup.pageObjectManager.getLandingPage();
		//WebDriverWait wait = new WebDriverWait(testContextSetup.driver,Duration.ofSeconds(5000));
		lp.clickTopDeals();
		testContextSetup.genericUtils.SwitchWindowToChild();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Veg/fruit name')]")));
	}
}
