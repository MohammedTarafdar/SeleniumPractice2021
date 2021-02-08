package com.testNG.practice;

import org.testng.annotations.*;

public class TestNGBasic {
	/*	@BeforeMethod
	 *	@Test 
	 *	@AfterMethod
	 *
	 *	@BeforeMethod
	 *	@Test 
	 *	@AfterMethod
	 *
	 *	@BeforeMethod
	 *	@Test 
	 *	@AfterMethod
	 */
	
	
	@BeforeSuite	// 1
	public void setUp() {
		System.out.println("Setup System Property for Chrome");
	}
	
	@BeforeTest		//	2
	public void launchBrowser() {
		System.out.println("Launch Chrome Browser");
	}
	
	@BeforeClass	//	3
	private void enterURL() {
		System.out.println("Enter URL");
	}
	
	@BeforeMethod	//	4
	public void logIn () {
		System.out.println("LogIn Method");
	}
	
	@Test			//	5/1
	public void googleTitleTest() {
		System.out.println("Google title test");
	}
	
	@Test			//	5/2
	public void getTitle() {
		System.out.println("Print page title");
	}
	
	@Test
	public void logoTest() {
		System.out.println("Print Logo");
	}
	
	@Test
	public void clickLogIn() {
		System.out.println("Click on Login link");
	}
	
	
	@AfterMethod	//	6
	public void logOut() {
		System.out.println("LogOut from app.");
	}
	
	@AfterClass		//	7
	public void deleteAllCookies() {
		System.out.println("Delete all cookies");
	}
	
	@AfterTest		//	8
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	@AfterSuite		//9
	public void printReport() {
		System.out.println("Print your Report");
	}
	
	

}
