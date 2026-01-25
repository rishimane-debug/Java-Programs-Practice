import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingSendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		C:\Users\rharidas\Downloads\download.xlsx

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/upload-download-test/");
		driver.manage().window().maximize();
		driver.findElement(By.id("downloadButton")).click();
		WebElement upload = driver.findElement(By.id("fileinput"));
		upload.sendKeys("C:\\Users\\rharidas\\Downloads\\download.xlsx");

	}

}
