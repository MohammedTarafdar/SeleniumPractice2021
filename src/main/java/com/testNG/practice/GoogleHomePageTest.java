package com.testNG.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleHomePageTest {
	
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
	}
	
	@Test
	public void GoogleLogoTest() {
		Boolean present = driver.findElement(By.id("logo")).isDisplayed();
		
	}
	
	@Test
	public void mailLinkTest() {
		Boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@Test
	public void firstTest() {
		System.out.println("This is test case number one");
	}

	@Test
	public void secondTest() {
		System.out.println("This is test case number two");
	}

	@Test
	public void thirdTest() {
		System.out.println("This is test number three");
	}

	@Test
	public void fourthTest() {
		System.out.println("This is test case number four");
	}
	
	@Test
	public void avoidThisTest() {
		System.out.println("Please avoid this test");
	}
	
	@AfterMethod 
	public void tearDown() {
		driver.quit();
	}
	
	

}
