package Array.Lecture;

import java.util.Arrays;

public class ColNoFixed {

    public static void main(String[] args) {
        int [][] arr={
            {1,2,3,4},
            {5,7},
            {3,6,7,89}
        };
        //using Array.tostring 
             for (int row = 0; row < arr.length; row++) {
                System.out.println(Arrays.toString(arr[row]));
             }
        //using normal loop     
        // for (int row = 0; row < arr.length; row++) {
        //     for(int col=0;col<arr[row].length;col++){
        //         System.out.print(arr[row][col]+" ");
        //     }
        //     System.out.println();
            
        // }
    }
}