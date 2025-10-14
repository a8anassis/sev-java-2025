package gr.aueb.sev.ch5;

/**
 * Αμοιβαία ανταλλαγή τιμών δύο μεταβλητών.
 */
public class Swap {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);

        System.out.println("a=%d, b=%d");
    }

    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
