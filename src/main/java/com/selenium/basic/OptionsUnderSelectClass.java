package com.selenium.basic;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OptionsUnderSelectClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("u_8_b")).sendKeys("Mohammed");
		driver.findElement(By.name("firstname")).sendKeys("Mohammed");
		//driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("Mohammed");
		
		
		
		/*
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> iterator = allWindows.iterator();
		
		while(iterator.hasNext()) {
			String childWindow = iterator.next();
			if(! mainWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				driver.findElement(By.id("u_8_b")).click();
				driver.findElement(By.id("u_8_b")).sendKeys("Mohammed");
			}
		}
		*/
		/*
		WebElement month = driver.findElement(By.id("month"));
		
		Select select = new Select(month);
		List<WebElement> monthList = select.getOptions();
		System.out.println("List of month is : " + monthList);
		*/
		

	}

}
