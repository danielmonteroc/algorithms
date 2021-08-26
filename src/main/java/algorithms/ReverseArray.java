package algorithms;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 9};
        printArray(array);
        reverse(array);
        printArray(array);
    }

    public static void reverse(int[] array) {}

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
