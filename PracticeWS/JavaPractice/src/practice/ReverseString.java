package practice;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any String:");
		
//		String original = sc.nextLine();
		String original = "Rushi";
		String reverse = "";
		for(int i = original.length() - 1; i >=0; i--)
		{
			reverse = reverse + original.charAt(i);
		}
		System.out.println(reverse);
		
		

	}

}
