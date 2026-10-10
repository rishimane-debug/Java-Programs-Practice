// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
import java.util.stream.*;
class Main {
         public static List<Integer> tranformNumbers(List<Integer> numbers)
    {
       List<Integer> result = 
           numbers.stream()
                .map(n -> n = n * 2)
                   .collect(Collectors.toList());
        return result;
    }
    
    public static void main(String[] args) {
       List<Integer> numbers = Arrays.asList(10, 40, 5,50, 30, 25, 14);
        System.out.println(tranformNumbers(numbers));
        
    }
}
