package gr.aueb.sev.ch5;

import java.util.Scanner;

/**
 * Includes methods for finding the power
 * of an int.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power;
        int base;
        int result;

        System.out.println("Please insert base and power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        result = pow(base, power);

        System.out.printf("%d^%d = %,d", base, power, result);
    }

    /**
     * Finds the base^power.
     *
     * @param base      the base of power.
     * @param power     the power raised to.
     * @return          the base raised to the power.
     */
    public static int pow(int base, int power) {
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        return result;
    }
}
