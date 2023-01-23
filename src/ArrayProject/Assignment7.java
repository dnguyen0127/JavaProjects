package ArrayProject;

import  java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        /*
        * Write a java program to check whether a given number is prime or not?
        * */

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean isPrime = true;



        for(int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                isPrime = false;

            }
        }
        if(isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }


    }
}
