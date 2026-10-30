// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(3, 2, 2,7, 5 ,1,9,7);
    //print unique numbers
        numbers.stream()
            .distinct()
            .forEach(number -> System.out.print(number + " "));
System.out.println("\n*********************");
  //print in sorted order
        numbers.stream()
                .sorted()
                .forEach(number -> System.out.print(number + " "));
        System.out.println("\n*********************");
    //print in descending order
        numbers.stream()
            .sorted(Comparator.reverseOrder())
            .forEach(number -> System.out.print(number + " "));

        System.out.println("\n*********************");
    //find uniques sort and print 3 rd number

       List<Integer> li =  numbers.stream()
            .distinct()
            .sorted()
            .collect(Collectors.toList());
        System.out.println(li.get(2));
}}
