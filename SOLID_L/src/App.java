import GeometricFigures.Rectangle;
import GeometricFigures.Square;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(8);
        rectangle.setHeight(10);
        System.out.println("Rectangle area: " + rectangle.area());

        Square square = new Square();
        square.setSide(5);
        System.out.println("Square area: " + square.area());
    }
}
 

