package ecom;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import pojo.LoginRequest;
import pojo.LoginResponse;
import pojo.Order;
import pojo.OrderDetails;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

public class EcommerceApiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//User Login
		RequestSpecification req =  new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.setContentType(ContentType.JSON).build();
		
		LoginRequest lr = new LoginRequest();
		lr.setUserEmail("postman2312@gmail.com");
		lr.setUserPassword("Postman@2025");
		
		RequestSpecification reqLogin = given().log().all().spec(req).body(lr);
	LoginResponse resLogin = reqLogin.when().post("/api/ecom/auth/login")
		.then().log().all().extract().response().as(LoginResponse.class);
	
	String token = resLogin.getToken();
	System.out.println(token);
	String userId = resLogin.getUserId();
	System.out.println(userId);
	
	//Create Product
	
				RequestSpecification addProductBaseReq	= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
					.addHeader("Authorization", token).build();
				
				RequestSpecification reqCreateProdcut = given().log().all().spec(addProductBaseReq)
				.param("productName", "laptop")
				.param("productAddedBy", userId)
				.param("productCategory", "Device")
				.param("productSubCategory", "shirts")
				.param("productPrice", "11500")
				.param("productDescription", "Lenovo")
				.param("productFor", "Men")
				.multiPart("productImage", new File("C:\\Users\\rharidas\\OneDrive - Capgemini\\Documents\\RSA\\REST Assured\\download.jpg"));
				
				String addProductResponse = reqCreateProdcut.when().post("/api/ecom/product/add-product")
				.then().extract().response().asString();
				JsonPath js  = new JsonPath(addProductResponse);
				String productId = js.getString("productId");
				System.out.println("Product ID: " + productId);
				
				//Create order
				
				RequestSpecification placeOrderBaseReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
						.addHeader("Authorization", token)
						.setContentType(ContentType.JSON).build();
				
				OrderDetails orderDetails = new OrderDetails();
				orderDetails.setCountry("India");
				orderDetails.setProductOrderedId(productId);
				
				List<OrderDetails> orderDetailsList = new ArrayList<OrderDetails>();
				orderDetailsList.add(orderDetails);
				Order order = new Order();
				order.setOrders(orderDetailsList);
				RequestSpecification createOrderReq = given().log().all().spec(placeOrderBaseReq).body(order);
				String responseOrderReq = createOrderReq.when().post("/api/ecom/order/create-order")
				.then().log().all().extract().response().asString();
				
				JsonPath js1 = new JsonPath(responseOrderReq);
				String msg = js1.getString("message");
				System.out.println(msg);
				
				//delete prodcut
				RequestSpecification deleteOrderBaseReq =  new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				 .addHeader("Authorization", token)
				 .build();
				RequestSpecification deleteProdReq = given().log().all().spec(deleteOrderBaseReq).pathParam("productId", productId);
				String delectProductResponse = deleteProdReq.when().delete("/api/ecom/product/delete-product/{productId}")
				.then().log().all().extract().response().asString();
				
				JsonPath js2 = new JsonPath(delectProductResponse);
				String deleteMessgae = js2.getString("message");
				Assert.assertEquals("Product Deleted Successfully", deleteMessgae);
	}

}
