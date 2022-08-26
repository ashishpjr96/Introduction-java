import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver =new ChromeDriver();
		
		driver .get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		
	//	System.out.println(driver.findElement(By.cssSelector("input[id ='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id ='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id ='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		
		//System.out.println(driver.findElement(By.cssSelector("input[id ='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
 Assert.assertTrue(driver.findElement(By.cssSelector("input[id ='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		 System.out.println("number of check box available on site "+ driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		 Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 5);
  driver.quit();
	}

}
