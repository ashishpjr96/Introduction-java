import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "//Users/10657060//Documents//Selelnium_notes//chromedriver");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 
		 driver.findElement(By.xpath("//*[@class='paxinfo']")).click();
		 
	 Thread.sleep(2000);
		 
		 System.out.println("before selection :" +driver.findElement(By.xpath("//*[@class='paxinfo']")).getText());
		 for (int i=1;i<6;i++) 
		 {
			 
		 driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();
		 
		 }
		 
		 driver.findElement(By.cssSelector("input[id='btnclosepaxoption']")).click();
		 
		 
		 System.out.println("After selection :"+driver.findElement(By.xpath("//*[@class='paxinfo']")).getText());
		 
		 driver.quit();
	}

}
