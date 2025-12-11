package gr.aueb.sev.ch15;

public class Point2D extends Point {
    private double y;

    public Point2D() {
//        super();
//        this.y = 0;
    }

    public Point2D(double x, double y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void addPlusOne() {
        super.addPlusOne();
        y += 1;
    }

    @Override
    protected void addPlus10() {
        super.addPlus10();
        y += 10;
    }
}
