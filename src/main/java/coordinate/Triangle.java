package coordinate;

public class Triangle extends AbstractFigure {
    public Triangle(PointGroup pointGroup) {
        super(pointGroup);
    }

    @Override
    public int size() {
        return 3;
    }

    @Override
    public String getName() {
        return "삼각형";
    }

    @Override
    public double area() {
        return 0;
    }
}
