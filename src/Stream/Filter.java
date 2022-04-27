package Stream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32 (5)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//*[@id='search-field']")).sendKeys("Rice");
		
		//list of weblements on veggie column
		List<WebElement>veggies=driver.findElements(By.xpath("//tr/td[1]"));
		
		List<WebElement>flitteredVeggies=veggies.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		
		
		Assert.assertEquals(veggies.size(), flitteredVeggies.size());
		
		
	}

}
