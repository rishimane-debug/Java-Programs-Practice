import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.ReuseableMethods;
import files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class DynamicJson {

	
	@Test(dataProvider = "BooksData")
	public void addBook(String isbn, String aisle)
	{
		RestAssured.baseURI = "http://216.10.245.166";
		String response = given().log().all().header("Content-Type" , "application/json")
		.body(payload.addBook(isbn,aisle))
		.when().post("/Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString();
		JsonPath js = ReuseableMethods.rawToJson(response);
		String id =js.getString("ID");
		System.out.println(id);
		}
	
	@DataProvider(name = "BooksData")
	public Object[][] getData()
	{
		return new Object[][] {{"efgs","3245"},
						{"cfhb", "3378"},
						{"msnz", "2098"}};
		}
	
}
