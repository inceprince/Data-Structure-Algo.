package Array.Lecture;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList2d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // Intilization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        // add elemets
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter The Row Elemet " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter Column" + (j + 1) + ": ");
                list.get(i).add(input.nextInt());
            }
        }
        //output
        // System.out.println(list);
    }
}
