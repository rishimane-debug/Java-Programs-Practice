package practice;

public class CharacterShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "xYz Abc1";
//		o/p : yZa Bcd
		String result = "";
		
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(ch == ' ')
			{
				result = result + ch;
			}
			else if(ch == 'z')
			{
				result = result + 'a';
			}
			else if(ch == 'Z')
			{
				result = result + "A";
			}
			else
			{
				result = result + (char)(ch + 1);
			}
		}
		System.out.println(result);

	}

}
