package com.vcentry.lab.pages;

import com.vcentry.lab.initializer.Locator;

public class HomePage {
	
	public static void clickFrameworkForm() {
		
		Locator.getElementById("HOMEPAGE_CLICK_FRAMEWORKFORMS_ID").click();
		
	}
public static void clickSimpleForm() {
	Locator.getElementById("HOMEPAGE_CLICK_SIMPLEFORM_ID").click();
		
	}

public static void clickLogout() {
	
	Locator.getElementBylinkText("HOMEPAGE_CLICK_LOGOUT_LINKTEST").click();
}


}
