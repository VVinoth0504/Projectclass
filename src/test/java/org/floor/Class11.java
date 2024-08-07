package org.floor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class11 {
	
	public static void main (String [] args) throws IOException {
		
		File f = new File(".\\src\\test\\resources\\vii.properties");
		FileInputStream f1 = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(f1);
		String url = prop.getProperty("url");
		
		FileOutputStream f2 = new FileOutputStream(f);
		prop.setProperty("username", "vinoth");
		prop.save(f2, "updatedmyusername");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
	}

	
}
