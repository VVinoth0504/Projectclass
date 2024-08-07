package org.floor;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlink {
	
	private Brokenlink () {}
	
	static Brokenlink bl = null;
	
	public static Brokenlink justInstance() {
		if(bl==null) {
			bl = new Brokenlink();
		}
		return bl;
		
	}
	
	public static void main(String [] args) throws Throwable, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> links = driver.findElements(By.tagName("link"));
		Iterator<WebElement> iterator = links.iterator();
		while (iterator.hasNext()) {
			WebElement link = iterator.next();
			String href = link.getAttribute("href");
			if (href==null || href.isEmpty()) {
				System.out.println("Given link is empty or null");
			}
//			else if (!href.startsWith("https://www.amazon.in/")){
//				System.out.println("Given link is not to our application" + href);
//			}
			else { 
				HttpURLConnection http = (HttpURLConnection) (new URL(href)). openConnection();
				http.setRequestMethod("HEAD");
				http.connect();
				int responseCode = http.getResponseCode();
				if(responseCode==200) {
					System.out.println("Not a Broken link" + href);
				}else {
					System.out.println("Broken link" + href);
				}
			}
		}
		
	}

}
