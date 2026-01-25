package javapractice;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3, 5, 7,8, 10};
			System.out.println(arr[3]);
			
			for(int i = 0 ; i < arr.length; i++)
			{
				System.out.println(arr[i]);
			}
			//using enhanced loop
			String[] names = {"rushi", "Ashwin", "Naveen", "Ankita", "Nikita"};
			for(String n:names)
			{
				System.out.println(n);
			}
	}

}
