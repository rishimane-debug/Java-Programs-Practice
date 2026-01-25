package JavaPrograms;

public class ReverseWordsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "How are you";
//		output = "woH era uoy";
		String[] words = input.split(" ");
		String result = "";

		
		for(String word : words)
		{
			String reverseword = "";
			for(int i = word.length() -1 ; i >= 0; i--)
			{
				reverseword = reverseword + word.charAt(i);
			}
			result = result + reverseword + " ";
		}
		System.out.println(result);
	}

}
