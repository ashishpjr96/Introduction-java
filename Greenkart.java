import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users/10657060//Documents//Selelnium_notes//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		//get  the list of products
		List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
		
		
		for (int i=0; i<products.size();i++)
		{
			
			// get name of product 
			String name=products.get(i).getText();
			
			//System.out.println(name);
			
			if(name.contains("Cucumber"))
			{
				
				// click on kart 
				
		//System.out.println("the selected item in the cart is :" + driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).getText());
		driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		break;
				
			}
		}
		
	}

}
