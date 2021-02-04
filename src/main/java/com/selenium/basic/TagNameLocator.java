package com.selenium.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");

		// to get number of link
		List<WebElement> listOfLink = driver.findElements(By.tagName("a"));
		int numberOfLink = listOfLink.size();
		System.out.println("Total number of link : " + numberOfLink);

		// to print all the links with text or empty

		for (int i = 0; i < listOfLink.size(); i++) {
			String linkText = listOfLink.get(i).getText();
			System.out.println(i + " = => " + linkText);
		}
		System.out.println("= = = =");
		
		// to print all the links with text only
		/*
		for (int i = 0; i < listOfLink.size(); i++) {
			String linkText = listOfLink.get(i).getText();
			
			if (linkText.isEmpty()) {
				
			}
			else {
				System.out.println(i + " = => " + linkText);
			}
		}
		System.out.println("= = = =");
		*/
		// optimize your code
		for (int i = 0; i < listOfLink.size(); i++) {
			String linkText = listOfLink.get(i).getText();
			
			if (! linkText.isEmpty()) {
				System.out.println(i + " = => " + linkText);
			}
			
		}
		System.out.println("= = = =");
		
		// how to print all the link-text and url related with that link-text
		
		for (int i = 0; i < listOfLink.size(); i++) {
			if (! listOfLink.isEmpty()) {
				String linkText = listOfLink.get(i).getText();
				String attributeValue = listOfLink.get(i).getAttribute("href");
				System.out.println(i + " = => " + linkText + " = => " + attributeValue);
				
			}
		}
		
		Thread.sleep(1000);
		driver.quit();

	}

}
