import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHanlding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "//Users/10657060//Documents//Selelnium_notes//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> windows=driver.getWindowHandles();  //[parent[0],child[1]]
		
		Iterator<String>it=windows.iterator();
		String parentId= it.next();  //parent [0]
		
		String childId= it.next();   //child[1]
		
		driver.switchTo().window(childId);
		
		
		System.out.println(driver.findElement(By.xpath("//*[@class='im-para red']")).getText());
		
		driver.findElement(By.xpath("//*[@class='im-para red']")).getText();
		
		String emailID=driver.findElement(By.xpath("//*[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(parentId);
		driver.findElement(By.cssSelector("[id='username']")).sendKeys(emailID);
		
	}

}
