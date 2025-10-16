package gr.aueb.sev.ch6;

import java.util.Arrays;

public class ShallowCopy {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] shallowCopy;
        int[] arrCopy = new int[arr.length];

        shallowCopy = arr;
        shallowCopy[0] = 100;

        System.out.println(arr[0]); // Side effect

        // Deep Copy
        for (int i = 0; i < arr.length; i++) {
            arrCopy[i] = arr[i];
        }

        System.arraycopy(arr, 0, arrCopy, 0, arr.length);
        arrCopy = Arrays.copyOf(arr, arr.length);
        arrCopy = Arrays.copyOfRange(arr, 0, arr.length);
    }
}
