package practice;

public class NumberOfAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello123 world!";
		int counter = 0;
		
		char arr[] = s.toCharArray();
		
		for(int i = 0; i < arr.length; i++)
		{
			char ch = arr[i];
			if(Character.isLetter(ch))
			{
				counter++;
			}
		}
		System.out.println(counter);

	}

}
