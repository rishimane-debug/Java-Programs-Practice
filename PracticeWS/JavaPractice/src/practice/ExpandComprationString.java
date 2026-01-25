package practice;

public class ExpandComprationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input = a3b2c1
//		o/p = aaabbc
		String str = "a3b2c1";
		String result = "";
		for(int i = 0 ; i < str.length(); i = i + 2) {
			char ch = str.charAt(i);
			int counter = str.charAt(i + 1) - '0';
			
			
			for(int j = 0; j < counter; j ++)
			{
				result = result + ch;
			}
		}
		System.out.println(result);
		
		//ch = a
		//counter = 3;
//		result = aaabb

	}

}
