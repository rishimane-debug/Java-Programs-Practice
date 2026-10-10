// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,20,22,25,30,35);
        List<Integer> result = numbers.stream()
                                .filter(n -> n % 2 == 0)
                                .collect(Collectors.toList());
        System.out.println(result);
    }
}
