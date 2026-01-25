package test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class day1 {
	
	
	@AfterSuite
	public void afterSuites()
	{
		System.out.println("I will be number 1 from last");
	}
	@AfterTest
		public void afterTest()
		{
			System.out.println("This will run last");
		}
	
	@Test
	public void demo()
	{
		System.out.println("Hello");
	}
	@Test
	public void demo2()
	{
		System.out.println("world");
	}

}
