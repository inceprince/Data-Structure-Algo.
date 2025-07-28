package Array.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 4, 5 },
                { 5, 8 },
                { 4, 6, 20, 7 },
        };
        int [] res=Search(arr, 20);
        System.out.println(Arrays.toString(res));

    }
    static int[] Search(int [][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int []{row,col};
                }
            }

        }
        return new int[] {-1,-1};
    }

}