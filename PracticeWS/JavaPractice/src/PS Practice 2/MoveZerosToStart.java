package JavaPrograms;
import java.util.Arrays;

public class MoveZerosToStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 0, 6, 9, 0, 5, 3};
		 int index = 0;
		 
		 int[] newArr = new int[arr.length];
		 
		 for(int i = 0 ; i < arr.length; i++)
		 {
			 if(arr[i] == 0)
			 {
				 newArr[index] = 0;
				 index++;
			 }
		 }
		 for(int i = 0; i < arr.length; i++)
		 {
			 if(arr[i] != 0)
			 {
				 newArr[index] = arr[i];
				 index++;
			 }
		 }
		 System.out.println(Arrays.toString(newArr));
	}

}
