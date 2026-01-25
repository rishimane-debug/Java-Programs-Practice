package JavaPrograms;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class MergeTwoArrayRemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 4, 5, 5};
		int b[] = {8, 8, 9, 7};
		
		ArrayList<Integer> mergedList = new ArrayList<Integer>();
		
		for(int num : a)
		{
			mergedList.add(num);
		}
		for(int num : b)
		{
			mergedList.add(num);
		}	
		
		System.out.println(mergedList);
		
		
		
		LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<Integer>(mergedList);

		
		System.out.println("Merged Array without duplicates: " + uniqueSet);
	}

}
