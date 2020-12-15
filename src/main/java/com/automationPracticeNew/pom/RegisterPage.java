package com.automationPracticeNew.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public WebDriver driver;

	public RegisterPage(WebDriver localDriver) {
		this.driver=localDriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='email_create']")
	private WebElement email_create;

	@FindBy(xpath="//button[@id='SubmitCreate']")
	private WebElement SubmitCreate;

	@FindBy(xpath="//*[@id='id_gender1']")
	private WebElement id_gender1;
	private By id_gender1Locat = By.id("id_gender1");

	@FindBy(id="customer_firstname")
	private WebElement customer_firstname;

	@FindBy(id="customer_lastname")
	private WebElement customer_lastname;

	@FindBy(id="email")
	private WebElement email;

	@FindBy(id="passwd")
	private WebElement passwd;

	@FindBy(id="days")
	private WebElement days;

	@FindBy(id="months")
	private WebElement months;

	@FindBy(id="years")
	private WebElement years;
	
	@FindBy(id="newsletter")
	private WebElement newsletter;

	@FindBy(id="optin")
	private WebElement optin;

	private By daysLocat = By.id("days");
	private By monthsLocat = By.id("months");
	private By yearsLocat = By.id("years");
	private By newsletterLocat = By.id("newsletter");
	private By optinLocat = By.id("optin");
	
	@FindBy(id="firstname")
	private WebElement firstname;

	@FindBy(id="lastname")
	private WebElement lastname;

	@FindBy(id="company")
	private WebElement company;

	@FindBy(id="address1")
	private WebElement address1;

	@FindBy(id="address2")
	private WebElement address2;

	@FindBy(id="city")
	private WebElement city;

	@FindBy(id="postcode")
	private WebElement postcode;

	@FindBy(id="id_state")
	private WebElement id_state;

	@FindBy(id="id_country")
	private WebElement id_country;

	private By id_stateLocat = By.id("id_state");
	private By id_countryLocat = By.id("id_country");

	@FindBy(id="other")
	private WebElement other;

	@FindBy(id="phone")
	private WebElement phone;

	@FindBy(id="phone_mobile")
	private	WebElement phone_mobile;

	@FindBy(id="alias")
	private WebElement alias;

	@FindBy(id="submitAccount")
	private WebElement submitAccount;

	public WebElement getEmail_create() {
		return email_create;
	}

	public WebElement getSubmitCreate() {
		return SubmitCreate;
	}

	public WebElement getId_gender1() {
		return id_gender1;
	}
	public By getId_gender1Locat() {
		return id_gender1Locat;
	}

	public WebElement getCustomer_firstname() {
		return customer_firstname;
	}

	public WebElement getCustomer_lastname() {
		return customer_lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getDays() {
		return days;
	}
	public WebElement getMonths() {
		return months;
	}

	public WebElement getYears() {
		return years;
	}
	
	public WebElement getNewsletter() {
		return newsletter;
	}

	public WebElement getOptin() {
		return optin;
	}
	
	public By getDaysLocat() {
		return daysLocat;
	}

	public By getMonthsLocat() {
		return monthsLocat;
	}

	public By getYearsLocat() {
		return yearsLocat;
	}

	public By getNewsletterLocat() {
		return newsletterLocat;
	}

	public By getOptinLocat() {
		return optinLocat;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getId_state() {
		return id_state;
	}

	public WebElement getId_country() {
		return id_country;
	}

	public By getId_stateLocat() {
		return id_stateLocat;
	}

	public By getId_countryLocat() {
		return id_countryLocat;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public WebElement getOther() {
		return other;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getPhone_mobile() {
		return phone_mobile;
	}

	public WebElement getAlias() {
		return alias;
	}

	public WebElement getSubmitAccount() {
		return submitAccount;
	}
}