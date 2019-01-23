
public class Square extends Figure {
    
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double gretArea() {
        return Math.pow(side, 2);
    }
    
}
