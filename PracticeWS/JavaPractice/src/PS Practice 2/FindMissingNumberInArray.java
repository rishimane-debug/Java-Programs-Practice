package JavaPrograms;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 5, 6, 7, 8, 9, 10};
		System.out.println(arr.length);
		int n = arr.length + 1;
		System.out.println(n);
		
		int expectedSum = n*(n+1)/2; //55
		int actualSum = 0;
		
		for(int num : arr)
		{
			actualSum = actualSum + num;  //51
		}
		
		int missingNumber = expectedSum - actualSum;
		System.out.println(missingNumber);
		

	}

}
