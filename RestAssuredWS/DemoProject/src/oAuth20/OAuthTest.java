package oAuth20;

import static io.restassured.RestAssured.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.restassured.path.json.JsonPath;
public class OAuthTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//comented below code as Google doesn't allow any automation script run
//String password ="Gmail@June2025";
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://accounts.google.com/o/oauth2/v2/auth?scope="
//				+ "https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php");
//		driver.findElement(By.xpath("//input[@type=\'email\']")).sendKeys("rushimane3421@gmail.com");
//		driver.findElement(By.xpath("//input[@type=\'email\']")).sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[text()='Continue']")).click();
//		Thread.sleep(4000);
//		String url = driver.getCurrentUrl();
		
		String url = "https://rahulshettyacademy.com/getCourse.php?"
				+ "code=4%2F0Ab32j92b8VbuG-ir5xZw6s27EFyt4elFmNS4E_4lMBcGs0pVYoYBhrwdrcC4sLdxADj0xg&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=consent";
		//get Access token request
		
		String partialCode = url.split("code=")[1];
		String code = partialCode.split("&scope")[0];
		System.out.println(code);
		
		
		String accessTokenResponse = given().urlEncodingEnabled(false)
		.queryParam("code", code)
		.queryParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.queryParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
		.queryParam("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
		.queryParam("grant_type", "authorization_code")
		.when().log().all().post("https://www.googleapis.com/oauth2/v4/token").asString();
		
		JsonPath js = new JsonPath(accessTokenResponse);
		String accessToken = js.getString("access_token");
		System.out.println(accessToken);
		
		
		//actual get course request
	String response = 	given().queryParam("access_token", accessToken)
		.when().log().all().get("https://rahulshettyacademy.com/getCourse.php").asString();
	System.out.println(response);

}
}