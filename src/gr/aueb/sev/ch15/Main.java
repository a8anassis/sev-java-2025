package gr.aueb.sev.ch15;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point2D(22.6, 4);
        Point p2 = new Point2D(10, 20);

        p1.addPlusOne();
        p2.addPlus10();

        doMovePlusOne(p1);
        doMovePlusOne(p2);
    }

    private static void doMovePlusOne(Point p) {
        p.addPlusOne();
    }
}
