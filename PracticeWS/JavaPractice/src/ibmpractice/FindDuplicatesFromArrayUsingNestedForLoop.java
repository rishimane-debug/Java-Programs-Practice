package ibmpractice;

public class FindDuplicatesFromArrayUsingNestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4, 5, 7, 4, 5, 9, 3};
		
		for(int i = 0 ; i < arr.length; i++)
		{
			for(int j = i + 1 ; j < arr.length; i++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println(arr[i]);
					break;
				}
				
			}
		}

	}

}
