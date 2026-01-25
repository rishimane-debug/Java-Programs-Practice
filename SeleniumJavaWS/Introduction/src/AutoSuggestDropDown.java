import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//button[text() = 'Continue shopping']")).click();
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("laptop");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class = 's-suggestion s-suggestion-ellipsis-direction']"));
		
//		for(WebElement names : list)
//		{
//			String names1 = names.getText();
//			System.out.println(names);
//			
//		}
		if(list.size() >= 3)
		{
			list.get(2).click();
		}
	
		
	}

}
