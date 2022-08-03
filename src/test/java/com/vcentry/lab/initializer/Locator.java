package com.vcentry.lab.initializer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locator  extends Initializer{
	
	public static WebElement getElementByName(String key){
		
		try {
		WebElement element =wd.findElement(By.name(LocatorProp.getProperty(key)));
		return element;
		} catch (Exception e) {
			System.out.println("Alert  : Unable to find element by name  -"+key+"- "+e.getMessage());
		}
		return null;
		
        }
	
	public static WebElement getElementById(String key){
	try {
		WebElement element =wd.findElement(By.id(LocatorProp.getProperty(key)));
		return element;
		} catch (Exception e) {
			System.out.println("Alert  : Unable to find element by id  -"+key+"- "+e.getMessage());
		}
		return null;
		
}
	public static WebElement getElementByXpath(String key){
		try {
			WebElement element =wd.findElement(By.xpath(LocatorProp.getProperty(key)));
			return element;
			} catch (Exception e) {
				System.out.println("Alert  : Unable to find element by xpath  -"+key+"- "+e.getMessage());
			}
			return null;
			
	}
	
	public static WebElement getElementByCSS(String key){
		try{
		WebElement element=wd.findElement(By.cssSelector(LocatorProp.getProperty(key)));
		return element;

		}catch(Exception e){
		System.out.println("Alert unadle to find element by cssSelector -  "+key+"-"+e.getMessage());

		}
		return null;
		}
		public static WebElement getElementBylinkText(String key){
		try{
		WebElement element=wd.findElement(By.linkText(LocatorProp.getProperty(key)));
		return element;

		}catch(Exception e){
		System.out.println("Alert unadle to find element by linktest  -  "+key+"-"+e.getMessage());

		}
		return null;
		}
		
		public static WebElement getElementByPartialLinkText(String key){
		try{
		WebElement element=wd.findElement(By.partialLinkText(LocatorProp.getProperty(key)));
		return element;

		}catch(Exception e){
		System.out.println("Alert unadle to find element by partial link text - "+key+"-"+e.getMessage());

		}
		return null;
		}
		
		public static WebElement getElementByClassName(String key){
		try{
		WebElement element=wd.findElement(By.className(LocatorProp.getProperty(key)));
		return element;

		}catch(Exception e){
		System.out.println("Alert unadle to find element by class name -   "+key+"-"+e.getMessage());

		}
		return null;
		}
		
		public static WebElement getElementByTagName(String key){
		try{
		WebElement element=wd.findElement(By.tagName(LocatorProp.getProperty(key)));
		return element;

		}catch(Exception e){
		System.out.println("Alert unadle to find element by tag name  -  "+key+"-"+e.getMessage());

		}
		return null;
       }
		
		//find elements
		
		public static List<WebElement> getElementsByName(String key){
		try{
		List<WebElement> element=wd.findElements(By.name(LocatorProp.getProperty(key)));
		return (List<WebElement>) element;

		}catch(Exception e){
		System.out.println("Alert unadle to find element by name - "+key+"-"+e.getMessage());

		}
		return null;

		}
		public static List<WebElement> getElementsById(String key){
			try{
			List<WebElement> element=wd.findElements(By.id(LocatorProp.getProperty(key)));
			return (List<WebElement>) element;

			}catch(Exception e){
			System.out.println("Alert unadle to find element by id - "+key+"-"+e.getMessage());

			}
			return null;
		
		}
		
		public static List<WebElement> getElementsByXpath(String key){
			try{
			List<WebElement> element=wd.findElements(By.xpath(LocatorProp.getProperty(key)));
			return (List<WebElement>) element;

			}catch(Exception e){
			System.out.println("Alert unadle to find element by xpath - "+key+"-"+e.getMessage());

			}
			return null;
		
		}
		
		public static List<WebElement> getElementsByCSS(String key){
			try{
			List<WebElement> element=wd.findElements(By.cssSelector(LocatorProp.getProperty(key)));
			return (List<WebElement>) element;

			}catch(Exception e){
			System.out.println("Alert unadle to find element by id -"+key+"-"+e.getMessage());

			}
			return null;
		
		}
		public static List<WebElement> getElementsBylinkText(String key){
			try{
			List<WebElement> element=wd.findElements(By.linkText(LocatorProp.getProperty(key)));
			return (List<WebElement>) element;

			}catch(Exception e){
			System.out.println("Alert unadle to find element by linktest  -  "+key+"-"+e.getMessage());

			}
			return null;
			}
		
		public static List<WebElement> getElementsByPartialLinkText(String key){
			try{
			List<WebElement> element=wd.findElements(By.partialLinkText(LocatorProp.getProperty(key)));
			return  (List<WebElement>) element;

			}catch(Exception e){
			System.out.println("Alert unadle to find element by partial link text - "+key+"-"+e.getMessage());

			}
			return null;
			}
		
		public static List<WebElement> getElementsByClassName(String key){
			try{
			List<WebElement> element=wd.findElements(By.className(LocatorProp.getProperty(key)));
			return (List<WebElement>) element;

			}catch(Exception e){
			System.out.println("Alert unadle to find element by class name -   "+key+"-"+e.getMessage());

			}
			return null;
			}
		
		public static List<WebElement> getElementsByTagName(String key){
			try{
			List<WebElement> element=wd.findElements(By.tagName(LocatorProp.getProperty(key)));
			return (List<WebElement>) element;

			}catch(Exception e){
			System.out.println("Alert unadle to find element by tag name  -  "+key+"-"+e.getMessage());

			}
			return null;
	       }
		
}
