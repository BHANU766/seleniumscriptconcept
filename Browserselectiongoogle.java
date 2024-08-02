  package com.seleniumconcept;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browserselectiongoogle {
   
	public static void main(String[] args) throws InterruptedException, IOException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the browser name");
		
		String browser=sc.next().toLowerCase();
	    WebDriver driver=null;
		 
		System.out.println(browser);
		
	  	if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}else if(browser.equals("safari")) {
			driver=new SafariDriver();
		}else if(browser.equals("edge")) {			
			driver=new EdgeDriver();
		}else {
			System.out.println("invalid browser selection..");
			System.exit(0);
		}
		
		if(driver!=null) {
	//		testbrowser(driver);      OR
	//		Browserselectiongoogle.testbrowser(driver);			
	//		getloginorangehrm(driver);			
	//		linkselectiongoogle(driver);
	//		loginbuttonenable(driver);
			 getnumberoflinksondemoblaze(driver);
		}else {
			System.out.println("invalid browser selection..");
		}
				

	}
	
	public static void testbrowser(WebDriver driver) {
		driver.get("http://www.google.com");            //TO LAUNCH THE WEBSITE
		String title=driver.getTitle();                 //GET THE TITLE OF THE PARTICULAR PAGE
		System.out.println(title);                      //PRINT THE TITLE				
	}	
	
	
	
	public static void getloginorangehrm(WebDriver driver) throws InterruptedException, IOException {
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
	    FileUtils.copyFile(screenshot1,new File("seleniumconceptjat20//test1.png"));
	    
	    System.out.println("screenshot captured successfully...");
	    
	}
	
	
	
    //usecase for findelements()in webelement
	public static void linkselectiongoogle(WebDriver driver) {
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						
		driver.manage().window().maximize(); 
				
		//load the url
		driver.get("https://www.google.com");
		
		//find list of elements
	    try {
			List<WebElement> anchortagfieldlinks=driver.findElements(By.tagName("a"));   //COLLECT THE LIST OF ANCHOR TAG ELEMENTS
			int totalnolinks= anchortagfieldlinks.size();                                //FIND OUT SIZE OF ALL THE LINKS IN COLLECTING 1 VARIABLE
			System.out.println(totalnolinks);
			
			//iterate over each
			for(WebElement anchorlink : anchortagfieldlinks) {
				String linktext=anchorlink.getText();                   //IT IS PROVIDING ALL THE ATTRIBUTES			
				System.out.println(linktext);
				String attributename=anchorlink.getAttribute("href");   //IT IS PROVIDING ALL THE VALUES OF THE ATTRIBUTES
				System.out.println(attributename);
			}								
		} catch (Exception e) {			
			e.printStackTrace();
		}                                            
		
	} 
	
	
	
	public static void loginbuttonenable(WebDriver driver) {
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
								
		driver.manage().window().maximize(); 
						
		//load the url
		driver.get("https://www.guvi.in/register");
				
		//locate an element
		WebElement loginbtn=driver.findElement(By.cssSelector(".login")); 
				
		if(loginbtn.isEnabled()) {
			System.out.println("login button is enabled...");					
	 	}else {
			System.out.println("login button is disabled...");
 		}
				
	}
	
	
	
	public static void getnumberoflinksondemoblaze(WebDriver driver) {
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
								
		driver.manage().window().maximize(); 
						
		//load the url
		driver.get("https://www.demoblaze.com/");
		
		//locate all the items
		List<WebElement> allitems=driver.findElements(By.xpath("//a"));
		System.out.println(allitems);
		
		for(WebElement item:allitems) {
			System.out.println(item.getText());
			System.out.println(item.getSize());
			System.out.println(item.getAttribute("href"));
		}
		
		
		
	}
}
