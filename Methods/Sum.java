package Methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
    //    sum(); //simple print
    //    int ans=sum2(); //return type
    //    System.out.println(ans);
    int ans =sum3(20,39);//argument and parameter
    System.out.println(ans);

    }
     static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number1:");
        int num1=input.nextInt();
        System.out.print("Enter Number2:");
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.print("The Sum is: " +sum);
  
    }
    static int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number1:");
        int num1=input.nextInt();
        System.out.print("Enter Number2:");
        int num2=input.nextInt();
        int sum=num1+num2;
        return sum;
  
    }

    static int sum3(int a,int b){
        int sum=a+b;
        return sum;

    }

}

