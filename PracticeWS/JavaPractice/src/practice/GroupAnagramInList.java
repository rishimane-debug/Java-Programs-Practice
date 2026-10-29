// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        // o/p: [[bat], [eat, tea, ate], [tan, nat]]

        Map<String, List<String>> map = new LinkedHashMap<>();

        for(String word : arr)
            {
                char[] ch = word.toCharArray();

                Arrays.sort(ch);
                String key = new String(ch);
                // System.out.println(key);
                if(map.containsKey(key))
                {
                    map.get(key).add(word);
                }
                else
                {
                    List<String> list = new ArrayList<>();
                    list.add(word);
                    map.put(key,list);
                }
            }
        System.out.println(map.values());
    }
}
