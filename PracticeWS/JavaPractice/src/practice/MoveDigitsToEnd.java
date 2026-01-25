package practice;

public class MoveDigitsToEnd {

	public static void main(String[] args) {
		 // Input: "a1b2c3d" 
        // Output: "abcd123"
        
        String str = "a1b2c3d";
        
        String letters = "";
        String digits ="";
        
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(Character.isLetter(ch))
            {
                letters = letters + ch;
            }
            else if(Character.isDigit(ch))
            {
                digits = digits + ch;
            }
        }
        String result = letters + digits;
        System.out.println(result);

	}

}
