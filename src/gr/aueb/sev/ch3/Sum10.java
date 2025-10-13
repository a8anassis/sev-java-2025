package gr.aueb.sev.ch3;

/**
 * Υπολογίζει το άθροισμα των 10 πρώτων
 * ακεραίων.
 */
public class Sum10 {

    public static void main(String[] args) {

        int sum = 0;
        int i = 1;
        int mul = 1;

        while (i <= 10) {
            sum = sum + i;  // sum += i;
            mul = mul * i;
            i++;
        }

        System.out.println("Sum: " + sum);
        System.out.printf("Mul: %,d\n", mul);
    }
}
