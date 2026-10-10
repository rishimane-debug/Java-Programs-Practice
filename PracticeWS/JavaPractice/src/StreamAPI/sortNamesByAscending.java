// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
import java.util.stream.*;
class Main {
    public static List<String> sortNamesByAscending(List<String> names)
    {
      List<String> result =
          names.stream()
                .sorted()  //sorted for ascending sorting
                  .collect(Collectors.toList());
        return result;
        
    }
    public static void main(String[] args) {
      List<String> names = Arrays.asList("Rushi", "Aswin", "Nikita", "Ankita", "Naveen","Bharati", "LT", "Megha");
        System.out.println(sortNamesByAscending(names));
    }
}
