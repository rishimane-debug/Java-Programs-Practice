// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        String str = "banana";
        String longest = "";

        for(int i = 0 ; i < str.length(); i++)
            {
                for(int j = i ; j <str.length(); j++)
                    {
                        String temp = str.substring(i , j + 1);
                    
                if(isPalindrom(temp))
                {
                    if(temp.length() > longest.length())
                    {
                        longest = temp;
                    }
                }
            }}

         System.out.println("Longest palindrome: " + longest);
        System.out.println("Length: " + longest.length());
    }

        static boolean isPalindrom(String str)
            {
            String result =  "";
            for(int i = str.length() - 1 ; i >=0; i--)
                {
                    result = result + str.charAt(i);
                }
            if(str.equals(result))
            {
                return true;
            }
        else
            {
                return false;
            }
        
            
    }
}
