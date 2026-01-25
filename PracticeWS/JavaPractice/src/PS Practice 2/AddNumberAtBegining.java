package JavaPrograms;
import java.util.Arrays;

public class AddNumberAtBegining {

	public static void main(String[] args) {
		int arr[] = {2, 3, 4, 5};
		int addNumber = 1;
		
		int newArr[] = new int[arr.length + 1];
		
		newArr[0] = addNumber;
		for(int i = 0 ; i < arr.length; i++)
		{
			newArr[i+1] = arr[i];
		}
		System.out.println(Arrays.toString(newArr));
		
		for(int num : newArr)
		{
			System.out.print(num + " ");
		}
	}

}
