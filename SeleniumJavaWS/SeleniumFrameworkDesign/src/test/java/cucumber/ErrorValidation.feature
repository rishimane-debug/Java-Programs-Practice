Feature: Error Validation

@ErrorValidation
Scenario Outline:
Given I landed on Ecommerce page
When Logged in with username <name> and password <password>
Then "Incorrect email or password" message is displayed

Examples:
		|name 				| password      | 
		|rushi2653@gmail.com|Jobs@202		| 