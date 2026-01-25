package LTIPractice;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {{1, 3, 5},
						{4, 5, 7},
						{7, 2, 1}
		};
		
		
		for(int i = 0; i < 3; i ++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}

	}

}
