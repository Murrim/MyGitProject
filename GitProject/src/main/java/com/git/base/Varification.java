package com.git.base;

public class Varification {
	
	public static void varify(String actual , String expected) {
		
		if(actual.equals(expected)) {
			System.out.println("Test is passed");
		}else {
			
			System.out.println("Test is failed");
		}
		

		
	}

}
