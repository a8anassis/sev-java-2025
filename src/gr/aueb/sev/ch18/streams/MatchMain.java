package gr.aueb.sev.ch18.streams;

import java.util.List;

public class MatchMain {

    public static void main(String[] args) {
        List<String> names = List.of("John", "Peter", "Mary", "Denis");

        boolean isDenisExists = names.stream()
                .anyMatch(name -> name.equals("Denis"));

        System.out.println(isDenisExists);

        boolean allStartWithJ = names.stream()
                .allMatch(name -> name.startsWith("J"));

        System.out.println(allStartWithJ);

        boolean noneStartWithB = names.stream()
                .noneMatch(name -> name.startsWith("B"));

        System.out.println(noneStartWithB);
    }
}
