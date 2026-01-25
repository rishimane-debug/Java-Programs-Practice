package LTIPractice;

import java.util.Scanner;
public class ReverseStringInArrays {

	public static void main(String[] args) {
		
		
		String[] words = {"Rushi", "Nikita", "Ankita", "Ash","LT","Naveen"};
		System.out.println("Original String Array:");
		
		for(String word: words)
		{
			System.out.println(word);
		}
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = reversedString(words[i]);
		}
		
		System.out.println("\nReversed String Array:");
		for(String word: words)
		{
			System.out.println(word);
		}
		
		
		
	}
	public static String reversedString(String str)
	{
		String reversed = "";
		for(int i = str.length()-1 ; i >= 0; i-- )
		{
			reversed+=str.charAt(i);
		}
		return reversed;
	}

}
