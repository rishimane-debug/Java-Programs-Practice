package practice;
import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1 = "Silent";
//		String str2 = "Listen";
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("String is Anagram");
		}
		else
		{
			System.out.println("String is not Anagram");
		}
		
	}

}
