package com.automationPracticeNew.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage{

	public static WebDriver driver;	
		
	public SignInPage(WebDriver localDriver) {
		this.driver=localDriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="passwd")
	private WebElement passwd;
	
	@FindBy(id="SubmitLogin")
	private WebElement SubmitLogin;
	
	@FindBy(xpath="//a[@title='View my customer account']")
	private WebElement welcome;
	
	public WebElement getWelcome() {
		return welcome;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getSubmitLogin() {
		return SubmitLogin;
	}
	
	//============= Using Locator
	private By SubmitLoginLocat = By.id("SubmitLogin");
	public By getSubmitLoginLocat() {
		return SubmitLoginLocat;
	}
}
