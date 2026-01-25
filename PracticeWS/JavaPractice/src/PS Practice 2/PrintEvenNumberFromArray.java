package JavaPrograms;

public class PrintEvenNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
//		for(int i = 0 ; i < arr.length; i++)
//		{
//			if(arr[i] % 2 == 0)
//			{
//				System.out.println(arr[i]);
//			}
//		}
		for(int num : arr)
		{
			if(num % 2 == 0)
			{
				System.out.print(num + " ");
			}
		}
		

	}

}
