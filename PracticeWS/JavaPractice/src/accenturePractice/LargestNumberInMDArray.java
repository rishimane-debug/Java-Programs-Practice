package accenturePractice;

public class LargestNumberInMDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[][] = { {2, 4, 6},
						{8, 5, 4},
						{7, 3, 8},
		};
		
		int max = arr[0][0];
		
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
//				System.out.print(arr[j][i]);
				
				if(arr[i][j] > max )
				{
					max = arr[i][j];
				}
			}
//			System.out.println();
		}
		System.out.println(max);

	}

}
