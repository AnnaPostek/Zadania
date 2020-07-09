package Kształty;


public class ShapeCalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Point point = new Point(4,5);
        Circle cirlce = new Circle(5, point);
        Point point2 = new Point(4, 0);
        Point point3 = new Point(10,4);
        Point point4 = new Point(10,-1);
        calculator.isPointInsideCircle(cirlce, point2);
        Rectangle rectangle = new Rectangle(point, point2, point3, point4);
        System.out.println(calculator.rectangleArea(rectangle));
    }
}
