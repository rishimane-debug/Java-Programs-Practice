package rahulshettyacademy.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.abstractcomponets.AbstractComponent;

public class LandingPage extends AbstractComponent {
	WebDriver driver;
	
	
	public LandingPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	WebElement username = driver.findElement(By.id("userEmail"));
	
	@FindBy(id = "userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement passwordEle;
	
	@FindBy(id="login")
	WebElement submit;
	
//	.ng-tns-c4-14.ng-star-inserted.ng-trigger.ng-trigger-flyInOut.ngx-toastr.toast-error
	
	@FindBy(css = "[class*='flyInOut']")
	WebElement errorMessage1;
	
	
	public ProductCatalogue loginAplication(String email, String password )
	{
		userEmail.sendKeys(email);
		passwordEle.sendKeys(password);
		submit.click();
		ProductCatalogue productCatalogue = new ProductCatalogue(driver);
		return productCatalogue;
	}
	public String getErrorMsg()
	{
		waitForWebElementToAppear(errorMessage1);
		return errorMessage1.getText();
	}
	public void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
	

}
