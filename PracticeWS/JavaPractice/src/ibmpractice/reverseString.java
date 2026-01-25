package ibmpractice;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Rushikesh";
		String reverse = "";
		
		for(int i = name.length() - 1; i >= 0; i--)
		{
			char ch = name.charAt(i);
			reverse = reverse + ch;
		}
		System.out.println(reverse);

	}

}
