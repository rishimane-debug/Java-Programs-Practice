package practice;

public class ReverseStringWithoutSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "My name is rushikesh";
		String reverse= "";		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			if(str.charAt(i) != ' ')
			reverse = reverse + str.charAt(i);
		}
		
//		System.out.println(reverse.replaceAll(" ", ""));
		System.out.println(reverse);
		
	}

}
