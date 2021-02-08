package com.testNG.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class GoogleTitleTest {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.com");
	}
	
	@Test
	public void googleTitleTest() {
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		Assert.assertEquals(pageTitle, "Google", "Page title is not match");
	}
	
	@Test
	public void googlePageTitleTest() {
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		Assert.assertEquals(pageTitle, "Google#", "Page title is not match");
	}
	
	// java.lang.AssertionError: Page title is not match expected [Google#] 
	// but found [Google]
	
	@Test
	public void mailLinkTest() {
		Boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
		Assert.assertTrue(b);
		
	}
	
	@AfterMethod 
	public void tearDown() {
		driver.quit();
	}

}
