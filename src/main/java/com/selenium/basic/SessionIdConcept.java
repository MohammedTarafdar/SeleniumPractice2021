package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SessionIdConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// ChromeDriver 88.0.4324.96 (68dba2d8a0b149a1d3afac56fa74648032bcf46b
		
		driver.get("https://www.google.com");
		// sessionID: 69d88bd92b457e7c6ed5659cb7b14306
		
		driver.navigate().to("https://www.amazon.com");
		// sessionID: 69d88bd92b457e7c6ed5659cb7b14306
		
		String pageTitle = driver.getTitle();
		// sessionID: 69d88bd92b457e7c6ed5659cb7b14306
		System.out.println("Current page title : "+ pageTitle);
		// Current page title : Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more
		
		driver.close();
		// sessionID: 69d88bd92b457e7c6ed5659cb7b14306
		
		String pageTitle2 = driver.getTitle();
		// sessionID: 69d88bd92b457e7c6ed5659cb7b14306
		System.out.println("Current page title : "+ pageTitle2);
		// Current page title : org.openqa.selenium.NoSuchSessionException: invalid session id
		
		driver.quit();
		// sessionID: null 
		
		String pageTitle3 = driver.getTitle();
		// sessionID: null =>org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()
		System.out.println("Current page title : "+ pageTitle3);
		
	}

}
