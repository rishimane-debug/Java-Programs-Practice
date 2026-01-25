package practice;

public class ReverseStringWoSpecialCharacter {

	public static void main(String[] args) {
		String str = "Ru@s&h#i";
        String result = "";
        
        String letters = "";
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(Character.isLetter(ch))
            {
                letters = letters + ch;
            }
        }
//        System.out.println(letters);
        String reversedLetters = "";
        for(int i = letters.length() - 1 ; i >=0; i--)
        {
            char ch = letters.charAt(i);
            reversedLetters = reversedLetters + ch; 
        }
        // char arr[] = reversedLetters.toCharArray();
//        System.out.println(reversedLetters);
        
        int index = 0;
        for(int i = 0; i < str.length(); i ++)
        {
            char ch = str.charAt(i);
            if(Character.isLetter(ch))
            {
                result = result + reversedLetters.charAt(index);
                index++;
            }
            else{
                result = result + ch;
            }
        }
        System.out.println(result);

	}

}
