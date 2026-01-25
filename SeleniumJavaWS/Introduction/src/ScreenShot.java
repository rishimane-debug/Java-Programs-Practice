//import org.openqa.selenium.chrome.ChromeDriver;





import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		ChromeDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().deleteAllCookies(); //clear all cookies
//		driver.manage().deleteCookieNamed(""); // clear perticular cookies
		
		//Taking screenshot
		
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src, new File("C:\\Eclipse\\SeleniumJavaWS\\Introduction\\bin\\ScreenShots\\Screenshot.png"));
		
		
		
		
		
		
		
	}}