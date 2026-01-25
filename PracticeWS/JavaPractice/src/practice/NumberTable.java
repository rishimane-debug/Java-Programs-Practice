package practice;

import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number:");
		int number = sc.nextInt();
		
		for(int i = 1; i <= 10 ; i ++)
		{
			System.out.println(number +"X" + i + "=" + (number * i));
		}

	}

}
