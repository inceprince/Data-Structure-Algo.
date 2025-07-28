package Array.Questions.LOGIC;

import java.util.Scanner;

public class chcekSorted {

    static boolean checkSorted(int[] arr) {
        boolean ascending = true;
        boolean descending = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {// ascending
                ascending = false;
            }
            else if (arr[i] < arr[i + 1]) {// descending
                descending = false;
            }

        }
        return ascending || descending;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        boolean sort = checkSorted(arr);
        System.out.println("Is array sorted (ascending or descending)? " + sort);

    }
}
