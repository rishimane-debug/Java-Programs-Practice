package accenturePractice;

public class CheckCharAccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Heelloyyy";
		str1 = str1.toLowerCase();
		
		
		int charcount[] = new int[256];
		
		
		for(int i = 0; i < str1.length(); i++)
		{
			char ch = str1.charAt(i);
			charcount[ch]++;
		}
		
		System.out.println("Character Occurence:");
		
		for(int i = 0; i < charcount.length; i++)
		{
			if(charcount[i] > 0)
			{
				System.out.println((char)i + ": " + charcount[i]);
			}
		}
		

	}

}
