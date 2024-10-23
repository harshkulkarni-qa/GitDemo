package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/global.properties");
		//System.out.println("User directory-->"+System.getProperty("user.dir"));
		
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		//System.out.println("URL is-->"+url);
		
		if(driver == null) {
		if(prop.getProperty("Browser").equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		//driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		}
			else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				//firefox code
			}
	    }
		return driver;
	}
}
