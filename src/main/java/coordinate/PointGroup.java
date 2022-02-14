package coordinate;

import java.util.List;

/**
 * Created by melodist
 * Date: 2022-02-15 015
 * Time: 오전 12:13
 */
public class PointGroup {
    private final List<Point> points;

    public PointGroup(List<Point> points) {
        this.points = points;
    }

    public Point getPoint(int index) {
        return points.get(index);
    }

    public int getSize() {
        return this.points.size();
    }
}
