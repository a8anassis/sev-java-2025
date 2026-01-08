package gr.aueb.sev.ch19;

import javax.xml.transform.sax.SAXResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LowerCaseAssert {

    public static void main(String[] args) {
        String s = "XUafffffff*#";     // at least 8 chars, με τουλάχιστον ένα πεζό

        Pattern pattern = Pattern.compile("(?=.*?[a-z])^.{8,}$");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
