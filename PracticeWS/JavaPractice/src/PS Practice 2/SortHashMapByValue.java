package JavaPrograms;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortHashMapByValue {

    // Custom Comparator class to sort Map.Entry by value
    static class ValueComparator implements Comparator<Map.Entry<String, Integer>> {
        @Override
        public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
            return entry1.getValue().compareTo(entry2.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("D", 2);
        unsortedMap.put("E", 1);
        unsortedMap.put("B", 3);
        unsortedMap.put("A", 12);
        unsortedMap.put("C", 10);

        System.out.println("Unsorted Map: " + unsortedMap);

        // Convert Map to a List of Map.Entry
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(unsortedMap.entrySet());
        System.out.println(entryList);

        // Sort the list using the custom ValueComparator
        Collections.sort(entryList, new ValueComparator());

        // Create a LinkedHashMap to store the sorted entries and maintain order
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Sorted Map by Value: " + sortedMap);
    }
}