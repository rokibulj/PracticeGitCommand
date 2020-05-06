package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.hubspot.base.BasePage;

public class LoginPage extends BasePage{
	
	WebDriver driver;
	
	//Create Page Object with help of By Locators
	
	By 	emailID = By.id("username");
	By 	password = By.id("password");
	By 	loginButton = By.id("loginBtn");
	By signUpLink  = By.linkText("Sign up");
	
	// Create Page Constractor.
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	
	// Page Actions Methods:
	public String getPageTitle(){
		return driver.getTitle();
	}
	
	public boolean checkSignUpLinkIsDisplayed(){
		return driver.findElement(signUpLink).isDisplayed();
	}
	
	public void doLogIn(String uNmae, String pwd){
		driver.findElement(emailID).sendKeys(uNmae);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginButton).click();
	}
	

}
