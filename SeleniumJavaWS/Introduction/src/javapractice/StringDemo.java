package javapractice;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is object representing sequence of chanracters 
//		/String can defined in two ways 1 String literate and creating new object using new string
		
		//String iterate
		String a = "Rushi";
		String b = "Rushi";
		
		String c = new String("Welcome");
		String d = new String("Welcome");
		
		String s = "Rahul Shetty Academy";
		
		String[] splitedArr = s.split(" "); //slips string and stores it in array
		for( String names : splitedArr)
		{
			System.out.println(names);
		}
		//iterate through string in reverse to print sting in reverse
		String reverse = "";
		for(int i = s.length()-1; i >= 0; i --)
		{
			reverse = reverse + s.charAt(i);
			System.out.println(s.charAt(i));
			
		}
		System.out.println(reverse);
			
		
	}

}
