package rahulshettyacademy.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.CheckoutPage;
import rahulshettyacademy.pageobjects.ConfirmationPage;
import rahulshettyacademy.pageobjects.LandingPage;
import rahulshettyacademy.pageobjects.ProductCatalogue;
import rahulshettyacademy.testcomponents.BaseTest;
import rahulshettyacademy.testcomponents.Retry;

public class ErrorValidationTest extends BaseTest {

	    @Test(groups = "ErrorHandelling", retryAnalyzer = Retry.class)
	    public void loginErrorvalidation() throws IOException, InterruptedException {
	    	
		

		landingPage.loginAplication("rushi2653@gmail.com", "Jobs@202225");
		Assert.assertEquals("Incorrect email or password.", landingPage.getErrorMsg());
//		Assert.assertEquals("Incorrect email or pas", landingPage.getErrorMsg());
		
			}
	    
	    @Test
	    public void productErrorValidation() throws IOException, InterruptedException {
	    	
		String productName = "ZARA COAT 3";
		ProductCatalogue productCatalogue = landingPage.loginAplication("rushi2653@gmail.com", "Jobs@2025");
		
		List<WebElement> products = productCatalogue.getProductList();
		productCatalogue.addProductToCart(productName);
		CartPage cartPage = productCatalogue.goToCart();
		
		boolean match = cartPage.verifyProductDisplay("ZARA COAT 333");
		Assert.assertFalse(match);



	}


}
