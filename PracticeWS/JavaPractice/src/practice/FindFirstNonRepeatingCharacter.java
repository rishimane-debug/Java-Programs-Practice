package practice;

import java.util.HashMap;

public class FindFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "swiss";
//		o/p : w
		char arr[] = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++)
		{
			char ch = arr[i];
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch) + 1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		
		for(int i = 0 ; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(map.get(ch) == 1)
			{
				System.out.println(ch);
				break;
			}
		}
	

	}

}
