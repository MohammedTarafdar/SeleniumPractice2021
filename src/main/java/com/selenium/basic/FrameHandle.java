package com.selenium.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("http://www.londonfreelance.org/cources/frames/index.html");

		// how many frame is there?
		List<WebElement> frameList = driver.findElements(By.tagName("frame"));
		System.out.println("Total number of frame is : " + frameList.size());
		
		if (frameList.size() > 0) {
			// driver.switchTo().frame(2); // by index
			// driver.switchTo().frame("main"); // by id/name
			driver.switchTo().frame(driver.findElement(By.name("main")));

			WebElement header = driver.findElement(By.xpath("//h2[text()='Title bar ']"));
			System.out.println(header.getText());
			
			// to come back to main page
			driver.switchTo().defaultContent();
			// new
			// driver.switchTo().parentFrame();
		}
		else {
			System.out.println("There is no frame in this page.");
		}

		

	}

}
