import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Greenkartdynamic {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot","Capsicum"};

		System.setProperty("webdriver.chrome.driver", "//Users/10657060//Documents//Selelnium_notes//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait w= new WebDriverWait(driver ,5);  //explicit wait

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		Thread.sleep(3000);  //time need to find items to click
		
		addItmes(driver ,itemsNeeded );
		
		
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//div[@Class='cart-preview active'] //button")).click();
		
		///Explicit wait 
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.xpath("//div[@class='promoWrapper'] //button")).click();
		
		
		
		///Explicit wait 
	
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
	System.out.println(	driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void addItmes(WebDriver driver ,String[] itemsNeeded )
	{
		int j=0;
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));

	for (int i = 0; i < items.size(); i++) {
		// Brocolli - 1kg
		// after using slipt("-") -> [0]brocolli ,[1]1kg

		String[] name = items.get(i).getText().split("-");  //slipt is used to remove unwanted text 
		
		String formatedName = name[0].trim();  ///trim is used to remove whitespace

		// convert array into arraylist for easy search 

		// here we check if the name you extracted is present in arraylist or not
		
		List itemsNeededList = Arrays.asList(itemsNeeded); // in order to avoid of passing hardcoded  value we first convert array to arralist
		
	

		if (itemsNeededList.contains(formatedName))

		{
			j++; // to increase array size "itemsNeeded" 
			
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
			if (j == itemsNeeded.length)
			{
				break;
			}
		}

	}

}
}