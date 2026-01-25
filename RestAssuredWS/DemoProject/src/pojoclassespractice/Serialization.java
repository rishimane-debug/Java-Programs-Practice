package pojoclassespractice;
import static io.restassured.RestAssured.*;
import java.util.Arrays;
import java.util.List;

public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address add = new Address();
		add.setCiti("Pune");
		add.setState("MH");
		add.setPincode(411001);
		
		Projects p1 = new Projects();
		p1.setName("API Automation");
		p1.setDuration("6 Months");
		
		Projects p2 = new Projects();
		p2.setName("UI Automation");
		p2.setDuration("4 Months");
		
		List<Projects> projects = Arrays.asList(p1, p2);
		
		User user = new User();
		user.setName("Rushi");
		user.setId(9);
		user.setEmail("rushi@test.com");
		user.setAddress(add);
		user.setProjects(projects);
		
		
		
		given()
		.baseUri("https://reqres.in")
		.header("Content-Type", "Application/json")
		.body(user)
		.when().post("/api/users")
		.then().assertThat().statusCode(201).extract().response().asString();
		

	}

}
