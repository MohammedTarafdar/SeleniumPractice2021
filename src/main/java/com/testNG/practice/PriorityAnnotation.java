package com.testNG.practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityAnnotation {
	
	/*	= = > before priority keyword
	* PASSED: appleTest	1
	* PASSED: catTest	2
	* PASSED: firstTest	3
	* PASSED: lastTest	4
	* PASSED: newTestTwo	5
	* PASSED: newTestone	6
	* PASSED: newTestthree	7
	* PASSED: playGroundTest	8
	 */
	
	@BeforeMethod
	public void setup() {
		System.out.println("Launch your URL");
	}
	
	@Test(priority = 6)		//3
	public void firstTest() {
		System.out.println("This is test number one");
	}
	
	@Test(priority = 7)		// 2
	public void catTest() {
		System.out.println("This is cat test");
	}
	
	@Test(priority = 8)		// 1
	public void appleTest() {
		System.out.println("This is an apple test");
	}
	
	@Test(priority = 5)			//4
	public void lastTest() {
		System.out.println("This is last test");
	}
	
	@Test(priority = 1)		//	8
	public void playGroundTest() {
		System.out.println("This test about play ground");
	}
	
	@Test(priority = 3)		//6
	public void newTestone() {
		System.out.println("This test should be the first test");
	}
	
	@Test(priority = 4)		// 5
	public void newTestTwo() {
		System.out.println("This test should be the second test");
	}
	
	@Test(priority = 2)		//7
	public void newTestThree() {
		System.out.println("This test should be the third test");
	}
	
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Quit your Browser");
	}

}
