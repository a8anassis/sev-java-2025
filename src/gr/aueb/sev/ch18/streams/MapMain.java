package gr.aueb.sev.ch18.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMain {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Milk", 2.5, 2),
                new Product("Bread", 1.5, 5),
                new Product("Eggs", 0.5, 10),
                new Product("Cheese", 1.2, 15)
        ));

        var listOfNames = products.stream()
                .map(Product::getName)
                .collect(Collectors.toCollection(ArrayList::new));

        listOfNames.forEach(System.out::println);

        var listOfNamesStr = products.stream()
                .map(Product::getName)
                .collect(Collectors.joining(", "));

        System.out.println(listOfNamesStr);


        int totalQuantities = products.stream()
                .mapToInt(Product::getQuantity)
                .sum();

        System.out.println(totalQuantities);
    }
}
