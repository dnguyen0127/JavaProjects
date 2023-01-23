package ArrayProject;

public class Assignment3 {
    public static void main(String[] args) {
        /*
        *
        *Create a 2D array of integer values. Print the sum of all numbers.
        *
        */

        int[][] arr={{1,2,3},
                    {4,5,6},
                    {7,8,9}

        };

        int sum=0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                sum+=arr[i][j];
            }
        }

        System.out.println("The sum of all numbers in this array is "+sum);

    }
}
