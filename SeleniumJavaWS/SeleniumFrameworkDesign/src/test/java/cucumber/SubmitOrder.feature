Feature: Purchase the order from Ecommerce Website
		I want to use this template for my feature file
	
Background:
	Given I landed on Ecommerce page
	
	@Regression
	Scenario Outline: Positive Test of Submitting the order
	
		Given Logged in with username <name> and password <password>
		When I added product <productName> to the cart
		And Checkout <productName> and submit the order
		Then "THANKYOU FOR THE ORDER." message is displayed on Confirmation Page
		
		Examples:
		|name 				| password      |   productName	 |
		|rushi2653@gmail.com|Jobs@2025		| 	ZARA COAT 3  | 