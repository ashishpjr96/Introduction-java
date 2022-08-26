import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users/10657060//Documents//Selelnium_notes//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		Actions a =new Actions (driver);
		
		WebElement move =driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
		
		// typing string in upper case and double click 
		a.moveToElement(driver.findElement(By.cssSelector("[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello ashish").doubleClick().build().perform();
		
		//move to specific element & right click 
		a.moveToElement(move).contextClick().build().perform();
		
				

}
}