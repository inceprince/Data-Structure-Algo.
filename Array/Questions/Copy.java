package Array.Questions.LOGIC;

import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        int[]arr={23,45,67};
        
       
        System.out.println( Arrays.toString(copy(arr)));

    }
    static int[] copy(int[] arr){
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=arr[i];
        }
        return res;
    }
    
}
