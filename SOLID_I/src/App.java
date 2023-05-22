import GeometricFigures.Circle;
import GeometricFigures.Cube;

public class App {
    public static void main(String[] args) throws Exception {
        
        Circle circle1 = new Circle(5);
        Cube cube1 = new Cube(5);

        double circleArea = circle1.area();
        double cubeArea = cube1.area();
        double cubeVolume = cube1.volume();

        System.out.println("Площадь круга радиусом 5: " + circleArea);
        System.out.println("Площадь куба со стороной 5: " + cubeArea);
        System.out.println("Объем куба со стороной 5: " + cubeVolume);
    }
}
