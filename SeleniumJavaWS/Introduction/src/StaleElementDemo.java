
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class StaleElementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement uname  = driver.findElement(By.id("user-name"));
		driver.navigate().refresh();
		uname.sendKeys("rushikesh");
		String actual = "rushi";
		String expected = "Mane";
		
		Assert.assertEquals(actual, expected, "Test is failed ");
		
		
		
		
	}

}
