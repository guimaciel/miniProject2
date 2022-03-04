package week2.arraylists;

public class CopyingArrays {
    public static void main(String[] args) {
        // Create an array of ten integers
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < arr1.length ; i++ ) {
            // Fill the array with ten random numbers (1-100)
            arr1[i] = (int) (Math.random() * 100) +1;
            // Copy the array into another array of the same capacity
            arr2[i] = arr1[i];
        }

        // Change the last value in the first array to a -7
        arr1[arr1.length -1] = -7;

        // Display the contents of both arrays
        System.out.print("Array 1:");
        for (int i = 0 ; i < arr1.length ; i++ ) {
            System.out.print(" " + arr1[i]);
        }
        System.out.print("\nArray 2:");
        for (int i = 0 ; i < arr2.length ; i++ ) {
            System.out.print(" " + arr2[i]);
        }






    }
}
