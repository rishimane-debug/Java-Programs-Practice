package practice;
import java.util.Scanner;

public class CheckCharOccurence {

	public static void main(String[] args) {
		//defining a string
		//creating a int array with size 256
		//iterating to through the string and update the character count
		//iterate through charcount and printing the character occurence when characher count is more than 0
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String:");
		String str = sc.nextLine();
		
		str = str.toLowerCase();
		int[] charcount = new int[256];
		
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			charcount[ch]++;
		}
		
		System.out.println("Character Occurence:");
		for(int i = 0; i < charcount.length; i++)
		{
			if(charcount[i] > 0 && (char)i != ' ' )
			{
				System.out.println((char)i + ":" + charcount[i]);
			}
		}
		
	}
}
