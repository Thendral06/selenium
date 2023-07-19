package org.selenium;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Browser {
	//private static Object currentUrl;
	//private Object keys;

	public static void main(String[] args) throws Throwable{
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
	    driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//	    
//		
//		String Url1=driver.getCurrentUrl();
//		System.out.println(Url1);
//		
//		String title =driver.getTitle();
//		System.out.println(title);
//		
//		
//	WebElement s=driver.findElement(By.id("email"));
//	s.sendKeys("thendral061@gmail.com");
//	
//	WebElement s1=driver.findElement(By.id("pass"));
//	s1.sendKeys("9942366790");
//	
//	String attribute = s1.getAttribute("value");
//	System.out.println(attribute);
//		
		
		
   driver.findElement(By.xpath("//button[text()='✕']")).click();
   WebElement search= driver.findElement(By.xpath("//input[@type='text']"));
   search.sendKeys("realme",Keys.ENTER);
   
  
	}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebDriverWait wait = new WebDriverWait(driver,20);
////		wait.until(ExpectedConditions.)
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		//		driver.get("https://www.flipkart.com/");
////		driver.manage().window().maximize();
//		//driver.close();
//		
//		
//	}


