package gr.aueb.sev.ch6;

/**
 * Unsized array init.
 */
public class UnsizedInitApp {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };  // unsized array initialization.
        int[] arr2 = new int[] { 1, 8, 12, 23 };    // array initializer

        for (int i = 0; i <= arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Enhanced for
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
