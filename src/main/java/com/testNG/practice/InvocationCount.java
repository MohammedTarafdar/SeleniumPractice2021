package com.testNG.practice;

import org.testng.annotations.Test;

public class InvocationCount {
	
	/*
	 * PASSED: logIn
	* PASSED: homePageTest
	* PASSED: homePageTest
	* PASSED: homePageTest
	* PASSED: homePageTest
	* PASSED: homePageTest
	* PASSED: logOut
	 */
	
	@Test(priority = 1)
	public void logIn() {
		System.out.println("This is login test");
	}
	
	@Test(priority = 2, invocationCount = 5)
	public void homePageTest() {
		System.out.println("Home page test");
	}
	
	@Test(priority = 3)
	public void logOut() {
		System.out.println("This is log out test");
	}
	
	

}
