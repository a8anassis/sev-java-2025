package gr.aueb.sev.ch6;

/**
 * Swap with array.
 */
public class SwapApp {

    public static void main(String[] args) {
        int[] arr = {10, 20};

        printArray(arr);
        swap(arr);
        System.out.println();
        printArray(arr);
    }

    public static void swap(int[] arr) {
        if (arr.length != 2) return;

        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
