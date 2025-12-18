package gr.aueb.sev.ch18.maps;

import java.util.HashMap;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        // Add
        countries.put("GR", "Greece");
        countries.put("USA", "United States");
        countries.put("IT", "Italy");

        // Update
        countries.put("GR", "Greece (Hellas)");

        // Remove
        countries.remove("US");

        // Traverse
        countries.forEach((key, value) -> System.out.println(key + " - " + value));

        var filteredCounties = countries.entrySet().stream()
                .filter(entry -> entry.getKey().length() <= 2)
                .toList();

        filteredCounties.forEach(System.out::println);
    }
}
