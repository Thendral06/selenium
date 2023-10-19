package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drop1 {
	public static void main(String[]args) throws InterruptedException{
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
	    driver.get("");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[text()='Forgotten password?']//following::div[2]")).click();
	    
   
// Select s = new Select(driver.findElement(By.id("day")));
//List<WebElement> day=s.getOptions();
//   for(WebElement x:day){
//	   System.out.println(x.getText());
//	}
}}
