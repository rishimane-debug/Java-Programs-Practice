package accenturePractice;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = 0;
		int secondmax = 0;

		
		int arr[][] = {{1, 5, 6},
				{3, 6, 4},
				{5, 10, 10},
		};
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++ )
			{
				int current = arr[i][j];
				
				if(current > max)
				{
					secondmax = max;
					max = current;
				}
				else if (current > secondmax && current < max)
				{
					secondmax = current;
				}
			}
		}
		System.out.println(max);
		System.out.println(secondmax);
	}

}
