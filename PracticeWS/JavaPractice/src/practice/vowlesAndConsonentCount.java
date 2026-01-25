package practice;

public class vowlesAndConsonentCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Input: "Hello"
        // Output:
        // Vowels = 2
        // Consonants = 3
        String str = "Hellooo";
        int vowCount = 0;
        int consCount = 0;
        String vowels = "aeiouAEIOU";

        for(int i = 0; i < str.length(); i ++)
        {
            char ch = str.charAt(i);
            if(vowels.indexOf(ch) != -1)
            {
                vowCount++;
            }
            else
            {
                consCount++;
            }
            

        }
        System.out.println(vowCount);
            System.out.println(consCount);
            

	}

}
