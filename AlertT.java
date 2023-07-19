package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertT {
	public static void main(String[]args) throws InterruptedException{
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
	    driver.get("https://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	    Alert d=driver.switchTo().alert();
	   // d.accept();
	    String text =d.getText();
	    System.out.println(text);
	    d.accept();
	    
	    Thread.sleep(2000);
	   WebElement f= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
       f.click();
    
       Alert d1= driver.switchTo().alert();
      d1 .dismiss();
       Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	    Alert s1= driver.switchTo().alert();
	    s1.sendKeys("Thendral");
	    //String text3 =s1.getAttribute();
	    //sy
	    
	}

}
