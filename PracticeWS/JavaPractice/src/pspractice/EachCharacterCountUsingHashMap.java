package pspractice;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class EachCharacterCountUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Hellohhh";
		
		char[] words = input.toCharArray();
		
		
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for(char ch  : words)
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch) + 1);
			}
			else
			{
				charMap.put(ch, 1);
			}
		}
		
//		Set<Map.Entry<Character,Integer>> entrySet= charMap.entrySet();
		for(Map.Entry<Character, Integer> entry : charMap.entrySet())
		{
			System.out.println(entry.getKey()+ ":" + entry.getValue());
		}
	}

}
