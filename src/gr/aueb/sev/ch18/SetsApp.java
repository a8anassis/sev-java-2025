package gr.aueb.sev.ch18;

import java.util.HashSet;
import java.util.Set;

public class SetsApp {

    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();

        bag.add("apple");
        bag.add("banana");
        bag.add("orange");
        bag.add("apple");       // No duplicates allowed

        if (bag.contains("apple")) {
            bag.remove("apple");
        } else {
            System.out.println("Item not found!");
        }

        bag.forEach(System.out::println);
    }
}
