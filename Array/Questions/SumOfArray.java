package Array.Questions.LOGIC;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the Array Element" + (i + 1) + " : ");
            arr[i] = input.nextInt();

        }
        int Sum=sumOfArray(arr);
        System.out.print("The Array Sum is: "+Sum);

    }

    static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

}
