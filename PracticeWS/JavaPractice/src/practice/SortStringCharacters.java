package practice;

public class SortStringCharacters {

	public static void main(String[] args) {
	     // Input: "dcab" → "abcd"
        String str = "dcab";
        String result = "";
        char arr[] = str.toCharArray();
        // [d, c, a, b]
        for(int i = 0 ;i < arr.length; i++)
        {
            for(int j = i+ 1; j < arr.length; j++)
            {
                    if(arr[i] > arr[j])
                    {
                        char temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
            }
        }
            for(char ch : arr)
            {
                result = result +ch;
            }
            System.out.println(result);

	}

}
