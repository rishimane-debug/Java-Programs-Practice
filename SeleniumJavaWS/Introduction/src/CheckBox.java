import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.cssSelector("input[id*='chk_SeniorCitizenDiscount']")).isSelected());

//		driver.findElement(By.cssSelector("input[id*='chk_SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='chk_SeniorCitizenDiscount']")).isSelected());
        
        //count the number / size of the checkboxes.
        
        List <WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        System.out.println(checkboxes.size());
        System.out.println(checkboxes.get(2));
       
       
	}

}
