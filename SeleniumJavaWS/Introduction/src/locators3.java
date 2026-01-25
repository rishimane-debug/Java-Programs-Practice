import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String buttonText =driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		System.out.println(buttonText);
		String buttonText1 = driver.findElement(By.xpath("//button[text()='Practice']/parent::div/button[2]")).getText();
		System.out.println(buttonText1);
	}

}
