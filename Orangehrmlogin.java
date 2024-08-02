 package com.seleniumconcept;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrmlogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//launch browser
		WebDriver driver=new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize(); 
		
		//load the url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		
	    WebElement usernamefield=driver.findElement(By.xpath("//input[@placeholder='Username']"));
	    WebElement passwordfield=driver.findElement(By.xpath("//input[@name='password']"));
	    WebElement loginbtnfield=driver.findElement(By.tagName("button"));
	    
	    //send the input
	    usernamefield.sendKeys("Admin");
	    passwordfield.sendKeys("admin123");
	    loginbtnfield.click();
	    
	    //perform typecast of WebDriver to TakeScreenshot
	    Thread.sleep(2000);
	    File screenshot1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshot1,new File("seleniumconceptjat20//screenshot.png"));
	    
	    System.out.println("screenshot captured successfully...");
	    
	}

}
