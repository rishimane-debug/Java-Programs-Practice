package LTIPractice;

public class checkPalindrom {

	

	public static void main(String[] args) {
		
		String str1 = "radar";
		String result ="";
		
		for(int i = str1.length()-1; i >= 0; i--)
		{
			result+= str1.charAt(i);
		}
		System.out.println(result);
		if(str1.equals(result))
		{
			System.out.println("Strings are palindrom");
		}
		else
		{
			System.out.println("Strings are not palindrom");
		}
	}
	
}
