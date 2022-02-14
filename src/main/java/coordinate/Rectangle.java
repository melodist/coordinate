package coordinate;

public class Rectangle extends AbstractFigure {
    public Rectangle(PointGroup pointGroup) {
        super(pointGroup);
    }

    @Override
    public int size() {
        return 4;
    }

    @Override
    public String getName() {
        return "사각형";
    }

    @Override
    public double area() {
        return 0;
    }
}
