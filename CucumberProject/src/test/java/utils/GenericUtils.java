package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {

	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	public void SwitchWindowToChild() {
		Set<String> winHandles = driver.getWindowHandles();
		Iterator<String> i = winHandles.iterator();
		String parentWindow = i.next();
		String childWindow = i.next();
		
		driver.switchTo().window(childWindow);
	}
}
