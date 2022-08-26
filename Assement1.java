import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users/10657060//Documents//Selelnium_notes//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("checkBoxOption2")).click();
		String Label = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

		WebElement drop = driver.findElement(By.id("dropdown-class-example"));

		Select dropdown = new Select(drop);
		dropdown.selectByVisibleText(Label);

		driver.findElement(By.cssSelector("input[class='inputs']")).sendKeys(Label);

		driver.findElement(By.xpath("//*[@id='alertbtn']")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();
	}

}
