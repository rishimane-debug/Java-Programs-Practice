package Arrays;

public class TwoDArrayColumnWise {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Printing 2D array column-wise (vertical):");
       for(int i = 0; i < 3; i ++)
       {
    	   for(int j = 0; j < 3; j++)
    	   {
    		   System.out.print(matrix[j][i]+" ");
    	   }
    	   System.out.println();
       }
    }
}
