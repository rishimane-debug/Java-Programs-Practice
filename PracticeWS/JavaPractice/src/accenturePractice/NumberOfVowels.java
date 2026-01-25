package accenturePractice;

public class NumberOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Heloo";
		int counter = 0;
		
		for(int i = 0; i < str1.length(); i++)
		{
			char ch  = str1.charAt(i);
			if(ch =='a' || ch =='e' || ch == 'i' || ch == 'o'|| ch =='u')
			{
				counter++;
			}
		}
		
		System.out.println("Number of vowels: " + counter);

	}

}
