package org.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartTask {
	public static void main(String[]args) throws IOException, InterruptedException{
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
	    driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		try{
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		}catch(Exception e){
			System.out.println("Not clickable");
		}
		WebElement search= driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("realme",Keys.ENTER);
		   
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		File file =new File(".\\selenium\\org.selenium\target\thendral.xlsx");
		HSSFWorkbook  book= new HSSFWorkbook();
	    HSSFSheet sheet = book.createSheet("Mobiles List");
		   
		   for(int i=0;i<name.size();i++){
			 WebElement S=name.get(i);
			  String text=S.getText();
		      HSSFRow row =sheet.createRow(i);
		      HSSFCell col = row.createCell(0);
		        Thread.sleep(2000);
		        col.setCellValue("realme");
		        book.write();
		        book.close();
		        
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		   for(int j=0;j<price.size();j++){
			        WebElement s= price.get(j);
			        String text1 =s.getText();
			       HSSFCell co= row.createCell(1);
			       co.setCellValue(text1);
			        
			   
		   }
		        
		   
			}}	
	}


