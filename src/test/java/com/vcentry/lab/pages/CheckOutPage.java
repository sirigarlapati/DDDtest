package com.vcentry.lab.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.vcentry.lab.initializer.Locator;

public class CheckOutPage {
	
	public static void enterProductName(String data) {
		Locator.getElementById("CHECKOUTPAGE_TYPE_PRODUCT_ID").sendKeys(data);
	}
	public static void enterMobile(String data) {
		Locator.getElementById("CHECKOUTPAGE_TYPE_MOBILE_ID").sendKeys(data);
	}
	
	public static void enterEmail(String data) {
		Locator.getElementById("CHECKOUTPAGE_TYPE_EMAIL_ID").sendKeys(data);
	}
	
	public static void selectProdcat(String data) {
		WebElement element=Locator.getElementById("CHECKOUTPAGE_SELECT_PRODCAT_ID");
		Select s=new Select(element);
		s.selectByVisibleText(data);
		
	}
	
	public static void enterProdQuant(String data) {
		Locator.getElementById("CHECKOUTPAGE_TYPE_PRODQUANT_ID").sendKeys(data);
		
	}
	public static void enterPurchName(String data) {
		Locator.getElementById("CHECKOUTPAGE_TYPE_PURCHNAME_ID").sendKeys(data);
		
	}
	public static void clickGst() {
		Locator.getElementById("CHECKOUTPAGE_CLICK_GSTYES_ID").click();
	}
	public static void clickPayavail() {
		Locator.getElementById("CHECKOUTPAGE_CLICK_PAYAVAIL_ID").click();
	
	}
	
	public static void clickOrder() {
		
		Locator.getElementById("CHECKOUTPAGE_CLICK_ORDER_ID").click();
	}
	
}
