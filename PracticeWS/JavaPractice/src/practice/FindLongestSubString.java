// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
   String str = "abcdeafgh";
    String longest = "";
        for(int i = 0; i < str.length(); i++)
            {
                String temp ="";
                for(int j = i; j < str.length(); j++)
                    {
                        char ch = str.charAt(j);
                        if(temp.indexOf(ch) != -1)
                        {
                            break;
                        }
                        temp = temp + str.charAt(j);
                    }
                if(temp.length() > longest.length())
                {
                    longest = temp;
                }
            }
        System.out.println(longest);
        System.out.println(longest.length());
    }
}
