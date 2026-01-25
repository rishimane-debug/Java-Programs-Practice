package rahulshettyacademy.stepdefinations;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.CheckoutPage;
import rahulshettyacademy.pageobjects.ConfirmationPage;
import rahulshettyacademy.pageobjects.LandingPage;
import rahulshettyacademy.pageobjects.ProductCatalogue;
import rahulshettyacademy.testcomponents.BaseTest;

public class StepDefiniationImpl extends BaseTest{
	
	public ConfirmationPage confirmationPage;
	public LandingPage landingPage;
	public ProductCatalogue productCatalogue;
	@Given("I landed on Ecommerce page")
	public void I_landed_on_ecommerce_page() throws IOException
	{
		landingPage = launchApplication();
	}
	
	@Given("^Logged in with username (.+) and password (.+)$")
	public void logged_in_username_password(String username, String password)
	{
		productCatalogue = landingPage.loginAplication(username,password);
	}
	
	@When("^I added product (.+) to the cart?")
	public void i_added_product_to_cart(String productName) throws InterruptedException
	{
		List<WebElement> products = productCatalogue.getProductList();
		productCatalogue.addProductToCart(productName);
	}
	
	@When("^Checkout (.+) and submit the order?")
	public void checkut_submit_the_order(String productName)
	{
		CartPage cartPage = productCatalogue.goToCart();
		
		boolean match = cartPage.verifyProductDisplay(productName);
		Assert.assertTrue(match);
		
		CheckoutPage checkoutPage = cartPage.goToCheckOut();
		checkoutPage.selectCountry("India");
		 confirmationPage = checkoutPage.submitOrder();
	}
	
	@Then("{string} message is displayed on Confirmation Page")
	public void message_displayed_on_confirmation_page(String confiramtionmsg)
	
	{
		String confirmMessage = confirmationPage.getConfirmationMessage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase(confiramtionmsg));
		driver.quit();
	}
	
	@Then("{string} message is displayed")
	public void error_message_is_displayed(String str1)
	{
		Assert.assertEquals(str1, landingPage.getErrorMsg());
		driver.quit();
	}

}
