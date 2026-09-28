// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Main {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 20, 12, 5, 20};
        int count = 0;

        int[] unique = new int[arr.length];

        for(int i = 0 ; i < arr.length; i++)
            {
                boolean duplicate = false;
        for(int j = 0; j < count; j++)
            {
                if(arr[i] == unique[j])
                {
                    duplicate = true;
                    break;
                }
            }
                if(!duplicate)
                {
                 unique[count]= arr[i];
                    count++;
                }
            }
                for (int i = 0; i < count; i++) {
            System.out.print( unique[i] + " ");
        }
            
    }
}
