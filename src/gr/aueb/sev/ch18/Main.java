package gr.aueb.sev.ch18;

public class Main {

    public static void main(String[] args) {

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
