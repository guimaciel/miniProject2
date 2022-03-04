package week2.arraylists;

public class BasicArrays2 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        for(int i = 0; i < intArray.length ; i++) {
            intArray[i] = (int)(Math.random() * 100) +1;
            System.out.println(String.format("Slot %d contains a %d", i, intArray[i]));
        }
    }
}
