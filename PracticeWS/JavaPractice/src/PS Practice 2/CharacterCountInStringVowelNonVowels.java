package JavaPrograms;
import java.util.*;

public class CharacterCountInStringVowelNonVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method
		
		String input = "automation";
		
		input.toLowerCase();
		char charArr[] = input.toCharArray();
		
//		HashMap<Character,Integer> charCount = new HashMap<Character,Integer>();
		LinkedHashMap<Character,Integer> charCount = new LinkedHashMap<Character,Integer>();
		
		for(Character ch : charArr)
		{
			if(charCount.containsKey(ch))
			{
				charCount.put(ch, charCount.get(ch) + 1);
			}
			else
			{
				charCount.put(ch, 1);
			}
		}
		
//		System.out.println(charCount);
		System.out.print("Character Count = ");
		for(Map.Entry<Character,Integer> entry : charCount.entrySet())
		{
//			if(entry.getKey() == 'o')
			System.out.print(entry.getKey() + ":" +entry.getValue() + " ");
		}
		
		String vowels = "aeiou";
		String nonVowels = "";
		int nonVowelsCount = 0;
		for(char ch :charArr )
		{
			if(vowels.indexOf(ch) == -1)
			{
				nonVowels = nonVowels + ch;
				nonVowelsCount++;
			}
		}
		System.out.println( "\nNon Vowles Chracters : " + nonVowels);
		System.out.println("Non Vowles Chracters count : " +nonVowelsCount);
		
		
		String vowelsOnly = "";
		for(char ch : charArr)
		{
			if(vowels.indexOf(ch) != -1)
			{
				vowelsOnly = vowelsOnly + ch;
			}
		}
		System.out.println("Vowels Chracters : " + vowelsOnly);

	}

}
