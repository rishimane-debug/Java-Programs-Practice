import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals("Google", "Googl", "Title mismatch");
		soft.assertTrue(5 > 10, "Condition Failed");
		
		System.out.println("Test continues even after failures...");
		
		soft.assertAll();

	}

}
