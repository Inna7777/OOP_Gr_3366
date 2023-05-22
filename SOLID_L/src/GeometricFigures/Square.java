package GeometricFigures;
// класс квадрат который  может наследовать  метод расчета площади родительского класса Figure 
//или классом наследником Rectangle
public class Square extends Rectangle {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return this.side * this.side;
    }
}

    

