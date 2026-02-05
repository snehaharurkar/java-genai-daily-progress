package day03;

import java.util.Scanner;

public class calculatorMethod {

    public static int add(int a, int b){
        return a+b;
    }
     static int subtract(int a, int b){
        return a-b;
     }
     static int multiply(int a, int b){
        return a*b;

     }
     static float divide(int a,int b){
        if(b==0){
            return 0;
        }
        return a/b;
     }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first number: ");
        int a=sc.nextInt();
        System.out.print("enter the second number: ");
        int b=sc.nextInt();

        System.out.println("choose operation");
        System.out.println("1:add");
        System.out.println("2:subtract");
        System.out.println("3:multiply");
        System.out.println("4:divide");
        int choice=sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("result is " + add(a,b));
                break;
            case 2:
                System.out.println("result is " + subtract(a,b));
                break;
            case 3:
                System.out.println("result is " + multiply(a,b));
                break;
            case 4:
                System.out.println("result is " + divide(a,b));
                break;
        }
        sc.close();



    }
}
