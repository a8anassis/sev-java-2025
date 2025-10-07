package gr.aueb.sev.ch2;

/**
 * Demo για μετατροπή τύπων.
 */
public class TypecastApp {

    public static void main(String[] args) {
        int num = 10;
        long myLong = 20;

        num = (int) myLong;
        myLong = num;
    }
}
