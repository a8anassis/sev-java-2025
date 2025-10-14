package gr.aueb.sev.ch5;

/**
 * Ορίζει τις μεθόδους isEven και isOdd
 * για τον έλεγχο άρτιων και περιττών ακεραίων.
 */
public class EvenOddApp {

    public static void main(String[] args) {

    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static boolean isOdd(int a) {
        // return a % 2 != 0;
        return !isEven(a);
    }
}
