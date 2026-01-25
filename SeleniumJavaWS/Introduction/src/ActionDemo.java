import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("span[id *='nav-link-accountList']"));
		WebElement textBox = driver.findElement(By.xpath("//input[contains(@id , 'twotabsearc')]"));
		a.moveToElement(move).contextClick().build().perform();
		a.moveToElement(textBox).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
	}

}
