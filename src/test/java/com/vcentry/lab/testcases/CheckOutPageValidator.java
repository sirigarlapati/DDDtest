package com.vcentry.lab.testcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.vcentry.lab.initializer.Initializer;
import com.vcentry.lab.initializer.Locator;
import com.vcentry.lab.inputReader.InputReader;
import com.vcentry.lab.pages.CheckOutPage;
import com.vcentry.lab.pages.HomePage;
import com.vcentry.lab.pages.LoginPage;
import com.vcentry.lab.utils.ScreenshotGenerator;

public class CheckOutPageValidator extends Initializer {
	
	
	@BeforeTest
	public void setUp() throws IOException {
		//initialize();
		
	}
	
	
	@Test(dataProvider = "CheckoutTest")
	public void validateCheckoutPage(String testdata,String user, String password, String productname, String mobile, String mail, String prodcat, String productQty, String purchaser) throws IOException, InterruptedException {
		
		initialize();
		log=reports.startTest("start "+testdata, "validate - "+testdata);
		log.log(LogStatus.PASS, testdata+" -  initialized");
		//initialize();open the browser
		wd.get(envProp.getProperty("URL"));
		log.log(LogStatus.PASS, " url loaded succesfully");
		
		/*// step 1
		
		wd.findElement(By.name("username")).sendKeys("sirisha");
		wd.findElement(By.name("password")).sendKeys("Chaitra123!");
		wd.findElement(By.name("password")).submit();
		*/
		
		/*// step 2
		
		wd.findElement(By.name(LocatorProp.getProperty("LOGINPAGE_TYPE_USERNAME_NAME"))).sendKeys("sirisha");
		wd.findElement(By.name(LocatorProp.getProperty("LOGINPAGE_TYPE_PASSWORD_NAME"))).sendKeys("Chaitra123!");
		wd.findElement(By.name(LocatorProp.getProperty("LOGINPAGE_TYPE_PASSWORD_NAME"))).submit();
	*/
		
	/*	// step 3
		
		 Locator.getElementByName("LOGINPAGE_TYPE_USERNAME_NAME").sendKeys("sirisha");
		Locator.getElementByName("LOGINPAGE_TYPE_PASSWORD_NAME").sendKeys("Chaitra123!");
		Locator.getElementByName("LOGINPAGE_TYPE_PASSWORD_NAME").submit();
		
		*/
		
		
		// step 4 page objects  readable reusable maintanable
		
		LoginPage.enterUserName(user);
		LoginPage.enterPassword(password);
		LoginPage.clickLogin();
		log.log(LogStatus.PASS, " login completed succesfully");
		wd.get(envProp.getProperty("LAB_URL"));
		HomePage.clickFrameworkForm();
		HomePage.clickSimpleForm();
		log.log(LogStatus.PASS, " home page completed succesfully");
		CheckOutPage.enterProductName(productname);
		CheckOutPage.enterMobile(mobile);
		CheckOutPage.enterEmail(mail);
		CheckOutPage.selectProdcat(prodcat);
		CheckOutPage.enterProdQuant(productQty);
		CheckOutPage.enterPurchName(purchaser);
		CheckOutPage.clickGst();
		CheckOutPage.clickPayavail();
	
		CheckOutPage.clickOrder();
		log.log(LogStatus.PASS, " checkout page completed succesfully");
		
		
		
	}
	
	
	@DataProvider(name="CheckoutTest")
	public static Object[][] getData() throws IOException {
		
		if(InputReader.verifyRunMode("CheckOutPageValidator")) {
		Object[][] data=InputReader.verifyMultiData("CheckOutPageValidator");
		
		
		return data;
	}
		return null;
	}
	
	@AfterMethod
	public void tearDown(ITestResult r) throws IOException {
		
		// logout
		
		
		ScreenshotGenerator.generateScreenshot(r);
		HomePage.clickLogout();
		
		
	}
	
	

}