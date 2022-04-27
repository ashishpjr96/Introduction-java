package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32 (5)//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//*[@id='inputUsername']")).sendKeys("Ashish");
		driver.findElement(By.name("inputPassword")).sendKeys("Poojary");
		driver.findElement(By.xpath("//*[contains(@class,'submit')]")).click();
		
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-container']/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@placeholder='Name']")).sendKeys("Ashu");
		driver.findElement(By.xpath("//form/input[2]")).sendKeys("ashishpjr@gmail.com");
		driver.findElement(By.cssSelector("form input:nth-child(4)")).sendKeys("123456");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		
		driver.findElement(By.cssSelector("button[class*='login']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("inputUsername")).sendKeys("Ashish");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        
        driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		
	}

}
