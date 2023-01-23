package ArrayProject;

public class Assignment5 {
    public static void main(String[] args) {
        /*
        * Create a 2D array of integers. Develop a program
        *  which will calculate the sum of  even and odd numbers for that array.
        */

        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sumOdd=0;
        int sumEven=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 == 0) {
                    sumEven += arr[i][j];

                }else{
                    sumOdd += arr[i][j];
                }

            }
        }
        System.out.println("The sum of even numbers in this array is "+sumEven);
        System.out.println("The sum of odd numbers in this array is "+sumOdd);




    }
}
