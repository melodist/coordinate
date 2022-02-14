package coordinate;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class FigureFactoryTest {
    @Test
    public void line() {
        List<Point> points = Arrays.asList(
                Point.of(1, 2),
                Point.of(2, 3));

        PointGroup pointGroup = new PointGroup(points);

        Figure figure = FigureFactory.getFigure(pointGroup);
        assertThat(figure).isInstanceOfAny(Line.class);
        assertThat(figure.getName()).isEqualTo("선");
    }

    @Test
    public void triangle() {
        List<Point> points = Arrays.asList(
                Point.of(1, 1),
                Point.of(4, 1),
                Point.of(1, 4));

        PointGroup pointGroup = new PointGroup(points);

        Figure figure = FigureFactory.getFigure(pointGroup);
        assertThat(figure).isInstanceOfAny(Triangle.class);
        assertThat(figure.getName()).isEqualTo("삼각형");
    }

    @Test
    public void rectangle() {
        List<Point> points = Arrays.asList(
                Point.of(1, 1),
                Point.of(4, 1),
                Point.of(1, 4),
                Point.of(4, 4));

        PointGroup pointGroup = new PointGroup(points);

        Figure figure = FigureFactory.getFigure(pointGroup);
        assertThat(figure).isInstanceOfAny(Rectangle.class);
        assertThat(figure.getName()).isEqualTo("사각형");
    }

    @Test
    public void pentagon() {
        List<Point> points = Arrays.asList(
                Point.of(1, 1),
                Point.of(4, 1),
                Point.of(1, 4),
                Point.of(4, 4),
                Point.of(2, 5));

        PointGroup pointGroup = new PointGroup(points);
        assertThatThrownBy(() -> FigureFactory.getFigure(pointGroup))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
