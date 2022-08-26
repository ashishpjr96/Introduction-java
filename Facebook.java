import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
 System.setProperty("webdriver.chrome.driver", "//Users/10657060//Documents//Selelnium_notes//chromedriver");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 
		 driver.get("http://facebook.com");
		 
		 //tagname[@attribute='value']-xpath
		 
		 //regular expression -> //tagname[contains(@attribute,'value')]-xpath regular expression
		 
	/*	 driver.findElement(By.xpath("//*[@name='email']")).sendKeys("emailaddres");
		 
		 driver.findElement(By.cssSelector("input#pass.inputtext._55r1._6luy._9npi")).sendKeys("password");
	driver.findElement(By.xpath("//*[@type='submit']")).click();*/
	
	//String text =driver.findElement(By.xpath("//*[@id=‘email_container’]/div[2]")).getText();
	//System.out.println(text);
		 
		//driver.quit();
		 
         //tagname[attribute='value']-cssSelector
		 
		 //regular expression ->"tagname[Attribute*='value']"-css regular expression 
		 
		 driver.findElement(By.cssSelector("input[type='text']")).sendKeys("emailadress");
		 driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("passwordcssSlector");
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		 
		   File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(src ,new File("/Users/10657060/Downloads/screenshot.png"));
	}

}
