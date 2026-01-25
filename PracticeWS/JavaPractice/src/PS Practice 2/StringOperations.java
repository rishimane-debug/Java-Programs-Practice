package JavaPrograms;
import java.util.*;

public class StringOperations {
    public static void main(String[] args) {
        String input = "automation";
        input = input.toLowerCase(); // handle uppercase also

        // 1. Character Count
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char ch : input.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Character count: " + charCount);
}}