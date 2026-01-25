package JavaPrograms;

public class ReverseStringWithOutSpecialChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Test123@345@";
		char[] arr = input.toCharArray();
		
		int left = 0;
		int right = arr.length - 1;
		
		while(left < right)
		{
			if(!Character.isLetterOrDigit(arr[left]))
			{
				left++;
			}
			else if(!Character.isLetterOrDigit(arr[right]))
			{
				right--;
			}
			else
			{
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				
				left++;
				right--;
			}
		}
		System.out.println(new String(arr));

	}

}
