package JavaPrograms;

public class ReplaceOWith$OnIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "tomorrow";
//		o/p tom$rrow
		
		String result = "";
		
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if(i == 3)
			{
				result = result + "$";
			}
			else
			{
				result = result + ch;
			}
		}
		System.out.println(result);
	}

}
