package gr.aueb.sev.ch3;

import java.util.Scanner;

/**
 * Μετράει το πλήθος των ακεραίων που δίνει ο χρήστης
 * μέχρι να δώσει -1
 */
public class CountApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int count = 0;

        while (true) {
            System.out.println("Παρακαλώ εισάγετε ένα ακέραιο (-1 για έξοδο)");
            num = scanner.nextInt();
            if (num == -1) break;
            count++;
        }

        System.out.println("Το πλήθος των ακεραίων είναι: " + count);
    }
}
