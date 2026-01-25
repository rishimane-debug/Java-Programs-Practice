import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import files.ReuseableMethods;
import files.payload;

public class Basics {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		//Add place
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json\r\n"
				+ "").body(new String(Files.readAllBytes(Paths.get("C:\\Eclipse\\RestAssuredWS\\AddPlace.json"))))
		.when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope",equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)")
		.extract().response().asString();
//		System.out.println(response);
		
		JsonPath js = new JsonPath(response);
		String placeId = js.getString("place_id");
		System.out.println(placeId);
		
		//Update place with above place id using put http method.
		String newAddress = "205 Morya Residency, Navi Mumbai, MH";
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body("{\r\n"
				+ "    \"place_id\": \""+placeId+"\",\r\n"
				+ "    \"address\": \""+newAddress+"\",\r\n"
				+ "    \"key\": \"qaclick123\"\r\n"
				+ "}")
		.when().put("maps/api/place/update/json")
		.then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		//Get updated place deatils using GET http method
		String getResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
		.when().get("/maps/api/place/get/json")
		.then().assertThat().statusCode(200).extract().response().asString();
//		System.out.println(getResponse);
		
//		JsonPath js1 = new JsonPath(getResponse);
		JsonPath js1 = ReuseableMethods.rawToJson(getResponse);
		String actualAddress = js1.getString("address");
		System.out.println("Updated Address: " + actualAddress);
		
		Assert.assertEquals(actualAddress, newAddress);
		
		
	}

}
