package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

	 private WebDriver driver;
	 private By prodName = By.xpath("//p[contains(@class,'product-name')]");
	 private By quantity = By.xpath("//p[contains(@class,'quantity')]");
	 private By applyButton = By.xpath("//button[contains(text(),'Apply')]");
	 private By placeOrderButton = By.xpath("//button[contains(text(),'Place Order')]");
	 
	 public CheckOutPage(WebDriver driver) {
		 this.driver = driver;
	 }
	 
	 public String getProductName() {
		 return null;
	 }
	 
	 public String getProductQuantity() {
		 return null;
	 }
	 
	 public boolean getApplyButton() {
		 return false;
	 }
	 
	 public boolean getPlaceOrderButton() {
		 return false;
	 }
	 
}
