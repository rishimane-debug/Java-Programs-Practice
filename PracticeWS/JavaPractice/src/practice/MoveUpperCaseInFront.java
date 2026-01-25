package practice;

public class MoveUpperCaseInFront {

	public static void main(String[] args) {
//      Input: "aBcDeF"
//Output: "BDFace"
       String str = "aBcDeF";
       String upperCase = "";
       String lowerCase = "";
       
       for(int i = 0 ; i < str.length(); i++)
       {
           char ch = str.charAt(i);
           if(Character.isUpperCase(ch))
           {
               upperCase = upperCase + ch;
           }
           else if(Character.isLowerCase(ch))
           {
               lowerCase = lowerCase + ch;
           }
       }
       String result = upperCase + lowerCase;
       System.out.println(result);

	}

}
