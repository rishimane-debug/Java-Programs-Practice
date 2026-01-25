package Arrays;

public class MultiArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= new int[2][3];
		a[0][0] = 3;
		a[0][1] = 5;
		a[0][2] = 8;
		a[1][0] = 2;
		a[1][1] = 9;
		a[1][2] = 10;
			
		//We will need 2 loops one for iterating through row another for iterating through column
		
		for(int i = 0; i < 2; i++)   //loop for row with length 2
		{
			for(int j = 0; j < 3; j++)   //loop for column with length 3
			{
				System.out.print(a[i][j] + " ");  //using print to println in single line 
			}
			System.out.println();  //to println second row on next line.
		}
		
		
		
		
		
		int b[][] = {
						{1, 3, 7},
						{5, 7, 9},
						{2, 6, 7}};
//		System.out.println(b[0][2]);
		}

	

}
