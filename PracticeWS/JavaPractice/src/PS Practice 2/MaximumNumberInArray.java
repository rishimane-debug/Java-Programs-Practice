package JavaPrograms;

public class MaximumNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {55, 67, 89, 32, 96, 34};
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i ++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println(max);
		
		

	}

}
