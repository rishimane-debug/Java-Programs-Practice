package LTIPractice;

public class NumberOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text ="Hello Woold";
		
		String vowels = "aeiou";
		
		int counter = 0;
		
		for(int i = 0; i < text.length(); i++)
		{
			char ch = text.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u')
			{
				counter++;
			}
		}
		System.out.println("Vowels present: " + counter);

	}

}
