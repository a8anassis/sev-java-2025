package gr.aueb.sev.ch4;

import java.util.Scanner;

/**
 * Διαβάζει από τον χρήστη το base και το power
 * και υπολογίζει τη δύναμη του base^power
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base;
        int power;
        int result = 1;

        System.out.println("Παρακαλώ εισάγετε base και power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        for (int i = 1; i <= power; i++) {
            result *= base;     // result = result * base
        }

        System.out.println("Result: " + result);
    }
}
