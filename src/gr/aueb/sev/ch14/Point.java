package gr.aueb.sev.ch14;

import java.util.Random;

public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point getInstance() {
        return new Point();
    }

    public static Point getRandomInstance() {
        Random random = new Random(System.nanoTime());
        return new Point(random.nextInt(100), random.nextInt(100));
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
