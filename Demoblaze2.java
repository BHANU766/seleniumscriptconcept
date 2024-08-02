package com.seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze2 {

	public static void main(String[] args) throws InterruptedException {
		
		//create a chrome driver object
		WebDriver driver=new ChromeDriver();
		
		 driver.navigate().to("https://www.demoblaze.com/");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("cartur")).click();  //LAND ON CART PAGE
		 Thread.sleep(4000);
		 
		 driver.navigate().refresh();                  //AFTER REACHING TO THAT PAGE I WANT TO PERFORM REFRESH ACTION
		 
		 driver.navigate().back();                      //AFTER REFRESH ON CART PAGE I HAVE TO COME BACK TO PREVIOUS(HOME) PAGE
		

	}

}
