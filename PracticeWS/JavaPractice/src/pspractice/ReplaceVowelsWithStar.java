package pspractice;

public class ReplaceVowelsWithStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Welcome to India";
//		output = W*lc*m* t* *nd**

		String vowels = "AEIOUaeiou";
		String result = "";
		
		for(int i = 0; i < input.length(); i++)
		{
			char ch = input.charAt(i);
			
			if(vowels.indexOf(ch) != -1)
			{
				result = result + "*";
			}
			else
			{
				result = result + ch;
			}
		}
		System.out.println(result);

	}

}
