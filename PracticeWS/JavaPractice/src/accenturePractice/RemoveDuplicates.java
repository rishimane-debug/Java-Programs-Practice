package accenturePractice;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Banana";
		String new1 = "";
		
		for(int i = 0; i < str1.length(); i++)
		{
			char ch = str1.charAt(i);
			
			if(new1.indexOf(ch) == -1)
			{
				new1+=ch;
			}
		}
		System.out.println(new1);

	}

}
