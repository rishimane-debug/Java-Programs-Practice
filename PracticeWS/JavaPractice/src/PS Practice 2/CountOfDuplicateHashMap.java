package JavaPrograms;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class CountOfDuplicateHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDuplicateCharacter("Javvva");
	}
	
	public static void printDuplicateCharacter(String str)
	{
		if(str == null)
		{
			System.out.println("String is null");
		}
		if(str.isEmpty())
		{
			System.out.println("String is null");
		}
		if(str.length() == 1)
		{
			System.out.println("Single character string");
		}
		
		char words [] = str.toCharArray();//j a v a
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>(); 
		
		for(Character ch : words)
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch)+ 1);
			}
			else
			{
				charMap.put(ch, 1);
			}
		}
		//print the map
		Set<Map.Entry<Character,Integer>> entrySet = charMap.entrySet();
		for(Map.Entry<Character, Integer> entry : entrySet)
		{
//			if(entry.getValue() > 1)
//			{
				System.out.println(entry.getKey() + ":" + entry.getValue());
//			}
		}
	}

}
