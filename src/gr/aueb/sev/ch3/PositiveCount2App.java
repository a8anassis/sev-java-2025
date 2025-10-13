package gr.aueb.sev.ch3;

import java.util.Scanner;

/**
 * Μετράει το πλήθος των θετικών που δίνει
 * ο χρήστης.
 */
public class PositiveCount2App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int positivesCount = 0;

        System.out.println("Παρακαλώ εισάγετε ένα ακέραιο");

        while ((num = scanner.nextInt()) >= 0) {
            positivesCount++;
            System.out.println("Παρακαλώ εισάγετε ένα ακέραιο");
        }

        System.out.println("το πλήθος των θετικών είναι: " + positivesCount);
    }
}
