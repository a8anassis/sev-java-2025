package gr.aueb.sev.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το a^n. Για, παράδειγμα το
 * 2^10
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        System.out.println("Παρακαλώ εισάγετε το base και το power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        while (i <= power) {
            result = result * base; // result *= base;
            i++;
        }
        System.out.printf("%d^%d = %d", base, power, result);
    }
}
