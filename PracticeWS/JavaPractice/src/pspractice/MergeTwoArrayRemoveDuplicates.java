package pspractice;
import java.util.*;
import java.util.ArrayList;
public class MergeTwoArrayRemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 4, 5, 5};
		int b[] = {8, 8, 9, 7};
		
		
		//sum of Array
//		int sum = 0;
//		for(int num : b)
//		{
//			 sum = sum + num;
//		}
//		System.out.println(sum);
		
		List<Integer> mergedArray = new ArrayList<Integer>();
		
		for(int num : a)
		{
			mergedArray.add(num);
		}
		for(int num : b)
		{
			mergedArray.add(num);
		}
		
//		System.out.println(mergedArray);
		
		LinkedHashSet<Integer> uniqueArray = new LinkedHashSet<Integer>(mergedArray);
		
		System.out.println(uniqueArray);
		for(int num : uniqueArray)
		{
			System.out.print(num + " ");
		}
		
		
	}

}
