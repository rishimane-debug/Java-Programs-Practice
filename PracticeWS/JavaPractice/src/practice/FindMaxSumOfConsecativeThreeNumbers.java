// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Main {
    public static void main(String[] args) {
     int[] arr = {2, 1, 5, 1, 3, 2, 8, 1};
        int maxSum = 0;
        for(int i = 0; i < arr.length - 2; i++)
            {
                int sum = arr[i] + arr[i + 1] + arr[i + 2];
                if(sum > maxSum)
                {
                    maxSum = sum;
                }
            }
     System.out.println(maxSum);
         
         }}
