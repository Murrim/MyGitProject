package com.git.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WayFair {
	
	static WebDriver dr;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hkhan\\OneDrive\\Desktop\\chromedriver.exe");
	    dr = new ChromeDriver();
	    dr.get("https://www.wayfair.com");
	}
	
	
	   

}
