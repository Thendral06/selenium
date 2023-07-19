package org.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class act {
	public static void main(String[]args) throws Throwable{
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		try{
		
		WebElement log =driver.findElement(By.xpath("//button[text()='✕']"));
		log.click();
		}
		catch(Exception e){
			System.out.println("not clickable");
		}
		WebElement user =driver.findElement(By.xpath("//img[@alt='Grocery']"));
		user.click();
		
		Thread.sleep(2000);
		WebElement pin =driver.findElement(By.xpath("//input[@name='pincode']"));
		pin.sendKeys("614802");
		
		
		
		WebElement search=driver.findElement(By.xpath("//input[contains(@title,'Search grocery')]"));
		
		Actions d= new Actions(driver);
	    d.moveToElement(search).build().perform();
		
		
////		TakesScreenshot ts =(TakesScreenshot)driver;
////		File src = ts.getScreenshotAs(OutputType.FILE);
////		File des = new File("C:\\Users\\WINDOWS\\workspace\\selenium\\org.selenium\\target"\\folder\\.png");
////		FileUtils.copyFile(src, des);
//	
	}

}
