package pspractice;

public class ReverseWordsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "How are you";
//		output = woh era uoy
		
		String[] words = input.split(" ");
		String result = "";
		
		
		for(String word : words)
		{
			String reversedWord = "";
			for(int i = word.length() -1 ; i >=0; i--)
			{
				reversedWord = reversedWord + word.charAt(i);
			}
			result = result + reversedWord + " ";
		}
		System.out.println("Input:" + input);
		System.out.println("Output:" + result);

	}

}
