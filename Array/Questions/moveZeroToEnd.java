package Array.Questions.LOGIC;

import java.util.Arrays;
import java.util.Scanner;

public class moveZeroToEnd {
    static void moveZeroToLast(int [] arr){
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
            
        }
        while(arr.length>index){
            arr[index]=0;
            index++;
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
        moveZeroToLast(arr);
        System.out.println(Arrays.toString(arr));

    }

}
