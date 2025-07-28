package Array.Lecture;

import java.util.Arrays;
import java.util.Scanner;

public class t2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];  // 3 rows, 2 columns

        // Input
        for (int row = 0; row < arr.length; row++) {
            System.out.println("Enter elements for Row " + (row + 1) + ":");
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print("  Column " + (col + 1) + ": ");
                arr[row][col] = in.nextInt();
            }
        }

        // Output
        //Normal Loop
        System.out.println("\nMatrix is:");
        // for (int row = 0; row < arr.length; row++) {
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        //using Array.tostring 
            //  for (int row = 0; row < arr.length; row++) {
            //     System.out.println(Arrays.toString(arr[row]));
            //  }

        // Enhanced Loop
        for(int[]a:arr){
            System.out.println(Arrays.toString(a));
        }

        in.close();
    }
}
