package practice;

public class Concatinations {

	public static void main(String[] args) {
		String s = "Hello";
        int num = 1;
        char ch = 'A';

        System.out.println("---- STRING + NUMBER ----");
        System.out.println(s + num); //Hello1
        System.out.println(num + s); //1Hello
        
        System.out.println("---- STRING + CHAR ----");
        System.out.println(s + ch); //HelloA
        System.out.println(ch + s); //AHello
        
        System.out.println("---- CHAR + NUMBER ----");
        System.out.println(ch + num); // 65 + 1 66
        System.out.println(num + ch); //1 + 65 66
        
        System.out.println("---- NUMBER + CHAR + STRING ----");
        System.out.println(num + ch + s); //1 + 65 + Hello : 66Hello
        System.out.println(s + num + ch); //Hello + 1 + 'A' : Hello1A
        // String s = "Hello";
        // int num = 1;
        // char ch = 'A';
        System.out.println("---- CHAR + STRING + NUMBER ----");
        System.out.println(ch + s + num); //AHello1
        
        System.out.println("---- STRING + STRING + NUMBER ----");
        System.out.println(s + s + num); //HelloHello1
        
        System.out.println("---- NUMBER + NUMBER + STRING ----");
        System.out.println(5 + 10 + s); //15Hello
        
        System.out.println("---- STRING + NUMBER + NUMBER ----");
        System.out.println(s + 5 + 10); //Hello510
        
        System.out.println("---- STRING + (NUMBER + NUMBER) ----");
        System.out.println(s + (5 + 10)); //Hello15
	}

}
