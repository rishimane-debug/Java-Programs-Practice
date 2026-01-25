package practice;
import java.util.Scanner;
public class FibSeries {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number:");
		int number = sc.nextInt();
		int a = 0;
		int b = 1;
		
		for(int i = 1; i <= number; i++)
		{
			System.out.println(a);
			
			int next = a + b;
			a = b;
			b = next;
		}
	}

}
