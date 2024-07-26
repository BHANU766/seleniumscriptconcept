package com.seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firstseleniumscript {

	public static void main(String[] args) throws InterruptedException {
		
		//setup the chrome driver
	//	ChromeDriver driver=new ChromeDriver();
		
		//setup the firefox driver
		FirefoxDriver driver=new FirefoxDriver();
		
		//load the url
		driver.get("https://www.google.com/");
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//locating an element
		Thread.sleep(2000);
		
    	WebElement searchelement=	driver.findElement(By.id("APjFqb"));
	
	    //type the input in text box
    	 searchelement.sendKeys("Guvi",Keys.ENTER);
    	 
    	 System.out.println("Script executed successfully");
		
		driver.close();
		

	}

}
