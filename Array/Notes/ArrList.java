package Array.Lecture;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {
        // ArrayList does not require a predefined size and can grow dynamically as elements are added.
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        // list.add(67);
        // list.add(89);
        // list.add(57);
        // list.add(99);
        // list.add(877);
        // list.add(897);
        // System.out.println(list.contains(99));
        // System.out.println(list);
        // list.set(0, 99);
        // System.out.println(list);


        //Input
        for(int i=0; i<7;i++){
            System.out.print("Enter the elemet "+(i+1)+": ");
            list.add(input.nextInt());
        }
        //simple ouput
        System.out.print(list); //print the  output list 
        //output using for loop
        // for(int i=0; i<7;i++){
        //     System.out.print("The Element at index "+(i+1)+" is : ");
        //     System.out.println(list.get(i));
        // }


    }

}
