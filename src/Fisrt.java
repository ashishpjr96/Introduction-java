import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fisrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32 (5)//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https:google.com");
	}

}
