package JavaPrograms;
import java.util.Arrays;
public class MoveZerostoEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 0, 6, 9, 0, 5, 3};
		 int index = 0;
//		 int[] newArr = new int[arr.length];
		 
		 for(int i = 0; i < arr.length; i++)
		 {
			 if(arr[i] != 0){
				 
				 arr[index] = arr[i];
				 index++;
			 }
		 }
		 
		 while(index < arr.length)
		 {
			 arr[index] = 0;
			 index++;
		 }
		 System.out.println(Arrays.toString(arr));

	}

}
