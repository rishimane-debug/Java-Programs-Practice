package ibmpractice;

public class SwapStringSWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//combine str1 and str2 and store in str1
		
		String str1 = "Hello";
		String str2 = "World";
		
		System.out.println(str1);
		System.out.println(str2);
		
		str1 = str1 + str2;
//		str1 = "HelloWorld"
		str2 = str1.substring(0,str1.length() - str2.length());
		
		//str2 = "Hello";
		
		str1 = str1.substring(str2.length());
		
		System.out.println(str1);
		System.out.println(str2);
		

	}

}
