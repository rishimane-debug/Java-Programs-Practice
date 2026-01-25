package practice;

public class CompressionOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12. Compress a string (Run-length encoding)
	    // WK loves this one.
	    // Input: "aaabbc" 
	    // Output: "a3b2c1"
		
		String str = "aaabbcccc";
		String result = "";
		int counter = 1;
		
		for(int i = 0; i < str.length() - 1; i++)
		{
			if(str.charAt(i) == str.charAt(i + 1))
			{
				counter++;
			}
			else
			{
				result = result + str.charAt(i) + counter;
				counter = 1;
			}
		}
		
		result = result + str.charAt(str.length() - 1 ) + counter;

		System.out.println(result);
	}

}
