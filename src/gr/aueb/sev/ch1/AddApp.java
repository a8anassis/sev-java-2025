package gr.aueb.sev.ch1;

/**
 * Υπολογίζει το άθροισμα δύο ακεραίων
 */
public class AddApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 3;
        int num2 = 5;
        int sum = 0;

        // Πράξεις - Εντολές
        sum = num1 + num2;

        // Εκτύπωση αποτελεσμάτων
        System.out.println("Το άθροισμα του " + num1 + ", " + num2 + " είναι ίσο με: " + sum);
        System.out.printf("Το άθροισμα του %02d, %02d είναι ίσο με: %1d\n", num1, num2, sum);
    }
}
