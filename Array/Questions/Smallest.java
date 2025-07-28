package Array.Questions.LOGIC;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the Array Element" + (i + 1) + " : ");
            arr[i] = input.nextInt();

        }
        int minValue = smallest(arr);
        System.out.println("The Smallest elemet is " + minValue);

    }

    static int smallest(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
