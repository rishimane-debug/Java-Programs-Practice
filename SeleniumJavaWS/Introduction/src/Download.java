import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import org.openqa.selenium.chrome.ChromeOptions;

public class Download {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		String downloadPath = "C:\\Users\\rharidas\\Downloads\\New";
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("download.default_directory", downloadPath);
		
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("prefs", map);
		
		WebDriver driver = new ChromeDriver(option);

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		Thread.sleep(2000);
		driver.findElement(By.id("downloadButton")).click();
	}

}
