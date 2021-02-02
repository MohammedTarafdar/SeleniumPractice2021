package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	
	public WebDriver driver;

	public static void main(String[] args) {
		
		CrossBrowser browser = new CrossBrowser();
		browser.initDriver("chrome");
		//WebDriver driver = browser.initDriver("chrome");
		//driver.get("https://www.google.com");
		browser.launchURL("https://www.google.com");
		String pageTitle = browser.getCurrentPageTitle();
		
		if (pageTitle.equals("Google")) {
			System.out.println("Correct page title");
		}
		else {
			System.out.println("Incorrect page title");
		}
		
		browser.quitBrowser();
		

	}
	
	
	
	
	// utility or reusable methods
	
	public WebDriver initDriver(String browser) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Browser " + browser + " is not found.");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		
		return driver;
		
	}
	
	public void launchURL(String url) {
		driver.get(url);
		
	}
	
	public String getCurrentPageTitle() {
		//String currentPageTitle = driver.getTitle();
		//return currentPageTitle;
		// or
		return driver.getTitle();
		
	}
	
	public void closeBrowser() {
		driver.close();	
	}
	
	public void quitBrowser() {
		driver.quit();
	}

}
