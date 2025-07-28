package Array.Questions.LOGIC;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        int[] arr = new int[5];

      
        for (int i = 0; i < arr.length; i++) {
              System.out.print("Enter the Array Element"+(i+1)+" : ");
            arr[i] = input.nextInt();
        }
        int maxValue = maxval(arr);
        System.out.println("The Largest value is:" + maxValue);

    }

    static int maxval(int[] num) {
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }

        }
        return max;

    }
}
