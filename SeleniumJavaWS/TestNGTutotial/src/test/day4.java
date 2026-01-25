
package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day4 {

	@Test
	public void webLoginHomeLoan() {
		System.out.println("WebLoginHome");
	}

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("I am no 1");
	}
	@Test(groups= {"Smoke"})
	public void mobileLoginCarLoan() {
		System.out.println("mobileLoginHome");
	}

	@Test
	public void LoginApiCarLoan() {
		System.out.println("LoginAPIHome");
	}

}
