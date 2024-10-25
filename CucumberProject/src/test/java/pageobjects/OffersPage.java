package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	
	private WebDriver driver;
	
	private By search = By.xpath("//input[@type='search']");
	//private By actualProdName = By.xpath("//table//td[contains(text(),'Tom')]");
	private By actualProdName = By.xpath("(//table//td)[1]");
	
	public OffersPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchProductName(String prodName) {
		driver.findElement(search).sendKeys(prodName);
	}
	
	public String getProductName() {
		return driver.findElement(actualProdName).getText();
	}
	
	public void test3() {
		System.out.println("Test 3");
	}
}
