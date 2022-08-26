import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users/10657060//Documents//Selelnium_notes//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
      Set<String> windows=driver.getWindowHandles();
		
		Iterator <String >it= windows.iterator();
		
	String parentID=it.next();
	String childID =it.next();
	
	driver.switchTo().window(childID);
		System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
	
	
	 driver.switchTo().window(parentID);
	 
	System.out.println( driver.findElement(By.cssSelector(".example h3")).getText()); 
		
		

	}

}
