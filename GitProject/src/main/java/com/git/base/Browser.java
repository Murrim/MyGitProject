package com.git.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	static WebDriver dr;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hkhan\\OneDrive\\Desktop\\chromedriver.exe");
	   dr = new ChromeDriver();
	   
	   dr.get("https://www.osaconsultingtech.com");
	   String actualTitle = dr.getTitle();
	   System.out.println(actualTitle);
	   String expectedTitle = "OSA Consulting Tech Corp || Best Available Resources For Software Industry";
	   Varification.varify(actualTitle, expectedTitle);
	   dr.findElement(By.linkText("About")).click();
	   dr.findElement(By.linkText("Forum")).click();
	   dr.findElement(By.id("username")).sendKeys("hkhan211096@gmail.com");
	   dr.findElement(By.id("password")).sendKeys("Hkhan211096@");
	   
	}

}
