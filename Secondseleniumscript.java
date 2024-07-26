package com.seleniumconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secondseleniumscript {

	public static void main(String[] args) throws InterruptedException {
		
		//create driver instance
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.google.com/");
		//navigate to guvi website
	//	driver.navigate().to("https://www.guvi.in/");
		 
		 //to maximize
		 driver.manage().window().maximize();
		
		//print title
		String url=driver.getTitle();              //get the title of the page
	//	String sourceurl=driver.getPageSource();   //provide the entire source code
		String currenturl=driver.getCurrentUrl();  //url of the current website
		
		System.out.println("Title of website "+ url);
    //  System.out.println(sourceurl);
		System.out.println("Current url"+currenturl);
		
		Thread.sleep(3000);
		//reload the page
		driver.navigate().refresh();
		
	}

}
