package Array.Lecture;

import java.util.Arrays;
import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         //Syntax
        // datatype[] variable_name= new datatype[size]
        // eg1: store 5 roll number
        // int [] rollno =new int[5];
        // or
        // int [] rollno2={11,15,45,43,46};

        int[] ros; //declaration of array. ros is getting defined in stack.
        ros=new int[5]; //initilaization:actually here ibject us being creted in the heap.
      
        // int [] a=new int[4];
        //array of primitives
        // a[0]=45;
        // a[1]=67;
        // a[2]=67;
        // a[3]=78;

        // for(int i=0;i<a.length;i++){
        //     System.out.print("Enter element"+(i+1)+": ");
        //    a[i]=input.nextInt();
        
        // }
        //Printing the array

        //    System.out.println("Array elements are:");
        //    System.out.println(Arrays.toString(a));// it will covert to string and give output .

        // for(int i=0;i<a.length;i++){
        //     System.out.print(a[i] +" ");
        // }

        // for(int num:a){ //for every elemt in array,print the elemet(enhaced for loop)
        //     System.out.print(num+" ");
        // }

        //array of objects

        String[] str=new String[4];
        for(int i=0;i<str.length;i++){
            System.out.print("Enter String"+(i+1)+": ");
            str[i]=input.next();
        }
        System.out.println(Arrays.toString(str));







        input.close();
    }
}

    

