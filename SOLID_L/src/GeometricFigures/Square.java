package GeometricFigures;

public class Square extends Figure {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return this.side * this.side;
    }
}

    

