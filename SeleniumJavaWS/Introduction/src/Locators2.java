import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String uname = "Rushi";
//		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String pword = getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(uname);
		driver.findElement(By.name("inputPassword")).sendKeys(pword);
		driver.findElement(By.className("signInBtn")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String text = driver.findElement(By.tagName("p")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "You are successfully logged in.");
		
		String text2 = driver.findElement(By.xpath("//div /h2")).getText();
		System.out.println(text2);
		Assert.assertEquals(text2, "Hello " +uname+",");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
//		wait.until(ExpectedConditions.elementToBeClickable(text2)));
		
		driver.findElement(By.xpath("//button[text() = 'Log Out']")).click();

		driver.quit();
	}
	
	public static String getpassword(ChromeDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passText = driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] arr1 = passText.split("'");
		//arr1[0] = Please use temporary password
		//arr[1] = rahulshettyacademy' to Login.
		String[] arr2 = arr1[1].split("'");
		//arr2[0] = rahulshettyacademy
		//arr2[1] = ' to Login.
		String password = arr2[0];
		return password;

		
//		driver.findElement(By.xpath("//div/button[contains(@class,'go')]")).click();
	}

}
