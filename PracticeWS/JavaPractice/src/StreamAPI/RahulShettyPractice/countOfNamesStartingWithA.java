// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
       List<String> names = Arrays.asList("Abhijit", "Don", "Alexa", "Adam", "Ram");
        // names.addAll();
        System.out.println(names);

        long result = names.stream()
                                .filter(name -> name.startsWith("A"))
                                .count();
        
        System.out.println(result);
}}
