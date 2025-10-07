package gr.aueb.sev.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει Euro σε USD dollars και cents.
 * Για παράδειγμα, αν η ισοτιμία ευρώ - δολαρίου
 * είναι 1 euro = 99 USD cents, τότε 10 euros = 990 USD cents
 * Άρα 10 euros είναι 9 USD Dollars και 90 cents
 */
public class EuroApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;

        // Εντολές - Επεξεργασία
        System.out.println("Παρακαλώ εισάγετε ένα ποσό σε euros");
        inputEuros = scanner.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        // Εκτύπωση Αποτελεσμάτων
        System.out.printf("%d euros = %d usa dollars & %d usa cents", inputEuros, usaDollars, usaCents);
    }
}
