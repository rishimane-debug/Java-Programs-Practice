package practice;

public class PairSum {

	public static void main(String[] args) {
		int arr[] = {5, 12, 6,7, 13,  8, 10, 16, 4, 23};
        int sum = 20;
        
        for(int i = 0 ; i < arr.length ; i++)
        {
        	for(int j = i + 1; j < arr.length; j++)
        	{
        		if(arr[i] + arr[j] == sum)
        		{
        			System.out.println(arr[i] + " " + arr[j]);
        		}
        	}
        }

	}

}
