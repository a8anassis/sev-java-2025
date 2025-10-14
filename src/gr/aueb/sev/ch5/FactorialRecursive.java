package gr.aueb.sev.ch5;

public class FactorialRecursive {

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial: " + factorial(num));
    }

    public static int factorial(int n) {
//        if (n <= 1) return 1;
//        return n * factorial(n-1);

        return (n <= 1) ? 1 : n * factorial(n-1);
    }
}
