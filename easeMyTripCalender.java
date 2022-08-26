import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class easeMyTripCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users/10657060//Documents//Selelnium_notes//chromedriver");
		
        ChromeOptions options =new ChromeOptions();
        options.setExperimentalOption("excludeSwitches",

        	     Arrays.asList("disable-popup-blocking"));
        
        WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.easemytrip.com/");
		driver.findElement(By.id("ddate")).click();
		
		List<WebElement> days=driver.findElements(By.xpath("//*[@onclick='SelectDate(this.id)']"));
		
		int count =driver.findElements(By.xpath("//*[@onclick='SelectDate(this.id)']")).size();
       
		  for( int i=0; i<count;i++)
		  {
			  String selectedDate=driver.findElements(By.xpath("//*[@onclick='SelectDate(this.id)']")).get(i).getText();
			  
			  if(selectedDate.equalsIgnoreCase("28"))
			  {
				  driver.findElements(By.xpath("//*[@onclick='SelectDate(this.id)']")).get(i).click();
			  }
		  }
	}

}
