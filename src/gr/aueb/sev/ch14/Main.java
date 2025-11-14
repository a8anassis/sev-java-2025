package gr.aueb.sev.ch14;

public class Main {

    public static void main(String[] args) {
        Point p1 = Point.getInstance();
        Point p2 = Point.getRandomInstance();

        CodingFactory codingFactory = CodingFactory.getInstance();
        CodingFactory codingFactory2 = CodingFactory.getInstance();

        codingFactory.sayHello();
        codingFactory2.sayHello();

        HelloUtil.sayHello();

    }
}
