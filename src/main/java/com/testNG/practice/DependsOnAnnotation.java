package com.testNG.practice;

import org.testng.annotations.Test;

public class DependsOnAnnotation {
	
	@Test
	public void logIn() {
		System.out.println("Log in test");
	}
	
	@Test(dependsOnMethods = "cartPageTest")
	public void logOut() {
		System.out.println("Log out test");
	}
	
	@Test(dependsOnMethods = "logIn")
	public void homePage() {
		System.out.println("Home page test");
		int num = 5/0;
		System.out.println(num);
	}
	
	@Test(dependsOnMethods = "homePage")
	public void cartPageTest() {
		System.out.println("Cart page test");
	}

}
