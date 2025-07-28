package Array.Questions.LOGIC;

public class MaxRange {
    public static void main(String[] args) {
        int[] arr = { 1, 67, 98, 54, 56 };
      
        System.out.println(maxRange(arr,1,4));
    }
           static int maxRange (int[] arr,int start,int end) {
        int maxval = arr[start];
        for (int i = start; i <=end; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;

    }
}
