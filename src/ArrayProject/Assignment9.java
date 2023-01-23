package ArrayProject;

public class Assignment9 {
    public static void main(String[] args) {
        /*
        Maximum and minimum number in the array?
        */

        int[] numbers = {9, 2, 15, 22, 37, 18, 27, 42};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Largest value in the array: " + max);
        System.out.println("Smallest value in the array: " + min);




        /*
        *
        * In this program, an array called "numbers" is created
        * and initialized with some values.
        * Then, a for loop is used to iterate through the array.
        * In each iteration, the current value is compared with
        * the current minimum and maximum values.
        * If the current value is greater than the current maximum,
        * it becomes the new maximum. If the current value is less than
        * the current minimum, it becomes the new minimum.
        * Finally, the minimum and maximum values are printed out.
        *
        * */


    }
}
