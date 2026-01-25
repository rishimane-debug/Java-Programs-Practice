package jiraAPI;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.File;

public class BugTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://rushimane3421.atlassian.net";
		
		String createIssueResponse = given().log().all().header("Content-Type", "application/json").header("Authorization","Basic cnVzaGltYW5lMzQyMUBnbWFpbC5jb206QVRBVFQzeEZmR0YwUnJKTEs5RXoxaXQ3eUpLclRNUmRpWHFSUmpuNXBqUk5taG1UOWYyWlRvRl9Eb3B6dWoxMWNrcWdTeFBLemNnV3ZTbkQ1cEpLdE9QYUNEMVl0ZWs0dHlRVEJpYTZHYXk5dTYyak5TVHhBajFRck5QODVaMFBLakdUNkdCa0FSZVNpdk9pNmNyMERobEZGN2YzT0NDWUIwYzh2VkRQVGpoRUxaYVRsOHc2SGtRPTc2QkExN0JF")
		.body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "       \"project\":\r\n"
				+ "       {\r\n"
				+ "          \"key\": \"SCRUM\"\r\n"
				+ "       },\r\n"
				+ "       \"summary\": \"Website is not working.\",\r\n"
				+ "       \"issuetype\": {\r\n"
				+ "          \"name\": \"Bug\"\r\n"
				+ "       }\r\n"
				+ "   }\r\n"
				+ "}\r\n"
				+ "")
		.when().post("rest/api/3/issue")
		.then().assertThat().statusCode(201).extract().response().asString();
		
		JsonPath js = new JsonPath(createIssueResponse);
		int id = js.getInt("id");
		
		System.out.println(id);
		
		given().pathParam("key", id)
		.header("X-Atlassian-Token", "no-check")
		.header("Authorization","Basic cnVzaGltYW5lMzQyMUBnbWFpbC5jb206QVRBVFQzeEZmR0YwUnJKTEs5RXoxaXQ3eUpLclRNUmRpWHFSUmpuNXBqUk5taG1UOWYyWlRvRl9Eb3B6dWoxMWNrcWdTeFBLemNnV3ZTbkQ1cEpLdE9QYUNEMVl0ZWs0dHlRVEJpYTZHYXk5dTYyak5TVHhBajFRck5QODVaMFBLakdUNkdCa0FSZVNpdk9pNmNyMERobEZGN2YzT0NDWUIwYzh2VkRQVGpoRUxaYVRsOHc2SGtRPTc2QkExN0JF")
		.multiPart("file", new File("C:\\Eclipse\\RestAssuredWS\\image.png")).log().all()
		.when().post("rest/api/3/issue/{key}/attachments")
		.then().assertThat().statusCode(200);
		
	}

}
