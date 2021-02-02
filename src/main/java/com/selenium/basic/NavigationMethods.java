package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		driver.close();
		driver.quit();

	}

}
