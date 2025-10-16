package gr.aueb.sev.ch6;

public class MaxArrayElement {

    public static void main(String[] args) {
        int[] grades = { 7, 10, 7, 9, 9, 7, 8 };
        int maxPosition;

        maxPosition = getMinPosition(grades);

        System.out.println("Min Grade: " + grades[maxPosition] + " MinPosition: " + (maxPosition + 1));
    }

    public static int getMinPosition(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        return maxPosition;
    }
}
