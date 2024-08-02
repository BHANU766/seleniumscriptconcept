package com.seleniumconcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fontproperties {

	public static void main(String[] args) {
		
		//launch browser
 		WebDriver driver=new ChromeDriver();
				
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		driver.manage().window().maximize(); 
				
		//load the url
		driver.get("https://www.guvi.in/register/"); 
		
		//locate an element
		WebElement signuptext=driver.findElement(By.xpath("//h2"));
		
		//read the font size
		String fontsize=signuptext.getCssValue("font-size");
		System.out.println(fontsize);
		
		String textcolor=signuptext.getCssValue("color");
		System.out.println(textcolor);
		
		String fontfamily=signuptext.getCssValue("font-family");
		System.out.println(fontfamily);
				
	}

}
