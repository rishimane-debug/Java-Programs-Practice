
public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = new int[5];
		arr[0] = 5;
		arr[3] = 7;
		arr[2] = 3;
		arr[1] = 3;
		arr[4] = 2;
//		arr[5] = 1;
		
		int arr1[] = {32, 34, 31, 36, 35 , 45 , 21, 20, 122};
		System.out.println(arr[2]);
		System.out.println(arr1[3]);
		
		for(int i = 0; i < arr.length; i++)
		{	
					System.out.println(arr[i]);
		}
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		
		String names[] = {"rushi", "mane", "Pratik", "Vivek", "Sagar", "Aniket"};
		
		for(int i = 0; i<names.length; i++)
		{
			System.out.println(names[i]);
		}
		
		//using enhanced for loop to iterate through array.
		for( String s:names)
		{
			System.out.println(s);
		}
		for( int num: arr1)
		{
			System.out.println(num);
		}
	}

}
