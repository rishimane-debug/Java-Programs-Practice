package javapractice;

public class IfElseStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 6,22, 50, 9, 21, 7, 8, 10};
		//print only numbers which are multiple of 2
		
		for(int i = 0; i < arr.length; i ++)
		{
			if (arr[i] % 2 == 0)
			{
				System.out.println(arr[i]);
				break; //to check if array has multiple of two.
			}
		}
		

	}

}
