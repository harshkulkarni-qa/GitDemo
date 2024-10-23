package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageobjects.PageObjectManager;

public class TestContextSetup {
	//public WebDriver driver;
	public String prodName;
	public PageObjectManager pageObjectManager;
	public GenericUtils genericUtils;
	public TestBase testBase;
	
	public TestContextSetup() throws IOException {
		testBase = new TestBase();
	    pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
	    genericUtils = new GenericUtils(testBase.WebDriverManager());
	}
}