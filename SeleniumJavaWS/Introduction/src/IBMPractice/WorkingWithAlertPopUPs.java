package IBMPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
public class WorkingWithAlertPopUPs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.findElement(By.id("name")).sendKeys("Rushi");
		WebElement textBox = driver.findElement(By.id("name"));
		textBox.sendKeys("Rushi");
		driver.findElement(By.xpath("//input[@id = 'name']/following-sibling::input[1]")).click();
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println(msg);
		Thread.sleep(3000);
		alert.accept();
		textBox.sendKeys("RushiKesh");
		driver.findElement(By.xpath("//input[@id = 'name']/following-sibling::input[2]")).click();
		Alert alert1  = driver.switchTo().alert();
		String msg1 = alert1.getText();
		System.out.println(msg1);
		Thread.sleep(3000);
		alert1.dismiss();
		
	}

}
