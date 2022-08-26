import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "//Users/10657060//Documents//Selelnium_notes//chromedriver");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	WebElement	staticdrop =driver.findElement(By.xpath("//*[@name='ctl00$mainContent$DropDownListCurrency']"));
		 Select dropdown =new Select(staticdrop);
		 dropdown.selectByIndex(3);
		 
		String currency= dropdown.getFirstSelectedOption().getText();
		System.out.println("Selected curreny is :" + currency);
		
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		

		
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.quit();

}
	}
