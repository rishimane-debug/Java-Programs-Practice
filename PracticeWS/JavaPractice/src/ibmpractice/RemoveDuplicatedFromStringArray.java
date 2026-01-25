package ibmpractice;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatedFromStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a LinckedHash set which doesn't accept duplicate values and follows insertion order
		//Insert each array element in Linked Hash set using for loop
		//Convert LinkedHash set to array using toArray() method.
		//Print array elements using for loop
		
		String[] names = {"Rushi", "Naveen", "Naveen", "Nikita", "Ankita", "Ankita", "Ashwin"};
		
		LinkedHashSet<String> namesSet = new LinkedHashSet<String>();
		
		for(String name : names)
		{
			namesSet.add(name);
			
		}
		String[] uniqueNames = namesSet.toArray(new String[0]);
		System.out.println(Arrays.toString(uniqueNames));
//		for(String uname : uniqueNames)
//		{
//			System.out.println(uname);
//		}

	}

}
