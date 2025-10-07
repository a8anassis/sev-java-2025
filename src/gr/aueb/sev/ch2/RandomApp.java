package gr.aueb.sev.ch2;

/**
 * Χρησιμοποιεί τη Math.random() για να παράγει τυχαίους
 * ακεραίους μεταξύ 1 - 6, δηλαδή ένα ζάρι
 */
public class RandomApp {

    public static void main(String[] args) {
        int die = (int)(Math.random() * 6) + 1;
        System.out.println(die);
    }
}
