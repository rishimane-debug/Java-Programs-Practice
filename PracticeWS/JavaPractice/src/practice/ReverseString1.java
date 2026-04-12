package practice;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "Rushi";
		String reverse = "";
		
		for(int i = original.length()- 1; i >= 0; i-- )
		{
			reverse = reverse + original.charAt(i);
		}
		System.out.println(reverse);
		
		if(reverse.equals(original))
		{
			System.out.println("String is palindrom");
		}
		else
		{
			System.out.println("String is not palindrom");
		}

	}

}
