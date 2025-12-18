package gr.aueb.sev.ch18.streams;

import java.util.List;
import java.util.stream.Collectors;

public class MainFilter {

    public static void main(String[] args) {
        List<String> cities = List.of("Athens", "London", "Paris", "Rome", "Athens");

        var filteredCities = cities.stream()
                .filter(city -> city.startsWith("A"))
                .toList();      // immutable list

        Iterable<String> filteredCities2 = cities.stream()
                .filter(city -> city.startsWith("R"))
                .collect(Collectors.toList());

        filteredCities.forEach(System.out::println);
    }
}
