// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
import java.util.stream.*;
class Main {
         public static List<String> removeDuplicates(List<String> names)
    {
        List<String> result = 
            names.stream()
                .distinct()
                .collect(Collectors.toList());
        return result;
    }
    
    public static void main(String[] args) {
      List<String> names = Arrays.asList("Rushi", "Naveen", "Naveen", "Nikita", "Ankita", "Ankita", "Ashwin","Bharati", "LT", "Megha");
        System.out.println(removeDuplicates(names));
        
    }
}
