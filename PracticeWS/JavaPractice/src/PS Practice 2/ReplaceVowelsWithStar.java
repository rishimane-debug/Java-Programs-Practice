package JavaPrograms;

public class ReplaceVowelsWithStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Welcome To India";
		String vowels = "AEIOUaeiou";
		String result = "";
		int counter = 0;
		
		
		for(int i = 0; i < input.length(); i++)
		{
			char ch = input.charAt(i);
			
			if(vowels.indexOf(ch) != -1)
			{
				result = result + "*";
				counter++;

			}
			else
			{
				result = result + ch;
			}
		}
		System.out.println("Number of vowels:" + counter);
		System.out.println("Original:" + input);
		System.out.println("Result:" + result);

	}

}
