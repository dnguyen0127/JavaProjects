package ArrayProject;

public class Assignment11 {
    public static void main(String[] args) {
        /*
        Write a program to print out duplicate elements from an Array of Strings?
        */

        String[] arr = {"James", "John", "Pookie", "Frank", "John", "Andrew"};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j]) && (i != j)) {
                    System.out.println("Duplicate element: " + arr[i]);

                }
            }
        }



    }
}
