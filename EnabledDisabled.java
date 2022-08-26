import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EnabledDisabled {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users/10657060//Documents//Selelnium_notes//chromedriver");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println( driver.findElement(By.id("Div1")).getAttribute("style"));
		 
		 driver.findElement(By.xpath("(//input[@value='RoundTrip'])[1]")).click();
		 
		 System.out.println( driver.findElement(By.id("Div1")).getAttribute("style"));
		 
		 if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		 {
			System.out.println("Round trip radio button is Enabled"); 
			Assert.assertTrue(true);
		 
		 }
		 else
		 {
			 Assert.assertTrue(false);
			 
		 }
		 
		 driver.quit();
}
}