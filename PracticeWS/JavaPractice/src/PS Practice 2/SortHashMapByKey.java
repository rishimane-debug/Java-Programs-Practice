package JavaPrograms;
import java.util.HashMap;
import java.util.TreeMap;

public class SortHashMapByKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("C", 43);
		map.put("D", 2);
		map.put("A", 6);
		map.put("T", 54);
		
		
		 TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(map);
		System.out.print("Sorted TreeMap:");
		System.out.print(sortedMap);

	}

}
