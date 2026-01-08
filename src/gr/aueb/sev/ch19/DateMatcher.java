package gr.aueb.sev.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateMatcher {

    public static void main(String[] args) {
        String date = "05/06/2025;01/02/2026   xxxx    11/05/2024";   //   mm/dd/yyyy

        Pattern pattern = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");
        Matcher matcher = pattern.matcher(date);

        while (matcher.find()) {
            System.out.print(matcher.group() + " ");

            String month = matcher.group(1);
            String day = matcher.group(2);
            String year = matcher.group(3);

            String grFormattedDate = day + "/" + month + "/" + year;
            System.out.println(grFormattedDate);
        }

    }
}
