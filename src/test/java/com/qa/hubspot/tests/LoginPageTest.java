package com.qa.hubspot.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.hubspot.base.BasePage;

public class LoginPageTest {
	
	WebDriver driver;
	BasePage basePage;
	Properties prop;
	
	
	//It's Precondition and this will launch before test
	@BeforeMethod
	public void setUp(){
		basePage = new BasePage();
		prop = basePage.init_properties();
		driver = basePage.init_driver(prop);
	}
	
	
	
	
	@AfterMethod
	public void quitBrowser(){
		driver.quit();
	}
	
	

}
