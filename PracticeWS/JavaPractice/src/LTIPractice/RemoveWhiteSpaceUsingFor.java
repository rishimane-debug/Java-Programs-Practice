package LTIPractice;

public class RemoveWhiteSpaceUsingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Rushiksh Mane";
		String new1 = "";
		for(int i = 0; i < name.length(); i++)
		{
			char ch = name.charAt(i);
			if(ch != ' ')
			{
				new1+=ch;
			}

		}
		System.out.println(name.length());
		System.out.println(name.indexOf('e'));
		System.out.println(new1);

	}

}
