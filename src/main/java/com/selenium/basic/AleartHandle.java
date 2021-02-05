package com.selenium.basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AleartHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		WebElement alertButton = driver.findElement(By.id("alertButton"));
		alertButton.click();
		
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		System.err.println("Alert message is : " + alertMessage);
		
		if (alertMessage.equalsIgnoreCase("You clicked a button")) {
			System.out.println("You have correct Message.");
		}
		else {
			System.out.println("You have Incorrect Message.");
		}
		
		Thread.sleep(1000);
		alert.accept();
		
		// to dismiss
		//alert.dismiss();
		
		Thread.sleep(1000);
		driver.quit();

	}

}
