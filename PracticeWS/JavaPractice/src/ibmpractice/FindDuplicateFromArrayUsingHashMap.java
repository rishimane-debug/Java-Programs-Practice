package ibmpractice;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class FindDuplicateFromArrayUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char[] arr = {'a', 'c', 'd', 'd', 'd', 'c', 'a', 'r'};
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char ch :arr)
		{
			if(map.containsKey(ch))
			{
			  map.put(ch, map.get(ch) + 1);	
			}
			else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		
	 Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
	 for(Map.Entry<Character, Integer> entry :entrySet)
	 {
		 if(entry.getValue() == 2)
		 {
			 System.out.println(entry.getKey());
		 }
	 }

	}

}
