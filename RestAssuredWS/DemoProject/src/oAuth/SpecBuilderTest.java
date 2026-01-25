package oAuth;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddPlace;
import pojo.Location;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

public class SpecBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		AddPlace p = new AddPlace();
		p.setAccuracy(50);
		p.setName("Rahul Shetty Academy");
		p.setPhone_number("(+91)8286641803");
		p.setAddress("205, Morya Residency, Navi Mumbai");
		p.setWebsite("http://google.com");
		p.setLanguage("Marathi");
		List<String> types = new ArrayList<String>();
		types.add("shoe park");
		types.add("shop");
		p.setTypes(types);
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		p.setLocation(l);
		
	RequestSpecification req	= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123")
		.setContentType(ContentType.JSON).build();
	
	ResponseSpecification resp = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		RequestSpecification rs = given().spec(req).body(p);
		Response response = rs.when().post("/maps/api/place/add/json")
		.then().assertThat().spec(resp).extract().response();
		String responseString  = response.asString();
		System.out.println(responseString);
	}

}
