package pspractice;

public class ReplaceOWithDoller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input = "Tomorrow";
//		o/p = t$m$$rr$$$w
		String result = "";
		int counter = 1;
		
		for(int i = 0; i < input.length(); i++)
		{
			char ch = input.charAt(i);
			
			if(ch == 'o')
			{
				for(int j = 0; j < counter; j++)
				{
					result = result + "$";
				}
				counter++;
			}
			else
			{
				result = result + ch;
			}
		}
		System.out.println(result);
		 
		
	}

}
