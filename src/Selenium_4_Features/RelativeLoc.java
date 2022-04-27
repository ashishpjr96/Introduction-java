package Selenium_4_Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32 (5)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		// syntax : driver.findElement(withTagname("XX").above(WebElemnt)
		
          //above
		WebElement nameField = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameField)).getText());

		// below
		WebElement dob = driver.findElement(By.xpath("//*[@for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dob)).click();

		// toleftOf
		WebElement leftTo = driver.findElement(By.xpath("//*[text()='Check me out if you Love IceCreams!']"));

		driver.findElement(with(By.tagName("input")).toLeftOf(leftTo)).click();

		// torightOf
		 WebElement toRight=  driver.findElement(By.xpath("//*[@value='option1']"));
		 String s= driver.findElement(with(By.tagName("label")).toRightOf(toRight)).getText();	
	      System.out.println(s);	 
	}

}
