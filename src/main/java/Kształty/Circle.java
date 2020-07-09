package Kształty;

public class Circle {
    double r;
    Point p;

    public Circle(double r, Point p) {
        this.r = r;
        this.p = p;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }
}
