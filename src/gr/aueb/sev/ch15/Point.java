package gr.aueb.sev.ch15;

public class Point {
    private double x;

    public Point() {}

    public Point(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void addPlusOne() {
        x++;    // x = x + 1
    }

    protected void addPlus10() {
        x += 10;
    }

    private void reset() {
        x = 0;
    }
}
