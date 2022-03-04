package week2.arraylists;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        System.out.print("Array:");
        for(int i = 0; i < intArray.length ; i++) {
            intArray[i] = (int)(Math.random() * 100) + 1;
            System.out.print(" " + intArray[i]);
        }

        int max = 0;
        int pos = 0;
        for ( int i = 0 ; i < intArray.length ; i++ ) {
            if (intArray[i] > max) {
                max = intArray[i];
                pos = i;
            }
        }
        System.out.println("\n\nThe largest value is " + max);
        System.out.println("It is in slot " + pos);

    }
}
