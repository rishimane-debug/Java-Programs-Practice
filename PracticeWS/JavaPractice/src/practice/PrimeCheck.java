package practice;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 11;
		boolean isPrime = true;
		
		if(num <= 1)
		{
			System.out.println("Number is not prime");
		}
		else
		{
			for (int i = 2; i <= num/2; i++)
			{
				if(num % i == 0)
				{
					isPrime = false;
					break;
				}
								
			
			}
			if(isPrime)
			{
				System.out.println("Number is  prime");
			}
			else
			{
				System.out.println("Number is not prime");
			}
		}

	}

}
