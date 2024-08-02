package com.seleniumconcept;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.demoblaze.com/");
		 
		 //implicit with synchronization
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.manage().window().maximize();
		 
		 //click on element laptop and sony
		 driver.findElement(By.linkText("Laptops")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Sony vaio i5")).click();
		 
		 //click on add product to cart
		 driver.findElement(By.linkText("Add to cart")).click(); 
		 Thread.sleep(2000); 
		 
		 Alert al=driver.switchTo().alert();
		 
		 //get the text display on your screen to check
		 String alertext=al.getText();
		 System.out.println(alertext);
		 
		 //to accept and click
		 al.accept();
		 
		
		 
		 
	}

}
