// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
      //second most repeating character in string
        String str = "Hellloo";
        char[] chars = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for(char ch : chars)
            {
                if(map.containsKey(ch))
                {
                    map.put(ch, map.get(ch) + 1);
                }
                else
                {
                    map.put(ch,1);
                }
            }
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i : map.values())
            {
                if(i > max)
                {
                    secondMax = max;
                    max = i;
                }
                else if(i < max && i > secondMax)
                {
                    secondMax = i;
                }
            }

        for(Map.Entry<Character,Integer> entry : map.entrySet())
            {
                if(entry.getValue() == max)
                {
                    System.out.println("Most Occuring character: " + entry.getKey());
                    
                }
                 if(entry.getValue() == secondMax)
                {
                    System.out.println("Second Most Occuring character: " + entry.getKey());
                    
                }
            }
        // System.out.println(max);
        // System.out.println(secondMax);
       
    }
}
