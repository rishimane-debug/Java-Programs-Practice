package JavaPrograms;
import java.util.Arrays;

public class SortArrayUsingSelectionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {64, 25, 12, 22, 11};
		
		for(int i = 0; i < arr.length; i++)
		{
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++ )
			{
				if(arr[j] < arr[minIndex])
				{
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}
}
