package com.automationPracticeNew.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	public static WebDriver driver;

	public AddToCart(WebDriver localDriver) {
		this.driver=localDriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@title='Women']") 
	private WebElement womenTab;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[1]") 
	private WebElement tShirts;
	
	@FindBy(xpath="//select[@id='selectProductSort']") 
	private WebElement selectProductSort;	
	
	@FindBy(xpath="//li[contains(@class,'ajax_block_product ')]") 
	private WebElement productContainer;
	
	@FindBy(xpath="//a/span[text()='Quick view']") 
	private WebElement quickView;
	
	@FindBy(xpath="//iframe") 
	private WebElement firstFrame;

	@FindBy(xpath="(//img[@alt='Faded Short Sleeve T-shirts'])[5]") 
	private WebElement fancyBox;
	
	@FindBy(xpath="//a[@class='btn btn-default button-plus product_quantity_up']") 
	private WebElement addQty;
	
	@FindBy(xpath="//select[@id='group_1']") 
	private WebElement group_1;
		
	@FindBy(xpath="//a[@name='Blue']") 
	private WebElement Blue;
	
	@FindBy(xpath="//p[@id='add_to_cart']/button[@name='Submit']") 
	private WebElement submitButton;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']") 
	private WebElement proceedToCheckout;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]") 
	private WebElement proceedToCheckout2;
	
	@FindBy(xpath="//button[@name='processAddress']") 
	private WebElement processAddress;
	
	@FindBy(xpath="//input[@id='cgv']") 
	private WebElement cgv;
		
	@FindBy(xpath="//button[@name='processCarrier']") 
	private WebElement processCarrier;	
	
	@FindBy(xpath="//a[@title='Pay by bank wire']") 
	private WebElement payByBankWire;
	
	@FindBy(xpath="//button/span[text()='I confirm my order']") 
	private WebElement confirmOrder;
	
	@FindBy(xpath="//a[@title='Back to orders']") 
	private WebElement backToOrders;
	
	public WebElement getWomenTab() {
		return womenTab;
	}
	public WebElement gettShirts() {
		return tShirts;
	}
	public WebElement getSelectProductSort() {
		return selectProductSort;
	}
	
	public WebElement getProductContainer() {
		return productContainer;
	}
	public WebElement getQuickView() {
		return quickView;
	}
	public WebElement getFirstFrame() {
		return firstFrame;
	}
	public WebElement getFancyBox() {
		return fancyBox;
	}
	public WebElement getAddQty() {
		return addQty;
	}
	public WebElement getGroup_1() {
		return group_1;
	}
	
	public WebElement getBlue() {
		return Blue;
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}
	public WebElement getProceedToCheckout() {
		return proceedToCheckout;
	}
	public WebElement getProceedToCheckout2() {
		return proceedToCheckout2;
	}
	public WebElement getProcessAddress() {
		return processAddress;
	}
	public WebElement getCgv() {
		return cgv;
	}	
	public WebElement getProcessCarrier() {
		return processCarrier;
	}
	public WebElement getPayByBankWire() {
		return payByBankWire;
	}
	public WebElement getConfirmOrder() {
		return confirmOrder;
	}
	public WebElement getBackToOrders() {
		return backToOrders; 
	}
	
	//============= Using Locator
	private By selectProductSortLocat = By.xpath("//select[@id='selectProductSort']");
	public By getSelectProductSortLocat() {
		return selectProductSortLocat;
	}
	
	private By group_1Locat = By.xpath("//select[@id='group_1']");
	public By getGroup_1Locat() {
		return group_1Locat;
	}
	
	private By cgvLocat = By.xpath("//input[@id='cgv']");
	public By getCgvLocat() {
		return cgvLocat;
	}
}
