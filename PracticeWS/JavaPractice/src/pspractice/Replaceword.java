package pspractice;

public class Replaceword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Rushi Mane";
		String Swapped = "";
		
		String arr1[] = name.split(" ");
//		System.out.println(arr1[0]);
		
		for(int i = arr1.length - 1 ; i >= 0; i-- )
		{
			Swapped = Swapped + " " + arr1[i];
		}
		System.out.println(Swapped.trim());

	}

}
