import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "//Users/10657060//Documents//Selelnium_notes//chromedriver");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 
		 driver.get("http://rediff.com");
		 
		 String str= driver.getTitle();
		 System.out.println(str);
		 
		 driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		 driver.findElement(By.xpath("//*[contains(@name,'login')]")).sendKeys("email address");
		 driver.findElement(By.cssSelector("input[type=*'password']")).sendKeys("passqord");
		 driver.findElement(By.xpath("//*[contains(@class,'signinbtn')]")).click();
		 
		 
		// driver.quit();
		 

	}

}
