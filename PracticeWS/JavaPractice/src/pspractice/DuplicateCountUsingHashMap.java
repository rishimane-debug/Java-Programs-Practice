package pspractice;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class DuplicateCountUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printDuplicateCharacters("Hello");
		

	}
	public static void printDuplicateCharacters(String str)
	{
		
		char words[] = str.toCharArray();
		
		HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();
		
		for(char ch : words)
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch)+1);
			}
			else
			{
				charMap.put(ch, 1);
			}
		}
		
		Set<Map.Entry<Character , Integer>> entryset = charMap.entrySet();
		for(Map.Entry<Character,Integer> entry : entryset)
		{
			if(entry.getValue() > 1)
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
