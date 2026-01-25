
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement selectDropdown = driver.findElement(By.xpath("//select[@id ='ctl00_mainContent_DropDownListCurrency']"));
		Select dropDown = new Select(selectDropdown);
		dropDown.selectByIndex(2);
		System.out.println(dropDown.getFirstSelectedOption().getText());
		dropDown.selectByVisibleText("USD");
		System.out.println(dropDown.getFirstSelectedOption().getText());
		dropDown.selectByValue("INR");
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
		
		
	}

}
