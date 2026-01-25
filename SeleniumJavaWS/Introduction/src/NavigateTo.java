import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
//		ChromeDriver driver = new ChromeDriver();

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		URL url = new URL("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().to(url);
		driver.navigate().back();
		driver.navigate().forward();
//		driver.navigate().forward();
		

		
		

	}

}
