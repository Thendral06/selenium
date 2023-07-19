package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {
	public static void main(String[]args){
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    WebElement price = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
	    JavaScriptExecutor js =(JavaScriptExecutor)driver;
	    
	    }

	
		
	}


