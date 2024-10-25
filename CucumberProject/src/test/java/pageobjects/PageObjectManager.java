package pageobjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}	
	
	public LandingPage getLandingPage() {
		return new LandingPage(driver);
	}
	
	public OffersPage getOffersPage() {
		return new OffersPage(driver);
	}
	
	public CheckOutPage getCheckoutPage() {
		return new CheckOutPage(driver);
	}
	
	public void test4() {
		System.out.println("Test 4");
	}
}
