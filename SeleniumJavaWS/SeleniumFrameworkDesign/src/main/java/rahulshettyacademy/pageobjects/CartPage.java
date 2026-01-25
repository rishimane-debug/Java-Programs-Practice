package rahulshettyacademy.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import rahulshettyacademy.abstractcomponets.AbstractComponent;

public class CartPage extends AbstractComponent {
	WebDriver driver;
	
	@FindBy(css =".cartSection h3")
	List<WebElement> cartProducts;
	
	@FindBy(xpath = "//li[@class='totalRow']//button")
	WebElement checkoutEle;
	
	public CartPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	WebElement username = driver.findElement(By.id("userEmail"));
	public boolean verifyProductDisplay(String productName)
	{
		boolean match = cartProducts.stream().anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(productName));
		return match;
	}
	
	public CheckoutPage goToCheckOut()
	{
		checkoutEle.click();
		return new CheckoutPage(driver);
		
	}
	

}
