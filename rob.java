package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rob {
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
		
		
		
		Actions s= new Actions(driver);
		WebElement d2 =driver.findElement(By.xpath("//a[text()='Login']"));
		s.contextClick(d2).build().perform();
		Robot d =new Robot();
		d.keyPress(KeyEvent.VK_DOWN);
		d.keyRelease(KeyEvent.VK_DOWN);
		
		d.keyPress(KeyEvent.VK_DOWN);
		d.keyRelease(KeyEvent.VK_DOWN);
		
		d.keyPress(KeyEvent.VK_DOWN);
		d.keyRelease(KeyEvent.VK_DOWN);
		
		d.keyPress(KeyEvent.VK_ENTER);
		d.keyRelease(KeyEvent.VK_ENTER);
		
		d.keyPress(KeyEvent.VK_TAB);
		d.keyRelease(KeyEvent.VK_TAB);
		
	
	}

}
