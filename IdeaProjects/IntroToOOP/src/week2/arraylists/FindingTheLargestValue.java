package week2.arraylists;

public class FindingTheLargestValue {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        System.out.print("Array:");
        for(int i = 0; i < intArray.length ; i++) {
            intArray[i] = (int)(Math.random() * 100) + 1;
            System.out.print(" " + intArray[i]);
        }

        int max = 0;
        for ( int i = 0 ; i < intArray.length ; i++ ) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        System.out.println("\nThe largest value is " + max);

    }
}
