package JavaPrograms;

public class FirstLetterCapitalRemaningSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		String input = "how are you?";
//		o/p = How Are You?
		String result = "";
		
		String words[] = input.split(" ");
		
		for(String word : words)
		{
			if(word.length() > 0)
			{
				word = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
			}
			result = result + word + " ";
			
		}
		System.out.println(result);

	}

}
