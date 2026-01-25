import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ControlPlusA {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Actions ac = new Actions(driver);
		//performing ctr + A
		ac.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		//performing ctr + c 
		ac.keyDown(Keys.CONTROL).sendKeys("c").build().perform();

	}

}
