package Array.Questions.LOGIC;

import java.util.Scanner;

public class CountOccureces {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the Array Element" + (i + 1) + " : ");
            arr[i] = input.nextInt();     
        }
        System.out.println("Enter the target Element");
        int targetElement=input.nextInt();
         int Count=CountOccureces(arr,targetElement);
         System.out.println("The Element "+targetElement+" occured "+Count+ " times.");
    }
        
        static int CountOccureces(int[] arr,int targetElement){
            
            int count=0;
            for(int i=0;i<arr.length;i++){
                if(targetElement==arr[i]){
                    count++;
                }
                

            }
            return count;
        }



    }

