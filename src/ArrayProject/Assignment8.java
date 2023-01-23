package ArrayProject;

public class Assignment8 {
    public static void main(String[] args) {
        /*
        Write a Java Program to print the first 10 numbers of Fibonacci series.
        */

        int[]   fibonacci=new   int[10];

        fibonacci[0]=0;
        fibonacci[1]=1;

        System.out.println(fibonacci[0]);
        System.out.println(fibonacci[1]);

            for(int i=2; i<fibonacci.length;i++){
                fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
                System.out.println(fibonacci[i]);
            }





    }
}
