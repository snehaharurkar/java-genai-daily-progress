package day03;

import java.util.Scanner;

public class primeCheck {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;

        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;//its not a prime number
            }
        }
            return true;//its a prime number
        }


    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print( "enter the number: ");
        int n=sc.nextInt();

        if(isPrime(n)) {
            System.out.println(n + " is a prime number");
        }
        else {
            System.out.println(n + " is not a prime number");
        }


        }

    }




