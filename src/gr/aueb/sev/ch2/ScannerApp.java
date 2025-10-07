package gr.aueb.sev.ch2;


import java.util.Scanner;

/**
 * Scanner Demo. Διαβάζει δύο ακεραίους
 * από το stdin (keyboard) και εκτυπώνει
 * το άθροισμα
 */
public class ScannerApp {

    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        System.out.println("Παρακαλώ εισάγετε δύο ακεραίους");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        sum = num1 + num2;

        System.out.printf("Sum of %d + %d = %d", num1, num2, sum);
    }
}
