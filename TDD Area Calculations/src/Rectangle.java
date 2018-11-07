
public class Rectangle extends Figure {
    
    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double gretArea() {
        return height * width;
    }
    
}
