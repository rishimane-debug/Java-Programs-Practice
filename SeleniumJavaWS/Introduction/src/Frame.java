import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ChromeDriver driver1 = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
//		driver.get("https://rahulshettyacademy.com/loginpagePractise/");		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class = 'demo-frame']"));
		driver.switchTo().frame(frame);
//		driver.findElement(By.id("draggable")).click();
//		
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//h1[text() = 'Droppable']")).getText());

	}

}
