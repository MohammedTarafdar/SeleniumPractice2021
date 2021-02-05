package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessMode {

	public static void main(String[] args) {
		/*
		// normal mode
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		*/
		
		//headless mode
		
		WebDriverManager.chromedriver().setup();
		// add head less arguments 
		ChromeOptions chOption = new ChromeOptions();
		chOption.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(chOption);		// pass the argement
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("First website title is : " + title);
		
		driver.navigate().to("https://www.facebook.com");
		String pageTitle = driver.getTitle();
		System.out.println("Second website title is : " + pageTitle);
		
		driver.quit();

	}

}
