package com.testNG.practice;

import org.testng.annotations.Test;

public class ExpectedExceptionAnnotation {
	
	@Test
	public void exceptionTestOne() {
		String string = "Hello100";
		Integer.parseInt(string);
				
	}
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void exceptionTestTwo() {
		String string = "Hello100";
		Integer.parseInt(string);
				
	}

}
