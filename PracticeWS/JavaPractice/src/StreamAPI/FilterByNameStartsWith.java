// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
import java.util.stream.*;
class Main {
    public static List<String> filterNamesStartingWithA(List<String> names)
    {
        List<String> result = names.stream().filter(name -> name.toUpperCase().startsWith("A") ||
                                                            name.toUpperCase().startsWith("L"))
                                                            .collect(Collectors.toList());
        return result;
        
    }
    public static void main(String[] args) {
      List<String> names = Arrays.asList("Rushi", "Aswin", "Nikita", "Ankita", "aveen","Bharati", "LT", "Megha" );
        System.out.println(filterNamesStartingWithA(names));
    }
}
