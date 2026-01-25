package practice;

public class StringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World  ";
		//printing length of String
		System.out.println("Length: " + s.length());
		//printing char at specific index
		System.out.println("Char at 3: " + s.charAt(5));
		//remove any spaces
		System.out.println("Remove spaces: " + s.trim());
		//covert string to uppercase
		System.out.println("Uppercase String: " + s.toUpperCase());
		//check if contains specific text
		System.out.println("Check text: " + s.contains("o"));
		//return index of specific char
		System.out.println("Check index: " + s.indexOf("r"));
		//return substring from to specific index
		System.out.println("return substring: " + s.substring(2,6));
	}

}
