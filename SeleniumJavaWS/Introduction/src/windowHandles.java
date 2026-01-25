
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
public class windowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/loginpagePractise/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//div[@id = 'login']/preceding-sibling::a")).click();
			Set <String> windows = driver.getWindowHandles();
			Iterator<String> r = windows.iterator();
			String homeWindow = r.next();
			String childWindow = r.next();
		
			
			driver.switchTo().window(childWindow);
			String text = driver.findElement(By.cssSelector("p.im-para.red")).getText();
			System.out.println(text);
			String uname = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
			driver.switchTo().window(homeWindow);
			driver.findElement(By.id("username")).sendKeys(uname);
	}

}
