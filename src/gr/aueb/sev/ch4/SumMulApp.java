package gr.aueb.sev.ch4;

/**
 * Υπολογίζει το άθροισμα και το γινόμενο των
 * 10 πρώτων ακεραίων από 1 - 10.
 */
public class SumMulApp {

    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= 10; i++) {
            sum += i;   // sum = sum + i;
            mul *= i;   // mul = mul * i;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Mul: " + mul);
    }
}
