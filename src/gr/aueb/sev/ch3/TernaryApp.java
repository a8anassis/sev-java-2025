package gr.aueb.sev.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το απόλυτο ενός ακεραίου.
 */
public class TernaryApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int abs;

        System.out.println("Παρακαλώ εισάγετε ένα ακέραιο");
        num = scanner.nextInt();

//        if (num < 0) {
//            abs = -num;
//        } else {
//            abs = num;
//        }

        // Ternary operator - τριαδικός τελεστής
        abs = (num >= 0) ? num : -num;

        System.out.printf("Absolute of %d is %d", num, abs);
    }
}
