package rahulshettyacademy.tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.CheckoutPage;
import rahulshettyacademy.pageobjects.ConfirmationPage;
import rahulshettyacademy.pageobjects.LandingPage;
import rahulshettyacademy.pageobjects.OrderPage;
import rahulshettyacademy.pageobjects.ProductCatalogue;
import rahulshettyacademy.testcomponents.BaseTest;

public class SubmitOrderTest extends BaseTest {
	String productName = "ZARA COAT 3";

	    @Test(dataProvider = "getData", groups = "purchase")
	    public void submitOrder(HashMap<String, String> input ) throws IOException, InterruptedException {
	    	
		
//		LandingPage landingPage = launchApplication();
		ProductCatalogue productCatalogue = landingPage.loginAplication(input.get("email"), input.get("password"));
		
		List<WebElement> products = productCatalogue.getProductList();
		productCatalogue.addProductToCart(input.get("product"));
		CartPage cartPage = productCatalogue.goToCart();
		
		boolean match = cartPage.verifyProductDisplay(input.get("product"));
		Assert.assertTrue(match);
		
		CheckoutPage checkoutPage = cartPage.goToCheckOut();
		checkoutPage.selectCountry("India");
		ConfirmationPage confirmationPage = checkoutPage.submitOrder();
		String confirmMessage = confirmationPage.getConfirmationMessage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("Thankyou for the order."));
//				driver.quit();

	}
	    @Test(dependsOnMethods = {"submitOrder"})
	    public void orderHistoryTest()
	    {
	    	ProductCatalogue productCatalogue = landingPage.loginAplication("rushi2653@gmail.com", "Jobs@2025");
	    	OrderPage orderPage = productCatalogue.goToOrdersPage();
	    	Assert.assertTrue(orderPage.verifyOrderDisplay(productName)); 
	    }
	    
	    
	    
	    @DataProvider
	    public Object[][] getData() throws IOException
	    {
	    	
//	    	HashMap<String,String> map = new HashMap<String,String>();
//	    	map.put("email", "rushi2653@gmail.com");
//	    	map.put("password", "Jobs@2025");
//	    	map.put("product", "ZARA COAT 3");
//	    	
//	    	HashMap<String, String> map1 = new HashMap<String, String>();
//	    	map1.put("email", "rushi000@gmail.com");
//	    	map1.put("password", "Rushi@000");
//	    	map1.put("product", "ADIDAS ORIGINAL");
	    	
	    	List<HashMap<String, String>> data = getJasonDataToMap(System.getProperty("user.dir") + 
					"\\src\\test\\java\\rahulshettyacademy\\data\\PurchaseOrder.json");
	    	
	    	return new Object[][]{{data.get(0)},{data.get(1)}};
//	    	return new Object[][] {{"rushi2653@gmail.com","Jobs@2025", "ZARA COAT 3"},
//	    						{"rushi000@gmail.com", "Rushi@000", "ADIDAS ORIGINAL"}};
	    }

}
