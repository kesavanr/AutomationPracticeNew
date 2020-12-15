package com.automationPracticeNew.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public static WebDriver driver;
	
	public HomePage(WebDriver localDriver) {
		this.driver=localDriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Sign in")
	private WebElement signIn;
	
	public WebElement getSignIn() {
		return signIn;
	}
	
	//============= Using Locator
	private By signInLocat = By.linkText("Sign in");
	public By getSignInLocat() {
		return signInLocat;
	}
}
