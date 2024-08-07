package org.floor;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mock {
	
	public static void main (String [] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	try {
      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("google pixel",Keys.ENTER);
       List<WebElement> mob = driver.findElements(By.className("KzDlHZ"));
    	List<WebElement> price = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
	
       	File f = new File("C:\\Users\\monika.v\\eclipse-workspace\\MAVEN\\target\\mock.xlsx");
        FileOutputStream file = new FileOutputStream(f);
        XSSFWorkbook work = new XSSFWorkbook();
        XSSFSheet sheet = work.createSheet("mobile");
        for(int i=0; i<mob.size(); i++) {
        XSSFRow row = sheet.createRow(i);
        WebElement mob1 = mob.get(i);
       String mobname =  mob1.getText();
       WebElement price1 = price.get(i);
       String pricelist = price1.getText();
       System.out.println("Mobile Name"+ mobname);
       System.out.println("price" + pricelist);
        row.createCell(0).setCellValue( mobname);
        row.createCell(1).setCellValue(pricelist);
       
        }
        work.write(file);
        
     
	}catch(Exception e) {
		
   
		  
      }
      
//     
		
	}
    
   
     
	 }
		
	

	
