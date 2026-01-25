package JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Rushikesh";
		String reverse = "";
		
		for(int i = input.length() -1 ; i >= 0; i-- )
		{
			char ch = input.charAt(i);
			reverse = reverse + ch;
		}
		System.out.println(reverse);

	}

}
