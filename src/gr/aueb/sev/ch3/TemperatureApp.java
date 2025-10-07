package gr.aueb.sev.ch3;

import java.util.Scanner;

/**
 * Αν η θερμοκρασία είναι < 0 τότε το
 * isBelowZero γίνεται true, αλλιώς γίνεται
 * false. Ο χρήστης δίνει τη θερμοκρασία
 */
public class TemperatureApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isTempBelowZero = false;
        int temp = 0;

        System.out.println("Παρακαλώ εισάγετε μία θερμοκρασία (ακέραια τιμή)");
        temp = scanner.nextInt();

        isTempBelowZero = temp < 0;

        System.out.println("Temperature is below zero: " + isTempBelowZero);
    }
}
