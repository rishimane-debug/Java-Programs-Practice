package practice;

public class ReverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 1234;
		int rev = 0;
		
		while(number != 0)
		{
			int lastDigit = number % 10;
			rev = rev * 10 + lastDigit;
			number = number / 10;
		}
		System.out.println(rev);
	}

}
