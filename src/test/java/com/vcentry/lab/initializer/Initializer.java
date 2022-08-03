package com.vcentry.lab.initializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.vcentry.lab.utils.ReportOptimizer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Initializer {
	
	/**
	 * @author sirisha
	 * @created_date       18th july 2022
	 * @purpose to initialize the report variables
	 */
	 
	public static ExtentReports reports;
	public static ExtentTest log;
	public static boolean isReport=true;
	
	/**
	 * @author sirisha
	 * @created_date       18th july 2022
	 * @purpose            to initialize the environment variables
	 */
	public static Properties envProp=null;
	/**
	 * @author sirisha
	 * @created_date       18th july 2022
	 * @purpose            to initialize the locator variables
	 */
	
	public static Properties LocatorProp=null;
	
	public static WebDriver wd=null;
	/**
	 * @author sirisha
	 * @throws IOException
	 * @created_date       18th july 2022
	 * @purpose            to initialize the env.properties and locator.properties files variables
	 */
	
	
	public static void initialize() throws IOException {
		if(isReport) {
			ReportOptimizer.optimizeReport();
		reports=new ExtentReports("C:\\Users\\Hp\\eclipse-workspace-java\\H2_DDDTest\\report\\index.html");
		isReport=false;
		}
		envProp=new Properties();
		envProp.load(new FileInputStream(new File("src/test/resources/com/vcentry/lab/config/env.properties")));
		
		LocatorProp=new Properties();
		LocatorProp.load(new FileInputStream(new File("src/test/resources/com/vcentry/lab/config/locator.properties")));
		
		if(wd==null) {
		if (envProp.get("BROWSER").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			wd = new ChromeDriver();
		} else if (envProp.get("BROWSER").equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			wd = new FirefoxDriver();
		} else if (envProp.get("BROWSER").equals("ie")) {
			WebDriverManager.iedriver().setup();
			wd = new InternetExplorerDriver();
		}
		}
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wd.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
		
	}


