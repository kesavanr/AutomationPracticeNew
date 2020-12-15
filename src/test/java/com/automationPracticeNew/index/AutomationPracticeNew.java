package com.automationPracticeNew.index;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import com.automationPracticeNew.baseclass.BaseClass;
import com.automationPracticeNew.pom.AddToCart;
import com.automationPracticeNew.pom.HomePage;
import com.automationPracticeNew.pom.SignInPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class AutomationPracticeNew extends BaseClass{
	ExtentHtmlReporter htmlReporter;
	ExtentReports exReports;
	ExtentTest test;
	@Test
	public void mainPage() throws IOException {
		
		try {
			
			htmlReporter = new ExtentHtmlReporter("Report/extentReport.html");
			exReports = new ExtentReports();
			exReports.attachReporter(htmlReporter);
			test = exReports.createTest("Automation Practice");
			
			test.log(Status.INFO, "Launch the Browser");
			driver = getBrowser("chrome");
			test.log(Status.INFO, "Launch the URL");
			getURL("http://automationpractice.com/index.php");

			test.log(Status.WARNING, "Launch home page");
			HomePage hp = new HomePage(driver);		
			Click(hp.getSignIn());
			test.pass("Successfully redirect to login page");
			
			test.info("User enter the login credintials");
			SignInPage signPage=new SignInPage(driver);
			findInputElement(signPage.getEmail(), "demolink1984@gmail.com");
			findInputElement(signPage.getPasswd(), "123456");
			Click(signPage.getSubmitLogin());

			boolean displayed = isDisplayedStatus(signPage.getWelcome());
			System.out.println("welcomeText : " + signPage.getWelcome().getText());
			test.log(Status.PASS, "User successfully logged in.");
			
			test.info("Purchasing a cart");
			AddToCart cartPage = new AddToCart(driver);
			moveToElement(cartPage.getWomenTab());

			WebElement gettShirts = cartPage.gettShirts();
			moveToElement(gettShirts);
			clickOnElement(gettShirts);
			scrollIntoView(cartPage.getSelectProductSortLocat());
			moveToElement(cartPage.getProductContainer());
			moveToElement(cartPage.getQuickView());
			clickOnElement(cartPage.getQuickView());

			//switchToFrameUsingId("id", 0);			
			driver = switchToFrame(cartPage.getFirstFrame());

			moveToElement(cartPage.getFancyBox());
			clickOnElement(cartPage.getFancyBox()); 	
			Click(cartPage.getAddQty()); 			
			Click(cartPage.getAddQty());
			selectDropDown(cartPage.getGroup_1Locat(), "2", "value");
			clickOnElement(cartPage.getBlue());
			Click(cartPage.getSubmitButton());

			driver = defaultContent();
			Click(cartPage.getProceedToCheckout());
			Click(cartPage.getProceedToCheckout2());
			Click(cartPage.getProcessAddress());
			clickPresenceOfElement(cartPage.getCgvLocat());
			Click(cartPage.getProcessCarrier());
			Click(cartPage.getPayByBankWire());
			Click(cartPage.getConfirmOrder());
			Click(cartPage.getBackToOrders());
			test.pass("Successfully order is placed.");

			System.out.println("==========DONE=========");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			test.fail("Error in shopping cart");
			String imagePath = "automationPractice.png";
			getScreenshot(imagePath);
			test.addScreenCaptureFromPath("../Screenshot/" + imagePath);
		}	
		finally {
			quitBrowser();
			exReports.flush();
		}
	}
}
