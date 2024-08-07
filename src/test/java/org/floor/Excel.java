package org.floor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel {
	
	public static void main (String [] args) throws IOException, InterruptedException, AWTException {
		
		//System.setProperty("webdriver.edge.driver","C:\\Users\\monika.v\\eclipse-workspace\\MAVEN\\target\\Driver\\msedgedriver.exe");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		String url ="https://www.naukri.com/registration/createAccount?othersrcp=22636";
		//driver.get("https://www.amazon.com/");
		driver.get(url);
		driver.manage().window().maximize();
		
		
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
//		until.sendKeys("vicky");
	
		
//		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
//		WebElement tbody = table.findElement(By.tagName("tbody"));
//		List<WebElement> trows = tbody.findElements(By.tagName("tr"));
//		for (int i=0; i<trows.size(); i++) {
//			WebElement row = trows.get(i);
//		    List<WebElement> tdata = row.findElements(By.tagName("td"));
//		
//				WebElement text = tdata.get(0);
//			    String cmp = text.getText();
//				System.out.println("company Name" + cmp);
//				
//				if(cmp.contains("Nestle India")) {
//					WebElement data2 = tdata.get(2);
//					String text2 = data2.getText();
//					System.out.println("Nestle India" + text2);
//				}
//				else {
//					System.out.println("company name not matched" + cmp);
//					
//				}
//					
//				}
			
		

		driver.findElement(By.xpath("(//div[@class='textWrap'])[1]")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Runtime.getRuntime().exec("\"C:\\Users\\monika.v\\Desktop\\vinoth.exe\"");

		
		
		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("apple iphone 14",Keys.ENTER);
//		driver.findElement(By.xpath("(//span[contains(text(),'Apple iPhone 14')])[7]")).click();
//		driver.findElement(By.xpath("(//span[contains(text(),'Apple iPhone 14')])[8]")).click();
//		driver.findElement(By.xpath("(//span[contains(text(),'Apple iPhone 14')])[9]")).click();
//	
//		 String parent =  driver.getWindowHandle();
//		 System.out.println(parent);
//		 Set<String> child = driver.getWindowHandles();
//		 System.out.println(child);
//		 List<String> li = new ArrayList<String>(child);
//		 driver.switchTo().window(li.get(3));
////		 for(String x: child) {
////			 if(!x.equals(parent)) {
////				 driver.switchTo().window(x);
////			 }
//			 
//		// }

		
		
		
//	    WebElement user = driver.findElement(By.id("email"));
//		WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
//		WebElement down = driver.findElement(By.xpath("//a[text()='Careers']"));
//		
//		String attribute = user.getAttribute("name");
//		System.out.println(attribute);
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].setAttribute('value','selenium')",user,login);
//		Object script = js.executeScript("return arguments[0].getAttribute('value')",user);
//		System.out.println(script );
//		//js.executeScript("arguments[1].click()",user,login);
//		js.executeScript("arguments[0].setAttribute('style','background:blue;border:5px solid yellow')",user,login);
//		js.executeScript("arguments[0].scrollIntoView(true)",down);
//		Thread.sleep(3000);
//		js.executeScript("arguments[0].scrollIntoView(false)",user);
//	
		
		
		
		
		
		
//		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
//		Alert simple = driver.switchTo().alert();
//		Thread.sleep(3000);
//		simple.accept();
//		
//		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
//		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		
//		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
//		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
//		Thread.sleep(3000);
//		Alert prompt = driver.switchTo().alert();
//		String text = prompt.getText();
//		System.out.println(text);
//		prompt.accept();
//	
		
		
//		Actions a = new Actions(driver);
//		WebElement bank = driver.findElement(By.xpath("//a[contains(text(),' BANK ')]"));
//		WebElement drag = driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']"));
//		a.dragAndDrop(bank, drag).build().perform();
//		
//	    WebElement drag2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
//		WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
//		a.dragAndDrop(drag2,drop).build().perform();
//		
//         WebElement debit = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
//         WebElement drag1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
//    	a.dragAndDrop(debit, drag1).build().perform();
//    	
//    	WebElement drag3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
//        WebElement drop2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
//   	    a.dragAndDrop(drag3, drop2).build().perform();
//		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File des = new File("C:\\Users\\monika.v\\eclipse-workspace\\MAVEN\\target\\screen.png");
//		FileUtils.copyFile(src, des);
//		
		
		
		//WebElement user = driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number')]"));
	//	user.sendKeys("virat");
		
		
		//WebElement open = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	//	Actions action = new Actions(driver);
//		action.doubleClick(user).perform();
	//	action.contextClick(user).build().perform();
		//action.moveToElement(open).click().perform();
		
		//Thread.sleep(4500);
		
//		Robot rob = new Robot();
//		rob.keyPress(KeyEvent.VK_DOWN);
//		rob.keyRelease(KeyEvent.VK_DOWN);
//		rob.keyPress(KeyEvent.VK_DOWN);
//		rob.keyRelease(KeyEvent.VK_DOWN);
//		rob.keyPress(KeyEvent.VK_DOWN);
//		rob.keyRelease(KeyEvent.VK_DOWN);
//		rob.keyPress(KeyEvent.VK_ENTER);
//	    rob.keyRelease(KeyEvent.VK_ENTER);
//		rob.keyPress(KeyEvent.VK_TAB);
//		rob.keyRelease(KeyEvent.VK_TAB);
//		Thread.sleep(3000);
//		rob.keyPress(KeyEvent.VK_CONTROL);
//		rob.keyPress(KeyEvent.VK_V);
//		rob.keyRelease(KeyEvent.VK_CONTROL);
//		rob.keyRelease(KeyEvent.VK_V);
//	
//	
//		  
		
  		
      
		
		
		
	
		
		
	}

	
	
	}

	
