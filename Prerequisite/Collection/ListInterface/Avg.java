package Collection.ListInterface;

import java.util.*;

public class Avg {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter how many numbers you want to add (N): ");
        int N = input.nextInt();

        // Add numbers
        for (int i = 0; i < N; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            int num = input.nextInt();
            al.add(num);
        }

        // Calculate sum
        int sum = 0;
        for (int num : al) {
            sum += num;
        }

        // Calculate average
        double average = (double) sum / N;
        System.out.println("\nNumbers: " + al);
        System.out.println("Average: " + average);

        // Even-Odd check
        System.out.println("\nEven/Odd Check:");
        for (int number : al) {
            if (number % 2 == 0) {
                System.out.println(number + " is Even");
            } else {
                System.out.println(number + " is Odd");
            }
        }

        // Highest and Lowest number in list
        int max = al.get(0);
        int min = al.get(0);
        for (int i = 1; i < al.size(); i++) {
            int val = al.get(i);
            if (val > max) {
                max = val;
            }
            if (val < min) {
                min = val;
            }
        }

        System.out.println("\nMaximum number: " + max);
        System.out.println("Minimum number: " + min);



        //Remove duplicates
        
    }



}
