import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users/10657060//Documents//Selelnium_notes//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companions");

		driver.findElement(By.id("travel_date")).click();

		while (!driver.findElement(By.cssSelector("div[class='datepicker-days'] [class='datepicker-switch']")).getText()
				.contains("February")) {
			driver.findElement(By.cssSelector("div[class='datepicker-days'] [class='next']")).click();
		}
		// grab common attribute then put it into list then iterate
		List<WebElement> date = driver.findElements(By.cssSelector(".day"));

		int count = driver.findElements(By.cssSelector(".day")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
			if (text.equalsIgnoreCase("25"))

			{
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}
		}

	}

}
