package ArrayProject;

import java.util.Arrays;

public class Assignment10 {
    public static void main(String[] args) {
        /*
         Write a java program to find the second largest number in the array
         */

        int[]   arr = {5, 234, 23, 67, 845, 42, 14};

        Arrays.sort(arr);
        System.out.println("The second largest value in the array is "+arr[arr.length-2]);


    }
}
