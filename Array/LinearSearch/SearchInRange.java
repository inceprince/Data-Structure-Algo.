package Array.LinearSearch;

import java.util.Scanner;

public class SearchInRange {
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
        System.out.println("Enter The Target Value");
        int target=input.nextInt();
        int res=Range(arr,target,1,4);
        System.out.println(res);

    }

    static int Range(int[] arr, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;

    }

}
