package gr.aueb.sev.ch3;

/**
 * Εμφανίζει 10 οριζόντια αστεράκια.
 */
public class Stars10App {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            System.out.print("*");
            i++;    // i = i + 1;
        }

        int j = 10;
        while (j >= 1) {
            System.out.print("*");
            j--;
        }
    }
}
