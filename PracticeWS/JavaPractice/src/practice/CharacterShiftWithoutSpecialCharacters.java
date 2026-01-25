package practice;

public class CharacterShiftWithoutSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "x@Y1z A%bc";
//		o/p : y@Z1a B%cd
		String result = "";
		
		
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <='z')
			{
				if(ch == 'z')
				{
					result = result + 'a';
				}
				else {
					result = result + (char)(ch + 1);
				}
			}
			else if(ch >='A' && ch <='Z')
			{
				if(ch =='Z')
				{
					result = result + 'A';
				}
				else
				{
					result = result + (char)(ch + 1);
				}
			}
			else
			{
				result = result + ch;
			}
		}
		System.out.println(result);

	}

}
