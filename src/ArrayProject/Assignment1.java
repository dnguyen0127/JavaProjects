package ArrayProject;

import  java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        /*
        *
        * Using Scanner create an array of integer values.
        * After the array is created, calculate the sum of all stored elements
        * in that array.
        *
        */

        int[]   arr=new int[5];
        Scanner sc=new Scanner(System.in);
        int x=0;

        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
            x+=arr[i];

        }
        System.out.println("The sum of all stored elements in this array is "+x);




    }

}
