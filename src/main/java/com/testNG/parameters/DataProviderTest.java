package com.testNG.parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {
	
	// org.openqa.selenium.ElementClickInterceptedException: element click intercepted:
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.target.com");
	}
	/*
	@Test
	public void getPageTitle() {
		String pageTitle = driver.getTitle();
		System.out.println("Current page title is : " + pageTitle);
		
	}
	*/
	@Test
	public void createAccountWithDataTest(String email, String firstName, 
			String lastName, String phone, String password) {
		
		driver.findElement(By.xpath("(//*[@id=\"account\"])[1]")).click();	
		driver.findElement(By.xpath("//*[text()=\"Create account\"]")).click();
		
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("test1@gmail.com");
		
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("firstname")).sendKeys("Mohammed");
		
		driver.findElement(By.id("lastname")).clear();
		driver.findElement(By.id("lastname")).sendKeys("Tarafdar");
		
		driver.findElement(By.id("phone")).clear();
		driver.findElement(By.id("phone")).sendKeys("3451239876");
		
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Test1234");
		driver.findElement(By.xpath("//*[text()=\"show\"]")).click();
		
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
	

}
