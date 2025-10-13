package gr.aueb.sev.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το n! = 1 * 2 * 3 * ... * n
 * Για παράδειγμα το 3! = 1 * * 3,
 * το 5! = 1 * 2 * 3 * 4 * 5
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int result = 0;

        System.out.println("Please insert an int");
        n = scanner.nextInt();

        result = facto(n);

        System.out.printf("%d! = %d", n, result);
    }

    public static int facto(int n) {
        int facto = 1;

        for (int i = 1; i <= n; i++) {
            facto = facto * i; // facto *= i
        }

        return facto;
    }
}
