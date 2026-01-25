package practice;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "1234";
		int num = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			num = num * 10 + (ch - '0');
		}
				
		System.out.println(num +1);
		

	}

}
