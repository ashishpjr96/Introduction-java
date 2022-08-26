import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesAssesment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users/10657060//Documents//Selelnium_notes//chromedriver");
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Nested Frames")).click();
		
		
		//System.out.println(driver.findElements(By.tagName("frame")).size());
		
		driver.switchTo().frame(0);
		
	//	System.out.println(driver.findElements(By.tagName("frame")).size());
		
		driver.switchTo().frame(1);
		
		System.out.println(driver.findElement(By.cssSelector("[id='content']")).getText());
	}

}
