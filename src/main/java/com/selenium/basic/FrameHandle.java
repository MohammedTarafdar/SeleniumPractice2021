package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import okhttp3.internal.http2.Header;

public class FrameHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://www.londonfreelance.org/cources/frames/index.html");
		driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
		WebElement header = driver.findElement(By.xpath("//h2[text()='Title bar']"));
		System.out.println(header.getText());

	}

}
