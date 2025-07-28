
// Way2
package Array.Questions.LOGIC;

import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    static int[] reverse(int[] a) {
        int i = 0;
        int j = a.length - 1;
        int temp = 0;
        while (j > i) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return a;
    }
    // static int[] reverse(int[] arr) {
    // int temp[] = new int[arr.length];
    // for (int i = 0; i < arr.length; i++) {
    // temp[i] = arr[arr.length - 1 - i];
    // }
    // return temp;

    // }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter 5 Numbers");
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }

        int reversed[] = reverse(a);
        System.out.println("Reversed Array :" + Arrays.toString(a));

    }

}
