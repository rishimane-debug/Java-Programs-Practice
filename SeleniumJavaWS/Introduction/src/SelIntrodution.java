import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

public class SelIntrodution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		
//		System.setProperty("webdriver.edge.driver", "C:\\Eclipse\\Drivers\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		
//		ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
//		driver.get("www.google.com");
//		System.out.println("Hello World");

	}

}