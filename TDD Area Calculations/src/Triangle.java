
public class Triangle extends Figure {

    double traingleBase;
    double triangleHeight;

    public Triangle(double traingleBase, double triangleHeight) {
        this.traingleBase = traingleBase;
        this.triangleHeight = triangleHeight;
    }

    @Override
    public double gretArea() {
        return (triangleHeight * traingleBase) / 2;
    }
}
