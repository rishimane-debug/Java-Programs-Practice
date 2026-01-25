package javapractice;

public class ExceptionHandelling {
//try block can follow multiple catch block
//catch should be imediated block after try	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int b = 0;
//		int b = 0=1;
		try {
//		int c = a/b;
//		System.out.println(c);
			
			int[] arr = new int[5];
			System.out.println(arr[7]);
		}
			
		catch(ArithmeticException ae)
		{
			System.out.println("This is arithmetic exception");
		}
		catch(IndexOutOfBoundsException eob)
		{
			System.out.println("This is Index out of bound exception");
		}
		catch(Exception e)
		{
			System.out.println("I catched exeption");
		}
	}

}
