
public class Circle extends Figure {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double gretArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}
