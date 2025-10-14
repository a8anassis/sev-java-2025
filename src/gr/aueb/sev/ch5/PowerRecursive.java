package gr.aueb.sev.ch5;

/**
 * Αναδρομική λύση του υπολογισμού του
 * a^n
 */
public class PowerRecursive {

    public static void main(String[] args) {

    }

    public static int pow(int base, int power) {
        if (power == 0) return 1;
        return base * pow(base, power-1);
    }
}
