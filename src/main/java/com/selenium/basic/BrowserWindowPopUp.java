package com.selenium.basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://popuptest.com/goodpopups.html");
		String parentWindowTitle = driver.getTitle();
		System.out.println("Parent window title is : " + parentWindowTitle);
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		
		String parentWindow = iterator.next();
		System.out.println("Parent window ID :" + parentWindow);
		
		String childWindow = iterator.next();
		System.out.println("child window ID : " + childWindow);
		
		driver.switchTo().window(childWindow);
		String childWindowTitle = driver.getTitle();
		System.out.println("Child window title is : " + childWindowTitle);
		driver.close();
		
		driver.switchTo().window(parentWindow);
		String parentWindowTitleNew = driver.getTitle();
		System.out.println("Our parent window title is : " + parentWindowTitleNew);
		
		driver.quit();
		
		
		

	}

}
