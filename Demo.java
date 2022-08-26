import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "//Users/10657060//Documents//Selelnium_notes//chromedriver");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://google.com");
		 
		String title= driver.getTitle();
		
		 System.out.println( title);
		 
		String currentpageUrl= driver.getCurrentUrl();
		 
		 System.out.println( currentpageUrl);
		 
		 System.out.println( driver.getPageSource());
		 
		 
		 
		 
		 driver.get("http://yahoo.com");
		 
		String title2= driver.getTitle();
		
		 System.out.println( title2);
		 
		String currentpageUrl2= driver.getCurrentUrl();
		
		 System.out.println( currentpageUrl2);
		 
		 driver.navigate().back();
		 
		System.out.println(driver.getTitle());
			
		 
		 
		 driver.navigate().forward();
		 System.out.println(driver.getTitle());
		 
		 
		 driver.quit();
		 
	}

}
