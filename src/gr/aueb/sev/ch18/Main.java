package gr.aueb.sev.ch18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>(List.of(
                new Product("Apple", 1.2, 10),
                new Product("Banana", 0.8, 5))
        );

        products.sort(Comparator.naturalOrder());
        products.sort(Comparator.reverseOrder());

        products.sort(Comparator.comparing(Product::getPrice));
        products.sort(Comparator.comparing(Product::getPrice).reversed());

        products.sort(Comparator.comparing(Product::getDescription));
        products.sort(Comparator.comparing(Product::getPrice)
                .thenComparing(Product::getDescription, Comparator.reverseOrder()));


        products.sort(
                Comparator.comparing(Product::getPrice)
                        .thenComparing(Product::getDescription)
                        .thenComparing(Product::getQuantity)
                        .reversed());



        var intNode = new Node<Integer>();
        Node<String> strNode = new Node<>("Hello");

        strNode.setValue("World");

        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"a", "b", "c"};

        printArray(intArray);
        printArray(strArray);
    }

    public static <T> void printArray(T[] arr) {
        for (T item : arr) {
            System.out.println(item);
        }
    }
}
