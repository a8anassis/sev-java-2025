package gr.aueb.sev.ch19;

public class RegEx {

    public static void main(String[] args) {
        String s = "red";
        System.out.println(isRed(s));

        String s2 = "Dcoding";
        System.out.println(startsWithUppercase(s2));
    }

    public static boolean isRed(String s) {
        return s.matches("red");
    }

    public static boolean isHelloOrHi(String s) {
        return s.matches("hello|hi");
    }

    // Character classes [abc] [a-z] [A-Z] [0-9]

    public static boolean isHhello(String s) {
        return s.matches("[hH]ello");
    }

    public static boolean startsWithUppercase(String s) {
        return s.matches("[A-Z]coding");
    }

    public static boolean startsWithLetterOrDigit(String s) {
        return s.matches("[a-zA-Z0-9]coding");
    }

    // Μεταχαρακτήρες

    public static boolean anyAndDigit(String s) {
        return s.matches(".\\d");
    }

    public static boolean dotAndDigit(String s) {
        return s.matches("\\.\\d");
    }

    // 01/12/2025
    public static boolean isDate(String s) {
        return s.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    // Athens University
    public static String reverse(String s) {
        return s.replaceAll("(.*)\\s(.*)", "$2 $1");
    }
}

