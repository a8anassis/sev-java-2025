package gr.aueb.sev.ch17.callback;

public class Main {

    public static void main(String[] args) {
        Printable printable = () -> System.out.println("Hello World!");

        doPrint(Main::sayHello);        // Method reference
        doPrint(() -> System.out.println("Hello from lambda 2!"));

//        doPrint(new Printable() {
//            @Override
//            public void print() {
//                System.out.println("Hello World!");
//            }
//        });
//
//        doPrint(new Printable() {
//            @Override
//            public void print() {
//                System.out.println( "Hello from callback!");
//            }
//        });

    }

    public static void doPrint(Printable printable) {
        printable.print();
    }

    public static void sayHello() {
        System.out.println("Hello from static method!");
    }
}
