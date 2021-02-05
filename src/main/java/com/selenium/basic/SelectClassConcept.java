package com.selenium.basic;

import java.time.Month;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassConcept {
	
	WebDriver driver;

	public static void main(String[] args) {
		
		//SelectClassConcept selectClass = new SelectClassConcept();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.id("u_0_2")).click();
		//driver.findElement(By.id("u_1_b")).sendKeys("Mohammed");
		//driver.findElement(By.name("firstname")).sendKeys("Mohammed");
		
		
		
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> iterator = allWindows.iterator();
		
		while(iterator.hasNext()) {
			String childWindow =iterator.next();
			if(!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				WebElement heading = driver.findElement(By.xpath("(//*[text()=\"Sign Up\"])[2]"));
				String headingValue = heading.getText();
				System.out.println("Child page heading is : " + headingValue);
				
				//driver.findElement(By.name("firstname")).sendKeys("Mohammed");
				
				
				
				
			}
		}
		
		
		
		/*
		// for parent
		String parentID = driver.getWindowHandle();
		System.out.println("parent ID : " + parentID);
		
		
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		// create an object for select class
		
		Select selectMonth = new Select(month);
		selectMonth.selectByVisibleText("Apr");
		
		Select selectDay = new Select(day);
		selectDay.selectByVisibleText("25");
		
		Select selectYear = new Select(year);
		selectYear.selectByVisibleText("1985");
		
		
		
		
		driver.quit();
		
		*/

	}
	
	
	

}
