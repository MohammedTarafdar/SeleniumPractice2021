package com.tools.qa;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowsHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/browser-windows");
		
		String pageTitle = driver.getTitle();
		System.out.println("Current page Title is : " + pageTitle);
		
		/*
		// to click first button "New Tab"
		driver.findElement(By.id("tabButton")).click();
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Text of New Tab is : " + text);

		// to click second button "New Window"
		driver.findElement(By.id("windowButton")).click();
		WebElement headingElement = driver.findElement(By.id("sampleHeading"));
		String textValue = headingElement.getText();
		System.out.println("Text of New Window is : " + textValue);

		// org.openqa.selenium.NoSuchElementException: no such element: Unable to locate
		// element:
		// {"method":"css selector","selector":"#sampleHeading"}
		*/
		
		// To open child window within the main window
		driver.findElement(By.id("windowButton")).click();
		
		// To get handle of the windows
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		// To iterate with Iterator
		Iterator<String> iterator = allWindowHandles.iterator();
		
		//
		while(iterator.hasNext()) {
			String childWindow = iterator.next();
				if(!mainWindowHandle.equalsIgnoreCase(childWindow)) {
					driver.switchTo().window(childWindow);
					WebElement headingElement = driver.findElement(By.id("sampleHeading"));
					String textValue = headingElement.getText();
					System.out.println("Text of New Window is : " + textValue);
					driver.close();
					System.out.println("Child window closed");
				}
		}
		
		driver.switchTo().window(mainWindowHandle);
		
		String pageNewTitle = driver.getTitle();
		System.out.println("Current page Title after handle window is : " + pageNewTitle);
		
		
		

		Thread.sleep(2000);
		driver.quit();

	}

}
