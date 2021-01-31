package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasic {

	public static void main(String[] args) {
		
	
		
		//System.setProperty("webdriver.chrome.drier", "/Users/ashik/Downloads/chromedriver88");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://www.google.com");		// to launch your expected website
		
		String pageTitle = driver.getTitle();
		System.out.println("Our current page title is : " + pageTitle);
		
		if(pageTitle.equals("Google")) {
			System.out.println("Page title is correct.");
		}
		else {
			System.out.println("Incorrect page title.");
		}
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Our current URL is : " + currentUrl);
		
		//driver.close();  	// to close the focus window
		
		//driver.quit(); 		// to close all the open window related with driver
		
		
		
		
		
		

	}

}
