package gr.aueb.sev.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίων ενός ακεραίου.
 * Για, παράδειγμα το 123 -> 3 ψηφία
 */
public class DigitCount {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int count = 0;

        // Εντολές
        System.out.println("Παρακαλώ εισάγετε ένα ακέραιο");
        inputNum = scanner.nextInt();

        num = inputNum;

        do {
            count++;
            num = num / 10;
        } while (num != 0);

        // Εκτύπωση των αποτελεσμάτων
        System.out.println("Το πλήθος των ψηφίων του " + inputNum + " είναι: " + count);
    }
}
