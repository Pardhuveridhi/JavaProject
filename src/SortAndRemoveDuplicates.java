package src;

import java.util.Arrays;

public class SortAndRemoveDuplicates {
    public static int[] sortAndRemoveDuplicates(int[] array) {
        Arrays.sort(array);

        int[] temp = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length -1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[array.length-1];

        return Arrays.copyOf(temp, j);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 3, 1, 8, 2, 1};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        int[] result = sortAndRemoveDuplicates(numbers);

        System.out.println("Sorted Array without Duplicates: " + Arrays.toString(result));
    }
}
