package algorithms;

import java.util.Arrays;

public class Sum {
    /// 1, 5, 7 , 9
    //     *      *
    // 14

    static boolean findPair(int[] array, int target) {
        Arrays.sort(array);
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == target) {
                return true;
            } else if (array[i] + array[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] array = {1, 5, 7, 9};

        System.out.println(findPair(array, 14));
        System.out.println(findPair(array, 1));
        System.out.println(findPair(array, 16));
    }
}
