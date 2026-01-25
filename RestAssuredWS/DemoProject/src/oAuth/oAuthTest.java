package oAuth;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import io.restassured.path.json.*;
import pojo.Api;
import pojo.GetCoursesReponse;
import pojo.WebAutomation;

public class oAuthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] courseTitles = {"Selenium Webdriver Java", "Cypress", "Protractor"};
		
		String response = given()
		.formParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.formParam("client_secret","erZOWM9g3UtwNRj340YYaK_W")
		.formParam("grant_type","client_credentials")
		.formParam("scope", "trust")
		.when().log().all()
		.post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").asString();
		
		System.out.println(response);
		JsonPath js = new JsonPath(response);
		String token =js.getString("access_token");
		System.out.println(token);
		
//		Storing as a String
//		String response2 = given()
//		.queryParam("access_token", token)
//		.when().log().all()
//		.get("https://rahulshettyacademy.com/oauthapi/getCourseDetails").asString();
//		System.out.println(response2);
		
		//deserialization using Pojo classX
		GetCoursesReponse gc = given()
				.queryParam("access_token", token)
				.when().log().all()
				.get("https://rahulshettyacademy.com/oauthapi/getCourseDetails")
				.as(GetCoursesReponse.class);
		
		System.out.println(gc.getLinkedIn());
		System.out.println(gc.getInstructor());
		
		//Get curse title and price of API SoapUI Webservices testing course.
		
		System.out.println(gc.getCourses().getApi().get(1).getCourseTitle());
		
		//Get any course price using for loop
		
		List<Api> apiCourses = gc.getCourses().getApi();
		String courseTitle = "SoapUI Webservices testing";
		
		for(int i = 0; i <apiCourses.size(); i++ )
		{
			if(apiCourses.get(i).getCourseTitle().equalsIgnoreCase(courseTitle))
			{
				System.out.println(apiCourses.get(i).getPrice());
			}
		}
		
		//Get courses name in webAutomationCourses
		
		List<WebAutomation> webAutomationCourses = gc.getCourses().getWebAutomation();
		
		//print all course titles
		for(int i = 0; i < webAutomationCourses.size(); i++)
		{
			System.out.println(webAutomationCourses.get(i).getCourseTitle());
		}
		
		//verify all course titles are correct
		ArrayList<String> a = new ArrayList<String>();
		
		for(int i = 0; i < webAutomationCourses.size();i++)
		{
			a.add(webAutomationCourses.get(i).getCourseTitle());
		}
		List<String> exepectedList = Arrays.asList(courseTitles);
		Assert.assertTrue(a.equals(exepectedList));
		
		
		
		
			
	}

}
