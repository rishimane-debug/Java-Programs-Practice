// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
      String[] names = {"Rushi", "Naveen", "Naveen", "Nikita", "Ankita", "Ankita", "Ashwin"};

        String unique[] = new String[names.length];
        int count = 0;

        for (int i = 0 ; i < names.length; i++)
            {
                boolean duplicate = false;
            for(int j = 0 ; j < count ; j++)
                {
                    if(names[i].equals(unique[j]))
                    {
                        duplicate = true;
                        break;
                    }
                }
            if(!duplicate)
            {
                unique[count] = names[i];
                count++;
            }
            
            }
        System.out.println(Arrays.toString(unique));
         for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}
