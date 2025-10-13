package gr.aueb.sev.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης προσπαθεί να βρει ένα μυστικό κλειδί
 * (ακέραιο) και λαμβάνει κατάλληλο μήνυμα να το βει
 * ή όχι.
 */
public class BingoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET_KEY = 12;
        int inputNum;

        while (true) {
            System.out.println("Παρακαλώ εισάγετε ένα ακέραιο");
            inputNum = scanner.nextInt();

            if (inputNum == SECRET_KEY) {
                System.out.println("Bingo!");
                break;
            } else {
                System.out.println("Not Found. Try again");
            }
        }

        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε το app!");

    }
}
