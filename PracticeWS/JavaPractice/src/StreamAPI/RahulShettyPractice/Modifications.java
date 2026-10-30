// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
       List<String> names = Arrays.asList("Azbhijit", "Don", "Alexa", "Adam", "Rama");
          //filter the names ending with 'a' and convert to uppercase

        names.stream()
                .filter(name -> name.endsWith("a"))
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name+" "));
        //print names which has first letter as a to uppercase and by sorted
System.out.println("\n*********************");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .sorted().map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name +" "));

        System.out.println("\n*********************");
        // merge two different Lists
        List<String> names2 = Arrays.asList("Ashwin", "Ankita", "Naveen", "LT","Nikita", "Megha", "Sanju");
            List<String> newList = Stream.concat(names.stream(), names2.stream())
                                    .collect(Collectors.toList());
        // System.out.println(newList);
        newList.forEach(name -> System.out.print(name+ " "));
        //check if specific element present in list
        boolean flag = newList.stream()
                .anyMatch(name -> name.equalsIgnoreCase("Megha"));
        System.out.println(flag);
        
        
        
}}
