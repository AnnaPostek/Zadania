package Kształty;

public class Calculator {

    public double lineLength(Point start, Point end) {
        double X = Math.pow(end.getX() - start.getX(), 2);
        double Y = Math.pow(end.getY() - start.getY(), 2);
        double sqrt = Math.sqrt(X+Y);
        return sqrt;
    }

    public double rectangleArea (Rectangle rectangle) {
        double x = lineLength(rectangle.x1, rectangle.x2);
        double y = lineLength(rectangle.y1, rectangle.y2);
        double area = x*y;
        return area;
    }
    public boolean isPointInsideCircle (Circle circle, Point point) {
        double X = Math.pow(point.getX() - circle.getP().getX(), 2);
        double Y = Math.pow(point.getY() - circle.getP().getY(), 2);
        if (X+Y<Math.pow(circle.getR(), 2)) {
            System.out.println("Należy");
            return true;
        }
        System.out.println("nie należy");
        return false;

    }
}


