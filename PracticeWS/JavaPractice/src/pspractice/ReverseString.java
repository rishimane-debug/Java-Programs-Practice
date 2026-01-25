package pspractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "How are you";
		String reverse = "";
		
		for(int i = input.length() - 1; i >= 0; i-- )
		{
			reverse = reverse + input.charAt(i);
		}
		
		System.out.println("Original: " + input);
		System.out.println("Reversed: "+reverse);
		

	}

}
