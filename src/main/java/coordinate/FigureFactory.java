package coordinate;

import java.util.function.Function;

public enum FigureFactory {
    LINE(2, Line::new),
    TRIANGLE(3, Triangle::new),
    RECTANGLE(4, Rectangle::new);

    int numOfPoints;
    Function<PointGroup, Figure> function;

    FigureFactory(int numOfPoints, Function<PointGroup, Figure> function) {
        this.numOfPoints = numOfPoints;
        this.function = function;
    }

    public static Figure getFigure(PointGroup pointGroup) {
        int numOfPoints = pointGroup.getSize();

        for (FigureFactory figureFactory : values()) {
            if (figureFactory.numOfPoints == numOfPoints) {
                return figureFactory.function.apply(pointGroup);
            }
        }

        throw new IllegalArgumentException("유효하지 않은 도형입니다.");
    }
}
