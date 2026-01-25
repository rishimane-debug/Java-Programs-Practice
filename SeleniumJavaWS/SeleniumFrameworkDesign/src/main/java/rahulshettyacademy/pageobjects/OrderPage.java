package rahulshettyacademy.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import rahulshettyacademy.abstractcomponets.AbstractComponent;

public class OrderPage extends AbstractComponent {
	WebDriver driver;
	
	@FindBy(css ="tr td:nth-child(3)")
	List<WebElement> productNames;
	
	@FindBy(xpath = "//li[@class='totalRow']//button")
	WebElement checkoutEle;
	
	public OrderPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	WebElement username = driver.findElement(By.id("userEmail"));
	public boolean verifyOrderDisplay(String productName)
	{
		boolean match = productNames.stream().anyMatch(Product -> Product.getText().equalsIgnoreCase(productName));
		return match;
	}
	
	

}
