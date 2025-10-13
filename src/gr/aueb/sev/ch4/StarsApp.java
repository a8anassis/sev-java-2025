package gr.aueb.sev.ch4;

/**
 * Prints 10 horizontal stars.
 */
public class StarsApp {

    public static void main(String[] args) {

        // Prints 10 horizontal stars
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }

        // Prints 10 vertical stars
        for (int i = 1; i <= 10; i++) {
            System.out.println("*");
        }

        // Prints 10 rows with 10 stars in each row
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Prints 1, 2, 3, 4, ... 10
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 10; i >= 1; i--){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 10; i++){
            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
