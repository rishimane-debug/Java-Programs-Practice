package JavaPrograms;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 123;
		int original = num;
		int reverse = 0;
		
		while(num > 0)
		{
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num /10;
		}

//		System.out.println(num);
		if(original == reverse)
			
		{
			System.out.println("Number is palindrom");
		}
		else {
			System.out.println("Number is not palindrom");
		}
	}

}
