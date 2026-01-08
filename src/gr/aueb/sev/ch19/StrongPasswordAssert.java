package gr.aueb.sev.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPasswordAssert {

    public static void main(String[] args) {
        String s = "XUaffff3fff#";     // at least 8 chars, με τουλάχιστον ένα πεζό

        Pattern pattern = Pattern.compile("(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[!@#$%^&*()])^.{8,}$");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
