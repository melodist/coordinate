package coordinate;

public class Line extends AbstractFigure {
    public Line(PointGroup pointGroup) {
        super(pointGroup);
    }

    @Override
    public int size() {
        return 2;
    }

    @Override
    public String getName() {
        return "선";
    }

    @Override
    public double area() {
        return 0;
    }
}
