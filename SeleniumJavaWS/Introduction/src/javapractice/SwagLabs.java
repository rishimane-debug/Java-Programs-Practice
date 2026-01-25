package javapractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class SwagLabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String header = driver.findElement(By.className("app_logo")).getText();
		if(header.equals("Swag Labs"))
		{
			System.out.println("Login Succesfull");
		}
		else
		{
			System.out.println("Login Failed");
		}
		
		
		
		
		

	}

}
