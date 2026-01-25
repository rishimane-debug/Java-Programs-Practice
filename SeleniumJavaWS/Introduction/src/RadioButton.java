import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class RadioButton {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='radio1']"));
		
		if(!radio1.isSelected())
		{
			radio1.click();
		}
		
		//handelling multiple radio buttons
		
		List <WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='radioButton']")); 
					System.out.println(radioButtons.size());
					for(WebElement radio : radioButtons)
					{
						if(radio.getAttribute("value").equals("radio2"))
						{
							if(!radio.isSelected())
							{
								radio.click();
							}
//							break;
									
						}
					}
					
					
					
	}

}
