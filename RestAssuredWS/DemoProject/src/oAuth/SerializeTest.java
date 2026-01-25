package oAuth;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojo.AddPlace;
import pojo.Location;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

public class SerializeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		
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
		
		Response rs = given().queryParam("key", "qaclick123").body(p)
		.when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200).extract().response();
		String responseString  = rs.asString();
		System.out.println(responseString);
	}

}
