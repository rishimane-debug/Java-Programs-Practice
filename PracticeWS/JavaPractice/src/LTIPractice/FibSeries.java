package LTIPractice;

public class FibSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		int a = 0;
		int b = 1;
		
		for(int i = 1; i <=num; i++)
		{
				
			System.out.println(a);
			
			int next = a + b; //2
			a = b;  //2
			b = next;  //2
			
		}

	}

}
