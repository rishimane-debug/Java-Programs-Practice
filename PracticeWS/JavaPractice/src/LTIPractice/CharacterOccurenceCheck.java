package LTIPractice;

public class CharacterOccurenceCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " Hello World";
		
		int[] charcount = new int[256];
		for(int i = 0; i < str.length(); i ++)
		{
			char ch = str.charAt(i);
			charcount[ch]++;
		}
		System.out.println("Character Occurence:");
		for(int i = 0; i < charcount.length; i++)
		{
			if(charcount[i] > 0 && (char)i != ' ')
			{
				System.out.println((char)i +":" + charcount[i]);
			}
		}
	}

}
