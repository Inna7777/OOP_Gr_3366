package GeometricFigures;

import Controller.iAreaShape;
import Controller.iVolumeShape;

public class Cube implements  iAreaShape, iVolumeShape{
    private int edge;
    //конструктор куба
    public Cube(int edge) {
    this.edge = edge;
    }
    // метод расчета объема имплементируемый из интерфейса iAreaShape
    @Override
    public double volume() {
        return edge * edge * edge;
    }
    // метод расчета площади имплементируемый из интерфейса iVolumeShape
    @Override
    public double area() {
        return 6 * edge * edge;
    }
    
}
