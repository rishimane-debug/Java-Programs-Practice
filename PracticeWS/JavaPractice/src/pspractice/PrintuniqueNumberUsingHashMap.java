package pspractice;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class PrintuniqueNumberUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = {2, 2, 2, 3, 4, 4, 5, 6, 6, 7};
//		o/p = 3,5, 7
		
		HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();
		
		for(int num : arr)
		{
			if(frequency.containsKey(num))
			{
				frequency.put(num, frequency.get(num) + 1);
			}
			else
			{
				frequency.put(num, 1);
			}
		}
		
		System.out.print("Unique numbers are: ");
		
		Set<Map.Entry<Integer,Integer>> entrySet = frequency.entrySet();
			for(Map.Entry<Integer, Integer> entry : entrySet)
			{
				if(entry.getValue() == 1)
				{
					System.out.print(entry.getKey() + " ");
				}
			}
	}

}
