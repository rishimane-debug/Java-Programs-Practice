package LTIPractice;

import java.util.Arrays;

public class checkAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String str1 = "Listn";
		String str2 = "Silent";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
	
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Both string are Anagram");
		}
		else
		{
			System.out.println("Strings are not Anagram");
		}
		

	}

}
