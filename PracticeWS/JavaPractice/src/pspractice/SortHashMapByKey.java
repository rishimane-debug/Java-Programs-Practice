package pspractice;
import java.util.HashMap;
import java.util.TreeMap;
public class SortHashMapByKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("C", 34);
		map.put("E", 21);
		map.put("A", 45);
		map.put("B", 9);
		map.put("J", 32);
		
		
		TreeMap<String,Integer>sortedMap = new TreeMap<String, Integer>(map);
		
		System.out.println(sortedMap);
	}

}
