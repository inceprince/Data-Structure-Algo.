package Array.LinearSearch;

import java.util.Scanner;

public class Minium {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Size Of Array");
        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter The array");
        // input.
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the Array Element" + (i + 1) + "at Index " +(i)+ " : ");
            arr[i] = input.nextInt();

        }
       
        int res=minimum(arr);
        System.out.println(res);
    }
    static int minimum(int[] arr){
        int ans=arr[0];
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]<ans){
                ans=arr[index];
            }
            
        }
        return ans;

    }

    
}
