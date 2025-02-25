package src;

import java.util.Arrays;
public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
          System.out.println(arr[i]);
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
