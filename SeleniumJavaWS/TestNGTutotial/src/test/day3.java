package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This will run before executing any method of day3 class ");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("This will run after executing all methods of day3 class ");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This will run befoer each test case of day3 class");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This will run after each test case of day3 class");
	}

	@Parameters({"URL"})
	@Test
	public void webLoginCarLoan(String uname)
	{
		System.out.println("WebLoginCar");
		System.out.println(uname);
	}
	@Test(groups= {"Smoke"})
	public void mobileLoginCarLoan()
	{
		System.out.println("mobileLoginCar");
	}
	
	@Test(enabled= true)
	public void mobilesinINLoan()
	{
		System.out.println("mobile sign IN");
		Assert.assertTrue(false);
	}
	
	@Test(dataProvider ="loginData1")
	public void mobileusingLoan(String uname, String pass)
	{
		System.out.println("mobileusingCar");
		System.out.println(uname);
		System.out.println(pass);
		
	}
	
	@Test(dataProvider="loginData")
	public void mobileBasedCarLoan(String uname, String pass)
	{
		System.out.println("mobileBasedCar");
		System.out.println(uname);
		System.out.println(pass);
	}
	@Test(dependsOnMethods= {"webLoginCarLoan"})
	public void ApiCarLoan()
	{
		System.out.println("LoginAPICar");
	}
	
	@DataProvider(name = "loginData")
	public Object[][] getData()
	{
		//using adding values as per indexing
		Object[][] data = new Object[3][2]; //object array with 3 rows and 2 columns
		//1st username password set
		data[0][0] = "firstusername"; //first row first column username field 
		data[0][1] = "firstpass"; // first row second column password field
		//2nd username password set
		data[1][0] = "secondusername";
		data[1][1] = "secondpass";
		//3rd username password set
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpass";
		return data;
	}
	
	//using direct array values
	@DataProvider(name="loginData1")
	public Object[][] getData1()
	{
		return new Object[][]
				{
			{"user1", "pass1"},
			{"user2", "pass2"},
			{"user3","pass3"}
			
				};
		
	}
	

}
