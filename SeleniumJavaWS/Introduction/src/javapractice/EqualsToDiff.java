package javapractice;

import java.util.Scanner;

public class EqualsToDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String a1 = sc.next();
		String a2 = sc.nextLine();
//		System.out.println(a1 );
		System.out.println(a2);
		
		String a = "Rushi";
		String b = "Rushi";
		
		String c = new String("Rushi");
		String d = new String ("Rushi");
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		System.out.println(c == d);
		System.out.println(c.equals(d));

	}

}
