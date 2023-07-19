package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DROP {
	public static void main(String[]args) throws InterruptedException{
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
	    driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
        
		driver.findElement(By.xpath("//a[contains(text(),'Create new')]")).click();
		
WebElement d1 =driver.findElement(By.xpath("//select[@id='day']"));	
Select s= new Select(d1);
Thread.sleep(2000);
s.selectByIndex(5);
WebElement d2= driver.findElement(By.xpath("//select[@id='month']"));
s.selectByValue("1");
WebElement d3 =driver.findElement(By.xpath("//select[@id='year']"));
s.selectByVisibleText("2023");


WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
Select s1 =new Select(d1);
List<WebElement> mon= s.getOptions();
  for(WebElement x:mon){
	  System.out.println(x);
  }
	}

}
