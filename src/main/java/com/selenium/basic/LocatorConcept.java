package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {
	
	public WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		/*
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("tarafdarmohammed@gmail.com");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Tarafdar1234");
		Thread.sleep(1000);
		
		driver.quit();
		*/
		
		
		// create an object of locator class
		LocatorConcept object = new LocatorConcept();
		
		object.initialDriver("chrome");
		object.launchURL("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		// locators or page object
		
		By userName = By.id("email");
		By password = By.id("pass");
		
		object.getElement(userName).sendKeys("tarafdarmohammed@gmail.com");
		object.getElement(password).sendKeys("Tarafdar1234");
		
		Thread.sleep(1000);
		
		//object.closeBrowser();
		
		Thread.sleep(1000);
		
		object.closeBrowser();
 		
	
	}
	
	public WebDriver initialDriver(String browser) {
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
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public void launchURL(String url) {
		driver.get(url);
	}
	
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void closeBrowser() {
		driver.quit();;
	}
	
	

}
