package gr.aueb.sev.ch18.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OtherCases {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Milk", 2.5, 2),
                new Product("Bread", 21.5, 5),
                new Product("Eggs", 12.5, 10),
                new Product("Cheese", 1.2, 15)
        ));

        var sortedByQuantity = products.stream()
                .sorted(Comparator.comparingInt(Product::getQuantity))
                .collect(Collectors.toList());

        sortedByQuantity.forEach(System.out::println);

        double totalCost = products.stream()
                .filter(product -> product.getPrice() >= 10)
                .mapToDouble(p -> p.getPrice() * p.getQuantity())
                .sum();

        System.out.println(totalCost);

        List<String> cheapProductNames = products.stream()
                .filter(product -> product.getPrice() <= 10)
                .map(Product::getName)
                .map(String::toUpperCase)
                .toList();

        cheapProductNames.forEach(System.out::println);
    }
}
