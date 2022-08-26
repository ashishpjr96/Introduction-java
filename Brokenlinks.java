import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Brokenlinks {

	public static void main(String[] args) throws IOException, IOException {
		// TODO Auto-generated method stub
	  SoftAssert a= new Soft();
	  
		System.setProperty("webdriver.chrome.driver", "//Users/10657060//Documents//Selelnium_notes//chromedriver");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
	List<WebElement> 	links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	   
	  for (WebElement link:links)
	  {
		 String url= link.getAttribute("href");
	  }
		 
		
	//URL -class , Openconnection()-method
		HttpURLConnection  conn= (HttpURLConnection)new URL (url).openConnection();
	   conn.setRequestMethod("HEAD");
	   conn.connect();
	  int respcode= conn.getResponseCode();
	  
	  
	
	
	}

}
