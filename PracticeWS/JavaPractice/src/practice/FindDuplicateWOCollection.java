// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Main {
    public static void main(String[] args) {
        //find Uniques
        String name = "Rushikesh";

        for(int i = 0; i < name.length(); i++)
            {
                int counter = 0;
                for(int j = 0; j < name.length(); j++)
                    {
                        if(name.charAt(i) == name.charAt(j))
                        {
                            counter++; //1
                            
                        }
                        // break;
                    }
                if(counter == 2)
                {
                    if(name.indexOf(name.charAt(i)) == i)       //for second 's' value of i will be '7' but indexOf(s) will return 2 
                                                                // so second 's' will not bre printed same for 'h'
                    {   
                        System.out.print(name.charAt(i) + " ");
                    
                }
            }
    }}
}
