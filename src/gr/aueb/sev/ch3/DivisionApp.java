package gr.aueb.sev.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει δύο ακεραίους, έναν αριθμητή
 * και ένα παρονομαστή και αν ο αριθμητής είναι 0
 * διακόπτεται το loop ανώ αν ο παρονομαστής είναι
 * 0 συνεχίζει το while
 */
public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator;
        int denominator;
        int result = 0;

        while (true) {
            System.out.println("Παρακαλώ εισάγετε τον αριθμητή (0 για Έξοδο");
            numerator = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("Quiting ....");
                break;
            }

            System.out.println("Παρακαλώ εισάγετε τον παρονομαστή");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Λάθος διαίρεση με το μηδέν");
                continue;
            }

            result = numerator / denominator;
            System.out.println("Το αποτέλεσμα είναι: " + result);
        }
    }
}
