package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {

	private WebDriver driver;
	private By search = By.xpath("//input[@type='search']");
	private By prodName = By.xpath("//h4[@class='product-name']");
	private By clickTopDeals = By.linkText("Top Deals");
	private By clickItemIncrement = By.xpath("//a[contains(@class,'increment')]");
	private By clickAddToCartButton = By.xpath("//button[contains(text(),'ADD TO CART')]");
	private By addedButton = By.xpath("//button[contains(text(),'✔ ADDED')]");
	private By cartIcon = By.xpath("//a[contains(@class,'cart-icon')]");
	private By proceedToCheckOutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchProdName(String prodName) throws InterruptedException {
		driver.findElement(search).sendKeys(prodName);
		Thread.sleep(2000);
	}
	
	public String getProductName() {
		System.out.println("Prod Name in Landing Page-->"+driver.findElement(prodName).getText());
		return driver.findElement(prodName).getText();
	}
	
	public void clickTopDeals() {
		driver.findElement(clickTopDeals).click();
	}
	
	public void clickToAddMoreItems() {
		driver.findElement(clickItemIncrement).click();
	}
	
	public void clickAddToCartButton() {
		driver.findElement(clickAddToCartButton).click();
	}
	
	
	public boolean verifyAddedToCart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(addedButton));
		return driver.findElement(addedButton).isDisplayed();
	}
	
	public void clickCartIcon() {
		driver.findElement(cartIcon).click();
	}
	
	public void clickProceedToCheckout() {
		driver.findElement(proceedToCheckOutButton).click();
	}
	
	 public void test2() {
		 System.out.println("This is test 2");
	 }
}
