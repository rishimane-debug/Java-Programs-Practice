// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
       List<String> names = Arrays.asList("Abhijit", "Don", "Alexa", "Adam", "Ram");
          //print count of names starting with "A"
            long result = names.stream()
                                .filter(name -> name.startsWith("A"))
                                .count();
            System.out.println(result);

        //print names with length more that 4
        names.stream().filter(name->name.length() > 3).forEach(name -> System.out.print(name + " "));
        //limiting the result
        names.stream().filter(name -> name.length() >3).limit(1).forEach(name -> System.out.print("\n"+ name + " "));
}}
