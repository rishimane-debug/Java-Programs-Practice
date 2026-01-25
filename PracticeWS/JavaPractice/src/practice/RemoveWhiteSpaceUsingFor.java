package practice;

public class RemoveWhiteSpaceUsingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Rushikesh Mane";
		
		String name1 = "";
		
		for(int i = 0; i < name.length(); i++)
		{
			if(name.charAt(i) != ' ') {
			name1 = name1 + name.charAt(i);
			}
		}
		System.out.println(name1);

	}

}
