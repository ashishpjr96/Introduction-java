package Locators;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String name = "Ashish";
		System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32 (5)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String paswrd1=getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//*[@id='inputUsername']")).sendKeys(name);
		
		
		driver.findElement(By.name("inputPassword")).sendKeys(paswrd1);

		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		
		Thread.sleep(1000);

		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

		System.out.println(driver.findElement(By.xpath("//*[@class='login-container']/h2")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//*[@class='login-container']/h2")).getText(),
				"Hello " + name + ",");
		driver.findElement(By.cssSelector(".logout-btn")).click();

	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//div[@class='forgot-pwd-container']/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@placeholder='Name']")).sendKeys("Ashu");
		driver.findElement(By.xpath("//form/input[2]")).sendKeys("ashishpjr@gmail.com");
		driver.findElement(By.cssSelector("form input:nth-child(4)")).sendKeys("123456");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		String s1= driver.findElement(By.cssSelector("p.infoMsg")).getText();
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		String [] s2=s1.split("'");
		System.out.println(s2[1]);
		     String pass= s2[1].split("'")[0];
		     return pass;
	}

}
