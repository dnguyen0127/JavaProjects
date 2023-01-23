package ArrayProject;

import  java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        /*
        *
        * Using Scanner create an array of countries.
        * When an array is created, retrieve all values from it and while
        * retrieving those values print capital for each country.
        * (use 2 different loops)
        *
        */

        Scanner sc=new Scanner(System.in);

        String[]  arr=new String[5];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextLine();

        }


        /*

        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i].charAt(0));
        }

        Use two different loops. For loop already used above.
        Using While loop below.

        */

        int i=0;
        while(i>=0 && i<5){
            System.out.println("The first capital letter of "+arr[i]+" is "+arr[i].charAt(0));
            i++;
        }



    }
}
