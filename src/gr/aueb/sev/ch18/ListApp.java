package gr.aueb.sev.ch18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListApp {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        cities.add("Athens");
        cities.add("Thessaloniki");
        cities.add("Patras");

        System.out.println("City: " + cities.get(0));   // Athens

        int position = cities.indexOf("Patras");

        if (position == -1) {
            System.out.println("City not found!");
        } else {
            cities.set(position, "Larissa");        // update
        }

        if (cities.contains("Larissa")) {
            cities.remove("Larissa");
        } else {
            System.out.println("City not found!");
        }

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        for (String city : cities) {
            System.out.println(city);
        }

        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        cities.forEach(System.out::println);    // recommended way for traversal
    }
}
