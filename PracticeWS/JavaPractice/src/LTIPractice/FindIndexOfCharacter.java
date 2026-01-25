package LTIPractice;

public class FindIndexOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Rushikesh";
		char ch = 'n';
		
		int index = name.indexOf(ch);
		
		if(index != -1)
		{
			System.out.println("Index of "+ ch+" is " +index );
		}
		else
		{
			System.out.println("Character "+ch+" is not present in given String");
		}

	}

}
