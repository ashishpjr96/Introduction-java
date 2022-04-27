package Selenium_4_Features;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newwindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32 (5)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//driver.switchTo().newWindow(WindowType.TAB); -->this is for new tab
		
		 driver.switchTo().newWindow(WindowType.WINDOW);  //to switch to new window 
		
	Set<String>handles=driver.getWindowHandles();
	
	 Iterator<String>it= handles.iterator();
	 
	    String parentWindow=it.next();
	        String childWindow= it.next();
	        
	        driver.switchTo().window(childWindow);
	        
	        driver.get("https://rahulshettyacademy.com/#/index");	
	        
	       String course=  driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
	       
	        driver.switchTo().window(parentWindow);
	      WebElement name=  driver.findElement(By.cssSelector("[name='name']"));
	      
	       name.sendKeys(course);
	       // taking partial screen shot using selenium 4 feature
	       File file= name.getScreenshotAs(OutputType.FILE);
	       FileUtils.copyFile(file, new File("logo.png") );
	       
	       
	       //get height & width
	       
	        System.out.println( name.getRect().getDimension().getHeight());
	           System.out.println( name.getRect().getDimension().getWidth());
	         
	         
	        }	    
	    
	}


