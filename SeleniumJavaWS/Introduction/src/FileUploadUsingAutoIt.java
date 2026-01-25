import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadUsingAutoIt {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rajteachers.net/pdf-to-jpg");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".upload-btn")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\rharidas\\Downloads\\File Upload\\upload1.exe");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)" );
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='convert-btn']")));
		driver.findElement(By.cssSelector("button[class*='convert-btn']")).click();
		

	}

}
