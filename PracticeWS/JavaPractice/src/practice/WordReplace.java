package practice;

public class WordReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name  = "Rushikesh Mane";
		String swapped = "";
		String[] arr = name.split(" ");
		
		for(int i = arr.length - 1; i >= 0; i--)
		{
			swapped = swapped +" "+ arr[i];
		}
		System.out.println(swapped.trim());
//		System.out.println(arr[1]+ " "+ arr[0]);
	}}

