package javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("rushi");
		a.add("Nikita");
		a.add("Ashwin");
		a.add("Naveen");
		a.add("Ankita");
		System.out.println(a.get(2));
//		System.out.println(a);
		System.out.println("---------------------");
		//iterating through array list
		for(int i = 0; i < a.size(); i ++)
		{
			if(a.get(i) != "Nikita") {
				
			
			System.out.println(a.get(i));
			}
		}
		System.out.println("---------------------");
		//inhnaced loop
		for( String name: a )
		{
			System.out.println(name);
		}
		System.out.println("---------------------");
		//check if arraylist contains any specific value
		System.out.println(a.contains("Ankita"));
		
		System.out.println("---------------------");
		//converting array to arraylist
		String[] names = {"selenium", "java", "testng", "cucumber", "junit"};
		List<String> arraylist1 = Arrays.asList(names);
		
		System.out.println(arraylist1.contains("selenium"));
		
	}

	
}
