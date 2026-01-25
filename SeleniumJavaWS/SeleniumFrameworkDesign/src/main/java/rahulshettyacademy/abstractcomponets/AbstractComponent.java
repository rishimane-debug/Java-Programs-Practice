package rahulshettyacademy.abstractcomponets;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.OrderPage;

public class AbstractComponent {
	WebDriver driver;
	
	

	public AbstractComponent(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(xpath = "//button[contains(@routerlink,'cart')]")
	WebElement cardHeader;
	
	@FindBy(xpath = "//button[contains(@routerlink,'myorders')]")
	WebElement orderHeader;

	public void waitForElementToAppear(By Findby) {
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfElementLocated(Findby));
	
	}
	public void waitForWebElementToAppear(WebElement Findby) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(Findby));
		
		}
	
	
	public OrderPage goToOrdersPage()
	{
		orderHeader.click();
		OrderPage orderPage = new OrderPage(driver);
		return orderPage;
	}
	public CartPage goToCart()
	{
		cardHeader.click();
		CartPage cartPage = new CartPage(driver);
		return cartPage;
	}
	public void waitForWebElementToDisapper(By Findby) throws InterruptedException
	{
		Thread.sleep(2000);
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(Findby));
	}
}
