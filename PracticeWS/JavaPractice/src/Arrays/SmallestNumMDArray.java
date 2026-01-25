package Arrays;

public class SmallestNumMDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc [][] = {{4, 4, 5},
						{3, 4, 7}, 
						{1, 2, 9}};
		int min = abc[0][0];
		
		for(int i = 0; i < 3; i ++)
		{
			for(int j = 0; j < 3; j++)
			{
//				System.out.print(abc[i][j] + " ");
					if(abc[i][j] < min)
					{
						min = abc[i][j];
					}
					
			}

		}
		System.out.println(min);

	}

}
