package JavaPrograms;
import java.util.HashMap;
import java.util.Map;

public class PrintUniqueNumbersUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,2,2,3,4,4,5,6,6,7};
		
		HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
		
		for(int num : arr)
		{
			if(numbers.containsKey(num))
			{
				numbers.put(num, numbers.get(num)+ 1);
			}
			else
			{
				numbers.put(num, 1);
			}
		}
		System.out.print("Unique Number In Array Are: ");
		
		for(Map.Entry<Integer,Integer> entry : numbers.entrySet())
		{
			if(entry.getValue() == 1)
			{
				System.out.print(entry.getKey() + " ");
			}
		}

	}

}
