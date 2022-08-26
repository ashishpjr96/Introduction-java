import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users/10657060//Documents//Selelnium_notes//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// one trip
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		// From & To
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

		driver.findElement(By.xpath("//a[@value='JSA']")).click();
		System.out.println("From place name " + driver.findElement(By.xpath("//a[@value='JSA']")).getText());

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='UDR']"))
				.click();

		System.out.println("To place name :" + driver
				.findElement(
						By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='UDR']"))
				.getText());

		// calender
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		// enabled disabled

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("Round trip radio button is disabled ");
			Assert.assertTrue(true);

		} else {
			System.out.println("Round trip radio button is disabled ");
			Assert.assertTrue(false);

		}

		// checkbox

		driver.findElement(By.cssSelector("input[id ='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();

		// dropdown

		driver.findElement(By.xpath("//*[@class='paxinfo']")).click();

		Thread.sleep(2000);

		for (int i = 1; i < 6; i++) {

			driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();

		}

		driver.findElement(By.cssSelector("input[id='btnclosepaxoption']")).click();

		System.out.println("After selection :" + driver.findElement(By.xpath("//*[@class='paxinfo']")).getText());

		// click on search button
		driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();

	}

}
