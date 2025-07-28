package Array.Questions.LOGIC;

import java.util.Arrays;
import java.util.Scanner;

public class pairWithSum {
    static int[] pairSum(int[] arr, int k) {
        int[] pair = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    pair[0] = arr[i];
                    pair[1] = arr[j];
                    return pair;

                }

            }
        }
        return null;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the Array Element" + (i + 1) + " : ");
            arr[i] = input.nextInt();

        }
        System.out.print("Enter the target sum (k): ");
        int k = input.nextInt();
        int[] result = pairSum(arr, k);
        if (result != null) {
            System.out.println("The Pair is " + Arrays.toString(result));
        } else {
            System.out.println("No pair found with sum " + k);
        }

    }

}
