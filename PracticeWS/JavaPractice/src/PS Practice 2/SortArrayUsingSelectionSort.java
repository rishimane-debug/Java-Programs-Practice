package JavaPrograms;

public class SortArrayUsingSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {98, 3, 2, 42, 23};
		
		
		for(int i = 0; i < arr.length - 1; i++)
		{
			int minindex = i;
			
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[j] < arr[minindex])
				{
					minindex = j;
				}
				
			}
			
			int temp = arr[i];
			arr[i] = arr[minindex];
			arr[minindex] = temp;
			
		}
		
		System.out.println("Sorted Array:");
		for(int num : arr)		{
			System.out.println(num + " ");
		}
		
		

	}

}
