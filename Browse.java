package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browse {
	public static void main(String[]args){
		try{
			WebDriverManager.edgedriver().setup();
			WebDriver driver =new EdgeDriver();
		    driver.get("https://www.naukri.com/");
		    System.exit(0);
		
		}
		catch(Exception e){
			System.out.println("success");
			
		}
		finally{
			System.out.println("finally");
		}
			
		}}