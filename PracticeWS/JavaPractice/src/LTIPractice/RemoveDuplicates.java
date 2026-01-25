package LTIPractice;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String input = sc.nextLine();
		String result="";
		
		for(int i = 0 ; i < input.length(); i ++)
		{
			char ch = input.charAt(i);
			if(result.indexOf(ch) == -1)
			{
				result+=ch;
			}
		}
		System.out.println("String after removing duplicates: " + result);
	}

}
