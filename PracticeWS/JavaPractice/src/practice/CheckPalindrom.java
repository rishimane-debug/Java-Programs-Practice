package practice;

import java.util.Scanner;

public class CheckPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String original = sc.nextLine();
		String lowerCase = original.toLowerCase();
		String reverse = "";
		
		for(int i = original.length() - 1 ; i >= 0 ; i-- )
		{
			reverse = reverse + lowerCase.charAt(i); 
		}
		if(reverse.equals(lowerCase))
		{
			System.out.println("String is palindrom");
		}
		else
		{
			System.out.println("String is not palindrom");
		}
		
		

	}

}
