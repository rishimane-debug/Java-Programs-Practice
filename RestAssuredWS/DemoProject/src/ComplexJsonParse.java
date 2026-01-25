import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonPath js = new JsonPath(payload.getPurchase());
//		String pAmount = js.getString("dashboard.purchaseAmount");
//		System.out.println(pAmount);
		
		//Print number of courses
		
		int courseCount = js.getInt("courses.size()");
		System.out.println("Number of Courses: " +courseCount);
		
		//print purchase amount
		
		int purchaseAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println("Purchase Amount: "+ purchaseAmount);
		
		//print title of first course
		String firstCourseTitle = js.getString("courses[0].title");
		System.out.println("Name of First Course: " + firstCourseTitle);
		
		//print all course names and there prices
		
		for(int i = 0; i < courseCount; i++)
		{
			String courseTitle = js.getString("courses["+i+"].title");
			int coursePrice = js.getInt("courses["+i+"].price");
			System.out.println(courseTitle + " : " + coursePrice);
		}
		
		System.out.println("Print no of copies sold by RPA Course");
		
		for(int i = 0; i < courseCount; i++)
		{
			String courseTitle = js.getString("courses["+i+"].title");
			if(courseTitle.equalsIgnoreCase("RPA"))
			{
				int numberOfCopies = js.getInt("courses["+i+"].copies");
				System.out.println(numberOfCopies);
				break;
			}
			
		}
		
	}

}
