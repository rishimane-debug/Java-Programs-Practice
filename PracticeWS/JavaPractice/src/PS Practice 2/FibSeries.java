package JavaPrograms;

public class FibSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		int num = 5;
		for(int i = 1; i <= num; i++)
		{
			System.out.println(a);
			
			int result = a + b;
			a = b;
			b = result;
		}

	}

}
