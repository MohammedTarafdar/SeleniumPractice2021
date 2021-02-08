package com.testNG.practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupsAnnotation {
	
	@BeforeMethod
	public void setup() {
		System.out.println("Launch your URL");
	}
	
	@Test(priority = 6, groups = "test")		
	public void firstTest() {
		System.out.println("This is test number one");
	}
	
	@Test(priority = 7, groups = "logo")		
	public void catTest() {
		System.out.println("This is cat test");
	}
	
	@Test(priority = 8, groups = "test")		
	public void appleTest() {
		System.out.println("This is an apple test");
	}
	
	@Test(priority = 5, groups = "logo")			
	public void lastTest() {
		System.out.println("This is last test");
	}
	
	@Test(priority = 1, groups = "test")		
	public void playGroundTest() {
		System.out.println("This test about play ground");
	}
	
	@Test(priority = 3)		
	public void newTestone() {
		System.out.println("This test should be the first test");
	}
	
	@Test(priority = 4)		
	public void newTestTwo() {
		System.out.println("This test should be the second test");
	}
	
	@Test(priority = 2)		
	public void newTestThree() {
		System.out.println("This test should be the third test");
	}
	
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Quit your Browser");
	}

}
