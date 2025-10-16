package gr.aueb.sev.ch6;

/**
 * Βρίσκει το ελάχιστο στοιχείο ενός πίνακα
 * με μέθοδο.
 */
public class MinArrayElement {

    public static void main(String[] args) {
        int[] grades = { 7, 10, 7, 9, 9, 7, 8 };
        int minPosition;

        minPosition = getMinPosition(grades);

        System.out.println("Min Grade: " + grades[minPosition] + " MinPosition: " + (minPosition + 1));
    }

    public static int getMinPosition(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        return minPosition;
    }
}

