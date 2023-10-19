package org.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[]args){
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		//driver.manage().timeouts().implicitlyWait(30,Timeunit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		
	List<WebElement> table =driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr[3]//td"));
	System.out.println(table.size());
	//table.
	
	for (int i=2; i<table.size();i++){
		WebElement element = table.get(i);
		System.out.println("Last 3 data value="+element.getText()); 
	}

	List<WebElement> table = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td[last()-1]"));
	System.out.println(table.size());

	
	

}}
