// package Array.Questions.LOGIC;

// import java.util.Arrays;
// import java.util.Scanner;

// public class SecondLargest {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int size = input.nextInt();
//         int[] arr = new int[size];

//         for (int i = 0; i < size; i++) {
//             System.out.print("Enter element " + (i + 1) + ": ");
//             arr[i] = input.nextInt();
//         }
//         int SecondMaxNum = SecondLargest(arr);
//         System.out.println("The Second Largest Element in an Array"+Arrays.toString(arr)+ " is : "+SecondMaxNum);

//     }

//     static int SecondLargest(int[] arr) {
//         int firstmax = arr[0];
//         int SecondMax=arr[1];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > firstmax) {
//                 SecondMax=firstmax;
//                 firstmax = arr[i];

//             }
//             else if(arr[i]>SecondMax && arr[i]!= firstmax){
//                 SecondMax=arr[i];
//             }

//         }
//         return SecondMax;
//     }

// }

package Array.Questions.LOGIC;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        int largestIndex = findIndexOfLargest(arr);
        // System.out.println("Index of largest element: " + largestIndex + ", Value: " + arr[largestIndex]);

        int secondLargest = findSecondLargest(arr, largestIndex);
        System.out.println("Second largest value: " + secondLargest);
    }

    //  Step 1: Find index of largest number
    static int findIndexOfLargest(int[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    //  Step 2: Find second largest by skipping the largest index
    static int findSecondLargest(int[] arr, int largestIndex) {
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (i != largestIndex && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}

