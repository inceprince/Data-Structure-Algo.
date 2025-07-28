package Array.Questions.LOGIC;

import java.util.Arrays;
import java.util.Scanner;

public class moveZeroToFront {
    static void moveZeroToFront(int[] arr) {
        int index = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index--;
            }
        }

        while (index >= 0) {
            arr[index] = 0;
            index--;
        }

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
        moveZeroToFront(arr);
        System.out.println(Arrays.toString(arr));
    }

}
