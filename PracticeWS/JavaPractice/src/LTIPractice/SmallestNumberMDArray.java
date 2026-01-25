package LTIPractice;

public class SmallestNumberMDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {{9, 6, 8},
						{7, 4, 2},
						{9, 4, 7}};
		int min = arr[0][0];
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				if(arr[i][j] < min)
				{
					min = arr[i][j];
				}
			}
			
		}
		System.out.println(min);
		}
}
