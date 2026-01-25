package JavaPrograms;

public class MinMaxNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {98, 3, 2, 42, 23};
		int min = arr[0];
		int max = arr[0];
		
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		System.out.println("Maximum number :" + max);
		System.out.println("Minimum number :" + min);

	}

}
