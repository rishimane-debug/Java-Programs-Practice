package pspractice;
import java.util.*;
public class AddNumberAtTheBegining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input[] = {2, 3, 4, 5};
		int addNumber = 1;
//		o/p : {1 ,2, 3, 4, 5};
		
		int newArr[] = new int[input.length + 1];
		
		newArr[0] = addNumber;
		
//		{1, 0, 0, 0, 0}
		
		for(int i = 0; i < input.length ; i++)
		{
			newArr[i + 1] = input[i];
		}
		
		System.out.println(Arrays.toString(newArr));
		for(int num : newArr)
		{
			System.out.print(num + " ");
		}
		

	}

}
