
package Array.LinearSearch;


public class MinIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 4, 5 },
                { 5, 8 },
                { 4, 6, 20, 7 },
        };
        int  res=Max(arr);
        System.out.println(res);

    }
    static int Max(int [][] arr){
        int minValue=arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]<minValue){
                    minValue=arr[row][col];
                    
                  
                }
            }

        }
       return minValue;
    }

}
