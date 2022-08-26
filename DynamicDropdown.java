import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "/Users/10657060/Documents/Selelnium_notes/chromedriver");
		 
		// WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","/Users/10657060/Documents/Selelnium_notes/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		 
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 
		 driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 
		 driver.findElement(By.xpath("//a[@value='BOM']")).click();
			 
		Thread.sleep(2000);
		 driver.findElement(By.xpath("(//a[@value='IXE'])[2]")).click();
		 
		
	}

}
